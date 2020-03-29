package com.technegames.lexiconda;

import com.technegames.framework.imp.DBAdapter;

import android.content.SharedPreferences;
import android.database.Cursor;

public class SaveData{
	private static SharedPreferences settings;
	private static SharedPreferences.Editor editor;
	private static DBAdapter dba;
	private static final int NUM_SCORES = 10;
	public static int newHighscoreRow = 0;
	public static boolean submitOpenFeint;
	
	//Scores and Initials to be Saved
	public static long[] casualHighscores = new long[NUM_SCORES];
	public static String[] casualHighscoresInitials = new String[NUM_SCORES];
	public static long[] survivalHighscores = new long[NUM_SCORES];
	public static String[] survivalHighscoresInitials = new String[NUM_SCORES];
	//Control Preference
	public static int controlPref;
	
	//Location for Storing Highscores and Initials
	private static final String[] casualHighscoreColumn2 = { "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "a9", "a10"}; //score
	private static final String[] casualHighscoreColumn3 = { "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8", "b9", "b10"}; //initials
	private static final String[] survivalHighscoreColumn2 = { "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10"}; //score
	private static final String[] survivalHighscoreColumn3 = { "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10"}; //initials
	//Storage for Control Preference
	private static final String controls = "controls";
	
	public static void SetActivityInstance(SharedPreferences settings, SharedPreferences.Editor editor, DBAdapter dba){
		SaveData.settings = settings;
		SaveData.editor = editor;
		SaveData.dba = dba;
		SaveData.submitOpenFeint = false;
		SaveData.dba.open();
	}
	
	public static void load(){
		loadHighscores();
		loadControlPreferences();
	}
	
	public static Cursor loadWordTable(){
		return dba.getUniqueSortedWords();
	}
	
	private static void loadHighscores(){
		for(int i = 0; i < NUM_SCORES; i++){
			casualHighscores[i] = settings.getLong(casualHighscoreColumn2[i], 0);
			casualHighscoresInitials[i] = settings.getString(casualHighscoreColumn3[i], "");
			survivalHighscores[i] = settings.getLong(survivalHighscoreColumn2[i], 0);
			survivalHighscoresInitials[i] = settings.getString(survivalHighscoreColumn3[i], "");
		}
	}
	
	private static void loadControlPreferences(){
		controlPref = settings.getInt(controls, 0);
		Mode.setControls(Mode.CONTROLTYPES[controlPref]);
	}
	
	public static void save(){
		saveUsedWords();
		saveHighscores();
		saveControlPreference();
		editor.commit();
	}
	
	private static void saveUsedWords(){
		for(int i = 0; i < Assets.usedWords.usedWords.size(); i++){
			dba.insertWord(Assets.usedWords.usedWords.get(i));
		}
	}
	
	private static void saveHighscores(){
		for(int i = 0; i < NUM_SCORES; i++){
			editor.putLong(casualHighscoreColumn2[i], casualHighscores[i]);
			editor.putString(casualHighscoreColumn3[i], casualHighscoresInitials[i]);
			editor.putLong(survivalHighscoreColumn2[i], survivalHighscores[i]);
			editor.putString(survivalHighscoreColumn3[i], survivalHighscoresInitials[i]);
		}
	}
	
	private static void saveControlPreference(){
		editor.putInt(controls, controlPref);
	}
	
	public static void addScore(long score, int type, String initials){
		switch(type){
		case 0: //Casual Mode
			for(int i = newHighscoreRow; i < casualHighscores.length; i++){
				if(casualHighscores[i] < score){
					for(int j = casualHighscores.length -1; j > i; j--){
						casualHighscores[j] = casualHighscores[j-1];
						casualHighscoresInitials[j] = casualHighscoresInitials[j-1];
					}
					casualHighscores[i] = score;
					casualHighscoresInitials[i] = initials;
					return;
				}
			}
			return;
		case 1: //Survival Mode
			for(int i = newHighscoreRow; i < survivalHighscores.length; i++){
				if(survivalHighscores[i] < score){
					for(int j = survivalHighscores.length -1; j > i; j--){
						survivalHighscores[j] = survivalHighscores[j-1];
						survivalHighscoresInitials[j] = survivalHighscoresInitials[j-1];
					}
					survivalHighscores[i] = score;
					survivalHighscoresInitials[i] = initials;
					return;
				}
			}
			return;
		default:
			return;
		}
	}
	
	public static boolean isNewScore(long score, int type){
		switch(type){
		case 0: //Casual Mode
			for(int i = 0; i < casualHighscores.length; i++){
				if(casualHighscores[i] < score){
					newHighscoreRow = i;
					if(i == 0){
						SaveData.submitOpenFeint = true;
					}
					return true;
				}
			}
			return false;
		case 1: //Survival Mode
			for(int i = 0; i < survivalHighscores.length; i++){
				if(survivalHighscores[i] < score){
					newHighscoreRow = i;
					if(i == 0){
						SaveData.submitOpenFeint = true;
					}
					return true;
				}
			}
			return false;
		default:
			return false;
		}
	}
}