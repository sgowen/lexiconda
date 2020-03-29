package com.technegames.dict.Y;

import com.technegames.framework.Dictionary;

public class DictionaryY4 implements Dictionary{
	private static String[] lettersY4 = { "yodel", "yodelled", "yodeller", "yodelling", "yodels", "yoga", "yogi", "yoke", "yoked", "yokel", "yokels", "yokes", "yolk", "yolks", "yon", "yonder", "yore", "york", "yorker", "yorkers", "you", "young", "younger", "youngest", "youngish", "youngster", "youngsters", "your", "yours", "yourself", "yourselves", "youth", "youthful", "youthfulness", "youths", "yowl", "yoyo", "yrs", "yttrium" };
	private int searchIndex;
	
	public DictionaryY4(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersY4.length; i++){
			if(lettersY4[i].equalsIgnoreCase(value)){
				return lettersY4[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersY4.length; i++){
			if(lettersY4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}