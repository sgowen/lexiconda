package com.technegames.dict.X;

import com.technegames.framework.Dictionary;

public class DictionaryX4 implements Dictionary{
	private static String[] lettersX4 = { "xray", "xrayed", "xraying", "xrays" };
	private int searchIndex;
	
	public DictionaryX4(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersX4.length; i++){
			if(lettersX4[i].equalsIgnoreCase(value)){
				return lettersX4[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersX4.length; i++){
			if(lettersX4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}