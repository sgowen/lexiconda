package com.technegames.dict.F;

import com.technegames.framework.Dictionary;

public class DictionaryF2 implements Dictionary{
	private static String[] lettersF2 = { "fealty", "fear", "feared", "fearful", "fearfully", "fearfulness", "fearing", "fearless", "fearlessly", "fearlessness", "fears", "fearsome", "fearsomely", "fearsomeness", "feasibility", "feasible", "feasibly", "feast", "feasted", "feasting", "feasts", "feat", "feather", "feathered", "feathering", "featherlight", "feathers", "featherweight", "feathery", "feats", "feature", "featured", "featureless", "features", "featuring", "febrile", "february", "feckless", "fecklessness", "fecund", "fecundity", "fed", "federal", "federalism", "federalist", "federalists", "federally", "federate", "federated", "federation", "federations", "fedora", "feds", "fedup", "fee", "feeble", "feebleminded", "feebleness", "feebler", "feeblest", "feebly", "feed", "feedback", "feeder", "feeders", "feeding", "feedings", "feeds", "feedstock", "feedstuffs", "feel", "feeler", "feelers", "feeling", "feelingly", "feelings", "feels", "fees", "feet", "feign", "feigned", "feigning", "feigns", "feint", "feinted", "feinting", "feints", "feldspar", "feldspars", "felicia", "felicitation", "felicitations", "felicities", "felicitous", "felicity", "feline", "felines", "fell", "fellatio", "felled", "feller", "felling", "fellow", "fellows", "fellowship", "fellowships", "fells", "felon", "felonious", "felons", "felony", "felt", "feltpen", "female", "femaleness", "females", "feminine", "femininely", "femininity", "feminism", "feminist", "feminists", "femur", "femurs", "fen", "fence", "fenced", "fencepost", "fencer", "fencers", "fences", "fencing", "fencings", "fend", "fended", "fender", "fenders", "fending", "fends", "fenland", "fennel", "fens", "feral", "ferment", "fermentation", "fermented", "fermenting", "ferments", "fermion", "fermions", "fern", "ferns", "ferny", "ferocious", "ferociously", "ferociousness", "ferocity", "ferret", "ferreted", "ferreting", "ferrets", "ferric", "ferried", "ferries", "ferrite", "ferromagnetic", "ferrous", "ferrule", "ferry", "ferrying", "ferryman", "fertile", "fertilisation", "fertilise", "fertilised", "fertiliser", "fertilisers", "fertilises", "fertilising", "fertility", "fervent", "fervently", "fervid", "fervidly", "fervour", "fescue", "fest", "festal", "fester", "festered", "festering", "festers", "festival", "festivals", "festive", "festivities", "festivity", "festoon", "festooned", "festooning", "festoons", "fetal", "fetch", "fetched", "fetches", "fetching", "fete", "feted", "fetes", "fetid", "fetish", "fetishes", "fetishism", "fetishist", "fetishistic", "fetishists", "fetlock", "fetlocks", "fetter", "fettered", "fetters", "fettle", "fetus", "feud", "feudal", "feudalism", "feuded", "feuding", "feudist", "feuds", "fever", "fevered", "feverish", "feverishly", "fevers", "few", "fewer", "fewest", "fewness", "fez" };
	private int searchIndex;
	
	public DictionaryF2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersF2.length; i++){
			if(lettersF2[i].equalsIgnoreCase(value)){
				return lettersF2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersF2.length; i++){
			if(lettersF2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}