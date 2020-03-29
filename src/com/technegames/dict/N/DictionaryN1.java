package com.technegames.dict.N;

import com.technegames.framework.Dictionary;

public class DictionaryN1 implements Dictionary{
	private static String[] lettersN1 = { "nab", "nabbed", "nabs", "nadir", "nag", "nagasaki", "nagged", "nagger", "nagging", "nags", "naiad", "naiads", "nail", "nailbiting", "nailed", "nailing", "nails", "nairobi", "naive", "naively", "naivete", "naivety", "naked", "nakedly", "nakedness", "name", "nameable", "namecalling", "named", "namedropping", "nameless", "namely", "nameplate", "nameplates", "names", "namesake", "namesakes", "namibia", "namibian", "naming", "namings", "nannies", "nanny", "nanometre", "nanometres", "nanosecond", "nanoseconds", "nanotechnology", "naomi", "nap", "napalm", "nape", "naphtha", "napkin", "napkins", "naples", "napoleon", "napped", "nappies", "napping", "nappy", "naps", "narcissism", "narcissistic", "narcoleptic", "narcosis", "narcotic", "narcotics", "narrate", "narrated", "narrates", "narrating", "narration", "narrations", "narrative", "narratives", "narratology", "narrator", "narrators", "narrow", "narrowed", "narrower", "narrowest", "narrowing", "narrowly", "narrowminded", "narrowmindedness", "narrowness", "narrows", "narwhal", "nasal", "nasalised", "nasally", "nascent", "nastier", "nastiest", "nastily", "nastiness", "nasturtium", "nasturtiums", "nasty", "natal", "nation", "national", "nationalisation", "nationalisations", "nationalise", "nationalised", "nationalising", "nationalism", "nationalist", "nationalistic", "nationalists", "nationalities", "nationality", "nationally", "nationals", "nationhood", "nations", "nationwide", "native", "natives", "nativity", "nato", "nattering", "natural", "naturalisation", "naturalise", "naturalised", "naturalism", "naturalist", "naturalistic", "naturalists", "naturally", "naturalness", "nature", "natures", "naturist", "naturists", "naught", "naughtiest", "naughtily", "naughtiness", "naughts", "naughty", "nausea", "nauseate", "nauseated", "nauseates", "nauseating", "nauseatingly", "nauseous", "nauseousness", "nautical", "nautili", "nautilus", "naval", "nave", "navel", "navels", "navies", "navigable", "navigate", "navigated", "navigating", "navigation", "navigational", "navigator", "navigators", "navvies", "navvy", "navy", "nay", "nazi", "naziism", "nazis", "nazism", "ndebele" };
	private int searchIndex;
	
	public DictionaryN1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersN1.length; i++){
			if(lettersN1[i].equalsIgnoreCase(value)){
				return lettersN1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersN1.length; i++){
			if(lettersN1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}