package com.technegames.lexiconda;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
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

import com.technegames.dict.A.DictionaryA1;
import com.technegames.dict.A.DictionaryA2;
import com.technegames.dict.A.DictionaryA3;
import com.technegames.dict.A.DictionaryA4;
import com.technegames.dict.A.DictionaryA5;
import com.technegames.dict.B.DictionaryB1;
import com.technegames.dict.B.DictionaryB2;
import com.technegames.dict.B.DictionaryB3;
import com.technegames.dict.B.DictionaryB4;
import com.technegames.dict.B.DictionaryB5;
import com.technegames.dict.C.DictionaryC1;
import com.technegames.dict.C.DictionaryC2;
import com.technegames.dict.C.DictionaryC3;
import com.technegames.dict.C.DictionaryC4;
import com.technegames.dict.C.DictionaryC5;
import com.technegames.dict.D.DictionaryD1;
import com.technegames.dict.D.DictionaryD2;
import com.technegames.dict.D.DictionaryD3;
import com.technegames.dict.D.DictionaryD4;
import com.technegames.dict.D.DictionaryD5;
import com.technegames.dict.E.DictionaryE1;
import com.technegames.dict.E.DictionaryE2;
import com.technegames.dict.E.DictionaryE3;
import com.technegames.dict.E.DictionaryE4;
import com.technegames.dict.E.DictionaryE5;
import com.technegames.dict.F.DictionaryF1;
import com.technegames.dict.F.DictionaryF2;
import com.technegames.dict.F.DictionaryF3;
import com.technegames.dict.F.DictionaryF4;
import com.technegames.dict.F.DictionaryF5;
import com.technegames.dict.G.DictionaryG1;
import com.technegames.dict.G.DictionaryG2;
import com.technegames.dict.G.DictionaryG3;
import com.technegames.dict.G.DictionaryG4;
import com.technegames.dict.G.DictionaryG5;
import com.technegames.dict.H.DictionaryH1;
import com.technegames.dict.H.DictionaryH2;
import com.technegames.dict.H.DictionaryH3;
import com.technegames.dict.H.DictionaryH4;
import com.technegames.dict.H.DictionaryH5;
import com.technegames.dict.I.DictionaryI1;
import com.technegames.dict.I.DictionaryI2;
import com.technegames.dict.I.DictionaryI3;
import com.technegames.dict.I.DictionaryI4;
import com.technegames.dict.I.DictionaryI5;
import com.technegames.dict.J.DictionaryJ1;
import com.technegames.dict.J.DictionaryJ2;
import com.technegames.dict.J.DictionaryJ3;
import com.technegames.dict.J.DictionaryJ4;
import com.technegames.dict.J.DictionaryJ5;
import com.technegames.dict.K.DictionaryK1;
import com.technegames.dict.K.DictionaryK2;
import com.technegames.dict.K.DictionaryK3;
import com.technegames.dict.K.DictionaryK4;
import com.technegames.dict.K.DictionaryK5;
import com.technegames.dict.L.DictionaryL1;
import com.technegames.dict.L.DictionaryL2;
import com.technegames.dict.L.DictionaryL3;
import com.technegames.dict.L.DictionaryL4;
import com.technegames.dict.L.DictionaryL5;
import com.technegames.dict.M.DictionaryM1;
import com.technegames.dict.M.DictionaryM2;
import com.technegames.dict.M.DictionaryM3;
import com.technegames.dict.M.DictionaryM4;
import com.technegames.dict.M.DictionaryM5;
import com.technegames.dict.N.DictionaryN1;
import com.technegames.dict.N.DictionaryN2;
import com.technegames.dict.N.DictionaryN3;
import com.technegames.dict.N.DictionaryN4;
import com.technegames.dict.N.DictionaryN5;
import com.technegames.dict.O.DictionaryO1;
import com.technegames.dict.O.DictionaryO2;
import com.technegames.dict.O.DictionaryO3;
import com.technegames.dict.O.DictionaryO4;
import com.technegames.dict.O.DictionaryO5;
import com.technegames.dict.P.DictionaryP1;
import com.technegames.dict.P.DictionaryP2;
import com.technegames.dict.P.DictionaryP3;
import com.technegames.dict.P.DictionaryP4;
import com.technegames.dict.P.DictionaryP5;
import com.technegames.dict.Q.DictionaryQ1;
import com.technegames.dict.Q.DictionaryQ5;
import com.technegames.dict.R.DictionaryR1;
import com.technegames.dict.R.DictionaryR2;
import com.technegames.dict.R.DictionaryR3;
import com.technegames.dict.R.DictionaryR4;
import com.technegames.dict.R.DictionaryR5;
import com.technegames.dict.S.DictionaryS1;
import com.technegames.dict.S.DictionaryS2;
import com.technegames.dict.S.DictionaryS3;
import com.technegames.dict.S.DictionaryS4;
import com.technegames.dict.S.DictionaryS5;
import com.technegames.dict.T.DictionaryT1;
import com.technegames.dict.T.DictionaryT2;
import com.technegames.dict.T.DictionaryT3;
import com.technegames.dict.T.DictionaryT4;
import com.technegames.dict.T.DictionaryT5;
import com.technegames.dict.U.DictionaryU1;
import com.technegames.dict.U.DictionaryU2;
import com.technegames.dict.U.DictionaryU3;
import com.technegames.dict.U.DictionaryU4;
import com.technegames.dict.U.DictionaryU5;
import com.technegames.dict.V.DictionaryV1;
import com.technegames.dict.V.DictionaryV2;
import com.technegames.dict.V.DictionaryV3;
import com.technegames.dict.V.DictionaryV4;
import com.technegames.dict.V.DictionaryV5;
import com.technegames.dict.W.DictionaryW1;
import com.technegames.dict.W.DictionaryW2;
import com.technegames.dict.W.DictionaryW3;
import com.technegames.dict.W.DictionaryW4;
import com.technegames.dict.W.DictionaryW5;
import com.technegames.dict.X.DictionaryX2;
import com.technegames.dict.X.DictionaryX3;
import com.technegames.dict.X.DictionaryX4;
import com.technegames.dict.X.DictionaryX5;
import com.technegames.dict.Y.DictionaryY1;
import com.technegames.dict.Y.DictionaryY2;
import com.technegames.dict.Y.DictionaryY3;
import com.technegames.dict.Y.DictionaryY4;
import com.technegames.dict.Y.DictionaryY5;
import com.technegames.dict.Z.DictionaryZ1;
import com.technegames.dict.Z.DictionaryZ2;
import com.technegames.dict.Z.DictionaryZ3;
import com.technegames.dict.Z.DictionaryZ4;
import com.technegames.dict.Z.DictionaryZ5;
import com.technegames.framework.Audio;
import com.technegames.framework.imp.AndroidAudio;
import com.technegames.framework.imp.DBAdapter;

public class Lexiconda extends Activity{
	Audio audio;
	DBAdapter dba;
	WakeLock wakeLock;
	public static final String SAVE_DATA = "Lexiconda_SAVE_DATA";
	public SharedPreferences settings;
	public SharedPreferences.Editor editor;
	Button btnPlay;
	Button btnHighScores;
	Button btnLexicon;
	Button btnHowToPlay;
	Animation btnPress;
	enum ACTION { Play, HighScores, Lexicon, HowToPlay };
	ACTION action;
	Intent i;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
		wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "Lexiconda");
		setContentView(R.layout.main);
        
		settings = getSharedPreferences(SAVE_DATA, 0);
		editor = settings.edit();
		dba = new DBAdapter(this);
		SaveData.SetActivityInstance(settings, editor, dba);
		SaveData.load();
		audio = new AndroidAudio(this);
		loadDictionary();
		loadSound();
		
		btnPress = AnimationUtils.loadAnimation(this, R.anim.button);
		btnPlay = (Button) findViewById(R.id.btnPlay);
		btnHighScores = (Button) findViewById(R.id.btnHighScores);
		btnLexicon = (Button) findViewById(R.id.btnLexicon);
		btnHowToPlay = (Button) findViewById(R.id.btnHowToPlay);
		
		btnPress.setAnimationListener(new AnimationListener(){
			@Override
			public void onAnimationEnd(Animation arg0) {
				switch(action){
				case Play:
					i = new Intent(getBaseContext(), ModeActivity.class);
	                startActivityForResult(i, -1);
	                break;
	            case HighScores:
					i = new Intent(getBaseContext(), HighScoresActivity.class);
	                startActivityForResult(i, -1);
					break;
				case Lexicon:
					i = new Intent(getBaseContext(), LexiconActivity.class);
	                startActivityForResult(i, -1);
					break;
				case HowToPlay:
					i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://technegames.com/lexiconda/howtoplay.html"));
					startActivity(i);
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
				btnPlay.setEnabled(false);
				btnHighScores.setEnabled(false);
				btnLexicon.setEnabled(false);
				btnHowToPlay.setEnabled(false);
				if(Assets.click != null){
					Assets.click.play(1);
				}
			}
		});
	}
	
	public void click(View view){
		int id = view.getId();
		switch(id){
		case R.id.btnPlay:
			btnPlay.startAnimation(btnPress);
			action = ACTION.Play;
			return;
		case R.id.btnHighScores:
			btnHighScores.startAnimation(btnPress);
			action = ACTION.HighScores;
			return;
		case R.id.btnLexicon:
			btnLexicon.startAnimation(btnPress);
			action = ACTION.Lexicon;
			return;
		case R.id.btnHowToPlay:
			btnHowToPlay.startAnimation(btnPress);
			action = ACTION.HowToPlay;
			return;
		default:
			return;
		}
	}
	
	@Override
	public void onResume(){
		super.onResume();
		wakeLock.acquire();
		btnPlay.setEnabled(true);
		btnHighScores.setEnabled(true);
		btnLexicon.setEnabled(true);
		btnHowToPlay.setEnabled(true);
	}
	
	@Override
	public void onPause(){
		super.onPause();
		wakeLock.release();
	}
	
	private void loadSound(){
		//Load some catchy sound effects!
		Assets.click = audio.newSound("click.ogg"); //ANY TYPE OF CLICK!!!
	}
	
	private void loadDictionary(){
		Assets.dictA1 = new DictionaryA1();
		Assets.dictA2 = new DictionaryA2();
		Assets.dictA3 = new DictionaryA3();
		Assets.dictA4 = new DictionaryA4();
		Assets.dictA5 = new DictionaryA5();
		Assets.dictB1 = new DictionaryB1();
		Assets.dictB2 = new DictionaryB2();
		Assets.dictB3 = new DictionaryB3();
		Assets.dictB4 = new DictionaryB4();
		Assets.dictB5 = new DictionaryB5();
		Assets.dictC1 = new DictionaryC1();
		Assets.dictC2 = new DictionaryC2();
		Assets.dictC3 = new DictionaryC3();
		Assets.dictC4 = new DictionaryC4();
		Assets.dictC5 = new DictionaryC5();
		Assets.dictD1 = new DictionaryD1();
		Assets.dictD2 = new DictionaryD2();
		Assets.dictD3 = new DictionaryD3();
		Assets.dictD4 = new DictionaryD4();
		Assets.dictD5 = new DictionaryD5();
		Assets.dictE1 = new DictionaryE1();
		Assets.dictE2 = new DictionaryE2();
		Assets.dictE3 = new DictionaryE3();
		Assets.dictE4 = new DictionaryE4();
		Assets.dictE5 = new DictionaryE5();
		Assets.dictF1 = new DictionaryF1();
		Assets.dictF2 = new DictionaryF2();
		Assets.dictF3 = new DictionaryF3();
		Assets.dictF4 = new DictionaryF4();
		Assets.dictF5 = new DictionaryF5();
		Assets.dictG1 = new DictionaryG1();
		Assets.dictG2 = new DictionaryG2();
		Assets.dictG3 = new DictionaryG3();
		Assets.dictG4 = new DictionaryG4();
		Assets.dictG5 = new DictionaryG5();
		Assets.dictH1 = new DictionaryH1();
		Assets.dictH2 = new DictionaryH2();
		Assets.dictH3 = new DictionaryH3();
		Assets.dictH4 = new DictionaryH4();
		Assets.dictH5 = new DictionaryH5();
		Assets.dictI1 = new DictionaryI1();
		Assets.dictI2 = new DictionaryI2();
		Assets.dictI3 = new DictionaryI3();
		Assets.dictI4 = new DictionaryI4();
		Assets.dictI5 = new DictionaryI5();
		Assets.dictJ1 = new DictionaryJ1();
		Assets.dictJ2 = new DictionaryJ2();
		Assets.dictJ3 = new DictionaryJ3();
		Assets.dictJ4 = new DictionaryJ4();
		Assets.dictJ5 = new DictionaryJ5();
		Assets.dictK1 = new DictionaryK1();
		Assets.dictK2 = new DictionaryK2();
		Assets.dictK3 = new DictionaryK3();
		Assets.dictK4 = new DictionaryK4();
		Assets.dictK5 = new DictionaryK5();
		Assets.dictL1 = new DictionaryL1();
		Assets.dictL2 = new DictionaryL2();
		Assets.dictL3 = new DictionaryL3();
		Assets.dictL4 = new DictionaryL4();
		Assets.dictL5 = new DictionaryL5();
		Assets.dictM1 = new DictionaryM1();
		Assets.dictM2 = new DictionaryM2();
		Assets.dictM3 = new DictionaryM3();
		Assets.dictM4 = new DictionaryM4();
		Assets.dictM5 = new DictionaryM5();
		Assets.dictN1 = new DictionaryN1();
		Assets.dictN2 = new DictionaryN2();
		Assets.dictN3 = new DictionaryN3();
		Assets.dictN4 = new DictionaryN4();
		Assets.dictN5 = new DictionaryN5();
		Assets.dictO1 = new DictionaryO1();
		Assets.dictO2 = new DictionaryO2();
		Assets.dictO3 = new DictionaryO3();
		Assets.dictO4 = new DictionaryO4();
		Assets.dictO5 = new DictionaryO5();
		Assets.dictP1 = new DictionaryP1();
		Assets.dictP2 = new DictionaryP2();
		Assets.dictP3 = new DictionaryP3();
		Assets.dictP4 = new DictionaryP4();
		Assets.dictP5 = new DictionaryP5();
		Assets.dictQ1 = new DictionaryQ1();
		Assets.dictQ5 = new DictionaryQ5();
		Assets.dictR1 = new DictionaryR1();
		Assets.dictR2 = new DictionaryR2();
		Assets.dictR3 = new DictionaryR3();
		Assets.dictR4 = new DictionaryR4();
		Assets.dictR5 = new DictionaryR5();
		Assets.dictS1 = new DictionaryS1();
		Assets.dictS2 = new DictionaryS2();
		Assets.dictS3 = new DictionaryS3();
		Assets.dictS4 = new DictionaryS4();
		Assets.dictS5 = new DictionaryS5();
		Assets.dictT1 = new DictionaryT1();
		Assets.dictT2 = new DictionaryT2();
		Assets.dictT3 = new DictionaryT3();
		Assets.dictT4 = new DictionaryT4();
		Assets.dictT5 = new DictionaryT5();
		Assets.dictU1 = new DictionaryU1();
		Assets.dictU2 = new DictionaryU2();
		Assets.dictU3 = new DictionaryU3();
		Assets.dictU4 = new DictionaryU4();
		Assets.dictU5 = new DictionaryU5();
		Assets.dictV1 = new DictionaryV1();
		Assets.dictV2 = new DictionaryV2();
		Assets.dictV3 = new DictionaryV3();
		Assets.dictV4 = new DictionaryV4();
		Assets.dictV5 = new DictionaryV5();
		Assets.dictW1 = new DictionaryW1();
		Assets.dictW2 = new DictionaryW2();
		Assets.dictW3 = new DictionaryW3();
		Assets.dictW4 = new DictionaryW4();
		Assets.dictW5 = new DictionaryW5();
		Assets.dictX2 = new DictionaryX2();
		Assets.dictX3 = new DictionaryX3();
		Assets.dictX4 = new DictionaryX4();
		Assets.dictX5 = new DictionaryX5();
		Assets.dictY1 = new DictionaryY1();
		Assets.dictY2 = new DictionaryY2();
		Assets.dictY3 = new DictionaryY3();
		Assets.dictY4 = new DictionaryY4();
		Assets.dictY5 = new DictionaryY5();
		Assets.dictZ1 = new DictionaryZ1();
		Assets.dictZ2 = new DictionaryZ2();
		Assets.dictZ3 = new DictionaryZ3();		
		Assets.dictZ4 = new DictionaryZ4();
		Assets.dictZ5 = new DictionaryZ5();
	}
}