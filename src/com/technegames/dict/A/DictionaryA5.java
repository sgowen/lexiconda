package com.technegames.dict.A;

import com.technegames.framework.Dictionary;

public class DictionaryA5 implements Dictionary{
	private static String[] lettersA5 = { "aubergine", "aubergines", "auburn", "auction", "auctioned", "auctioneer", "auctioneers", "auctioning", "auctions", "audacious", "audaciously", "audacity", "audibility", "audible", "audibly", "audience", "audiences", "audio", "audiovisual", "audit", "audited", "auditing", "audition", "auditioned", "auditioning", "auditions", "auditive", "auditor", "auditorium", "auditors", "auditory", "audits", "auger", "augers", "augite", "augment", "augmentation", "augmentations", "augmented", "augmenting", "augments", "augur", "augured", "augurs", "augury", "august", "augustus", "auk", "auks", "aunt", "auntie", "aunties", "aunts", "aupair", "aupairs", "aura", "aural", "aurally", "auras", "aurevoir", "auric", "auriculas", "aurora", "aurorae", "auroral", "auroras", "auspice", "auspices", "auspicious", "auspiciously", "aussie", "aussies", "austere", "austerely", "austerity", "austral", "australian", "austria", "autarchy", "auteur", "authentic", "authentically", "authenticate", "authenticated", "authenticates", "authenticating", "authentication", "authenticator", "authenticators", "authenticity", "author", "authored", "authoress", "authorial", "authoring", "authorisation", "authorisations", "authorise", "authorised", "authorises", "authorising", "authoritarian", "authoritarianism", "authoritarians", "authoritative", "authoritatively", "authorities", "authority", "authors", "authorship", "autism", "autistic", "auto", "autobahn", "autobahns", "autobiographical", "autobiographically", "autobiographies", "autobiography", "autocracies", "autocracy", "autocrat", "autocratic", "autocratically", "autocrats", "autocue", "autograph", "autographed", "autographing", "autographs", "autoignition", "autoimmune", "automat", "automata", "automate", "automated", "automates", "automatic", "automatically", "automatics", "automating", "automation", "automaton", "automats", "automobile", "automorphism", "automorphisms", "automotive", "autonomic", "autonomous", "autonomously", "autonomy", "autopilot", "autopsies", "autopsy", "autosuggestion", "autumn", "autumnal", "autumns", "auxiliaries", "auxiliary", "avail", "availabilities", "availability", "available", "availed", "availing", "avails", "avalanche", "avalanches", "avalanching", "avantgarde", "avarice", "avaricious", "avariciousness", "ave", "avenge", "avenged", "avenger", "avengers", "avenges", "avenging", "avens", "avenue", "avenues", "aver", "average", "averaged", "averagely", "averages", "averaging", "averred", "averring", "avers", "averse", "aversion", "aversions", "aversive", "avert", "averted", "averting", "averts", "avian", "aviaries", "aviary", "aviate", "aviation", "aviator", "aviators", "avid", "avidity", "avidly", "avionics", "avocado", "avoid", "avoidable", "avoidance", "avoided", "avoiding", "avoids", "avoirdupois", "avow", "avowal", "avowals", "avowed", "avowedly", "avowing", "avulsion", "avuncular", "await", "awaited", "awaiting", "awaits", "awake", "awaken", "awakened", "awakening", "awakenings", "awakens", "awakes", "awaking", "award", "awarded", "awarding", "awards", "aware", "awareness", "awash", "away", "awe", "awed", "aweless", "awesome", "awesomely", "awesomeness", "awestruck", "awful", "awfully", "awfulness", "awhile", "awkward", "awkwardest", "awkwardly", "awkwardness", "awls", "awn", "awning", "awnings", "awoke", "awoken", "awol", "awry", "axe", "axed", "axehead", "axeheads", "axeman", "axes", "axial", "axially", "axillary", "axing", "axiom", "axiomatic", "axiomatically", "axiomatising", "axioms", "axis", "axle", "axles", "axolotl", "axon", "axons", "aye", "ayurvedic", "azalea", "azaleas", "azimuth", "azimuthal", "azores", "aztec", "aztecs", "azure" };
	private int searchIndex;
	
	public DictionaryA5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersA5.length; i++){
			if(lettersA5[i].equalsIgnoreCase(value)){
				return lettersA5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersA5.length; i++){
			if(lettersA5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}