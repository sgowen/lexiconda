package com.technegames.dict.H;

import com.technegames.framework.Dictionary;

public class DictionaryH5 implements Dictionary{
	private static String[] lettersH5 = { "hub", "hubbies", "hubbub", "hubby", "hubcap", "hubcaps", "hubris", "hubristic", "hubs", "huckleberry", "huddle", "huddled", "huddles", "huddling", "hue", "hues", "huff", "huffed", "huffily", "huffing", "huffy", "hug", "huge", "hugely", "hugeness", "hugged", "hugging", "hugs", "huguenot", "huh", "hulk", "hulking", "hulks", "hull", "hullabaloo", "hulled", "hullo", "hulls", "hum", "human", "humane", "humanely", "humaner", "humanise", "humanised", "humanising", "humanism", "humanist", "humanistic", "humanists", "humanitarian", "humanitarianism", "humanities", "humanity", "humankind", "humanly", "humanness", "humanoid", "humanoids", "humans", "humble", "humbled", "humbleness", "humbler", "humbles", "humblest", "humbling", "humbly", "humbug", "humbugs", "humdrum", "humerus", "humid", "humidifier", "humidifiers", "humidity", "humify", "humiliate", "humiliated", "humiliates", "humiliating", "humiliatingly", "humiliation", "humiliations", "humility", "hummable", "hummed", "hummer", "humming", "hummingbird", "hummingbirds", "hummock", "hummocks", "hummocky", "humorist", "humorous", "humorously", "humour", "humoured", "humouring", "humourless", "humours", "hump", "humpback", "humped", "humping", "humps", "hums", "humus", "hunch", "hunchback", "hunchbacked", "hunched", "hunches", "hunching", "hundred", "hundredfold", "hundreds", "hundredth", "hundredths", "hundredweight", "hundredweights", "hung", "hungary", "hunger", "hungered", "hungering", "hungers", "hungrier", "hungriest", "hungrily", "hungry", "hunk", "hunkers", "hunks", "hunt", "hunted", "hunter", "huntergatherer", "huntergatherers", "hunters", "hunting", "hunts", "huntsman", "huntsmen", "hurdle", "hurdled", "hurdler", "hurdlers", "hurdles", "hurl", "hurled", "hurling", "hurls", "hurlyburly", "hurrah", "hurrahs", "hurray", "hurricane", "hurricanes", "hurried", "hurriedly", "hurries", "hurry", "hurrying", "hurt", "hurtful", "hurting", "hurtle", "hurtled", "hurtles", "hurtling", "hurts", "husband", "husbandman", "husbandmen", "husbandry", "husbands", "hush", "hushed", "hushes", "hushhush", "hushing", "husk", "husked", "huskier", "huskies", "huskiest", "huskily", "husks", "husky", "hussies", "hussy", "hustings", "hustle", "hustled", "hustler", "hustlers", "hustles", "hustling", "hut", "hutch", "hutches", "huts", "hyacinth", "hyacinths", "hyaena", "hyaenas", "hybrid", "hybridisation", "hybridised", "hybrids", "hydra", "hydrangea", "hydrangeas", "hydrant", "hydrants", "hydrate", "hydrated", "hydration", "hydraulic", "hydraulically", "hydraulics", "hydrazine", "hydride", "hydro", "hydrocarbon", "hydrocarbons", "hydrochloric", "hydrochloride", "hydrodynamic", "hydrodynamical", "hydrodynamics", "hydroelectric", "hydroelectricity", "hydrofluoric", "hydrofoil", "hydrofoils", "hydrogen", "hydrogenated", "hydrogenation", "hydrographer", "hydrographic", "hydrological", "hydrologically", "hydrologists", "hydrology", "hydrolysis", "hydromagnetic", "hydromechanics", "hydrophobia", "hydrophobic", "hydroponically", "hydrosphere", "hydrostatic", "hydrostatics", "hydrothermal", "hydrous", "hydroxide", "hydroxides", "hyena", "hyenas", "hygiene", "hygienic", "hygienically", "hygienist", "hygienists", "hygroscopic", "hymen", "hymens", "hymn", "hymnal", "hymnbook", "hymns", "hype", "hyperactive", "hyperactivity", "hyperbola", "hyperbolas", "hyperbole", "hyperbolic", "hyperboloid", "hyperboloids", "hypercholesterolaemia", "hypercube", "hypercubes", "hyperfine", "hyperinflation", "hypermarket", "hypermarkets", "hyperplane", "hyperplanes", "hypersensitive", "hypersensitiveness", "hypersensitivity", "hypersonic", "hyperspace", "hypersphere", "hypertension", "hypertext", "hypertonic", "hyperventilated", "hyperventilating", "hyperventilation", "hyphen", "hyphenate", "hyphenated", "hyphenates", "hyphenating", "hyphenation", "hyphenations", "hyphened", "hyphens", "hypnosis", "hypnotherapists", "hypnotherapy", "hypnotic", "hypnotically", "hypnotise", "hypnotised", "hypnotises", "hypnotising", "hypnotism", "hypnotist", "hypochondria", "hypochondriac", "hypochondriacal", "hypochondriacs", "hypocrisies", "hypocrisy", "hypocrite", "hypocrites", "hypocritical", "hypocritically", "hypodermic", "hypoglycaemia", "hypoglycaemic", "hypotension", "hypothalamus", "hypothermia", "hypotheses", "hypothesis", "hypothesise", "hypothesised", "hypothesiser", "hypothesises", "hypothesising", "hypothetical", "hypothetically", "hypoxia", "hyssop", "hysterectomy", "hysteresis", "hysteria", "hysteric", "hysterical", "hysterically", "hysterics" };
	private int searchIndex;
	
	public DictionaryH5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersH5.length; i++){
			if(lettersH5[i].equalsIgnoreCase(value)){
				return lettersH5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersH5.length; i++){
			if(lettersH5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}