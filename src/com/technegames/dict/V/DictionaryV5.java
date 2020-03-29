package com.technegames.dict.V;

import com.technegames.framework.Dictionary;

public class DictionaryV5 implements Dictionary{
	private static String[] lettersV5 = { "vulcan", "vulcanise", "vulcanised", "vulcanism", "vulcanologist", "vulgar", "vulgarities", "vulgarity", "vulgarly", "vulgate", "vulnerabilities", "vulnerability", "vulnerable", "vulpine", "vulture", "vultures", "vulva", "vying" };
	private int searchIndex;
	
	public DictionaryV5(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersV5.length; i++){
			if(lettersV5[i].equalsIgnoreCase(value)){
				return lettersV5[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersV5.length; i++){
			if(lettersV5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}