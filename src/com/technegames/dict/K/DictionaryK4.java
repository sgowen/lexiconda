package com.technegames.dict.K;

import com.technegames.framework.Dictionary;

public class DictionaryK4 implements Dictionary{
	private static String[] lettersK4 = { "koala", "koalas", "kongo", "kookaburra", "koran", "korea", "korean", "koreans", "kosher", "kraal", "kraals", "kraft", "kremlin", "kriegspiel", "krill", "krypton" };
	private int searchIndex;
	
	public DictionaryK4(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersK4.length; i++){
			if(lettersK4[i].equalsIgnoreCase(value)){
				return lettersK4[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersK4.length; i++){
			if(lettersK4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}