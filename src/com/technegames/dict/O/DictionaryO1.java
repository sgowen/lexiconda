package com.technegames.dict.O;

import com.technegames.framework.Dictionary;

public class DictionaryO1 implements Dictionary{
	private static String[] lettersO1 = { "oaf", "oafish", "oafs", "oak", "oaken", "oaks", "oakum", "oar", "oars", "oarsman", "oarsmen", "oases", "oasis", "oast", "oat", "oatcakes", "oath", "oaths", "oatmeal", "oats", "obduracy", "obdurate", "obdurately", "obedience", "obedient", "obediently", "obeisance", "obelisk", "obelisks", "obese", "obesity", "obey", "obeyed", "obeying", "obeys", "obfuscate", "obfuscated", "obfuscates", "obfuscation", "obfuscatory", "obituaries", "obituary", "object", "objected", "objectified", "objecting", "objection", "objectionable", "objectionableness", "objectionably", "objections", "objective", "objectively", "objectives", "objectivity", "objectless", "objector", "objectors", "objects", "oblate", "obligate", "obligated", "obligation", "obligations", "obligatorily", "obligatory", "oblige", "obliged", "obliges", "obliging", "obligingly", "oblique", "obliqued", "obliquely", "obliqueness", "obliquity", "obliterate", "obliterated", "obliterates", "obliterating", "obliteration", "oblivion", "oblivious", "obliviousness", "oblong", "oblongs", "obloquy", "obnoxious", "obnoxiously", "obnoxiousness", "oboe", "oboes", "oboist", "obscene", "obscenely", "obscenities", "obscenity", "obscurantism", "obscurantist", "obscuration", "obscure", "obscured", "obscurely", "obscureness", "obscurer", "obscures", "obscurest", "obscuring", "obscurities", "obscurity", "obsequious", "obsequiously", "obsequiousness", "observability", "observable", "observables", "observably", "observance", "observances", "observant", "observation", "observational", "observationally", "observations", "observatories", "observatory", "observe", "observed", "observer", "observers", "observes", "observing", "obsess", "obsessed", "obsesses", "obsessing", "obsession", "obsessional", "obsessions", "obsessive", "obsessively", "obsessiveness", "obsidian", "obsolescence", "obsolescent", "obsolete", "obstacle", "obstacles", "obstetric", "obstetrician", "obstetricians", "obstetrics", "obstinacy", "obstinate", "obstinately", "obstreperous", "obstruct", "obstructed", "obstructing", "obstruction", "obstructionism", "obstructions", "obstructive", "obstructively", "obstructiveness", "obstructs", "obtain", "obtainable", "obtained", "obtaining", "obtains", "obtrude", "obtruded", "obtruding", "obtrusive", "obtrusiveness", "obtuse", "obtusely", "obtuseness", "obverse", "obviate", "obviated", "obviates", "obviating", "obvious", "obviously", "obviousness", "occasion", "occasional", "occasionally", "occasioned", "occasioning", "occasions", "occident", "occidental", "occipital", "occluded", "occludes", "occlusion", "occult", "occultism", "occults", "occupancies", "occupancy", "occupant", "occupants", "occupation", "occupational", "occupationally", "occupations", "occupied", "occupier", "occupiers", "occupies", "occupy", "occupying", "occur", "occurred", "occurrence", "occurrences", "occurring", "occurs", "ocean", "oceanic", "oceanographer", "oceanographers", "oceanographic", "oceanography", "oceans", "ocelot", "ocelots", "ochre", "ochres", "octagon", "octagonal", "octagons", "octahedral", "octahedron", "octal", "octane", "octanes", "octant", "octave", "octaves", "octavo", "octet", "octets", "october", "octogenarian", "octogenarians", "octopus", "octopuses", "ocular", "oculist", "odd", "odder", "oddest", "oddities", "oddity", "oddjob", "oddly", "oddment", "oddments", "oddness", "odds", "ode", "odes", "odin", "odious", "odiously", "odiousness", "odium", "odiums", "odometer", "odoriferous", "odorous", "odour", "odourless", "odours", "odyssey" };
	private int searchIndex;
	
	public DictionaryO1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersO1.length; i++){
			if(lettersO1[i].equalsIgnoreCase(value)){
				return lettersO1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersO1.length; i++){
			if(lettersO1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}