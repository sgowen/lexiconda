package com.technegames.dict.Y;

import com.technegames.framework.Dictionary;

public class DictionaryY1 implements Dictionary{
	private static String[] lettersY1 = { "yacht", "yachting", "yachts", "yachtsman", "yachtsmen", "yak", "yaks", "yale", "yalelock", "yam", "yams", "yank", "yankee", "yankees", "yanks", "yap", "yapping", "yaps", "yard", "yardage", "yards", "yardstick", "yardsticks", "yarn", "yarns", "yaw", "yawed", "yawl", "yawls", "yawn", "yawned", "yawning", "yawningly", "yawns", "yaws" };
	private int searchIndex;
	
	public DictionaryY1(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersY1.length; i++){
			if(lettersY1[i].equalsIgnoreCase(value)){
				return lettersY1[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersY1.length; i++){
			if(lettersY1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}