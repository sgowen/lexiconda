package com.technegames.dict.J;

import com.technegames.framework.Dictionary;

public class DictionaryJ2 implements Dictionary{
	private static String[] lettersJ2 = { "jealous", "jealousies", "jealously", "jealousy", "jeans", "jeep", "jeeps", "jeer", "jeered", "jeering", "jeeringly", "jeerings", "jeers", "jehad", "jejune", "jejunum", "jell", "jellied", "jellies", "jellify", "jelly", "jellyfish", "jemmy", "jennets", "jeopardise", "jeopardised", "jeopardises", "jeopardising", "jeopardy", "jerboas", "jeremiah", "jericho", "jerk", "jerked", "jerkier", "jerkiest", "jerkily", "jerkin", "jerking", "jerkings", "jerkins", "jerks", "jerky", "jersey", "jerseys", "jest", "jested", "jester", "jesters", "jesting", "jestingly", "jests", "jesuit", "jesus", "jet", "jetlagged", "jetplane", "jetpropelled", "jets", "jetsam", "jetsetting", "jetted", "jetties", "jetting", "jettison", "jettisoned", "jettisoning", "jetty", "jew", "jewel", "jeweled", "jeweler", "jewelers", "jewelry", "jewels", "jewess", "jewish", "jews", "jewsharp", "jezebel" };
	private int searchIndex;
	
	public DictionaryJ2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersJ2.length; i++){
			if(lettersJ2[i].equalsIgnoreCase(value)){
				return lettersJ2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersJ2.length; i++){
			if(lettersJ2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}