package com.technegames.dict.E;

import com.technegames.framework.Dictionary;

public class DictionaryE2 implements Dictionary{
	private static String[] lettersE2 = { "eel", "eels", "eelworm", "eelworms", "eerie", "eerier", "eeriest", "eerily", "eeriness", "eery", "efface", "effaced", "effacing", "effect", "effected", "effecting", "effective", "effectively", "effectiveness", "effector", "effectors", "effects", "effectual", "effectually", "effeminacy", "effeminate", "efferent", "effervescence", "effervescent", "effete", "efficacious", "efficacy", "efficiencies", "efficiency", "efficient", "efficiently", "effigies", "effigy", "effluent", "effluents", "effluvia", "effluxion", "effort", "effortless", "effortlessly", "efforts", "effrontery", "effulgence", "effulgent", "effusion", "effusions", "effusive", "effusively", "eg", "egalitarian", "egalitarianism", "egalitarians", "egg", "egged", "eggheads", "egging", "eggs", "eggshell", "eggshells", "ego", "egocentric", "egocentricity", "egoism", "egoist", "egoistic", "egoists", "egomania", "egomaniac", "egomaniacs", "egotism", "egotist", "egotistic", "egotistical", "egotistically", "egotists", "egregious", "egress", "egret", "egrets", "egypt", "egyptian", "eh" };
	private int searchIndex;
	
	public DictionaryE2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersE2.length; i++){
			if(lettersE2[i].equalsIgnoreCase(value)){
				return lettersE2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersE2.length; i++){
			if(lettersE2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}