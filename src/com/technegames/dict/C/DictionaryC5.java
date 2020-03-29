package com.technegames.dict.C;

import com.technegames.framework.Dictionary;

public class DictionaryC5 implements Dictionary{
	private static String[] lettersC5 = { "cub", "cuba", "cuban", "cubans", "cube", "cubed", "cubes", "cubic", "cubical", "cubically", "cubicle", "cubicles", "cubing", "cubism", "cubist", "cubistic", "cubists", "cubit", "cubits", "cuboid", "cubs", "cuckold", "cuckolded", "cuckoo", "cuckoos", "cucumber", "cucumbers", "cud", "cuddle", "cuddled", "cuddles", "cuddlier", "cuddliest", "cuddliness", "cuddling", "cuddly", "cudgel", "cudgels", "cuds", "cue", "cued", "cueing", "cues", "cuff", "cuffed", "cuffing", "cuffs", "cuing", "cuirass", "cuisine", "culdesac", "culinary", "cull", "culled", "culling", "culls", "culminate", "culminated", "culminates", "culminating", "culmination", "culpability", "culpable", "culpably", "culprit", "culprits", "cult", "cultivable", "cultivar", "cultivate", "cultivated", "cultivates", "cultivating", "cultivation", "cultivations", "cultivator", "cultivators", "cults", "cultural", "culturally", "culture", "cultured", "cultures", "culturing", "cultus", "culvert", "cumbersome", "cumbersomely", "cumlaude", "cummerbund", "cumulative", "cumulatively", "cumulus", "cuneiform", "cunnilingus", "cunning", "cunningly", "cup", "cupboard", "cupboards", "cupful", "cupid", "cupidinously", "cupidity", "cupola", "cupolas", "cupped", "cupping", "cuprous", "cups", "cur", "curable", "curare", "curate", "curated", "curates", "curative", "curator", "curatorial", "curators", "curatorships", "curb", "curbed", "curbing", "curbs", "curd", "curdle", "curdled", "curdles", "curdling", "curds", "cure", "cured", "curer", "cures", "curfew", "curfews", "curia", "curial", "curie", "curies", "curing", "curio", "curiosities", "curiosity", "curious", "curiously", "curl", "curled", "curlers", "curlew", "curlews", "curlicues", "curlier", "curliest", "curliness", "curling", "curls", "curly", "curmudgeons", "currant", "currants", "currencies", "currency", "current", "currently", "currents", "curricle", "curricula", "curricular", "curriculum", "curried", "curries", "curry", "currying", "curs", "curse", "cursed", "curses", "cursing", "cursive", "cursor", "cursorily", "cursors", "cursory", "curt", "curtail", "curtailed", "curtailing", "curtailment", "curtailments", "curtails", "curtain", "curtained", "curtaining", "curtains", "curtilage", "curtly", "curtness", "curtsey", "curtseyed", "curtseying", "curtseys", "curtsied", "curtsies", "curtsy", "curtsying", "curvaceous", "curvature", "curvatures", "curve", "curved", "curves", "curvilinear", "curving", "curvy", "cushion", "cushioned", "cushioning", "cushions", "cusp", "cusps", "cuss", "cussedness", "custard", "custards", "custodial", "custodian", "custodians", "custodianship", "custody", "custom", "customarily", "customary", "customer", "customers", "customisable", "customisation", "customisations", "customise", "customised", "customising", "customs", "cut", "cutback", "cutbacks", "cute", "cutely", "cuteness", "cutest", "cuticle", "cuticles", "cutlass", "cutlasses", "cutler", "cutlery", "cutlet", "cutlets", "cutout", "cutouts", "cutprice", "cutrate", "cuts", "cutter", "cutters", "cutthroat", "cutting", "cuttingly", "cuttings", "cuttle", "cuttlefish", "cyan", "cyanide", "cyanogen", "cybernetic", "cybernetics", "cyberpunk", "cyberspace", "cyborg", "cycad", "cycads", "cycle", "cycled", "cycles", "cycleway", "cycleways", "cyclic", "cyclical", "cyclically", "cycling", "cyclist", "cyclists", "cycloid", "cyclone", "cyclones", "cyclops", "cyclotron", "cyclotrons", "cygnet", "cygnets", "cylinder", "cylinders", "cylindrical", "cylindrically", "cymbal", "cymbals", "cynic", "cynical", "cynically", "cynicism", "cynics", "cypher", "cyphers", "cypress", "cypresses", "cyprian", "cyprians", "cypriot", "cypriots", "cyprus", "cyst", "cysteine", "cystic", "cystine", "cystitis", "cysts", "cytochrome", "cytogenetic", "cytological", "cytology", "cytoplasm", "cytoplasmic", "cytosine", "cytotoxic", "czar", "czars", "czech", "czechs" };
	private int searchIndex;
	
	public DictionaryC5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersC5.length; i++){
			if(lettersC5[i].equalsIgnoreCase(value)){
				return lettersC5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersC5.length; i++){
			if(lettersC5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}