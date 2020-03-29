package com.technegames.dict.H;

import com.technegames.framework.Dictionary;

public class DictionaryH2 implements Dictionary{
	private static String[] lettersH2 = { "he", "head", "headache", "headaches", "headband", "headbands", "headboard", "headboards", "headcount", "headdress", "headdresses", "headed", "header", "headers", "headfast", "headgear", "headhunted", "headhunters", "headier", "headiest", "heading", "headings", "headlamp", "headlamps", "headland", "headlands", "headless", "headlight", "headlights", "headline", "headlined", "headlines", "headlining", "headlock", "headlong", "headman", "headmaster", "headmasters", "headmastership", "headmen", "headmistress", "headmistresses", "headnote", "headon", "headphone", "headphones", "headpiece", "headquarters", "headrest", "headroom", "heads", "headscarf", "headscarves", "headset", "headsets", "headship", "headstand", "headstock", "headstone", "headstones", "headstrong", "headwaters", "headway", "headwind", "headwinds", "headword", "headwords", "headwork", "heady", "heal", "healed", "healer", "healers", "healing", "heals", "health", "healthful", "healthier", "healthiest", "healthily", "healthiness", "healths", "healthy", "heap", "heaped", "heaping", "heaps", "hear", "hearable", "heard", "hearer", "hearers", "hearing", "hearings", "hearken", "hearkened", "hearkening", "hearkens", "hears", "hearsay", "hearse", "hearses", "heart", "heartache", "heartbeat", "heartbeats", "heartbreak", "heartbreaking", "heartbreaks", "heartbroken", "heartburn", "hearten", "heartened", "heartening", "heartfelt", "hearth", "hearthrug", "hearths", "hearties", "heartiest", "heartily", "heartiness", "heartland", "heartlands", "heartless", "heartlessly", "heartlessness", "heartrending", "hearts", "heartsearching", "heartstrings", "hearttoheart", "heartwarming", "heartwood", "hearty", "heat", "heated", "heatedly", "heater", "heaters", "heath", "heathen", "heathenish", "heathenism", "heathens", "heather", "heathers", "heathery", "heathland", "heaths", "heating", "heatresistant", "heats", "heatwave", "heave", "heaved", "heaveho", "heaven", "heavenly", "heavens", "heavensent", "heavenward", "heavenwards", "heaves", "heavier", "heavies", "heaviest", "heavily", "heaviness", "heaving", "heavings", "heavy", "heavyduty", "heavyweight", "heavyweights", "hebrew", "hebrews", "heck", "heckle", "heckled", "heckler", "hecklers", "heckles", "heckling", "hectare", "hectares", "hectic", "hectically", "hectolitres", "hector", "hectoring", "hedge", "hedged", "hedgehog", "hedgehogs", "hedgerow", "hedgerows", "hedges", "hedging", "hedonism", "hedonist", "hedonistic", "hedonists", "heed", "heeded", "heedful", "heeding", "heedless", "heedlessly", "heedlessness", "heeds", "heel", "heeled", "heels", "heft", "hefted", "heftier", "hefting", "hefty", "hegemonic", "hegemony", "heifer", "heifers", "height", "heighten", "heightened", "heightening", "heightens", "heights", "heinous", "heir", "heiress", "heiresses", "heirloom", "heirlooms", "heirs", "heist", "heists", "held", "helen", "helical", "helices", "helicopter", "helicopters", "heliocentric", "heliography", "heliosphere", "heliotrope", "helipad", "helium", "helix", "helixes", "hell", "hellenic", "hellfire", "hellish", "hellishly", "hello", "hellraiser", "hells", "helm", "helmet", "helmeted", "helmets", "helms", "helmsman", "helots", "help", "helped", "helper", "helpers", "helpful", "helpfully", "helpfulness", "helping", "helpings", "helpless", "helplessly", "helplessness", "helpline", "helplines", "helpmate", "helpmates", "helps", "helsinki", "helterskelter", "hem", "heman", "hemen", "hemisphere", "hemispheres", "hemispheric", "hemispherical", "hemline", "hemlines", "hemlock", "hemmed", "hemming", "hemp", "hems", "hen", "hence", "henceforth", "henceforward", "henchman", "henchmen", "henge", "henna", "henpeck", "henry", "hens", "hepatic", "hepatitis", "heptagon", "heptagonal", "heptagons", "heptane", "her", "herald", "heralded", "heraldic", "heralding", "heraldry", "heralds", "herb", "herbaceous", "herbage", "herbal", "herbalism", "herbalist", "herbalists", "herbicide", "herbicides", "herbivore", "herbivores", "herbivorous", "herbs", "herd", "herded", "herding", "herds", "herdsman", "herdsmen", "here", "hereabouts", "hereafter", "hereby", "hereditary", "heredity", "herein", "hereinafter", "hereof", "heresies", "heresy", "heretic", "heretical", "heretics", "hereto", "heretofore", "hereunder", "hereupon", "herewith", "heritability", "heritable", "heritage", "heritors", "herm", "hermaphrodite", "hermaphrodites", "hermaphroditic", "hermeneutic", "hermeneutics", "hermetic", "hermetically", "hermit", "hermitage", "hermits", "hernia", "hernias", "hero", "herod", "heroic", "heroical", "heroically", "heroics", "heroin", "heroine", "heroines", "heroism", "heron", "heronry", "herons", "herpes", "herring", "herringbone", "herrings", "hers", "herself", "hertz", "hesitancy", "hesitant", "hesitantly", "hesitate", "hesitated", "hesitates", "hesitating", "hesitatingly", "hesitation", "hesitations", "heterodox", "heterodoxy", "heterogeneity", "heterogeneous", "heterologous", "heterosexist", "heterosexual", "heterosexuality", "heterosexually", "heterosexuals", "heterozygous", "heuristic", "heuristically", "heuristics", "hew", "hewed", "hewer", "hewing", "hewn", "hex", "hexadecimal", "hexagon", "hexagonal", "hexagons", "hexagram", "hexagrams", "hexameter", "hexane", "hexed", "hey", "heyday", "heydays" };
	private int searchIndex;
	
	public DictionaryH2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersH2.length; i++){
			if(lettersH2[i].equalsIgnoreCase(value)){
				return lettersH2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersH2.length; i++){
			if(lettersH2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}