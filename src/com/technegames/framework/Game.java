package com.technegames.framework;

import android.app.Activity;

public interface Game {
	public Input getInput();
	
	public Graphics getGraphics();
	
	public Audio getAudio();
	
	public void setScreen(Screen screen);
	
	public Screen getCurrentScreen();
	
	public Screen getStartScreen();
	
	public Activity getActivity();
}
