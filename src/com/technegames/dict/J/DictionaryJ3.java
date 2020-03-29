package com.technegames.dict.J;

import com.technegames.framework.Dictionary;

public class DictionaryJ3 implements Dictionary{
	private static String[] lettersJ3 = { "jiffy", "jiggle", "jiggling", "jigs", "jigsaw", "jigsaws", "jihad", "jilt", "jilted", "jilting", "jilts", "jimmy", "jingle", "jingled", "jingles", "jingling", "jingo", "jingoism", "jingoistic", "jinked", "jinks", "jinx", "jinxed", "jinxes", "jitter", "jitters", "jittery", "jiujitsu", "jive", "jived", "jives" };
	private int searchIndex;
	
	public DictionaryJ3(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersJ3.length; i++){
			if(lettersJ3[i].equalsIgnoreCase(value)){
				return lettersJ3[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersJ3.length; i++){
			if(lettersJ3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}