package com.technegames.dict.J;

import com.technegames.framework.Dictionary;

public class DictionaryJ1 implements Dictionary{
	private static String[] lettersJ1 = { "jab", "jabbed", "jabber", "jabbered", "jabbering", "jabbers", "jabbing", "jabs", "jack", "jackal", "jackals", "jackass", "jackasses", "jackboot", "jackbooted", "jackboots", "jackdaw", "jackdaws", "jacked", "jacket", "jackets", "jacking", "jackinthebox", "jackpot", "jackpots", "jacks", "jacob", "jacuzzi", "jade", "jaded", "jadedly", "jadedness", "jades", "jag", "jagged", "jaggedly", "jaguar", "jaguars", "jahweh", "jail", "jailbird", "jailed", "jailer", "jailers", "jailing", "jails", "jakarta", "jalopy", "jam", "jamaica", "jamaican", "jamb", "jamboree", "jambs", "james", "jammed", "jamming", "jams", "jangle", "jangled", "jangling", "jangly", "janitor", "janitors", "january", "janus", "jap", "japan", "jape", "japes", "japonica", "jar", "jargon", "jargons", "jarl", "jarred", "jarring", "jars", "jasmine", "jaundice", "jaundiced", "jaunt", "jaunted", "jauntier", "jauntiest", "jauntily", "jaunting", "jaunts", "jaunty", "java", "javelin", "javelins", "jaw", "jawbone", "jawbones", "jawed", "jawing", "jawline", "jaws", "jay", "jays", "jaywalk", "jaywalker", "jaywalking", "jazz", "jazzed", "jazzier", "jazziest", "jazzy" };
	private int searchIndex;
	
	public DictionaryJ1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersJ1.length; i++){
			if(lettersJ1[i].equalsIgnoreCase(value)){
				return lettersJ1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersJ1.length; i++){
			if(lettersJ1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}