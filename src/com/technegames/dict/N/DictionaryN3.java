package com.technegames.dict.N;

import com.technegames.framework.Dictionary;

public class DictionaryN3 implements Dictionary{
	private static String[] lettersN3 = { "niagara", "nib", "nibble", "nibbled", "nibbler", "nibblers", "nibbles", "nibbling", "nibs", "nice", "nicely", "niceness", "nicer", "nicest", "niceties", "nicety", "niche", "niches", "nick", "nicked", "nickel", "nicking", "nickname", "nicknamed", "nicknames", "nicks", "nicotine", "niece", "nieces", "niftily", "nifty", "niger", "nigeria", "niggardly", "niggle", "niggled", "niggles", "niggling", "nigh", "night", "nightcap", "nightcaps", "nightclothes", "nightclub", "nightclubs", "nightdress", "nightdresses", "nightfall", "nightgown", "nightie", "nighties", "nightingale", "nightingales", "nightlife", "nightly", "nightmare", "nightmares", "nightmarish", "nights", "nightwatchman", "nightwear", "nihilism", "nihilist", "nihilistic", "nil", "nile", "nils", "nimble", "nimbleness", "nimbly", "nimbus", "nincompoop", "nine", "ninefold", "nines", "nineteen", "nineteenth", "nineties", "ninetieth", "ninety", "nineveh", "ninny", "ninth", "ninths", "nip", "nipped", "nipper", "nipping", "nipple", "nipples", "nippon", "nips", "nirvana", "nit", "nitpicking", "nitrate", "nitrates", "nitric", "nitrogen", "nitrogenous", "nitroglycerine", "nitrous", "nits", "nitwit", "nixon" };
	private int searchIndex;
	
	public DictionaryN3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersN3.length; i++){
			if(lettersN3[i].equalsIgnoreCase(value)){
				return lettersN3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersN3.length; i++){
			if(lettersN3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}