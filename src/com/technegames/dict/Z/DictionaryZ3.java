package com.technegames.dict.Z;

import com.technegames.framework.Dictionary;

public class DictionaryZ3 implements Dictionary{
	private static String[] lettersZ3 = { "zig", "zigzag", "zigzagged", "zigzagging", "zigzags", "zillion", "zillions", "zimbabwe", "zinc", "zion", "zionism", "zionist", "zionists", "zip", "zipped", "zipper", "zippers", "zipping", "zippy", "zips", "zit", "zither", "zithers" };
	private int searchIndex;
	
	public DictionaryZ3(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersZ3.length; i++){
			if(lettersZ3[i].equalsIgnoreCase(value)){
				return lettersZ3[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersZ3.length; i++){
			if(lettersZ3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}