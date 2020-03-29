package com.technegames.dict.U;

import com.technegames.framework.Dictionary;

public class DictionaryU4 implements Dictionary{
	private static String[] lettersU4 = { "up", "upbeat", "upbraid", "upbraided", "upbraiding", "upbraids", "upbringing", "upbringings", "upcast", "upcoming", "updatability", "update", "updated", "updater", "updates", "updating", "upended", "upfield", "upfront", "upgradable", "upgrade", "upgradeable", "upgraded", "upgrades", "upgrading", "upgradings", "upheaval", "upheavals", "upheld", "uphill", "uphold", "upholder", "upholders", "upholding", "upholds", "upholster", "upholstered", "upholsterer", "upholsterers", "upholstery", "upkeep", "upland", "uplands", "uplift", "uplifted", "uplifting", "uplifts", "uplink", "uplinks", "upload", "uploaded", "uploads", "upmarket", "upmost", "upon", "upped", "upper", "uppercase", "upperclass", "uppercut", "uppermost", "uppers", "upraised", "uprate", "uprated", "uprating", "upright", "uprightly", "uprightness", "uprights", "uprise", "uprising", "uprisings", "upriver", "uproar", "uproarious", "uproariously", "uproars", "uproo", "uproot", "uprooted", "uprooting", "uproots", "ups", "upset", "upsets", "upsetting", "upshot", "upside", "upsidedown", "upsilon", "upstage", "upstaged", "upstages", "upstaging", "upstairs", "upstanding", "upstart", "upstarts", "upstream", "upsurge", "upsurges", "upswing", "uptake", "upthrust", "uptotheminute", "uptown", "upturn", "upturned", "upward", "upwardly", "upwards", "upwind", "uranium", "uranus", "urban", "urbane", "urbanely", "urbanisation", "urbanise", "urbanised", "urbanising", "urbanites", "urbanity", "urchin", "urchins", "urea", "ureter", "ureters", "urethane", "urethra", "urethrae", "urethral", "urethras", "urethritis", "urge", "urged", "urgency", "urgent", "urgently", "urges", "urging", "urgings", "urinary", "urine", "urn", "urns", "urologist", "ursine", "urticaria", "uruguay", "us", "usability", "usable", "usage", "usages", "usances", "use", "useable", "used", "useful", "usefully", "usefulness", "useless", "uselessly", "uselessness", "user", "userfriendliness", "userfriendly", "users", "uses", "usher", "ushered", "usherette", "ushering", "ushers", "using", "usual", "usually", "usurer", "usurers", "usurious", "usurp", "usurpation", "usurped", "usurper", "usurping", "usury", "utah", "utensil", "utensils", "uteri", "uterine", "uterus", "utilisation", "utilise", "utilised", "utilises", "utilising", "utilitarian", "utilitarianism", "utilitarians", "utilities", "utility", "utmost", "utopia", "utopian", "utopians", "utopias", "utter", "utterance", "utterances", "uttered", "utterer", "uttering", "utterly", "uttermost", "utters", "uturns" };
	private int searchIndex;
	
	public DictionaryU4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersU4.length; i++){
			if(lettersU4[i].equalsIgnoreCase(value)){
				return lettersU4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersU4.length; i++){
			if(lettersU4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}