package com.technegames.lexiconda;

import java.util.ArrayList;
import java.util.List;

public class UsedWords {
	public List<String> usedWords;
	public UsedWords(){
		usedWords = new ArrayList<String>();
	}
	
	public boolean hasWordBeenUsed(String word){
		word = word.toLowerCase();
		for(int i = 0; i < usedWords.size(); i++){
			if(usedWords.get(i).equalsIgnoreCase(word)){
				return true;	
			}
		}
		return false;
	}
	
	public void insertNewWord(String word){
		usedWords.add(word);
	}
}