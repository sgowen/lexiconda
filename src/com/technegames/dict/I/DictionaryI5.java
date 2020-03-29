package com.technegames.dict.I;

import com.technegames.framework.Dictionary;

public class DictionaryI5 implements Dictionary{
	private static String[] lettersI5 = { "ive", "ivies", "ivories", "ivory", "ivy" };
	private int searchIndex;
	
	public DictionaryI5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersI5.length; i++){
			if(lettersI5[i].equalsIgnoreCase(value)){
				return lettersI5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersI5.length; i++){
			if(lettersI5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}