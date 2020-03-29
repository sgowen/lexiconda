package com.technegames.lexiconda;

public class SnakePart {
	public int x, y;
	public int index;
	public String letter;
	
	public SnakePart(int x, int y, int index){
		this.x = x;
		this.y = y;
		this.index = index;
		this.letter = Letter.letters[index];
	}
}
