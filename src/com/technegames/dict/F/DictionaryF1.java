package com.technegames.dict.F;

import com.technegames.framework.Dictionary;

public class DictionaryF1 implements Dictionary{
	private static String[] lettersF1 = { "fab", "fable", "fabled", "fables", "fabric", "fabricate", "fabricated", "fabricates", "fabricating", "fabrication", "fabrications", "fabricator", "fabrics", "fabulists", "fabulous", "fabulously", "facade", "facades", "face", "faced", "faceless", "facelift", "faceplate", "facer", "facers", "faces", "facet", "faceted", "faceting", "facetious", "facetiously", "facetiousness", "facets", "facia", "facial", "facials", "facile", "facilitate", "facilitated", "facilitates", "facilitating", "facilitation", "facilitative", "facilitator", "facilitators", "facilities", "facility", "facing", "facings", "facsimile", "facsimiles", "fact", "faction", "factional", "factionalism", "factions", "factious", "factitious", "factor", "factored", "factorial", "factorials", "factories", "factoring", "factorisable", "factorisation", "factorisations", "factorise", "factorised", "factorises", "factorising", "factors", "factory", "factotum", "facts", "factual", "factually", "faculties", "faculty", "fad", "fade", "faded", "fadeout", "fades", "fading", "fads", "faecal", "faeces", "fag", "faggot", "faggots", "fagot", "fags", "fahrenheit", "fail", "failed", "failing", "failings", "fails", "failure", "failures", "faint", "fainted", "fainter", "faintest", "fainthearted", "fainting", "faintly", "faintness", "faints", "fair", "fairer", "fairest", "fairground", "fairgrounds", "fairies", "fairing", "fairish", "fairly", "fairness", "fairs", "fairsex", "fairway", "fairways", "fairy", "fairytale", "faith", "faithful", "faithfully", "faithfulness", "faithless", "faithlessness", "faiths", "fake", "faked", "fakers", "fakery", "fakes", "faking", "falcon", "falconer", "falconry", "falcons", "fall", "fallacies", "fallacious", "fallacy", "fallen", "faller", "fallers", "fallguy", "fallibility", "fallible", "falling", "fallopian", "fallout", "fallow", "falls", "false", "falsebay", "falsehood", "falsehoods", "falsely", "falseness", "falser", "falsetto", "falsifiability", "falsifiable", "falsification", "falsifications", "falsified", "falsifier", "falsifiers", "falsifies", "falsify", "falsifying", "falsities", "falsity", "falter", "faltered", "faltering", "falteringly", "falters", "fame", "famed", "familial", "familiar", "familiarisation", "familiarise", "familiarised", "familiarising", "familiarities", "familiarity", "familiarly", "families", "family", "famine", "famines", "famish", "famished", "famous", "famously", "fan", "fanatic", "fanatical", "fanatically", "fanaticism", "fanatics", "fanbelt", "fanciable", "fancied", "fancier", "fanciers", "fancies", "fanciest", "fanciful", "fancifully", "fancy", "fancying", "fandango", "fanfare", "fanfares", "fang", "fangs", "fanlight", "fanned", "fanning", "fanny", "fans", "fantail", "fantails", "fantasia", "fantastic", "far", "farad", "faraday", "faraway", "farce", "farces", "farcical", "fare", "fared", "fares", "farewell", "farewells", "farfetched", "farflung", "faring", "farm", "farmed", "farmer", "farmers", "farmhouse", "farmhouses", "farming", "farmings", "farmland", "farms", "farmstead", "farmsteads", "farmyard", "farmyards", "faroff", "farout", "farrago", "farreaching", "farrier", "farriers", "farrow", "farseeing", "farsighted", "farther", "farthest", "farthing", "farthings", "fascia", "fascias", "fascinate", "fascinated", "fascinates", "fascinating", "fascinatingly", "fascination", "fascinations", "fascism", "fascist", "fascists", "fashion", "fashionable", "fashionably", "fashioned", "fashioning", "fashions", "fast", "fasted", "fasten", "fastened", "fastener", "fasteners", "fastening", "fastenings", "fastens", "faster", "fastest", "fastidious", "fastidiously", "fastidiousness", "fasting", "fastings", "fastness", "fastnesses", "fasts", "fat", "fatal", "fatalism", "fatalist", "fatalistic", "fatalistically", "fatalities", "fatality", "fatally", "fatcat", "fate", "fated", "fateful", "fates", "fatheadedness", "father", "fathered", "fatherhood", "fathering", "fatherinlaw", "fatherland", "fatherless", "fatherly", "fathers", "fathersinlaw", "fathom", "fathomed", "fathoming", "fathomless", "fathoms", "fatigue", "fatigued", "fatigues", "fatiguing", "fatless", "fatness", "fats", "fatted", "fatten", "fattened", "fattening", "fattens", "fatter", "fattest", "fattier", "fattiest", "fatty", "fatuity", "fatuous", "fatuously", "fatwa", "faucet", "faucets", "fault", "faulted", "faulting", "faultless", "faultlessly", "faults", "faulty", "faun", "fauna", "faunal", "faunas", "fauns", "faust", "faustus", "favour", "favourable", "favourably", "favoured", "favouring", "favourite", "favourites", "favouritism", "favours", "fawn", "fawned", "fawning", "fawningly", "fawns", "fax", "faxed", "faxes", "faxing" };
	private int searchIndex;
	
	public DictionaryF1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersF1.length; i++){
			if(lettersF1[i].equalsIgnoreCase(value)){
				return lettersF1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersF1.length; i++){
			if(lettersF1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}