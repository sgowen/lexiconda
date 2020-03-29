package com.technegames.framework.imp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.technegames.framework.Audio;
import com.technegames.framework.Game;
import com.technegames.framework.Graphics;
import com.technegames.framework.Input;
import com.technegames.framework.Screen;
import com.technegames.lexiconda.R;

public abstract class AndroidGame extends Activity implements Game{
	Activity activity;
	Context context;
	AndroidFastRenderView renderView;
	Graphics graphics;
	Bitmap frameBuffer;
	Audio audio;
	Input input;
	Screen screen;
	WakeLock wakeLock;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.game);
		
		boolean isLandscape = getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
		int frameBufferWidth = isLandscape ? 480 : 320;
		int frameBufferHeight = isLandscape ? 320 : 480;
		frameBuffer = Bitmap.createBitmap(frameBufferWidth, frameBufferHeight, Config.RGB_565);
		float scaleX = (float) frameBufferWidth / getWindowManager().getDefaultDisplay().getWidth();
		float scaleY = (float) frameBufferHeight / getWindowManager().getDefaultDisplay().getHeight();
		
		
		activity = this;
		renderView = new AndroidFastRenderView(this, frameBuffer);
		graphics = new AndroidGraphics(getAssets(), frameBuffer);
		audio = new AndroidAudio(this);
		input = new AndroidInput(this, renderView, scaleX, scaleY);
		
		LinearLayout game = (LinearLayout) findViewById(R.id.game);
		game.addView(renderView);
		
		screen = getStartScreen();
		
		PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
		wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "Lexiconda");
	}
	
	@Override
	public void onResume(){
		super.onResume();
		screen.resume();
		renderView.resume();
		wakeLock.acquire();
	}
	
	@Override
	public void onPause(){
		super.onPause();
		screen.pause();
		renderView.pause();
		wakeLock.release();
		if(isFinishing()){
			screen.dispose();
			finish();
		}
	}
	
	@Override
	public Input getInput(){
		return input;
	}
	
	@Override
	public Graphics getGraphics(){
		return graphics;
	}
	
	@Override
	public Audio getAudio(){
		return audio;
	}
	
	@Override
	public void setScreen(Screen screen){
		if(screen == null){
			throw new IllegalArgumentException("Screen must not be null");
		}
		
		this.screen.pause();
		this.screen.dispose();
		screen.resume();
		screen.update(0);
		this.screen = screen;
	}
	
	@Override
	public Screen getCurrentScreen(){
		return screen;
	}
	
	@Override
	public Activity getActivity(){
		return activity;
	}
}
