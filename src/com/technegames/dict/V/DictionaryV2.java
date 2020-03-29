package com.technegames.dict.V;

import com.technegames.framework.Dictionary;

public class DictionaryV2 implements Dictionary{
	private static String[] lettersV2 = { "veal", "vector", "vectored", "vectoring", "vectorisation", "vectorised", "vectors", "veer", "veered", "veering", "veers", "veg", "vegan", "vegans", "vegetable", "vegetables", "vegetarian", "vegetarianism", "vegetarians", "vegetate", "vegetated", "vegetating", "vegetation", "vegetational", "vegetative", "vegetive", "veggies", "vehemence", "vehement", "vehemently", "vehicle", "vehicles", "vehicular", "veil", "veiled", "veiling", "veils", "vein", "veined", "veins", "velar", "veld", "veldt", "vellum", "velocipede", "velocities", "velocity", "velodrome", "velour", "velum", "velvet", "velveteen", "velveteens", "velvets", "velvety", "venal", "venality", "vend", "venders", "vendetta", "vendettas", "vending", "vendor", "vendors", "vends", "veneer", "veneered", "veneers", "venerable", "venerate", "venerated", "venerates", "venerating", "veneration", "venereal", "venetian", "vengeance", "vengeful", "vengefully", "venial", "venice", "venison", "venom", "venomous", "venomously", "venoms", "venose", "venous", "vent", "vented", "ventilate", "ventilated", "ventilating", "ventilation", "ventilator", "ventilators", "venting", "ventings", "ventral", "ventrally", "ventricle", "ventricles", "ventricular", "ventriloquism", "ventriloquist", "ventriloquists", "ventriloquy", "vents", "venture", "ventured", "venturer", "ventures", "venturesome", "venturing", "venue", "venues", "venus", "veracity", "veranda", "verandah", "verandahs", "verandas", "verb", "verbal", "verbalise", "verbally", "verbals", "verbatim", "verbiage", "verbose", "verbosely", "verboseness", "verbosity", "verbs", "verdant", "verdict", "verdicts", "verdigris", "verdure", "verge", "verged", "verger", "verges", "verging", "verifiability", "verifiable", "verification", "verifications", "verified", "verifier", "verifiers", "verifies", "verify", "verifying", "verily", "verisimilitude", "veritable", "veritably", "verities", "verity", "vermilion", "vermin", "verminous", "vernacular", "vernal", "vernier", "verona", "versatile", "versatility", "verse", "versed", "verses", "versicle", "versification", "versifier", "version", "versions", "versus", "vertebra", "vertebrae", "vertebral", "vertebrate", "vertebrates", "vertex", "vertical", "verticality", "vertically", "verticals", "vertices", "vertiginous", "vertigo", "verve", "very", "vesicle", "vesicles", "vesicular", "vespers", "vessel", "vessels", "vest", "vestal", "vested", "vestibular", "vestibule", "vestibules", "vestige", "vestiges", "vestigial", "vesting", "vestment", "vestments", "vestry", "vests", "vesuvius", "vet", "veteran", "veterans", "veterinary", "veto", "vetoed", "vetoing", "vets", "vetted", "vetting", "vex", "vexation", "vexations", "vexatious", "vexed", "vexes", "vexing" };
	private int searchIndex;
	
	public DictionaryV2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersV2.length; i++){
			if(lettersV2[i].equalsIgnoreCase(value)){
				return lettersV2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersV2.length; i++){
			if(lettersV2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}