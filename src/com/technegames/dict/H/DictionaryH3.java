package com.technegames.dict.H;

import com.technegames.framework.Dictionary;

public class DictionaryH3 implements Dictionary{
	private static String[] lettersH3 = { "hi", "hiatus", "hiatuses", "hibernal", "hibernate", "hibernating", "hibernation", "hibiscus", "hic", "hiccough", "hiccup", "hiccups", "hickory", "hid", "hidden", "hide", "hideandseek", "hideaway", "hideaways", "hidebound", "hideous", "hideously", "hideousness", "hideout", "hideouts", "hider", "hides", "hiding", "hidings", "hierarch", "hierarchic", "hierarchical", "hierarchically", "hierarchies", "hierarchy", "hieratic", "hieroglyph", "hieroglyphic", "hieroglyphics", "hieroglyphs", "higgledypiggledy", "high", "highbrow", "higher", "highest", "highhandedness", "highheeled", "highish", "highjack", "highland", "highlander", "highlanders", "highlands", "highlight", "highlighted", "highlighter", "highlighting", "highlights", "highly", "highness", "highpitched", "highpoint", "highranking", "highs", "highspirited", "hight", "highway", "highwayman", "highwaymen", "highways", "hijack", "hijacked", "hijacker", "hijackers", "hijacking", "hijackings", "hijacks", "hike", "hiked", "hiker", "hikers", "hikes", "hiking", "hilarious", "hilariously", "hilarity", "hill", "hilled", "hillier", "hilliest", "hillman", "hillock", "hillocks", "hillocky", "hills", "hillside", "hillsides", "hilltop", "hilltops", "hillwalking", "hilly", "hilt", "hilts", "him", "himself", "hind", "hindbrain", "hinder", "hindered", "hinderer", "hindering", "hinders", "hindmost", "hindquarters", "hindrance", "hindrances", "hindsight", "hindu", "hinduism", "hinge", "hinged", "hinges", "hinnies", "hinny", "hint", "hinted", "hinterland", "hinterlands", "hinting", "hints", "hip", "hipbone", "hippie", "hippies", "hippo", "hippocampus", "hippodrome", "hippopotamus", "hippy", "hips", "hipster", "hipsters", "hire", "hired", "hireling", "hirer", "hires", "hiring", "hirings", "hirsute", "hirsuteness", "his", "hispanic", "hiss", "hissed", "hisses", "hissing", "hissings", "histamine", "histogram", "histograms", "histological", "histologically", "histologists", "histology", "historian", "historians", "historic", "historical", "historically", "historicist", "histories", "historiographical", "historiography", "history", "histrionic", "histrionics", "hit", "hitandrun", "hitch", "hitched", "hitcher", "hitches", "hitchhike", "hitchhiked", "hitchhiker", "hitchhikers", "hitchhiking", "hitching", "hither", "hitherto", "hitler", "hits", "hittable", "hitters", "hitting", "hive", "hived", "hives", "hiving", "hmm" };
	private int searchIndex;
	
	public DictionaryH3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersH3.length; i++){
			if(lettersH3[i].equalsIgnoreCase(value)){
				return lettersH3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersH3.length; i++){
			if(lettersH3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}