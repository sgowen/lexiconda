package com.technegames.dict.O;

import com.technegames.framework.Dictionary;

public class DictionaryO2 implements Dictionary{
	private static String[] lettersO2 = { "oedema", "oedipus", "oesophagus", "oestrogen", "oestrogens", "oestrus", "oeuvre", "oeuvres", "of", "off", "offal", "offbeat", "offcut", "offcuts", "offence", "offences", "offend", "offended", "offender", "offenders", "offending", "offends", "offensive", "offensively", "offensiveness", "offensives", "offer", "offered", "offering", "offerings", "offers", "offertory", "offhand", "office", "officer", "officers", "officership", "officerships", "offices", "official", "officialdom", "officially", "officialness", "officials", "officiate", "officiated", "officiating", "officious", "officiously", "officiousness", "offprint", "offset", "offshoot", "offshore", "oft", "often", "ogle", "ogled", "ogling", "ogre", "ogres", "ogrish", "oh", "ohio", "ohm", "ohmic", "ohms" };
	private int searchIndex;
	
	public DictionaryO2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersO2.length; i++){
			if(lettersO2[i].equalsIgnoreCase(value)){
				return lettersO2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersO2.length; i++){
			if(lettersO2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}