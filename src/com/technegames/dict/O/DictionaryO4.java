package com.technegames.dict.O;

import com.technegames.framework.Dictionary;

public class DictionaryO4 implements Dictionary{
	private static String[] lettersO4 = { "oocytes", "oodles", "ooh", "oolitic", "oology", "oompah", "oops", "ooze", "oozed", "oozes", "oozing", "oozy", "opacity", "opal", "opalescent", "opals", "opaque", "open", "opened", "opener", "openers", "openhanded", "openhandedness", "openheart", "openhearted", "opening", "openings", "openly", "openminded", "openmindedness", "openness", "opens", "opera", "operable", "operand", "operands", "operas", "operate", "operated", "operates", "operatic", "operating", "operation", "operational", "operationally", "operations", "operative", "operatives", "operator", "operators", "operculum", "operetta", "operettas", "ophthalmic", "ophthalmics", "ophthalmologist", "ophthalmologists", "ophthalmology", "opiate", "opiates", "opine", "opined", "opines", "opining", "opinion", "opinionated", "opinions", "opioid", "opioids", "opium", "opossum", "opponent", "opponents", "opportune", "opportunely", "opportunism", "opportunist", "opportunistic", "opportunistically", "opportunists", "opportunities", "opportunity", "oppose", "opposed", "opposes", "opposing", "opposite", "oppositely", "opposites", "opposition", "oppositional", "oppositions", "oppress", "oppressed", "oppresses", "oppressing", "oppression", "oppressions", "oppressive", "oppressively", "oppressiveness", "oppressor", "oppressors", "opprobrious", "opprobrium", "opt", "opted", "optic", "optical", "optically", "optician", "opticians", "optics", "optima", "optimal", "optimality", "optimally", "optimisation", "optimisations", "optimise", "optimised", "optimiser", "optimisers", "optimises", "optimising", "optimism", "optimist", "optimistic", "optimistically", "optimists", "optimum", "opting", "option", "optional", "optionality", "optionally", "options", "optoelectronic", "opts", "opulence", "opulent", "opus", "opuses", "or", "oracle", "oracles", "oracular", "oral", "orally", "orang", "orange", "oranges", "orangs", "orangutan", "orangutans", "orate", "orated", "orates", "orating", "oration", "orations", "orator", "oratorical", "oratorio", "orators", "oratory", "orb", "orbit", "orbital", "orbitals", "orbited", "orbiter", "orbiting", "orbits", "orbs", "orca", "orchard", "orchards", "orchestra", "orchestral", "orchestras", "orchestrate", "orchestrated", "orchestrates", "orchestrating", "orchestration", "orchestrations", "orchestrator", "orchid", "orchids", "ordain", "ordained", "ordaining", "ordains", "ordeal", "ordeals", "order", "ordered", "ordering", "orderings", "orderless", "orderlies", "orderliness", "orderly", "orders", "ordinal", "ordinals", "ordinance", "ordinances", "ordinands", "ordinarily", "ordinariness", "ordinary", "ordinate", "ordinates", "ordination", "ordinations", "ordnance", "ordure", "ore", "ores", "organ", "organelles", "organic", "organically", "organics", "organisable", "organisation", "organisational", "organisationally", "organisations", "organise", "organised", "organiser", "organisers", "organises", "organising", "organism", "organisms", "organist", "organists", "organs", "organza", "orgies", "orgy", "orient", "orientable", "oriental", "orientalism", "orientals", "orientate", "orientated", "orientates", "orientation", "orientations", "oriented", "orienteering", "orienting", "orifice", "orifices", "origami", "origin", "original", "originality", "originally", "originals", "originate", "originated", "originates", "originating", "origination", "originator", "originators", "origins", "orimulsion", "ornament", "ornamental", "ornamentation", "ornamented", "ornamenting", "ornaments", "ornate", "ornately", "ornery", "ornithological", "ornithologist", "ornithologists", "ornithology", "orphan", "orphanage", "orphanages", "orphaned", "orphans", "orpheus", "orthodontist", "orthodox", "orthodoxies", "orthodoxy", "orthogonal", "orthogonality", "orthogonally", "orthographic", "orthographical", "orthographically", "orthography", "orthonormal", "orthopaedic", "orthopaedics", "orthorhombic", "oryxes", "oscar", "oscars", "oscillate", "oscillated", "oscillates", "oscillating", "oscillation", "oscillations", "oscillator", "oscillators", "oscillatory", "oscilloscope", "oscilloscopes", "osiris", "oslo", "osmium", "osmosis", "osmotic", "osprey", "ospreys", "ossification", "ossified", "ostensible", "ostensibly", "ostentation", "ostentatious", "ostentatiously", "osteoarthritis", "osteopath", "osteopaths", "osteopathy", "osteoporosis", "ostler", "ostlers", "ostracise", "ostracised", "ostracism", "ostrich", "ostriches", "other", "otherness", "others", "otherwise", "otter", "otters", "ottoman" };
	private int searchIndex;
	
	public DictionaryO4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersO4.length; i++){
			if(lettersO4[i].equalsIgnoreCase(value)){
				return lettersO4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersO4.length; i++){
			if(lettersO4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}