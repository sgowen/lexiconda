package com.technegames.dict.Q;

import com.technegames.framework.Dictionary;

public class DictionaryQ1 implements Dictionary{
	private static String[] lettersQ1 = { "qatar" };
	private int searchIndex;
	
	public DictionaryQ1(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersQ1.length; i++){
			if(lettersQ1[i].equalsIgnoreCase(value)){
				return lettersQ1[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersQ1.length; i++){
			if(lettersQ1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}