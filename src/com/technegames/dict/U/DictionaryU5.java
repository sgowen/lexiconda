package com.technegames.dict.U;

import com.technegames.framework.Dictionary;

public class DictionaryU5 implements Dictionary{
	private static String[] lettersU5 = { "uvula", "uvular" };
	private int searchIndex;
	
	public DictionaryU5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersU5.length; i++){
			if(lettersU5[i].equalsIgnoreCase(value)){
				return lettersU5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersU5.length; i++){
			if(lettersU5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}