package com.technegames.dict.N;

import com.technegames.framework.Dictionary;

public class DictionaryN2 implements Dictionary{
	private static String[] lettersN2 = { "ne", "near", "nearby", "neared", "nearer", "nearest", "nearing", "nearly", "nearness", "nears", "nearside", "nearsighted", "neat", "neaten", "neatening", "neatens", "neater", "neatest", "neatly", "neatness", "nebula", "nebulae", "nebular", "nebulas", "nebulosity", "nebulous", "nebulously", "nebulousness", "necessaries", "necessarily", "necessary", "necessitate", "necessitated", "necessitates", "necessitating", "necessities", "necessity", "neck", "neckband", "necked", "necking", "necklace", "necklaces", "neckline", "necklines", "necks", "necktie", "necromancer", "necromancers", "necromancy", "necromantic", "necrophilia", "necrophiliac", "necrophiliacs", "necropolis", "necropsy", "necrosis", "necrotic", "nectar", "nectarines", "nectars", "nee", "need", "needed", "needful", "needier", "neediest", "neediness", "needing", "needle", "needlecraft", "needled", "needles", "needless", "needlessly", "needlework", "needling", "needs", "needy", "negate", "negated", "negates", "negating", "negation", "negations", "negative", "negatively", "negativeness", "negatives", "negativism", "negativity", "negev", "neglect", "neglected", "neglectful", "neglecting", "neglects", "negligee", "negligees", "negligence", "negligent", "negligently", "negligibility", "negligible", "negligibly", "negotiable", "negotiate", "negotiated", "negotiates", "negotiating", "negotiation", "negotiations", "negotiator", "negotiators", "negroid", "neigh", "neighbour", "neighbourhood", "neighbourhoods", "neighbouring", "neighbourliness", "neighbourly", "neighbours", "neighed", "neighing", "neither", "nematode", "nematodes", "nemesis", "neolithic", "neologism", "neologisms", "neon", "neonatal", "neonate", "neonates", "neophyte", "neophytes", "neoplasm", "neoplasms", "neoprene", "nepal", "nephew", "nephews", "nephritis", "nepotism", "neptune", "neptunium", "nerd", "nerds", "nerve", "nerveless", "nervelessness", "nerves", "nervous", "nervously", "nervousness", "nervy", "nest", "nestable", "nested", "nestegg", "nesting", "nestle", "nestled", "nestles", "nestling", "nests", "net", "netball", "nether", "nethermost", "nets", "nett", "netted", "netting", "nettle", "nettled", "nettles", "netts", "network", "networked", "networking", "networks", "neural", "neuralgia", "neurobiology", "neurological", "neurologically", "neurologist", "neurologists", "neurology", "neuron", "neuronal", "neurone", "neurones", "neurons", "neurophysiology", "neuroscience", "neuroscientists", "neuroses", "neurosis", "neurosurgeon", "neurosurgeons", "neurosurgery", "neurotic", "neurotically", "neurotics", "neurotransmitter", "neurotransmitters", "neuter", "neutered", "neutering", "neuters", "neutral", "neutralisation", "neutralise", "neutralised", "neutraliser", "neutralises", "neutralising", "neutralism", "neutralist", "neutrality", "neutrally", "neutrals", "neutrino", "neutron", "neutrons", "never", "neverending", "nevertheless", "new", "newborn", "newcomer", "newcomers", "newer", "newest", "newfangled", "newfound", "newish", "newlook", "newly", "newlywed", "newlyweds", "newness", "news", "newsagent", "newsagents", "newsboy", "newscast", "newscasters", "newsflash", "newsflashes", "newsletter", "newsletters", "newsman", "newsmen", "newspaper", "newspapermen", "newspapers", "newsprint", "newsreader", "newsreaders", "newsreel", "newsreels", "newsroom", "newsstand", "newsstands", "newsworthy", "newsy", "newt", "newton", "newts", "next", "ngoing", "nguni", "ngunis" };
	private int searchIndex;
	
	public DictionaryN2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersN2.length; i++){
			if(lettersN2[i].equalsIgnoreCase(value)){
				return lettersN2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersN2.length; i++){
			if(lettersN2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}