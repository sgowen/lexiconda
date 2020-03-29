package com.technegames.dict.N;

import com.technegames.framework.Dictionary;

public class DictionaryN4 implements Dictionary{
	private static String[] lettersN4 = { "no", "noah", "nobility", "noble", "nobleman", "noblemen", "nobleness", "nobler", "nobles", "noblest", "nobly", "nobodies", "nobody", "noctuids", "nocturnal", "nocturnally", "nocturne", "nocturnes", "nod", "nodal", "nodded", "nodding", "noddle", "noddy", "node", "nodes", "nods", "nodular", "nodule", "noduled", "nodules", "noel", "noggin", "nogging", "nohow", "noise", "noiseless", "noiselessly", "noises", "noisier", "noisiest", "noisily", "noisiness", "noisome", "noisy", "nomad", "nomadic", "nomads", "nomenclature", "nomenclatures", "nominal", "nominally", "nominate", "nominated", "nominates", "nominating", "nomination", "nominations", "nominative", "nominator", "nominee", "nominees", "non", "nonbeliever", "nonbelievers", "nonchalance", "nonchalant", "nonchalantly", "nonconformist", "nonconformists", "nonconformity", "nondrinkers", "none", "nonentities", "nonentity", "nonessential", "nonessentials", "nonetheless", "nonevent", "nonexistence", "nonexistent", "nonfunctional", "noninterference", "nonintervention", "nonparticipation", "nonpayment", "nonplussed", "nonsense", "nonsenses", "nonsensical", "nonsmoker", "nonsmokers", "nonsmoking", "nonviolence", "nonviolent", "noodle", "noodles", "nook", "nooks", "noon", "noonday", "noons", "noontide", "noose", "noosed", "nooses", "nor", "noradrenalin", "noradrenaline", "nordic", "norm", "normal", "normalcy", "normalisable", "normalisation", "normalisations", "normalise", "normalised", "normaliser", "normalisers", "normalises", "normalising", "normality", "normally", "normals", "norman", "normandy", "normans", "normative", "normed", "norms", "norsemen", "north", "northbound", "northerly", "northern", "northerner", "northerners", "northernmost", "northmen", "northward", "northwards", "norway", "nose", "nosed", "nosedive", "noses", "nosey", "nosier", "nosiest", "nosily", "nosiness", "nosing", "nostalgia", "nostalgic", "nostalgically", "nostril", "nostrils", "nostrum", "nosy", "not", "notable", "notables", "notably", "notaries", "notary", "notation", "notational", "notationally", "notations", "notch", "notched", "notches", "notching", "note", "notebook", "notebooks", "noted", "notepad", "notepads", "notepaper", "notes", "noteworthy", "nothing", "nothingness", "nothings", "notice", "noticeable", "noticeably", "noticeboard", "noticeboards", "noticed", "notices", "noticing", "notifiable", "notification", "notifications", "notified", "notifies", "notify", "notifying", "noting", "notion", "notional", "notionally", "notions", "notoriety", "notorious", "notoriously", "notwithstanding", "nougat", "nougats", "nought", "noughts", "noun", "nounal", "nouns", "nourish", "nourished", "nourishes", "nourishing", "nourishment", "novel", "novelette", "novelist", "novelistic", "novelists", "novelle", "novels", "novelties", "novelty", "november", "novice", "novices", "now", "nowadays", "nowhere", "noxious", "noxiously", "noxiousness", "nozzle", "nozzles" };
	private int searchIndex;
	
	public DictionaryN4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersN4.length; i++){
			if(lettersN4[i].equalsIgnoreCase(value)){
				return lettersN4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersN4.length; i++){
			if(lettersN4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}