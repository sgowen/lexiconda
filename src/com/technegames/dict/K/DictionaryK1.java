package com.technegames.dict.K;

import com.technegames.framework.Dictionary;

public class DictionaryK1 implements Dictionary{
	private static String[] lettersK1 = { "kaftan", "kaftans", "kaiser", "kalahari", "kale", "kaleidoscope", "kaleidoscopic", "kalif", "kamikaze", "kampala", "kampong", "kangaroo", "kangaroos", "kaolin", "karakul", "karaoke", "karate", "karma", "karst", "katydid", "kayak", "kayaks" };
	private int searchIndex;
	
	public DictionaryK1(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersK1.length; i++){
			if(lettersK1[i].equalsIgnoreCase(value)){
				return lettersK1[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersK1.length; i++){
			if(lettersK1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}