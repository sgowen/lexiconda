package com.technegames.dict.X;

import com.technegames.framework.Dictionary;

public class DictionaryX2 implements Dictionary{
	private static String[] lettersX2 = { "xenon", "xenophobe", "xenophobia", "xenophobic", "xerography", "xhosa", "xhosas" };
	private int searchIndex;
	
	public DictionaryX2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersX2.length; i++){
			if(lettersX2[i].equalsIgnoreCase(value)){
				return lettersX2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersX2.length; i++){
			if(lettersX2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}