package com.technegames.dict.V;

import com.technegames.framework.Dictionary;

public class DictionaryV1 implements Dictionary{
	private static String[] lettersV1 = { "vacancies", "vacancy", "vacant", "vacantly", "vacate", "vacated", "vacates", "vacating", "vacation", "vacations", "vaccinate", "vaccinated", "vaccinating", "vaccination", "vaccinations", "vaccine", "vaccines", "vacillate", "vacillating", "vacillation", "vacillations", "vacua", "vacuity", "vacuole", "vacuoles", "vacuous", "vacuously", "vacuum", "vacuums", "vaduz", "vagabond", "vagabonds", "vagrancy", "vagrant", "vagrants", "vague", "vaguely", "vagueness", "vaguer", "vaguest", "vain", "vainer", "vainest", "vainglorious", "vainglory", "vainly", "valance", "vale", "valediction", "valedictory", "valence", "valencies", "valency", "valentine", "vales", "valet", "valets", "valhalla", "valiant", "valiantly", "valid", "validate", "validated", "validates", "validating", "validation", "validity", "validly", "valise", "valley", "valleys", "valour", "valuable", "valuables", "valuation", "valuations", "value", "valueadded", "valued", "valueformoney", "valueless", "valuer", "valuers", "values", "valuing", "valuta", "valve", "valves", "vamp", "vamped", "vamper", "vamping", "vampire", "vampires", "vamps", "van", "vanadium", "vandal", "vandalise", "vandalised", "vandalising", "vandalism", "vandals", "vane", "vaned", "vanes", "vangogh", "vanguard", "vanilla", "vanish", "vanished", "vanishes", "vanishing", "vanishingly", "vanities", "vanity", "vanquish", "vanquished", "vanquishing", "vans", "vantage", "vapid", "vaporisation", "vaporise", "vaporised", "vaporising", "vaporous", "vapour", "vapours", "variability", "variable", "variables", "variably", "variance", "variances", "variant", "variants", "variate", "variates", "variation", "variational", "variations", "varicose", "varied", "variegated", "varies", "varietal", "varieties", "variety", "various", "variously", "varnish", "varnished", "varnishes", "varnishing", "varsity", "vary", "varying", "vascular", "vase", "vasectomies", "vasectomy", "vaseline", "vases", "vassal", "vassalage", "vassals", "vast", "vaster", "vastly", "vastness", "vat", "vatican", "vats", "vault", "vaulted", "vaulting", "vaults", "vaunted", "vaunting" };
	private int searchIndex;
	
	public DictionaryV1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersV1.length; i++){
			if(lettersV1[i].equalsIgnoreCase(value)){
				return lettersV1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersV1.length; i++){
			if(lettersV1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}