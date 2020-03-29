package com.technegames.dict.Y;

import com.technegames.framework.Dictionary;

public class DictionaryY3 implements Dictionary{
	private static String[] lettersY3 = { "yiddish", "yield", "yielded", "yielding", "yields", "yip", "yippee" };
	private int searchIndex;
	
	public DictionaryY3(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersY3.length; i++){
			if(lettersY3[i].equalsIgnoreCase(value)){
				return lettersY3[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersY3.length; i++){
			if(lettersY3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}