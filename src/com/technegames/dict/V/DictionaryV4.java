package com.technegames.dict.V;

import com.technegames.framework.Dictionary;

public class DictionaryV4 implements Dictionary{
	private static String[] lettersV4 = { "vocabularies", "vocabulary", "vocal", "vocalisation", "vocalisations", "vocalise", "vocalised", "vocalising", "vocalist", "vocalists", "vocally", "vocals", "vocation", "vocational", "vocationally", "vocations", "vocative", "vociferous", "vociferously", "vodka", "vogue", "voice", "voiced", "voiceless", "voices", "voicing", "voicings", "void", "voidable", "voided", "voiding", "voids", "voile", "volatile", "volatiles", "volatility", "volcanic", "volcanically", "volcanism", "volcano", "vole", "voles", "volga", "volition", "volley", "volleyball", "volleyed", "volleying", "volleys", "volt", "voltage", "voltages", "voltmeter", "volts", "volubility", "voluble", "volubly", "volume", "volumes", "volumetric", "voluminous", "voluntarily", "voluntary", "volunteer", "volunteered", "volunteering", "volunteers", "voluptuous", "voluptuously", "voluptuousness", "volute", "vomit", "vomited", "vomiting", "vomits", "voodoo", "voracious", "voraciously", "voracity", "vortex", "vortexes", "vortices", "vorticity", "vote", "voted", "voteless", "voter", "voters", "votes", "voting", "votive", "vouch", "vouched", "voucher", "vouchers", "vouches", "vouchsafe", "vouchsafed", "vouchsafing", "vow", "vowed", "vowel", "vowels", "vowing", "vows", "voyage", "voyaged", "voyager", "voyagers", "voyages", "voyaging", "voyeur", "voyeurism", "voyeuristic", "voyeurs" };
	private int searchIndex;
	
	public DictionaryV4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersV4.length; i++){
			if(lettersV4[i].equalsIgnoreCase(value)){
				return lettersV4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersV4.length; i++){
			if(lettersV4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}