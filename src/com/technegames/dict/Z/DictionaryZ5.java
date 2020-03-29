package com.technegames.dict.Z;

import com.technegames.framework.Dictionary;

public class DictionaryZ5 implements Dictionary{
	private static String[] lettersZ5 = { "zulu", "zulus" };
	private int searchIndex;
	
	public DictionaryZ5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersZ5.length; i++){
			if(lettersZ5[i].equalsIgnoreCase(value)){
				return lettersZ5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersZ5.length; i++){
			if(lettersZ5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}