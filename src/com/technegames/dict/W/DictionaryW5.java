package com.technegames.dict.W;

import com.technegames.framework.Dictionary;

public class DictionaryW5 implements Dictionary{
	private static String[] lettersW5 = { "wunderkind" };
	private int searchIndex;
	
	public DictionaryW5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersW5.length; i++){
			if(lettersW5[i].equalsIgnoreCase(value)){
				return lettersW5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersW5.length; i++){
			if(lettersW5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}