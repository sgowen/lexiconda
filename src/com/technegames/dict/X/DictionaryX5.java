package com.technegames.dict.X;

import com.technegames.framework.Dictionary;

public class DictionaryX5 implements Dictionary{
	private static String[] lettersX5 = { "xylophone", "xylophonist" };
	private int searchIndex;
	
	public DictionaryX5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersX5.length; i++){
			if(lettersX5[i].equalsIgnoreCase(value)){
				return lettersX5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersX5.length; i++){
			if(lettersX5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}