package com.technegames.dict.Z;

import com.technegames.framework.Dictionary;

public class DictionaryZ4 implements Dictionary{
	private static String[] lettersZ4 = { "zombi", "zombie", "zombies", "zonal", "zonation", "zone", "zoned", "zones", "zoning", "zoo", "zookeepers", "zoological", "zoologist", "zoologists", "zoology", "zoom", "zoomed", "zooming", "zooms", "zooplankton", "zoos" };
	private int searchIndex;
	
	public DictionaryZ4(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersZ4.length; i++){
			if(lettersZ4[i].equalsIgnoreCase(value)){
				return lettersZ4[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersZ4.length; i++){
			if(lettersZ4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}