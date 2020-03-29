package com.technegames.dict.U;

import com.technegames.framework.Dictionary;

public class DictionaryU2 implements Dictionary{
	private static String[] lettersU2 = { "ufo", "uganda", "ugandan", "uglier", "ugliest", "uglification", "ugliness", "ugly", "uhuh" };
	private int searchIndex;
	
	public DictionaryU2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersU2.length; i++){
			if(lettersU2[i].equalsIgnoreCase(value)){
				return lettersU2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersU2.length; i++){
			if(lettersU2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}