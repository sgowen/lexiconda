package com.technegames.dict.Y;

import com.technegames.framework.Dictionary;

public class DictionaryY2 implements Dictionary{
	private static String[] lettersY2 = { "ye", "yea", "yeah", "yeaned", "year", "yearbook", "yearbooks", "yearling", "yearlings", "yearlong", "yearly", "yearn", "yearned", "yearning", "yearningly", "yearnings", "yearns", "years", "yeas", "yeast", "yeasts", "yeasty", "yell", "yelled", "yelling", "yellings", "yellow", "yellowed", "yellower", "yellowing", "yellowish", "yellows", "yellowy", "yells", "yelp", "yelped", "yelping", "yelpings", "yelps", "yemen", "yen", "yens", "yeoman", "yeomanry", "yeomen", "yep", "yes", "yesterday", "yesterdays", "yesteryear", "yet", "yeti", "yetis", "yew", "yews" };
	private int searchIndex;
	
	public DictionaryY2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersY2.length; i++){
			if(lettersY2[i].equalsIgnoreCase(value)){
				return lettersY2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersY2.length; i++){
			if(lettersY2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}