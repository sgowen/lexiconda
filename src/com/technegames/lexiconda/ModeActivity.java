package com.technegames.lexiconda;

import com.technegames.framework.Audio;
import com.technegames.framework.imp.AndroidAudio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ModeActivity extends Activity{
	Audio audio;
	private static final String casual = "Score as many points as you can in 3 minutes! Extend your time limit by spelling words!";
	private static final String survival = "Play as long as you can surive! Penalty blocks are added to your snake when you mess up a word, so be careful!";
	WakeLock wakeLock;
	Animation btnPress;
	Button btnBack;
	Button btnGo;
	Button btnCasual;
	Button btnSurvival;
	TextView txtDescription;
	TextView txtMode;
	enum ACTION { Back, Go, Casual, Survival };
	ACTION action;
	Intent i;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
		wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "Lexiconda");
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.mode);
		
		btnPress = AnimationUtils.loadAnimation(this, R.anim.button);
		btnBack = (Button) findViewById(R.id.btnBack);
		btnGo = (Button) findViewById(R.id.btnGo);
		btnCasual = (Button) findViewById(R.id.btnCasual);
		btnSurvival = (Button) findViewById(R.id.btnSurvival);
		txtDescription = (TextView) findViewById(R.id.txtDescription);
		txtMode = (TextView) findViewById(R.id.txtMode);
		
		audio = new AndroidAudio(this);
		loadSound();
		action = ACTION.Casual;
		setText(0);
		
		btnPress.setAnimationListener(new AnimationListener(){
			@Override
			public void onAnimationEnd(Animation arg0) {
				switch(action){
				case Back:
					finish();
					break;
				case Go:
					i = new Intent(getBaseContext(), GameActivity.class);
	                startActivityForResult(i, -1);
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
				if(Assets.click != null){
					Assets.click.play(1);
				}
				switch(action){
				case Casual:
					Mode.setMode(Mode.CASUAL);
					setText(0);
	                break;
				case Survival:
					Mode.setMode(Mode.SURVIVAL);
					setText(1);
	                break;
				default:
					break;
				}
			}
		});
	}
	
	private void setText(int type){
		switch(type){
		case 0:
			txtMode.setText("Casual");
			txtDescription.setText(casual);
			break;
		case 1:
			txtMode.setText("Survival");
			txtDescription.setText(survival);
			break;
		default:
			break;
		}
		Toast.makeText(getBaseContext(), Mode.MODES[Mode.mode] + " Mode", Toast.LENGTH_SHORT).show();
	}
	
	public void click(View view){
		int id = view.getId();
		switch(id){
		case R.id.btnCasual:
			btnCasual.startAnimation(btnPress);
			action = ACTION.Casual;
			return;
		case R.id.btnSurvival:
			btnSurvival.startAnimation(btnPress);
			action = ACTION.Survival;
			return;
		case R.id.btnBack:
			btnBack.startAnimation(btnPress);
			action = ACTION.Back;
			return;
		case R.id.btnGo:
			btnGo.startAnimation(btnPress);
			action = ACTION.Go;
			return;
		default:
			return;
		}
	}
	
	private void loadSound(){
		//Load some catchy sound effects!
		Assets.click = audio.newSound("click.ogg"); //ANY TYPE OF CLICK!!!
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