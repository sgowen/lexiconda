package com.technegames.dict.U;

import com.technegames.framework.Dictionary;

public class DictionaryU1 implements Dictionary{
	private static String[] lettersU1 = { "uboats", "udder", "udders" };
	private int searchIndex;
	
	public DictionaryU1(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersU1.length; i++){
			if(lettersU1[i].equalsIgnoreCase(value)){
				return lettersU1[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersU1.length; i++){
			if(lettersU1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}