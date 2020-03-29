package com.technegames.dict.I;

import com.technegames.framework.Dictionary;

public class DictionaryI4 implements Dictionary{
	private static String[] lettersI4 = { "iodide", "iodine", "ion", "ionian", "ionic", "ionisation", "ionise", "ionised", "ionising", "ionosphere", "ionospheric", "ions", "iota", "iotas", "iran", "iranian", "iranians", "iraq", "iraqi", "iraqis", "irascibility", "irascible", "irascibly", "irate", "ire", "ireland", "iridescence", "iridescent", "iridium", "iris", "irises", "irish", "irishman", "irishmen", "irk", "irked", "irking", "irks", "irksome", "irksomeness", "iron", "ironage", "ironed", "ironic", "ironical", "ironically", "ironies", "ironing", "ironlady", "ironmonger", "ironmongers", "ironmongery", "irons", "ironstone", "ironwork", "ironworks", "irony", "irradiate", "irradiated", "irradiating", "irradiation", "irrational", "irrationalities", "irrationality", "irrationally", "irreconcilable", "irrecoverable", "irrecoverably", "irredeemable", "irredeemably", "irreducibility", "irreducible", "irreducibly", "irrefutable", "irregular", "irregularities", "irregularity", "irregularly", "irregulars", "irrelevance", "irrelevances", "irrelevancy", "irrelevant", "irrelevantly", "irreligious", "irremediable", "irremovable", "irreparable", "irreparably", "irreplaceable", "irrepressible", "irrepressibly", "irreproachable", "irreproachably", "irresistible", "irresistibly", "irresolute", "irresolutely", "irresolution", "irresolvable", "irrespective", "irrespectively", "irresponsibility", "irresponsible", "irresponsibly", "irretrievable", "irretrievably", "irreverence", "irreverent", "irreverently", "irreversibility", "irreversible", "irreversibly", "irrevocable", "irrevocably", "irrigate", "irrigated", "irrigating", "irrigation", "irritability", "irritable", "irritably", "irritant", "irritants", "irritate", "irritated", "irritatedly", "irritates", "irritating", "irritatingly", "irritation", "irritations", "irrupted", "irruption", "is", "isis", "islam", "islamic", "island", "islander", "islanders", "islands", "isle", "isles", "islet", "islets", "isms", "isnt", "isobar", "isobars", "isogram", "isolate", "isolated", "isolates", "isolating", "isolation", "isolationism", "isolationist", "isolator", "isolators", "isomer", "isomeric", "isomers", "isometric", "isometrically", "isometry", "isomorph", "isomorphic", "isomorphism", "isomorphisms", "isoperimetrical", "isosceles", "isostatic", "isothermal", "isothermally", "isotonic", "isotope", "isotopes", "isotopic", "isotropic", "isotropically", "isotropy", "israel", "israeli", "israelis", "issuable", "issuance", "issue", "issued", "issuer", "issuers", "issues", "issuing", "istanbul", "isthmus", "it", "italian", "italians", "italic", "italicisation", "italicise", "italicised", "italics", "italy", "itch", "itched", "itches", "itchier", "itchiest", "itching", "itchy", "item", "itemise", "itemised", "itemises", "itemising", "items", "iterate", "iterated", "iterates", "iterating", "iteration", "iterations", "iterative", "iteratively", "iterators", "itinerant", "itinerants", "itineraries", "itinerary", "itll", "its", "itself" };
	private int searchIndex;
	
	public DictionaryI4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersI4.length; i++){
			if(lettersI4[i].equalsIgnoreCase(value)){
				return lettersI4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersI4.length; i++){
			if(lettersI4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}