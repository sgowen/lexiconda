package com.technegames.lexiconda;

import java.util.Random;

public class Animation {
	public static final int LETTER = 0;
	public static final int WORD = 1;
	public static final int DEATH = 2;
	public static final int DISPLAY_WORD = 3;
	public static final int SUCCESS = 4;
	public static final float WORD_TIME = 0.04f;
	public static final float LETTER_TIME = 0.04f;
	public static final float DEATH_TIME = 0.15f;
	public static final float DISPLAY_WORD_TIME = 2.0f;
	public static final float SUCCESS_TIME = 0.1f;
	
	boolean destroy;
	float tick;
	int type;
	
	Random random; //ANY
	int alpha; //ANY
	int red; //ANY
	int blue; //ANY
	int green; //ANY
	
	int[] x1 = new int[16]; //WORD
	int[] y1 = new int[16]; //WORD
	int[] x2 = new int[16]; //WORD
	int[] y2 = new int[16]; //WORD
	
	int centerX; //LETTER
	int centerY; //LETTER
	int radius; //LETTER
	
	int snakeHeadAnimation; //DEATH
	int headX; //DEATH
	int headY; //DEATH
	
	int count; //SUCCESS
	
	String display; //DISPLAY_WORD
	int x; //DISPLAY_WORD
	int y; //DISPLAY_WORD
	
	public Animation(int x, int y, String display, int type){
		this.type = type;
		tick = 0;
		destroy = false;
		if(type == LETTER){
			random = new Random();
			alpha = 255;
			red = random.nextInt(255);
			green = random.nextInt(255);
			blue = random.nextInt(255);
			radius = 13; //LetterCircle
			centerX = x * 26 + 43;
			centerY = y * 26 + 114;
		} else if(type == WORD){
			random = new Random();
			alpha = 255;
			red = random.nextInt(255);
			green = random.nextInt(255);
			blue = random.nextInt(255);
			centerX = x * 26 + 43;
			centerY = y * 26 + 114;
			for(int i = 0; i < x1.length; i++){
				x1[i] = centerX;
				y1[i] = centerY;
			}
			//LEFT
			x2[0] = x1[0] - 10;
			y2[0] = y1[0];
			x2[1] = x1[1] - 8;
			y2[1] = y1[1] - 6;
			x2[2] = x1[2] - 8;
			y2[2] = y1[2] + 6;
			//MIDDLE
			x2[3] = x1[3];
			y2[3] = y1[3] - 10;
			x2[4] = x1[4];
			y2[4] = y1[4] + 10;
			//RIGHT
			x2[5] = x1[5] + 10;
			y2[5] = y1[5];
			x2[6] = x1[6] + 8;
			y2[6] = y1[6] - 6;
			x2[7] = x1[7] + 8;
			y2[7] = y1[7] + 6;
		} else if(type == DEATH){
			snakeHeadAnimation = 6;
			headX = x * 26 + 25;
			headY = y * 26 + 96;
		} else if(type == SUCCESS){
			snakeHeadAnimation = 0;
			headX = x * 26 + 25;
			headY = y * 26 + 96;
			count = 0;
		} else if(type == DISPLAY_WORD){
			this.display = display;
			this.x = x;
			this.y = y;
		}
	}
	
	public void update(float deltaTime){
		if(type == LETTER){
			updateEatLetter(deltaTime);
		} else if(type == WORD){
			updateSpellWord(deltaTime);
		} else if(type == DEATH){
			updateDeath(deltaTime);
		} else if(type == SUCCESS){
			updateSuccess(deltaTime);
		} else if(type == DISPLAY_WORD){
			updateDisplayWord(deltaTime);
		}
	}
	
	private void updateEatLetter(float deltaTime){
		if(radius < 38){
			tick += deltaTime;
			if(tick > LETTER_TIME){
				tick = 0;
				radius++;
				alpha -= 10;
				red = random.nextInt(255);
				green = random.nextInt(255);
				blue = random.nextInt(255);
			}
		} else if(destroy == false){
			destroy = true;
		}
	}
	
	private void updateSpellWord(float deltaTime){
		if(alpha > 55){
			tick += deltaTime;
			if(tick > WORD_TIME){
				tick = 0;
				alpha -= 5;
				red = random.nextInt(255);
				green = random.nextInt(255);
				blue = random.nextInt(255);
				//LEFT
				x1[0] -= 5;
				x1[1] -= 4;
				y1[1] -= 3;
				x1[2] -= 4;
				y1[2] += 3;
				//MIDDLE
				y1[3] -= 5;
				y1[4] += 5;
				//RIGHT
				x1[5] += 5;
				x1[6] += 4;
				y1[6] -= 3;
				x1[7] += 4;
				y1[7] += 3;
				//LEFT
				x2[0] = x1[0] - 10;
				y2[0] = y1[0];
				x2[1] = x1[1] - 8;
				y2[1] = y1[1] - 6;
				x2[2] = x1[2] - 8;
				y2[2] = y1[2] + 6;
				//MIDDLE
				x2[3] = x1[3];
				y2[3] = y1[3] - 10;
				x2[4] = x1[4];
				y2[4] = y1[4] + 10;
				//RIGHT
				x2[5] = x1[5] + 10;
				y2[5] = y1[5];
				x2[6] = x1[6] + 8;
				y2[6] = y1[6] - 6;
				x2[7] = x1[7] + 8;
				y2[7] = y1[7] + 6;
			}
		} else if(destroy == false){
			destroy = true;
		}
	}
	
	private void updateDeath(float deltaTime){
		if(snakeHeadAnimation < 15){
			tick += deltaTime;
			if(tick > DEATH_TIME){
				tick = 0;
				snakeHeadAnimation++;
			}
		} else if(destroy == false){
			destroy = true;
		}
	}
	
	private void updateSuccess(float deltaTime){
		if(count < 15){
			tick += deltaTime;
			if(tick > DEATH_TIME){
				tick = 0;
				snakeHeadAnimation = snakeHeadAnimation + 1 < 5 ? snakeHeadAnimation + 1 : 0;
				count++;
			}
		} else if(destroy == false){
			destroy = true;
		}
	}
	
	private void updateDisplayWord(float deltaTime){
		if(destroy == false){
			tick += deltaTime;
			if(tick > DISPLAY_WORD_TIME){
				tick = 0;
				destroy = true;
			}
		}
	}
	
}