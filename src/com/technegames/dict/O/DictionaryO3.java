package com.technegames.dict.O;

import com.technegames.framework.Dictionary;

public class DictionaryO3 implements Dictionary{
	private static String[] lettersO3 = { "oil", "oilcloth", "oiled", "oiler", "oilers", "oilfield", "oilfields", "oilier", "oiliest", "oiliness", "oiling", "oilman", "oilmen", "oilrig", "oils", "oily", "oink", "oinked", "oinks", "ointment", "ointments", "ok", "okapi", "okapis", "okay", "okayed", "okays", "oklahoma", "old", "oldage", "olden", "older", "oldest", "oldfashioned", "oldie", "oldish", "oldmaids", "oldtimer", "oldtimers", "ole", "oleander", "oleanders", "olfactory", "olive", "oliveoil", "oliver", "olives", "olm", "olms", "olympia", "olympiad", "olympian", "olympic", "olympics", "olympus", "ombudsman", "ombudsmen", "omega", "omelette", "omelettes", "omen", "omens", "ominous", "ominously", "omission", "omissions", "omit", "omits", "omitted", "omitting", "omnibus", "omnibuses", "omnidirectional", "omnipotence", "omnipotent", "omnipresence", "omnipresent", "omniscience", "omniscient", "omnivore", "omnivores", "omnivorous", "on", "onager", "onagers", "once", "one", "oneness", "oner", "onerous", "ones", "oneself", "onesided", "onesidedly", "onesidedness", "ongoing", "onion", "onions", "onlooker", "onlookers", "onlooking", "only", "onlybegotten", "onset", "onshore", "onslaught", "onslaughts", "ontario", "onto", "ontogeny", "ontological", "ontologically", "ontology", "onus", "onuses", "onward", "onwards", "onyx", "onyxes" };
	private int searchIndex;
	
	public DictionaryO3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersO3.length; i++){
			if(lettersO3[i].equalsIgnoreCase(value)){
				return lettersO3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersO3.length; i++){
			if(lettersO3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}