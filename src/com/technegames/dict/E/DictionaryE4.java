package com.technegames.dict.E;

import com.technegames.framework.Dictionary;

public class DictionaryE4 implements Dictionary{
	private static String[] lettersE4 = { "eon", "eons", "eosin", "epaulettes", "ephemera", "ephemeral", "ephemeris", "ephor", "epic", "epically", "epicarp", "epicentre", "epics", "epicure", "epicurean", "epicycles", "epicycloid", "epidemic", "epidemics", "epidemiological", "epidemiologist", "epidemiologists", "epidemiology", "epidermal", "epidermis", "epidural", "epigenetic", "epigon", "epigones", "epigram", "epigrammatic", "epigrams", "epigraph", "epigraphical", "epigraphy", "epilepsy", "epileptic", "epileptics", "epilogue", "epinephrine", "epiphanies", "epiphenomena", "epiphenomenon", "episcopacy", "episcopal", "episcopalian", "episcopate", "episode", "episodes", "episodic", "episodically", "epistemic", "epistemological", "epistemology", "epistle", "epistles", "epistolary", "epitap", "epitaph", "epitaphs", "epitaxial", "epitaxy", "epithelial", "epithelium", "epithet", "epithetic", "epithets", "epitome", "epitomise", "epitomised", "epitomises", "epoch", "epochal", "epochs", "epoxies", "epoxy", "epsilon", "equable", "equably", "equal", "equalisation", "equalise", "equalised", "equaliser", "equalisers", "equalising", "equalities", "equality", "equalled", "equalling", "equally", "equals", "equanimity", "equate", "equated", "equates", "equating", "equation", "equations", "equator", "equatorial", "equerry", "equestrian", "equestrianism", "equiangular", "equidistant", "equilateral", "equilibrating", "equilibration", "equilibria", "equilibrium", "equine", "equinoctial", "equinox", "equinoxes", "equip", "equipartition", "equipment", "equipments", "equipped", "equipping", "equips", "equitable", "equitably", "equities", "equity", "equivalence", "equivalences", "equivalent", "equivalently", "equivalents", "equivocal", "equivocated", "equivocating", "equivocation", "equivocations", "era", "eradicate", "eradicated", "eradicating", "eradication", "eras", "erasable", "erase", "erased", "eraser", "erasers", "erases", "erasing", "erasure", "erasures", "erbium", "ere", "erect", "erected", "erecter", "erectile", "erecting", "erection", "erections", "erectly", "erects", "erg", "ergo", "ergodic", "ergonomic", "ergonomically", "ergonomics", "ergophobia", "ergot", "ergs", "erica", "ericas", "eritrea", "ermine", "erode", "eroded", "erodes", "eroding", "erogenous", "eros", "erose", "erosion", "erosional", "erosions", "erosive", "erotic", "erotica", "erotically", "eroticism", "err", "errand", "errands", "errant", "errata", "erratic", "erratically", "erratum", "erred", "erring", "erroneous", "erroneously", "error", "errors", "errs", "ersatz", "erst", "erstwhile", "erudite", "erudition", "erupt", "erupted", "erupting", "eruption", "eruptions", "eruptive", "erupts", "erysipelas", "esau", "escalade", "escalate", "escalated", "escalates", "escalating", "escalation", "escalator", "escalators", "escapade", "escapades", "escape", "escaped", "escapee", "escapees", "escapement", "escapes", "escaping", "escapism", "escapist", "escapology", "escarp", "escarpment", "escarpments", "escarps", "eschatological", "eschatology", "eschew", "eschewed", "eschewing", "eschews", "escort", "escorted", "escorting", "escorts", "escudo", "eskimo", "esoteric", "esoterica", "esoterically", "espadrilles", "especial", "especially", "espied", "espionage", "esplanade", "espousal", "espouse", "espoused", "espouses", "espousing", "espresso", "esprit", "espy", "espying", "esquire", "esquires", "essay", "essayed", "essayist", "essayists", "essays", "essen", "essence", "essences", "essential", "essentialism", "essentialist", "essentially", "essentials", "est", "establish", "established", "establishes", "establishing", "establishment", "establishments", "estate", "estates", "esteem", "esteemed", "esteems", "ester", "esters", "esthete", "esthetic", "estimable", "estimate", "estimated", "estimates", "estimating", "estimation", "estimations", "estimator", "estimators", "estonia", "estranged", "estrangement", "estrangements", "estuaries", "estuarine", "estuary", "eta", "etal", "etcetera", "etch", "etched", "etcher", "etchers", "etches", "etching", "etchings", "eternal", "eternally", "eternity", "ethane", "ethanol", "ether", "ethereal", "ethereally", "etherised", "ethic", "ethical", "ethically", "ethicist", "ethics", "ethiopia", "ethnic", "ethnical", "ethnically", "ethnicity", "ethnocentric", "ethnographer", "ethnographers", "ethnographic", "ethnography", "ethnological", "ethnology", "ethological", "ethologist", "ethologists", "ethology", "ethos", "ethyl", "ethylene", "etiquette", "etna", "etudes", "etui", "etymological", "etymologically", "etymologies", "etymologist", "etymologists", "etymology" };
	private int searchIndex;
	
	public DictionaryE4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersE4.length; i++){
			if(lettersE4[i].equalsIgnoreCase(value)){
				return lettersE4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersE4.length; i++){
			if(lettersE4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}