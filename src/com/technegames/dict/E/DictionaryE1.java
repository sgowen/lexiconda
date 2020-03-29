package com.technegames.dict.E;

import com.technegames.framework.Dictionary;

public class DictionaryE1 implements Dictionary{
	private static String[] lettersE1 = { "each", "eager", "eagerly", "eagerness", "eagle", "eagles", "eaglet", "eaglets", "ear", "earache", "earaches", "eardrop", "eardrops", "eardrum", "eardrums", "eared", "earful", "earholes", "earl", "earldom", "earldoms", "earlier", "earliest", "earlobe", "earlobes", "earls", "early", "earmark", "earmarked", "earmarking", "earn", "earned", "earner", "earners", "earnest", "earnestly", "earnestness", "earning", "earnings", "earns", "earphone", "earphones", "earpiece", "earpieces", "earplug", "earplugs", "earring", "earrings", "ears", "earshot", "earsplitting", "earth", "earthbound", "earthed", "earthen", "earthenware", "earthiness", "earthing", "earthling", "earthlings", "earthly", "earthquake", "earthquakes", "earths", "earthshaking", "earthshattering", "earthwards", "earthwork", "earthworks", "earthworm", "earthworms", "earthy", "earwax", "earwig", "earwigs", "ease", "eased", "easel", "easels", "easement", "easements", "eases", "easier", "easiest", "easily", "easiness", "easing", "east", "eastbound", "easter", "easterly", "eastern", "easterners", "easternmost", "easting", "eastward", "eastwards", "easy", "easygoing", "eat", "eatable", "eatage", "eaten", "eater", "eaters", "eatery", "eating", "eatings", "eats", "eaves", "eavesdrop", "eavesdropped", "eavesdropper", "eavesdroppers", "eavesdropping", "eavesdrops", "ebb", "ebbed", "ebbing", "ebbs", "ebbtide", "ebony", "ebullience", "ebullient", "eccentric", "eccentrically", "eccentricities", "eccentricity", "eccentrics", "ecclesiastic", "ecclesiastical", "ecclesiastically", "echelon", "echelons", "echidna", "echidnas", "echinoderm", "echinoderms", "echo", "echoed", "echoic", "echoing", "eclair", "eclairs", "eclectic", "eclecticism", "eclipse", "eclipsed", "eclipses", "eclipsing", "ecliptic", "ecological", "ecologically", "ecologist", "ecologists", "ecology", "econometric", "econometrics", "economic", "economical", "economically", "economics", "economies", "economisation", "economise", "economised", "economises", "economising", "economist", "economists", "economy", "ecosystem", "ecosystems", "ecstasies", "ecstasy", "ecstatic", "ecstatically", "ectopic", "ectoplasm", "ecuador", "ecumenical", "ecumenically", "ecumenism", "eczema", "eddied", "eddies", "eddy", "eddying", "edema", "eden", "edge", "edged", "edgeless", "edges", "edgeways", "edgewise", "edgier", "edgily", "edginess", "edging", "edgings", "edgy", "edibility", "edible", "edibles", "edict", "edicts", "edification", "edifice", "edifices", "edified", "edifies", "edify", "edifying", "edison", "edit", "editable", "edited", "editing", "edition", "editions", "editor", "editorial", "editorialised", "editorially", "editorials", "editors", "editorship", "editorships", "edits", "educate", "educated", "educates", "educating", "education", "educational", "educationalist", "educationalists", "educationally", "educationist", "educationists", "educations", "educative", "educator", "educators", "eduction" };
	private int searchIndex;
	
	public DictionaryE1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersE1.length; i++){
			if(lettersE1[i].equalsIgnoreCase(value)){
				return lettersE1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersE1.length; i++){
			if(lettersE1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}