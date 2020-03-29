package com.technegames.lexiconda;

import com.technegames.framework.Audio;
import com.technegames.framework.imp.AndroidAudio;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class LexiconActivity extends Activity{
	Audio audio;
	WakeLock wakeLock;
	Animation btnPress;
	Button btnBack;
	Button btnUp;
	Button btnDown;
	TextView txtList;
	enum ACTION { Back, Up, Down };
	ACTION action;
	int index;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
		wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "Lexiconda");
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.lexicon);
		
		index = 0;
		btnPress = AnimationUtils.loadAnimation(this, R.anim.button);
		btnBack = (Button) findViewById(R.id.btnBack);
		btnUp = (Button) findViewById(R.id.btnUp);
		btnDown = (Button) findViewById(R.id.btnDown);
		txtList = (TextView) findViewById(R.id.list);
		txtList.setMovementMethod(new ScrollingMovementMethod());
		
		audio = new AndroidAudio(this);
		loadSound();
		updateText();
		
		btnPress.setAnimationListener(new AnimationListener(){
			@Override
			public void onAnimationEnd(Animation arg0) {
				switch(action){
				case Back:
					finish();
	                break;
				default:
					break;	
				}
			}
			@Override
			public void onAnimationRepeat(Animation animation) {
				//Nothing to do here... right??
			}
			@Override
			public void onAnimationStart(Animation animation) {
				switch(action){
				case Up:
					txtList.scrollBy(0, -1000);
					break;
				case Down:
					txtList.scrollBy(0, 1000);
					break;
				case Back:
					if(Assets.click != null){
						Assets.click.play(1);
					}
					break;
				default:
					break;	
				}
			}
		});
	}
	
	public void click(View view){
		int id = view.getId();
		switch(id){
		case R.id.btnBack:
			btnBack.startAnimation(btnPress);
			action = ACTION.Back;
			return;
		case R.id.btnUp:
			btnUp.startAnimation(btnPress);
			action = ACTION.Up;
			return;
		case R.id.btnDown:
			btnDown.startAnimation(btnPress);
			action = ACTION.Down;
			return;
		default:
			return;
		}
	}
	
	private void loadSound(){
		//Load some catchy sound effects!
		Assets.click = audio.newSound("click.ogg"); //ANY TYPE OF CLICK!!!
	}
	
	private void updateText(){
		Cursor cur = SaveData.loadWordTable();
		if(cur != null){
			cur.moveToFirst();
	        while (cur.isAfterLast() == false) {
	            txtList.append(cur.getString(0) + "\n");
	       	    cur.moveToNext();
	        }
	        cur.close();
		}
	}
	
	@Override
	public void onResume(){
		super.onResume();
		wakeLock.acquire();
	}
	
	@Override
	public void onPause(){
		super.onPause();
		wakeLock.release();
	}
	
}