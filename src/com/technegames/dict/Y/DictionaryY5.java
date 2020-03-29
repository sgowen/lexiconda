package com.technegames.dict.Y;

import com.technegames.framework.Dictionary;

public class DictionaryY5 implements Dictionary{
	private static String[] lettersY5 = { "yuck", "yukon", "yule", "yuletide", "yummiest", "yummy", "yuppie", "yuppies" };
	private int searchIndex;
	
	public DictionaryY5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersY5.length; i++){
			if(lettersY5[i].equalsIgnoreCase(value)){
				return lettersY5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersY5.length; i++){
			if(lettersY5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}