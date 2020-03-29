package com.technegames.dict.R;

import com.technegames.framework.Dictionary;

public class DictionaryR3 implements Dictionary{
	private static String[] lettersR3 = { "ria", "rial", "rials", "rialto", "rib", "ribald", "ribaldry", "ribbed", "ribbing", "ribbon", "ribbons", "ribcage", "riboflavin", "ribonucleic", "ribosomal", "ribosome", "ribosomes", "ribs", "rice", "rich", "richer", "riches", "richest", "richly", "richness", "rick", "rickets", "rickety", "ricking", "ricks", "ricksha", "rickshas", "rickshaw", "rickshaws", "ricochet", "ricocheted", "ricocheting", "rid", "riddance", "ridden", "ridding", "riddle", "riddled", "riddles", "riddling", "ride", "rider", "riders", "rides", "ridge", "ridged", "ridges", "ridicule", "ridiculed", "ridicules", "ridiculing", "ridiculous", "ridiculously", "ridiculousness", "riding", "ridings", "rids", "rife", "riff", "riffle", "riffled", "riffs", "rifle", "rifled", "rifleman", "riflemen", "rifles", "rifling", "riflings", "rift", "rifting", "rifts", "rig", "rigged", "rigger", "riggers", "rigging", "right", "righted", "righten", "righteous", "righteously", "righteousness", "righter", "rightful", "rightfully", "righthand", "righthanded", "righthandedness", "righthander", "righthanders", "righting", "rightist", "rightly", "rightminded", "rightmost", "rightness", "rights", "rightthinking", "rightward", "rightwards", "rightwing", "rightwinger", "rightwingers", "rigid", "rigidifies", "rigidify", "rigidities", "rigidity", "rigidly", "rigmarole", "rigor", "rigorous", "rigorously", "rigour", "rigours", "rigs", "rile", "riled", "riles", "riling", "rill", "rills", "rim", "rime", "rimless", "rimmed", "rims", "rind", "rinds", "ring", "ringed", "ringer", "ringers", "ringing", "ringingly", "ringleader", "ringleaders", "ringless", "ringlet", "ringlets", "ringmaster", "rings", "ringside", "ringworm", "rink", "rinks", "rinse", "rinsed", "rinses", "rinsing", "riot", "rioted", "rioter", "rioters", "rioting", "riotous", "riotously", "riots", "rip", "ripcord", "ripe", "ripely", "ripen", "ripened", "ripeness", "ripening", "ripens", "riper", "ripest", "riping", "ripoff", "riposte", "riposted", "ripostes", "ripped", "ripper", "rippers", "ripping", "ripple", "rippled", "ripples", "rippling", "rips", "ripstop", "rise", "risen", "riser", "risers", "rises", "risible", "rising", "risings", "risk", "risked", "riskier", "riskiest", "riskiness", "risking", "risks", "risky", "risotto", "risque", "rissole", "rissoles", "rite", "rites", "ritual", "ritualised", "ritualistic", "ritualistically", "ritually", "rituals", "rival", "rivalled", "rivalling", "rivalries", "rivalry", "rivals", "riven", "river", "riverine", "rivers", "riverside", "rivet", "riveted", "riveter", "riveting", "rivetingly", "rivets", "riviera", "rivulet", "rivulets" };
	private int searchIndex;
	
	public DictionaryR3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersR3.length; i++){
			if(lettersR3[i].equalsIgnoreCase(value)){
				return lettersR3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersR3.length; i++){
			if(lettersR3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}