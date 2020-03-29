package com.technegames.dict.R;

import com.technegames.framework.Dictionary;

public class DictionaryR1 implements Dictionary{
	private static String[] lettersR1 = { "rabat", "rabats", "rabbi", "rabbis", "rabbit", "rabbiting", "rabbits", "rabble", "rabid", "rabidly", "rabies", "raccoon", "raccoons", "race", "racecourse", "racecourses", "raced", "racegoers", "racehorse", "racehorses", "racer", "racers", "races", "racetrack", "rachis", "racial", "racialism", "racialist", "racialists", "racially", "racier", "raciest", "racily", "racing", "racings", "racism", "racist", "racists", "rack", "racked", "racket", "racketeering", "rackets", "racking", "racks", "raconteur", "racoon", "racquet", "racquets", "racy", "rad", "radar", "radars", "radial", "radially", "radials", "radian", "radiance", "radiancy", "radians", "radiant", "radiantly", "radiate", "radiated", "radiates", "radiating", "radiation", "radiations", "radiative", "radiatively", "radiator", "radiators", "radical", "radicalism", "radically", "radicals", "radices", "radii", "radio", "radioactive", "radioactively", "radioactivity", "radioastronomical", "radiocarbon", "radioed", "radiogalaxies", "radiogalaxy", "radiogram", "radiograph", "radiographer", "radiographers", "radiographic", "radiographs", "radiography", "radioing", "radiological", "radiologist", "radiologists", "radiology", "radiometric", "radionuclide", "radios", "radiotherapy", "radish", "radishes", "radium", "radius", "radix", "radon", "raffia", "raffle", "raffled", "raffles", "raft", "rafter", "rafters", "rafting", "raftman", "rafts", "raftsman", "rag", "ragamuffin", "ragamuffins", "ragbag", "rage", "raged", "rages", "ragged", "raggedly", "raging", "ragout", "rags", "ragstoriches", "ragtime", "ragwort", "raid", "raided", "raider", "raiders", "raiding", "raids", "rail", "railed", "railes", "railing", "railings", "raillery", "railroad", "rails", "railway", "railwayman", "railwaymen", "railways", "raiment", "rain", "rainbow", "rainbows", "raincloud", "rainclouds", "raincoat", "raincoats", "raindrop", "raindrops", "rained", "rainfall", "rainforest", "rainforests", "rainier", "rainiest", "raining", "rainless", "rainout", "rains", "rainstorm", "rainstorms", "rainswept", "rainwater", "rainy", "raise", "raised", "raiser", "raises", "raisin", "raising", "raisins", "raj", "rajah", "rake", "raked", "rakes", "raking", "rakish", "rallied", "rallies", "rally", "rallying", "ram", "ramble", "rambled", "rambler", "ramblers", "rambles", "rambling", "ramblings", "ramification", "ramifications", "ramified", "ramifies", "ramify", "rammed", "rammer", "ramming", "ramp", "rampage", "rampaged", "rampages", "rampaging", "rampant", "rampantly", "rampart", "ramparts", "ramped", "ramping", "ramps", "ramrod", "rams", "ramshackle", "ran", "ranch", "rancher", "ranchers", "ranches", "ranching", "rancid", "rancorous", "rancour", "rand", "random", "randomisation", "randomise", "randomised", "randomising", "randomly", "randomness", "rands", "randy", "rang", "range", "ranged", "ranger", "rangers", "ranges", "ranging", "rangy", "rani", "ranis", "rank", "ranked", "ranker", "rankers", "rankest", "ranking", "rankings", "rankle", "rankled", "rankles", "rankling", "rankness", "ranks", "ransack", "ransacked", "ransacking", "ransom", "ransomed", "ransoming", "ransoms", "rant", "ranted", "ranter", "ranters", "ranting", "rantings", "rants", "rap", "rapacious", "rapacity", "rape", "raped", "rapes", "rapeseed", "rapid", "rapidity", "rapidly", "rapids", "rapier", "rapiers", "rapine", "raping", "rapist", "rapists", "rapped", "rapping", "rapport", "rapporteur", "rapporteurs", "rapports", "rapprochement", "raps", "rapt", "raptor", "raptors", "rapture", "raptures", "rapturous", "rapturously", "rare", "rarebit", "rarefaction", "rarefactions", "rarefied", "rarely", "rareness", "rarer", "rarest", "raring", "rarities", "rarity", "rascal", "rascally", "rascals", "rased", "rash", "rasher", "rashers", "rashes", "rashest", "rashly", "rashness", "rasing", "rasp", "raspberries", "raspberry", "rasped", "rasper", "rasping", "rasps", "raspy", "raster", "rasters", "rat", "ratatouille", "rate", "rated", "ratepayer", "ratepayers", "rater", "rates", "rather", "ratification", "ratifications", "ratified", "ratifier", "ratifies", "ratify", "ratifying", "rating", "ratings", "ratio", "ratiocination", "ration", "rational", "rationale", "rationales", "rationalisation", "rationalisations", "rationalise", "rationalised", "rationalising", "rationalism", "rationalist", "rationalistic", "rationalists", "rationalities", "rationality", "rationally", "rationed", "rationing", "rations", "ratios", "ratlike", "ratrace", "rats", "rattier", "rattle", "rattled", "rattler", "rattles", "rattlesnake", "rattlesnakes", "rattling", "ratty", "raucous", "raucously", "ravage", "ravaged", "ravages", "ravaging", "rave", "raved", "ravel", "ravelled", "ravelling", "ravels", "raven", "ravening", "ravenous", "ravenously", "ravens", "raver", "ravers", "raves", "ravine", "ravines", "raving", "ravingly", "ravings", "ravioli", "ravish", "ravished", "ravisher", "ravishes", "ravishing", "ravishingly", "raw", "rawest", "rawness", "ray", "rayed", "rayon", "rays", "raze", "razed", "razes", "razing", "razor", "razorbills", "razorblades", "razoring", "razors", "razorsharp", "razzmatazz" };
	private int searchIndex;
	
	public DictionaryR1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersR1.length; i++){
			if(lettersR1[i].equalsIgnoreCase(value)){
				return lettersR1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersR1.length; i++){
			if(lettersR1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}