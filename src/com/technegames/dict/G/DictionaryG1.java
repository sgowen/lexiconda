package com.technegames.dict.G;

import com.technegames.framework.Dictionary;

public class DictionaryG1 implements Dictionary{
	private static String[] lettersG1 = { "gab", "gabble", "gabbled", "gabbles", "gabbling", "gaberdine", "gable", "gabled", "gables", "gabon", "gad", "gadded", "gadding", "gadfly", "gadget", "gadgetry", "gadgets", "gaff", "gaffe", "gaffes", "gag", "gaga", "gage", "gagged", "gagging", "gaggle", "gaggled", "gaging", "gags", "gagster", "gaiety", "gaijin", "gaily", "gain", "gained", "gainer", "gainers", "gainful", "gainfully", "gaining", "gainly", "gains", "gainsay", "gainsaying", "gait", "gaiter", "gaiters", "gaits", "gal", "gala", "galactic", "galas", "galaxies", "galaxy", "gale", "galena", "gales", "galilean", "galileo", "gall", "gallant", "gallantly", "gallantries", "gallantry", "gallants", "galled", "galleon", "galleons", "galleried", "galleries", "gallery", "galley", "galleys", "gallic", "galling", "gallium", "gallivanted", "gallivanting", "gallon", "gallons", "gallop", "galloped", "galloping", "gallops", "gallows", "galls", "gallstones", "galop", "galore", "galoshes", "gals", "galvanic", "galvanise", "galvanised", "galvanising", "galvanometer", "galvanometric", "gambia", "gambian", "gambit", "gambits", "gamble", "gambled", "gambler", "gamblers", "gambles", "gambling", "gambol", "gambolling", "gambols", "game", "gamed", "gamekeeper", "gamekeepers", "gamely", "gamers", "games", "gamesmanship", "gamesmen", "gamete", "gametes", "gaming", "gamma", "gammon", "gamut", "gamy", "gander", "ganders", "gandhi", "gang", "ganged", "ganger", "gangers", "ganges", "ganging", "gangland", "ganglia", "gangling", "ganglion", "ganglionic", "gangly", "gangplank", "gangrene", "gangrenous", "gangs", "gangster", "gangsterism", "gangsters", "gangway", "gangways", "gannet", "gannets", "gantries", "gantry", "gaol", "gaoled", "gaoler", "gaolers", "gaols", "gap", "gape", "gaped", "gapes", "gaping", "gapingly", "gaps", "garage", "garaged", "garages", "garb", "garbage", "garbed", "garble", "garbled", "garbles", "garbling", "garbs", "garden", "gardener", "gardeners", "gardening", "gardens", "gargantuan", "gargle", "gargled", "gargles", "gargling", "gargoyle", "gargoyles", "garish", "garishly", "garland", "garlanded", "garlands", "garlic", "garment", "garments", "garner", "garnered", "garnering", "garnet", "garnets", "garnish", "garnished", "garnishing", "garotte", "garotted", "garottes", "garotting", "garret", "garrets", "garrison", "garrisoned", "garrisons", "garrotte", "garrotted", "garrottes", "garrotting", "garrulous", "garter", "garters", "gas", "gaseous", "gases", "gash", "gashed", "gashes", "gashing", "gasholder", "gasify", "gasket", "gaskets", "gaslight", "gasometer", "gasp", "gasped", "gasper", "gasping", "gasps", "gassed", "gasses", "gassier", "gassiest", "gassing", "gassy", "gastrectomy", "gastric", "gastritis", "gastroenteritis", "gastrointestinal", "gastronomic", "gastronomy", "gastropod", "gastropods", "gasworks", "gate", "gateau", "gateaus", "gateaux", "gatecrash", "gatecrashed", "gatecrasher", "gatecrashers", "gatecrashing", "gated", "gatehouse", "gatehouses", "gatekeeper", "gatekeepers", "gatepost", "gateposts", "gates", "gateway", "gateways", "gather", "gathered", "gatherer", "gatherers", "gathering", "gatherings", "gathers", "gating", "gauche", "gaucheness", "gaucherie", "gaud", "gaudiest", "gaudily", "gaudiness", "gaudy", "gauge", "gauged", "gauges", "gauging", "gaul", "gauls", "gaunt", "gaunter", "gauntlet", "gauntlets", "gauntly", "gauze", "gave", "gavel", "gavial", "gavials", "gavotte", "gawk", "gawking", "gawky", "gawpin", "gay", "gayest", "gays", "gaze", "gazebo", "gazed", "gazelle", "gazelles", "gazes", "gazette", "gazetteer", "gazettes", "gazing", "gdansk" };
	private int searchIndex;
	
	public DictionaryG1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersG1.length; i++){
			if(lettersG1[i].equalsIgnoreCase(value)){
				return lettersG1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersG1.length; i++){
			if(lettersG1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}