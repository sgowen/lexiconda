package com.technegames.dict.L;

import com.technegames.framework.Dictionary;

public class DictionaryL1 implements Dictionary{
	private static String[] lettersL1 = { "laager", "lab", "label", "labelled", "labelling", "labellings", "labels", "labia", "labial", "labials", "labile", "labium", "laboratories", "laboratory", "laborious", "laboriously", "laboriousness", "labour", "laboured", "labourer", "labourers", "labouring", "labourintensive", "labours", "laboursaving", "labs", "laburnum", "labyrinth", "labyrinthine", "labyrinths", "lace", "laced", "lacerate", "lacerated", "lacerating", "laceration", "lacerations", "laces", "lacework", "laches", "lachrymal", "lachrymose", "lacier", "lacing", "lacings", "lack", "lackadaisical", "lacked", "lackey", "lackeys", "lacking", "lacklustre", "lacks", "laconic", "laconically", "lacquer", "lacquered", "lacquers", "lacrosse", "lacs", "lactate", "lactation", "lacteal", "lactic", "lactose", "lacuna", "lacunae", "lacunas", "lacy", "lad", "ladder", "laddered", "ladders", "laddie", "laddies", "lade", "laden", "ladies", "lading", "ladle", "ladled", "ladles", "ladling", "lads", "lady", "ladybird", "ladybirds", "ladybug", "ladylike", "ladyship", "ladyships", "lag", "lager", "lagers", "laggard", "laggards", "lagged", "lagging", "lagoon", "lagoons", "lagos", "lags", "lagune", "laid", "lain", "lair", "laird", "lairds", "lairs", "laissezfaire", "laity", "lake", "lakes", "lakeside", "lam", "lama", "lamas", "lamb", "lambasted", "lambasting", "lambda", "lambent", "lambing", "lambs", "lambskin", "lambswool", "lame", "lamed", "lamely", "lameness", "lament", "lamentable", "lamentably", "lamentation", "lamentations", "lamented", "lamenter", "lamenting", "laments", "lamest", "lamina", "laminar", "laminate", "laminated", "laminates", "lamination", "lamp", "lamplight", "lamplighter", "lamplit", "lampoon", "lampooned", "lampoonery", "lampooning", "lampoons", "lamppost", "lampposts", "lamprey", "lampreys", "lamps", "lampshade", "lampshades", "lance", "lanced", "lancelot", "lancer", "lancers", "lances", "lancet", "lancets", "lancing", "land", "landed", "lander", "landfall", "landfill", "landform", "landforms", "landholders", "landholding", "landholdings", "landing", "landings", "landladies", "landlady", "landless", "landlines", "landlocked", "landlord", "landlords", "landman", "landmark", "landmarks", "landmass", "landmine", "landowner", "landowners", "landowning", "lands", "landscape", "landscaped", "landscapes", "landscaping", "landside", "landslide", "landslides", "landslip", "landslips", "landward", "lane", "lanes", "language", "languages", "languid", "languidly", "languish", "languished", "languishes", "languishing", "languor", "languorous", "languorously", "lank", "lankier", "lankiest", "lanky", "lanolin", "lantern", "lanterns", "lanyard", "laos", "lap", "lapdog", "lapdogs", "lapel", "lapels", "lapful", "lapidary", "lapland", "lapp", "lapped", "lapping", "laps", "lapse", "lapsed", "lapses", "lapsing", "laptop", "laptops", "lapwing", "lapwings", "larceny", "larch", "larches", "lard", "larder", "larders", "lards", "large", "largely", "largeness", "larger", "largest", "largish", "largo", "lark", "larking", "larks", "larva", "larvae", "larval", "laryngeal", "laryngitis", "larynx", "larynxes", "las", "lasagne", "lascivious", "lasciviously", "lasciviousness", "lase", "laser", "lasers", "lash", "lashed", "lashers", "lashes", "lashing", "lashings", "lasing", "lass", "lasses", "lassie", "lassies", "lassitude", "lasso", "lassoed", "lassoing", "last", "lasted", "lasting", "lastly", "lasts", "latch", "latched", "latches", "latching", "late", "latecomer", "latecomers", "lately", "latencies", "latency", "lateness", "latent", "later", "lateral", "lateralisation", "laterally", "laterals", "latest", "latex", "lath", "lathe", "lather", "lathered", "lathers", "lathes", "laths", "latices", "latin", "latino", "latitude", "latitudes", "latitudinal", "latrine", "latrines", "latter", "lattice", "latticed", "lattices", "latvia", "latvian", "laud", "laudable", "laudatory", "lauded", "lauders", "lauding", "lauds", "laugh", "laughable", "laughably", "laughed", "laugher", "laughing", "laughingly", "laughs", "laughter", "launch", "launched", "launcher", "launchers", "launches", "launching", "launder", "laundered", "launderette", "launderettes", "laundering", "laundress", "laundrette", "laundrettes", "laundries", "laundry", "laureate", "laurel", "laurels", "lava", "lavas", "lavatorial", "lavatories", "lavatory", "lavender", "lavish", "lavished", "lavishes", "lavishing", "lavishly", "lavishness", "law", "lawabiding", "lawbreaker", "lawbreakers", "lawbreaking", "lawful", "lawfully", "lawfulness", "lawless", "lawlessness", "lawmaker", "lawmakers", "lawman", "lawmen", "lawn", "lawnmower", "lawnmowers", "lawns", "laws", "lawsuit", "lawsuits", "lawyer", "lawyers", "lax", "laxative", "laxatives", "laxer", "laxity", "laxness", "lay", "layabout", "layabouts", "layby", "laybys", "layer", "layered", "layering", "layers", "laying", "layman", "laymen", "layoff", "layoffs", "layout", "layouts", "layperson", "lays", "lazaret", "lazarus", "laze", "lazed", "lazier", "laziest", "lazily", "laziness", "lazing", "lazuli", "lazy", "lazybones" };
	private int searchIndex;
	
	public DictionaryL1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersL1.length; i++){
			if(lettersL1[i].equalsIgnoreCase(value)){
				return lettersL1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersL1.length; i++){
			if(lettersL1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}