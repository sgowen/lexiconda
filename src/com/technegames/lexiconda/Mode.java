package com.technegames.lexiconda;

public class Mode {
	public static final int CASUAL = 0;
	public static final int SURVIVAL = 1;
	public static final int DECATHLON = 2;
	public static final int WORDRUSH = 3;
	public static final int TAP = 99;
	public static final int FLING = 98;
	public static final int KEYBOARD = 97;
	public static final String[] LEADERBOARDS = { "908017", "908027", "908037", "908047" };
	public static final String[] MODES = { "Casual", "Survival", "Decathlon", "Word Rush" };
	public static final String[] CONTROLS = { "Tap", "Keyboard" };
	public static final int[] CONTROLTYPES = { TAP, KEYBOARD };
	public static int mode; //the mode determines what type of game the player is going to play
	public static int controls;
	public static long score;
	
	public static void setMode(int mode){
		Mode.mode = mode;
	}
	
	public static void setControls(int controls){
		Mode.controls = controls;
	}
	
	public static void setEndGameScore(long score){
		Mode.score = score;
	}
}