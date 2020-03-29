package com.technegames.dict.J;

import com.technegames.framework.Dictionary;

public class DictionaryJ4 implements Dictionary{
	private static String[] lettersJ4 = { "job", "jobbing", "jobless", "joblessness", "jobs", "jock", "jockey", "jockeying", "jockeys", "jocular", "jocularity", "jocularly", "joey", "jog", "jogged", "jogger", "joggers", "jogging", "jogs", "john", "join", "joined", "joiner", "joiners", "joinery", "joining", "joins", "joint", "jointed", "jointing", "jointly", "joints", "jointures", "joist", "joists", "joke", "joked", "joker", "jokers", "jokes", "jokey", "jokier", "jokily", "joking", "jokingly", "jollier", "jolliest", "jollify", "jollily", "jollity", "jolly", "jolt", "jolted", "jolting", "jolts", "jonah", "jonathan", "joseph", "joshua", "jostle", "jostled", "jostles", "jostling", "jot", "jots", "jotted", "jotter", "jotting", "jottings", "joule", "joules", "journal", "journalese", "journalism", "journalist", "journalistic", "journalists", "journalled", "journalling", "journals", "journey", "journeyed", "journeyer", "journeying", "journeyman", "journeys", "joust", "jouster", "jousting", "jousts", "jovial", "joviality", "jovially", "jovian", "jowl", "jowls", "joy", "joyed", "joyful", "joyfully", "joyfulness", "joyless", "joylessness", "joyous", "joyously", "joyousness", "joyride", "joyrider", "joyriders", "joyriding", "joys", "joystick", "joysticks" };
	private int searchIndex;
	
	public DictionaryJ4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersJ4.length; i++){
			if(lettersJ4[i].equalsIgnoreCase(value)){
				return lettersJ4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersJ4.length; i++){
			if(lettersJ4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}