package com.technegames.framework;

public abstract class Screen {
	protected final Game game;
	
	public Screen(Game game){
		this.game = game;
	}
	
	public abstract void update(float deltaTime);
	
	public abstract void present(float deltaTime);
	
	public abstract void pause();
	
	public abstract void unpause(); //Only For Menu Item Interactivity
	
	public abstract void resume();
	
	public abstract void dispose();
	
	public abstract int identity(); //Useful for assigning identity to screens
}
