package com.technegames.lexiconda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
	static final int WORLD_WIDTH = 10;
	static final int WORLD_HEIGHT = 13;
	static final float TICK_MOVEMENT = 0.5f;
	static final float TICK_TIMER = 1.0f;
	static final float BG_CHANGE = 0.25f;
	static final int[] scores = { 0, 5, 15, 30, 50, 75, 105, 140, 180, 225, 275, 330, 390, 455, 525, 600, 680, 765, 855, 950, 1050, 1155, 1265, 1380, 1500, 
		1625, 1755, 1890, 2030, 2175, 2325, 2480, 2640, 2805, 3000 };
	
	public int mode;
	public Snake snake;
	public List<Item> letters;
	public List<Animation> animations;
	public List<Integer> workingIndexes;
	public boolean gameOver;
	public boolean timeOut;
	
	boolean fields[][] = new boolean[WORLD_WIDTH][WORLD_HEIGHT];
	boolean indexes[] = new boolean[26];
	Random random;
	float movementTime;
	float bgTime;
	float timer;
	int bg;
	int bgFlash;
	float tick;
	long score;
	int minutesLeft;
	int secondsLeft;
	String lastLetterEaten;
	String masterWord; //this holds all letters that make up the snake
	String word;
	boolean highlightUsedWord;
	
	public World(int mode){
		this.mode = mode;
		if(mode == Mode.CASUAL){
			snake = new Snake();
			letters = new ArrayList<Item>();
			animations = new ArrayList<Animation>();
			workingIndexes = new ArrayList<Integer>();
			gameOver = false;
			timeOut = false;
			highlightUsedWord = false;
			random = new Random();
			movementTime = 0;
			bgTime = 0;
			timer = 0;
			bg = 0;
			bgFlash = 0;
			tick = TICK_MOVEMENT;
			score = 0;
			minutesLeft = 3;
			secondsLeft = 0;
			lastLetterEaten = "";
			masterWord = Letter.letters[snake.parts.get(snake.parts.size()-1).index];
			word = masterWord;
			workingIndexes.add(masterWord.length()-1);
			for(int i = 0; i < indexes.length; i++){
				indexes[i] = false;
			}
			placeLetters(word.charAt(0));
		} else if(mode == Mode.SURVIVAL){
			snake = new Snake();
			letters = new ArrayList<Item>();
			animations = new ArrayList<Animation>();
			workingIndexes = new ArrayList<Integer>();
			gameOver = false;
			highlightUsedWord = false;
			random = new Random();
			movementTime = 0;
			bgTime = 0;
			bg = 0;
			bgFlash = 0;
			tick = TICK_MOVEMENT;
			score = 0;
			lastLetterEaten = "";
			masterWord = Letter.letters[snake.parts.get(snake.parts.size()-1).index];
			word = masterWord;
			workingIndexes.add(masterWord.length()-1);
			for(int i = 0; i < indexes.length; i++){
				indexes[i] = false;
			}
			placeLetters(word.charAt(0));
		}
	}
	
	private void placeItem(int index){
		int letterX = random.nextInt(WORLD_WIDTH);
		int letterY = random.nextInt(WORLD_HEIGHT);
		while(true){
			if(fields[letterX][letterY] == false){
				break;
			}
			
			letterX += 1;
			if(letterX >= WORLD_WIDTH){
				letterX = 0;
				letterY += 1;
				if(letterY >= WORLD_HEIGHT){
					letterY = 0;
				}
			}
		}
		fields[letterX][letterY] = true;
		
		while(true){
			if(indexes[index] == false){
				break;
			}
			index++;
			if(index > 25){
				index = 0;
			}
		}
		indexes[index] = true;
		
		letters.add(new Item(letterX, letterY, index));
	}
	
	private void removeAllItems(){
		for(int i = 0; i < letters.size(); i++){
			indexes[letters.get(i).index] = false;
		}
		letters.removeAll(letters);
	}
	
	private void removeItem(int i){
		indexes[letters.get(i).index] = false;
		letters.remove(i);
	}
	
	public void update(float deltaTime){
		if(gameOver){
			return;
		}
		
		if(mode == Mode.CASUAL){
			timer += deltaTime;
			if(timer > TICK_TIMER){
				timer = 0;
				secondsLeft--;
				if(secondsLeft < 0){
					secondsLeft = 59;
					minutesLeft--;
				}
				if(minutesLeft == 0 && secondsLeft == 0){
					timeOut = true;
				}
			}
		}
		
		if(animations.size() > 0){
			for(int i = animations.size()-1; i >= 0; i--){
				if(animations.get(i).destroy == true){
					animations.remove(i);
				}
			}
		}
		
		for(int i = 0; i < letters.size(); i++){
			letters.get(i).update(deltaTime);
		}
		
		bgTime += deltaTime;
		if(bgTime > BG_CHANGE){
			bgTime = 0;
			bgFlash = 0;
			bg++;
			if(bg > 3){
				bg = 0;
			}
		}
		
		movementTime += deltaTime;
		if(movementTime > tick){
			movementTime = 0;
			snake.advance();
			if(snake.checkBitten()){
				gameOver = true;
				return;
			} 
			
			SnakePart head = snake.parts.get(0);
			
			for(int i = 0; i < letters.size(); i++){
				if(head.x == letters.get(i).x && head.y == letters.get(i).y){
					int lettersIndex = letters.get(i).index;
					snake.eat(lettersIndex);
					score += 10;
					lastLetterEaten = Letter.letters[lettersIndex];
					masterWord += lastLetterEaten;
					if(snake.parts.size() == WORLD_WIDTH * WORLD_HEIGHT){
						gameOver = true;
						return;
					} else{
						animations.add(new Animation(letters.get(i).x, letters.get(i).y, "", Animation.LETTER));
						removeItem(i);
					}
					increaseSpeed();
					evaluateSnake();
					if(word.length() > 0){
						placeLetters(word.charAt(word.length()-1));
					} else{
						placeLetters('0');
					}
				}
			}
		}
	}
	
	private void evaluateSnake(){
		highlightUsedWord = false;
		if(Assets.dict.packageLoaderMatcher(word+lastLetterEaten)){
			word += lastLetterEaten;
			evaluateWord(Assets.dict.packageLoader(word));
		} else{
			Assets.eat.play(1);
			workingIndexes.add(masterWord.length()-1);
			if(mode == Mode.SURVIVAL){
				snake.addPenaltyBlock();
			}
			word = lastLetterEaten;
		}
	}
	
	private void evaluateWord(int length){
		if(length > 0){
			if(!Assets.usedWords.hasWordBeenUsed(word)){
				animations.add(new Animation(160, 86, word, Animation.DISPLAY_WORD));
				Assets.boom.play(1);
				bgFlash = 1;
				Assets.usedWords.insertNewWord(word);
				score += scores[length];
				resetTick(.05f);
				if(mode == Mode.CASUAL){
					adjustTime(word.length());
				}
				removeWord(word.length());
				removeAllItems();
			} else{
				Assets.eat.play(1);
				highlightUsedWord = true;
			}
		} else{
			Assets.eat.play(1);
		}
	}
	
	private void removeWord(int length){
		removeAffectedTailParts(length);
		if(masterWord.length() == length){
			masterWord = "";
			word = "";
			workingIndexes.removeAll(workingIndexes);
			workingIndexes.add(0);
		} else{
			masterWord = masterWord.substring(0, masterWord.length()-length);
			workingIndexes.remove(workingIndexes.size()-1);
			if(workingIndexes.get(workingIndexes.size()-1) < masterWord.length()-1){
				word = masterWord.substring(workingIndexes.get(workingIndexes.size()-1), masterWord.length());
				if(Assets.usedWords.hasWordBeenUsed(word)){
					highlightUsedWord = true;
				}
			} else if(workingIndexes.get(workingIndexes.size()-1) == masterWord.length()-1){
				word = "";
				word += masterWord.charAt(workingIndexes.get(workingIndexes.size()-1));
			} else{
				word = "";
				word += masterWord.charAt(masterWord.length()-1);
				workingIndexes.add(masterWord.length()-1);
			}
		}
	}
	
	private void removeAffectedTailParts(int length){
		for(int i = 0; i < length+1; i++){
			animations.add(new Animation(snake.parts.get(snake.parts.size()-(i+1)).x, snake.parts.get(snake.parts.size()-(i+1)).y, "", Animation.WORD));
		}
		for(int i = 0; i < length; i++){
			snake.parts.remove(snake.parts.size()-1);
		}
	}
	
	private void placeLetters(char lastLetter){
		for(int x = 0; x < WORLD_WIDTH; x++){
			for(int y = 0; y < WORLD_HEIGHT; y++){
				fields[x][y] = false;
			}
		}
		for(int i = 0; i < letters.size(); i++){
			fields[letters.get(i).x][letters.get(i).y] = true;
		}
		for(int i = 0; i < snake.parts.size(); i++){
			SnakePart part = snake.parts.get(i);
			fields[part.x][part.y] = true;
		}
		SnakePart head = snake.parts.get(0);
		for(int y = 0; y < WORLD_HEIGHT; y++){
			fields[head.x][y] = true;
		}
		for(int x = 0; x < WORLD_WIDTH; x++){
			fields[x][head.y] = true;
		}
		
		while(letters.size() < 8 && snake.parts.size() < WORLD_WIDTH*WORLD_HEIGHT-8){
			if(lastLetter == '0'){
				placeItem(Index.indexesFirstLetter[random.nextInt(100)]);
			} else if(lastLetter == 'A'){
				placeItem(Index.indexesAfterA[random.nextInt(Index.indexesAfterA.length)]);
			} else if(lastLetter == 'C'){
				placeItem(Index.indexesAfterC[random.nextInt(Index.indexesAfterC.length)]);
			} else if(lastLetter == 'D'){
				placeItem(Index.indexesAfterD[random.nextInt(Index.indexesAfterD.length)]);
			} else if(lastLetter == 'E'){
				placeItem(Index.indexesAfterE[random.nextInt(Index.indexesAfterE.length)]);
			} else if(lastLetter == 'F'){
				placeItem(Index.indexesAfterF[random.nextInt(Index.indexesAfterF.length)]);
			} else if(lastLetter == 'H'){
				placeItem(Index.indexesAfterH[random.nextInt(Index.indexesAfterH.length)]);
			} else if(lastLetter == 'I'){
				placeItem(Index.indexesAfterI[random.nextInt(Index.indexesAfterI.length)]);
			} else if(lastLetter == 'L'){
				placeItem(Index.indexesAfterL[random.nextInt(Index.indexesAfterL.length)]);
			} else if(lastLetter == 'M'){
				placeItem(Index.indexesAfterM[random.nextInt(Index.indexesAfterM.length)]);
			} else if(lastLetter == 'N'){
				placeItem(Index.indexesAfterN[random.nextInt(Index.indexesAfterN.length)]);
			} else if(lastLetter == 'O'){
				placeItem(Index.indexesAfterO[random.nextInt(Index.indexesAfterO.length)]);
			} else if(lastLetter == 'Q'){
				placeItem(Index.indexesAfterQ[random.nextInt(Index.indexesAfterQ.length)]);
			} else if(lastLetter == 'P'){
				placeItem(Index.indexesAfterP[random.nextInt(Index.indexesAfterP.length)]);
			} else if(lastLetter == 'R'){
				placeItem(Index.indexesAfterR[random.nextInt(Index.indexesAfterR.length)]);
			} else if(lastLetter == 'S'){
				placeItem(Index.indexesAfterS[random.nextInt(Index.indexesAfterS.length)]);
			} else if(lastLetter == 'T'){
				placeItem(Index.indexesAfterT[random.nextInt(Index.indexesAfterT.length)]);
			} else if(lastLetter == 'V'){
				placeItem(Index.indexesAfterV[random.nextInt(Index.indexesAfterV.length)]);
			} else{
				placeItem(Index.indexesAfterFirstLetter[random.nextInt(100)]);
			}
			if(letters.size()+1 < 8){
				placeItem(Index.indexesAfterFirstLetter[random.nextInt(100)]);
			}
		}
	}
	
	private void adjustTime(int length){
		secondsLeft += length * 2;
		while(secondsLeft > 59){
			secondsLeft -= 60;
			minutesLeft += 1;
		}
	}
	
	private void resetTick(float time){
		if(tick + time <= TICK_MOVEMENT){
			tick += time;
		}
	}
	
	private void increaseSpeed(){
		if(tick - .01f >= .20f){
			tick -= .01f;
		}
	}
}
