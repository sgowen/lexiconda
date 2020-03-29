package com.technegames.dict.Z;

import com.technegames.framework.Dictionary;

public class DictionaryZ2 implements Dictionary{
	private static String[] lettersZ2 = { "zeal", "zealot", "zealotry", "zealots", "zealous", "zealously", "zealousness", "zeals", "zebra", "zebras", "zebu", "zebus", "zees", "zenith", "zeniths", "zeolite", "zeolites", "zephyr", "zephyrs", "zeppelin", "zero", "zeroed", "zeroing", "zest", "zestfully", "zesty", "zeta", "zeus" };
	private int searchIndex;
	
	public DictionaryZ2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersZ2.length; i++){
			if(lettersZ2[i].equalsIgnoreCase(value)){
				return lettersZ2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersZ2.length; i++){
			if(lettersZ2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}