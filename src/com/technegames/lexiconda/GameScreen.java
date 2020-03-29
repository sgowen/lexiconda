package com.technegames.lexiconda;

import java.util.List;

import android.content.Intent;
import android.graphics.Color;

import com.technegames.framework.Game;
import com.technegames.framework.Graphics;
import com.technegames.framework.Input.KeyEvent;
import com.technegames.framework.Input.TouchEvent;
import com.technegames.framework.Screen;

public class GameScreen extends Screen{
	Game game;
	Graphics g;
	enum GameState{ Waiting, Running, Paused, Death, Success, GameOver, NewHighScore };
	GameState gState;
	enum EndGameState{ Options, Submit };
	EndGameState egState;
	World world;
	int scoreFontSize;
	int wordFontSize;
	private static final float WAIT_TIME = 5.25f;
	float tick;
	String countDown;
	String initials;
	
	public GameScreen(Game game) {
		super(game);
		this.game = game;
		Assets.intro.play();
		initVariables();
	}
	
	private void initVariables(){
		Mode.setEndGameScore(0);
		g = game.getGraphics();
		gState = GameState.Waiting;
		world = new World(Mode.mode);
		scoreFontSize = 24;
		wordFontSize = 24;
		tick = 0;
		countDown = "";
		initials = "";
	}

	@Override
	public void update(float deltaTime) {
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		List<KeyEvent> keyEvents = game.getInput().getKeyEvents();
		
		if(gState == GameState.Waiting){
			updateWaiting(deltaTime);
		} else if(gState == GameState.Running){
			if(Mode.controls == Mode.TAP){
				updateTap(touchEvents);
			} else if(Mode.controls == Mode.KEYBOARD){
				updateKeyboardInput(keyEvents);
			}
			updateRunning(deltaTime);
			updateAnimations(deltaTime);
		} else if(gState == GameState.Success){
			updateSuccess(deltaTime);
			updateAnimations(deltaTime);
		} else if(gState == GameState.Death){
			updateDeath(deltaTime);
			updateAnimations(deltaTime);
		} else if(gState == GameState.NewHighScore){
			updateNewHighScore(deltaTime, touchEvents);
		} else if(gState == GameState.GameOver){
			updateGameOver(deltaTime, touchEvents);
		}
	}
	
	private void updateWaiting(float deltaTime){
		tick += deltaTime;
		if(tick > WAIT_TIME){
			tick = 0;
			handleMusic();
			world.animations.add(new Animation(160, 86, "GO!!!", Animation.DISPLAY_WORD));
			gState = GameState.Running;
		} else if(tick > 4.25f){
			countDown = "1";
		} else if(tick > 3.25f){
			countDown = "2";
		} else if(tick > 2.25f){
			countDown = "3";
		} 
	}
	
	private void updateTap(List<TouchEvent> touchEvents){
		SnakePart head = world.snake.parts.get(0);
		int headX = head.x*26+30;
		int headY = head.y*26+96;
		for(int i = 0; i < touchEvents.size(); i++){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_DOWN){
				if(world.snake.direction == Snake.UP){
					if(event.x > headX){
						world.snake.turnRight();
					} else{
						world.snake.turnLeft();
					}
				} else if(world.snake.direction == Snake.DOWN){
					if(event.x > headX){
						world.snake.turnLeft();
					} else{
						world.snake.turnRight();
					}
				} else if(world.snake.direction == Snake.LEFT){
					if(event.y > headY){
						world.snake.turnLeft();
					} else{
						world.snake.turnRight();
					}
				} else if(world.snake.direction == Snake.RIGHT){
					if(event.y > headY){
						world.snake.turnRight();
					} else{
						world.snake.turnLeft();
					}
				}
			}
		}
	}
	
	private void updateKeyboardInput(List<KeyEvent> keyEvents){
		for(int j = 0; j < keyEvents.size(); j++){
			KeyEvent event = keyEvents.get(j);
			if(event.type == KeyEvent.KEY_DOWN){
				if(event.keyCode == android.view.KeyEvent.KEYCODE_DPAD_UP){
					if(world.snake.direction == Snake.RIGHT){
						world.snake.turnLeft();
					} else if(world.snake.direction == Snake.LEFT){
						world.snake.turnRight();
					}
				} else if(event.keyCode == android.view.KeyEvent.KEYCODE_DPAD_LEFT){
					if(world.snake.direction == Snake.UP){
						world.snake.turnLeft();
					} else if(world.snake.direction == Snake.DOWN){
						world.snake.turnRight();
					}
				} else if(event.keyCode == android.view.KeyEvent.KEYCODE_DPAD_DOWN){
					if(world.snake.direction == Snake.LEFT){
						world.snake.turnLeft();
					} else if(world.snake.direction == Snake.RIGHT){
						world.snake.turnRight();
					}
				} else if(event.keyCode == android.view.KeyEvent.KEYCODE_DPAD_RIGHT){
					if(world.snake.direction == Snake.DOWN){
						world.snake.turnLeft();
					} else if(world.snake.direction == Snake.UP){
						world.snake.turnRight();
					}
				}
			}
		}
	}
	
	private void updateRunning(float deltaTime){
		world.update(deltaTime);
		
		if(world.gameOver){
			handleMusic();
			Mode.setEndGameScore(world.score);
			Assets.death.play(1);
			world.animations.add(new Animation(world.snake.parts.get(0).x, world.snake.parts.get(0).y, "", Animation.DEATH));
			gState = GameState.Death;
			return;
		} else if(Mode.mode == Mode.CASUAL && world.timeOut){
			handleMusic();
			Mode.setEndGameScore(world.score);
			world.animations.add(new Animation(world.snake.parts.get(0).x, world.snake.parts.get(0).y, "", Animation.SUCCESS));
			gState = GameState.Success;
		}
		if(Long.toString(world.score).length() > 11){
			scoreFontSize = 18;
		}
		if(world.word.length() > 11){
			wordFontSize = 18;
		}
	}
	
	private void updateAnimations(float deltaTime){
		if(world.animations.size() > 0){
			for(int i = world.animations.size()-1; i >= 0; i--){
				world.animations.get(i).update(deltaTime);
			}
		}
	}
	
	private void updateDeath(float deltaTime){
		if(world.animations.size() > 0){
			for(int i = world.animations.size()-1; i >= 0; i--){
				if(world.animations.get(i).type == Animation.DEATH && world.animations.get(i).destroy){
					world.animations.removeAll(world.animations);
					if(SaveData.isNewScore(Mode.score, Mode.mode)){
						gState = GameState.NewHighScore;
						egState = EndGameState.Submit;
					} else{
						gState = GameState.GameOver;
						egState = EndGameState.Options;
					}
					return;
				}
			}
		}
	}
	
	private void updateSuccess(float deltaTime){
		if(world.animations.size() > 0){
			for(int i = world.animations.size()-1; i >= 0; i--){
				if(world.animations.get(i).type == Animation.SUCCESS && world.animations.get(i).destroy){
					world.animations.removeAll(world.animations);
					if(SaveData.isNewScore(Mode.score, Mode.mode)){
						gState = GameState.NewHighScore;
						egState = EndGameState.Submit;
					} else{
						gState = GameState.GameOver;
						egState = EndGameState.Options;
					}
					return;
				}
			}
		}
	}
	
	private void updateNewHighScore(float deltaTime, List<TouchEvent> touchEvents){
		if(egState == EndGameState.Submit){
			for(int i = 0; i < touchEvents.size(); i++){
				TouchEvent event = touchEvents.get(i);
				if(event.type == TouchEvent.TOUCH_UP){
					if(event.y > 360 && event.y < 440 && event.x > 30 && event.x < 290){
						if(event.y > 413){
							if(event.x > 250){
								if(initials.length() == 3){
									Assets.click.play(1);
									SaveData.addScore(Mode.score, Mode.mode, initials);
									egState = EndGameState.Options;
								}
							} else if(event.x > 186){
								if(initials.length() == 1){
									Assets.click.play(1);
									initials = "";
								} else if(initials.length() == 2){
									Assets.click.play(1);
									char initial = initials.charAt(0);
									initials = "";
									initials += initial;
								} else if(initials.length() >= 3){
									Assets.click.play(1);
									char initial = initials.charAt(0);
									char initial2 = initials.charAt(1);
									initials = "";
									initials += initial;
									initials += initial2;
								}
							} else{
								if(initials.length() < 3){
									Assets.click.play(1);
									initials += Letter.letters[(event.x-30)/26+20];
								}
							}
						} else if(event.y > 387){
							if(initials.length() < 3){
								Assets.click.play(1);
								initials += Letter.letters[(event.x-30)/26+10];
							}
						} else{
							if(initials.length() < 3){
								Assets.click.play(1);
								initials += Letter.letters[(event.x-30)/26];
							}
						}
					}
				}
			}
		} else{
			for(int i = 0; i < touchEvents.size(); i++){
				TouchEvent event = touchEvents.get(i);
				if(event.x > 30 && event.x < 290 && event.y > 319 && event.y < 439){
					if(event.type == TouchEvent.TOUCH_UP){
						if(event.y > 379){
							Assets.click.play(1);
							game.getActivity().finish();
						} else{
							Assets.click.play(1);
							reload();
						}
					}
				}
			}
		}
	}
	
	private void updateGameOver(float deltaTime, List<TouchEvent> touchEvents){
		for(int i = 0; i < touchEvents.size(); i++){
			TouchEvent event = touchEvents.get(i);
			if(event.x > 30 && event.x < 290 && event.y > 319 && event.y < 439){
				if(event.type == TouchEvent.TOUCH_UP){
					if(event.y > 379){
						Assets.click.play(1);
						game.getActivity().finish();
					} else{
						Assets.click.play(1);
						reload();
					}
				}
			}
		}
	}
	
	@Override
	public void present(float deltaTime) {
		drawGUI();
		if(gState == GameState.Waiting){
			drawItems();
			drawSnakeTailParts();
			drawSnakeHead();
			drawWaiting();
			drawTimer();
		} else if(gState == GameState.Paused){
			drawItems();
			drawSnakeTailParts();
			drawSnakeHead();
			drawAnimations();
			drawPaused();
			drawTimer();
		} else if(gState == GameState.Running){
			drawItems();
			drawSnakeTailParts();
			drawAnimations();
			drawSnakeHead();
			drawTimer();
		} else if(gState == GameState.Death){
			drawAnimations();
			drawTimer();
		} else if(gState == GameState.Success){
			drawSnakeTailParts();
			drawAnimations();
			drawSuccess();
			drawTimer();
		} else if(gState == GameState.NewHighScore){
			drawNewHighScore();
		} else if(gState == GameState.GameOver){
			drawGameOver();
		}
	}

	private void drawGUI(){
		g.drawRect(0, 0, 321, 481, true, Color.rgb(0,0,55));
		g.drawPixmap(Assets.stats, 20, 0);
		g.drawPixmap(Assets.bg, 30, 101, world.bg*260, world.bgFlash*338, 260, 338);
		g.drawLine(120, 2, 120, 58, Color.BLACK);
		g.drawLine(25, 32, 295, 32, Color.BLACK);
		
		g.drawText(Long.toString(world.score), 125, 24, scoreFontSize, false, Color.WHITE);
		if(world.highlightUsedWord){
			g.drawText(world.word, 125, 54, wordFontSize, false, Color.RED);
		} else{
			g.drawText(world.word, 125, 54, wordFontSize, false, Color.WHITE);
		}
	}
	
	private void drawItems(){ 
		for(int i = 0; i < world.letters.size(); i++){
			if(world.letters.get(i).item == 0){
				g.drawToSize(Assets.item1, world.letters.get(i).x*26+25, world.letters.get(i).y*26+96, 36, 36);
			} else if(world.letters.get(i).item == 1){
				g.drawToSize(Assets.item2, world.letters.get(i).x*26+25, world.letters.get(i).y*26+96, 36, 36);
			} else if(world.letters.get(i).item == 2){
				g.drawToSize(Assets.item3, world.letters.get(i).x*26+25, world.letters.get(i).y*26+96, 36, 36);
			} else{
				g.drawToSize(Assets.item2, world.letters.get(i).x*26+25, world.letters.get(i).y*26+96, 36, 36);
			}
			g.drawText(Letter.letters[world.letters.get(i).index], world.letters.get(i).x*26+43, world.letters.get(i).y*26+120, 21, true, Color.rgb(0, 40, 0));
		}
	}
	
	private void drawSnakeTailParts(){ //Only the Tail Parts
		for(int i = 1; i < world.snake.parts.size(); i++){
			if(world.snake.parts.get(i).index < 26){
				g.drawRect(world.snake.parts.get(i).x*26+30, world.snake.parts.get(i).y*26+101, 26, 26, true, Color.rgb(35,177,77));
				g.drawText(Letter.letters[world.snake.parts.get(i).index], world.snake.parts.get(i).x*26+43, world.snake.parts.get(i).y*26+120, 21, true, Color.BLUE);
			} else if(world.snake.parts.get(i).index == 27){
				g.drawRect(world.snake.parts.get(i).x*26+30, world.snake.parts.get(i).y*26+101, 26, 26, true, Color.rgb(0,0,0));
			}
			if(world.snake.snakeTailAnimation > 0){
				g.drawRect(world.snake.parts.get(i).x*26+30, world.snake.parts.get(i).y*26+101, 26, 26, false, Color.rgb(163,73,163));
			}
		}
	}
	
	private void drawSnakeHead(){ //Only the Head of the Snake
		g.drawPixmap(Assets.head, world.snake.parts.get(0).x*26+25, world.snake.parts.get(0).y*26+96, world.snake.direction*36, world.snake.snakeHeadAnimation*36, 36, 36);
	}
	
	private void drawTimer(){
		if(Mode.mode == Mode.CASUAL){
			String timeLeft = Integer.toString(world.minutesLeft) + ":";
			int seconds = world.secondsLeft;
			if(seconds > 9){
				timeLeft += Integer.toString(world.secondsLeft);
			} else if(seconds > 0 && seconds < 10){
				timeLeft += "0" + Integer.toString(world.secondsLeft);
			} else if(seconds == 0){
				timeLeft += Integer.toString(world.secondsLeft) + "0";
			}
			g.drawText(timeLeft, 160, 468, 24, true, Color.RED);
		}
	}
	
	private void drawWaiting(){ //On top of world
		g.drawText("Ready?    " + countDown, 160, 86, 20, true, Color.RED);
	}
	
	private void drawPaused(){ //On top of world
		g.drawText("Paused!", 160, 86, 20, true, Color.RED);
	}
	
	private void drawNewHighScore(){ //On top of world
		g.drawRect(30, 101, 260, 338, true, Color.rgb(0,0,0));
		g.drawPixmap(Assets.newhs, 80, 111);
		if(egState == EndGameState.Submit){
			g.drawText("RANK", 60, 280, 20, true, Color.rgb(255, 255, 255));
			g.drawText(Letter.ranks[SaveData.newHighscoreRow], 60, 300, 18, true, Color.rgb(255, 255, 255));
			g.drawText("SCORE", 160, 280, 20, true, Color.rgb(255, 255, 255));
			g.drawText(Long.toString(Mode.score), 160, 300, 18, true, Color.rgb(255, 255, 255));
			g.drawText("NAME", 260, 280, 20, true, Color.rgb(255, 255, 255));
			g.drawText(initials, 260, 300, 18, true, Color.rgb(255, 255, 255));
			for(int i = 0; i < 10; i++){
				g.drawToSize(Assets.item1, i*26+25, 10*26+96, 36, 36);
				g.drawText(Letter.letters[i], i*26+43, 10*26+120, 21, true, Color.rgb(0, 40, 0));
			}
			for(int i = 0; i < 10; i++){
				g.drawToSize(Assets.item1, i*26+25, 11*26+96, 36, 36);
				g.drawText(Letter.letters[i+10], i*26+43, 11*26+120, 21, true, Color.rgb(0, 40, 0));
			}
			for(int i = 0; i < 6; i++){
				g.drawToSize(Assets.item1, i*26+25, 12*26+96, 36, 36);
				g.drawText(Letter.letters[i+20], i*26+43, 12*26+120, 21, true, Color.rgb(0, 40, 0));
			}
			g.drawPixmap(Assets.delete, 7*26+30, 12*26+101);
			g.drawPixmap(Assets.submit, 9*26+30, 12*26+101);
		} else{
			g.drawPixmap(Assets.options, 80, 319);
		}
	}
	
	private void drawGameOver(){ //On top of world
		g.drawRect(30, 101, 260, 338, true, Color.rgb(0,0,0));
		g.drawPixmap(Assets.go, 80, 111);
		g.drawPixmap(Assets.options, 80, 319);
	}
	
	private void drawSuccess(){ //On top of world
		g.drawText("TIME UP!!!", 160, 86, 20, true, Color.RED);
	}
	
	private void drawAnimations(){ //On top of world
		if(world.animations.size() > 0){
			for(int i = 0; i < world.animations.size(); i++){
				int type = world.animations.get(i).type;
				if(type == Animation.LETTER){
					g.drawCircle(world.animations.get(i).centerX, world.animations.get(i).centerY, 
							world.animations.get(i).radius, 5f, false, Color.argb(world.animations.get(i).alpha, 
									world.animations.get(i).red, world.animations.get(i).green, 
									world.animations.get(i).blue));
				} else if(type == Animation.WORD){
					for(int j = 0; j < 8; j++){
						g.drawLine(world.animations.get(i).x1[j], world.animations.get(i).y1[j], 
								world.animations.get(i).x2[j], world.animations.get(i).y2[j], 5f,
								Color.argb(world.animations.get(i).alpha, world.animations.get(i).red, 
										world.animations.get(i).green, world.animations.get(i).blue));
					}
				} else if(type == Animation.DEATH || type == Animation.SUCCESS){
					g.drawPixmap(Assets.head, world.animations.get(i).headX, world.animations.get(i).headY, 
							world.snake.direction*36, world.animations.get(i).snakeHeadAnimation*36, 36, 36);
				} else if(type == Animation.DISPLAY_WORD){
					g.drawText(world.animations.get(i).display, world.animations.get(i).x, world.animations.get(i).y, 24, true, Color.CYAN);
				}
			}
		}
	}
	
	private void handleMusic(){
		if(Assets.bgm != null){
			if(Assets.bgm.isPlaying()){
				Assets.bgm.pause();
			} else{
				Assets.bgm.play();
			}
		}
	}
	
	@Override
	public void pause() {
		if(gState == GameState.Running){
			Assets.click.play(1);
			handleMusic();
			gState = GameState.Paused;
		}
	}
	
	@Override
	public void unpause() {
		if(gState == GameState.Paused){
			Assets.click.play(1);
			handleMusic();
			gState = GameState.Running;
		}
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		SaveData.save();
	}

	@Override
	public int identity() {
		return 0;
	}
	
	public void reload() {
	    Intent intent = game.getActivity().getIntent();
	    game.getActivity().overridePendingTransition(0, 0);
	    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
	    game.getActivity().finish();

	    game.getActivity().overridePendingTransition(0, 0);
	    game.getActivity().startActivity(intent);
	}

}