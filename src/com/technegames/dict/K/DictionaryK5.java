package com.technegames.dict.K;

import com.technegames.framework.Dictionary;

public class DictionaryK5 implements Dictionary{
	private static String[] lettersK5 = { "kudu", "kudus", "kungfu", "kuwait", "kwacha", "kwachas" };
	private int searchIndex;
	
	public DictionaryK5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersK5.length; i++){
			if(lettersK5[i].equalsIgnoreCase(value)){
				return lettersK5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersK5.length; i++){
			if(lettersK5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}