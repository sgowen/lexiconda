package com.technegames.dict.N;

import com.technegames.framework.Dictionary;

public class DictionaryN5 implements Dictionary{
	private static String[] lettersN5 = { "nu", "nuance", "nuances", "nuclear", "nuclei", "nucleic", "nucleus", "nude", "nudeness", "nudes", "nudge", "nudged", "nudges", "nudging", "nudism", "nudist", "nudists", "nudities", "nudity", "nugget", "nuggets", "nuisance", "nuisances", "nuke", "null", "nullification", "nullified", "nullifies", "nullify", "nullifying", "nullity", "nulls", "numb", "numbed", "number", "numbered", "numbering", "numberings", "numberless", "numberplate", "numbers", "numbing", "numbingly", "numbly", "numbness", "numbs", "numbskull", "numeracy", "numeral", "numerals", "numerate", "numerator", "numerators", "numeric", "numerical", "numerically", "numerological", "numerologist", "numerologists", "numerology", "numerous", "numismatic", "numismatics", "numskull", "nun", "nunneries", "nunnery", "nuns", "nuptial", "nuptials", "nurse", "nursed", "nursemaid", "nursemaids", "nurseries", "nursery", "nurseryman", "nurserymen", "nurses", "nursing", "nurture", "nurtured", "nurtures", "nurturing", "nut", "nutation", "nutcracker", "nutcrackers", "nutmeg", "nutmegs", "nutrient", "nutrients", "nutriment", "nutrition", "nutritional", "nutritionally", "nutritionist", "nutritionists", "nutritious", "nutritive", "nuts", "nutshell", "nuttier", "nutty", "nuzzle", "nuzzled", "nuzzles", "nuzzling", "nyala", "nylon", "nylons", "nymph", "nympholepsy", "nymphomania", "nymphomaniac", "nymphs" };
	private int searchIndex;
	
	public DictionaryN5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersN5.length; i++){
			if(lettersN5[i].equalsIgnoreCase(value)){
				return lettersN5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersN5.length; i++){
			if(lettersN5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}