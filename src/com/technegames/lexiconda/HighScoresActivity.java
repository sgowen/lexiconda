package com.technegames.lexiconda;

import com.technegames.framework.Audio;
import com.technegames.framework.imp.AndroidAudio;

import android.app.Activity;
import android.content.Context;
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

public class HighScoresActivity extends Activity{
	Audio audio;
	WakeLock wakeLock;
	Animation btnPress;
	Button btnCasual;
	Button btnSurvival;
	Button btnBack;
	TextView txtModeDisplayed;
	TextView txtScore1;
	TextView txtScore2;
	TextView txtScore3;
	TextView txtScore4;
	TextView txtScore5;
	TextView txtScore6;
	TextView txtScore7;
	TextView txtScore8;
	TextView txtScore9;
	TextView txtScore10;
	TextView txtName1;
	TextView txtName2;
	TextView txtName3;
	TextView txtName4;
	TextView txtName5;
	TextView txtName6;
	TextView txtName7;
	TextView txtName8;
	TextView txtName9;
	TextView txtName10;
	enum ACTION { Back, Casual, Survival };
	ACTION action;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
		wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "Lexiconda");
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.highscores);
		
		btnPress = AnimationUtils.loadAnimation(this, R.anim.button);
		btnBack = (Button) findViewById(R.id.btnBack);
		btnCasual = (Button) findViewById(R.id.btnCasual);
		btnSurvival = (Button) findViewById(R.id.btnSurvival);
		txtModeDisplayed = (TextView) findViewById(R.id.modeDisplayed);
		txtScore1 = (TextView) findViewById(R.id.score1);
		txtScore2 = (TextView) findViewById(R.id.score2);
		txtScore3 = (TextView) findViewById(R.id.score3);
		txtScore4 = (TextView) findViewById(R.id.score4);
		txtScore5 = (TextView) findViewById(R.id.score5);
		txtScore6 = (TextView) findViewById(R.id.score6);
		txtScore7 = (TextView) findViewById(R.id.score7);
		txtScore8 = (TextView) findViewById(R.id.score8);
		txtScore9 = (TextView) findViewById(R.id.score9);
		txtScore10 = (TextView) findViewById(R.id.score10);
		txtName1 = (TextView) findViewById(R.id.name1);
		txtName2 = (TextView) findViewById(R.id.name2);
		txtName3 = (TextView) findViewById(R.id.name3);
		txtName4 = (TextView) findViewById(R.id.name4);
		txtName5 = (TextView) findViewById(R.id.name5);
		txtName6 = (TextView) findViewById(R.id.name6);
		txtName7 = (TextView) findViewById(R.id.name7);
		txtName8 = (TextView) findViewById(R.id.name8);
		txtName9 = (TextView) findViewById(R.id.name9);
		txtName10 = (TextView) findViewById(R.id.name10);
		
		audio = new AndroidAudio(this);
		loadSound();
		SaveData.load();
		updateHighscoreTable(0);
		
		btnPress.setAnimationListener(new AnimationListener(){
			@Override
			public void onAnimationEnd(Animation arg0) {
				switch(action){
				case Back:
					finish();
	                break;
				case Casual:
					updateHighscoreTable(0);
	                break;
				case Survival:
					updateHighscoreTable(1);
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
		case R.id.btnCasual:
			btnCasual.startAnimation(btnPress);
			action = ACTION.Casual;
			return;
		case R.id.btnSurvival:
			btnSurvival.startAnimation(btnPress);
			action = ACTION.Survival;
			return;
		default:
			return;
		}
	}
	
	private void loadSound(){
		//Load some catchy sound effects!
		Assets.click = audio.newSound("click.ogg"); //ANY TYPE OF CLICK!!!
	}
	
	private void updateHighscoreTable(int type){
		switch(type){
		case 0:
			txtModeDisplayed.setText("Casual Mode");
			txtScore1.setText(Long.toString(SaveData.casualHighscores[0]));
			txtScore2.setText(Long.toString(SaveData.casualHighscores[1]));
			txtScore3.setText(Long.toString(SaveData.casualHighscores[2]));
			txtScore4.setText(Long.toString(SaveData.casualHighscores[3]));
			txtScore5.setText(Long.toString(SaveData.casualHighscores[4]));
			txtScore6.setText(Long.toString(SaveData.casualHighscores[5]));
			txtScore7.setText(Long.toString(SaveData.casualHighscores[6]));
			txtScore8.setText(Long.toString(SaveData.casualHighscores[7]));
			txtScore9.setText(Long.toString(SaveData.casualHighscores[8]));
			txtScore10.setText(Long.toString(SaveData.casualHighscores[9]));
			txtName1.setText(SaveData.casualHighscoresInitials[0]);
			txtName2.setText(SaveData.casualHighscoresInitials[1]);
			txtName3.setText(SaveData.casualHighscoresInitials[2]);
			txtName4.setText(SaveData.casualHighscoresInitials[3]);
			txtName5.setText(SaveData.casualHighscoresInitials[4]);
			txtName6.setText(SaveData.casualHighscoresInitials[5]);
			txtName7.setText(SaveData.casualHighscoresInitials[6]);
			txtName8.setText(SaveData.casualHighscoresInitials[7]);
			txtName9.setText(SaveData.casualHighscoresInitials[8]);
			txtName10.setText(SaveData.casualHighscoresInitials[9]);
			return;
		case 1:
			txtModeDisplayed.setText("Survival Mode");
			txtScore1.setText(Long.toString(SaveData.survivalHighscores[0]));
			txtScore2.setText(Long.toString(SaveData.survivalHighscores[1]));
			txtScore3.setText(Long.toString(SaveData.survivalHighscores[2]));
			txtScore4.setText(Long.toString(SaveData.survivalHighscores[3]));
			txtScore5.setText(Long.toString(SaveData.survivalHighscores[4]));
			txtScore6.setText(Long.toString(SaveData.survivalHighscores[5]));
			txtScore7.setText(Long.toString(SaveData.survivalHighscores[6]));
			txtScore8.setText(Long.toString(SaveData.survivalHighscores[7]));
			txtScore9.setText(Long.toString(SaveData.survivalHighscores[8]));
			txtScore10.setText(Long.toString(SaveData.survivalHighscores[9]));
			txtName1.setText(SaveData.survivalHighscoresInitials[0]);
			txtName2.setText(SaveData.survivalHighscoresInitials[1]);
			txtName3.setText(SaveData.survivalHighscoresInitials[2]);
			txtName4.setText(SaveData.survivalHighscoresInitials[3]);
			txtName5.setText(SaveData.survivalHighscoresInitials[4]);
			txtName6.setText(SaveData.survivalHighscoresInitials[5]);
			txtName7.setText(SaveData.survivalHighscoresInitials[6]);
			txtName8.setText(SaveData.survivalHighscoresInitials[7]);
			txtName9.setText(SaveData.survivalHighscoresInitials[8]);
			txtName10.setText(SaveData.survivalHighscoresInitials[9]);
			return;
		default:
			return;
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