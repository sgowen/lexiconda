package com.technegames.dict.X;

import com.technegames.framework.Dictionary;

public class DictionaryX3 implements Dictionary{
	private static String[] lettersX3 = { "xmas" };
	private int searchIndex;
	
	public DictionaryX3(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersX3.length; i++){
			if(lettersX3[i].equalsIgnoreCase(value)){
				return lettersX3[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersX3.length; i++){
			if(lettersX3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}