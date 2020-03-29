package com.technegames.lexiconda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake {
	public static final int UP = 0;
	public static final int LEFT = 1;
	public static final int DOWN = 2;
	public static final int RIGHT = 3;
	
	public List<SnakePart> parts = new ArrayList<SnakePart>();
	public int direction;
	public int lettersEaten;
	
	public int snakeHeadAnimation;
	public int snakeTailAnimation;
	
	Random random = new Random();
	
	public Snake(){
		direction = UP;
		snakeHeadAnimation = 0;
		snakeTailAnimation = 0;
		lettersEaten = 1;
		parts.add(new SnakePart(5,5,26));
		parts.add(new SnakePart(5,6,Index.indexesFirstLetter[random.nextInt(100)]));
	}
	
	public void turnLeft(){
		direction += 1;
		if(direction > RIGHT){
			direction = UP;
		}
	}
	
	public void turnRight(){
		direction -= 1;
		if(direction < UP){
			direction = RIGHT;
		}
	}
	
	public void eat(int index){
		updateLetterEaten();
		lettersEaten++;
		SnakePart end = parts.get(parts.size()-1);
		parts.add(new SnakePart(end.x, end.y, index));
	}
	
	public void addPenaltyBlock(){
		SnakePart beginning = parts.get(1);
		parts.add(1, new SnakePart(beginning.x, beginning.y, 27));
	}
	
	public void updateMovement(){
		snakeHeadAnimation = snakeHeadAnimation + 1 < 5 ? snakeHeadAnimation + 1 : 0;
		if(snakeHeadAnimation > 2){
			snakeTailAnimation = 1;
		} else{
			snakeTailAnimation = 0;
		}
	}
	
	public void updateLetterEaten(){
		snakeHeadAnimation = 5;
	}
	
	public void advance(){
		updateMovement();
		SnakePart head = parts.get(0);
		
		int len = parts.size() - 1;
		for(int i = len; i > 0; i--){
			SnakePart before = parts.get(i-1);
			SnakePart part = parts.get(i);
			part.x = before.x;
			part.y = before.y;
		}
		
		if(direction == UP){
			head.y -= 1;
		}
		if(direction == LEFT){
			head.x -= 1;
		}
		if(direction == DOWN){
			head.y += 1;
		}
		if(direction == RIGHT){
			head.x += 1;
		}
		
		if(head.x < 0){
			head.x = World.WORLD_WIDTH-1;
		}
		if(head.x > World.WORLD_WIDTH-1){
			head.x = 0;
		}
		if(head.y < 0){
			head.y = World.WORLD_HEIGHT-1;
		}
		if(head.y > World.WORLD_HEIGHT-1){
			head.y = 0;
		}
	}
	
	public boolean checkBitten(){
		int len = parts.size();
		SnakePart head = parts.get(0);
		for(int i =1; i < len; i++){
			SnakePart part = parts.get(i);
			if(part.x == head.x && part.y == head.y){
				return true;
			}
		}
		return false;
	}
}
