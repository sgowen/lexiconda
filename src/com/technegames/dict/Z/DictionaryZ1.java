package com.technegames.dict.Z;

import com.technegames.framework.Dictionary;

public class DictionaryZ1 implements Dictionary{
	private static String[] lettersZ1 = { "zag", "zaire", "zambezi", "zambia", "zambian", "zambians", "zaniest", "zany", "zanzibar", "zap", "zapping", "zappy", "zaps" };
	private int searchIndex;
	
	public DictionaryZ1(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersZ1.length; i++){
			if(lettersZ1[i].equalsIgnoreCase(value)){
				return lettersZ1[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersZ1.length; i++){
			if(lettersZ1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}