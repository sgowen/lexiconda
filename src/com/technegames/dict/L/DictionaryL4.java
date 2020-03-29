package com.technegames.dict.L;

import com.technegames.framework.Dictionary;

public class DictionaryL4 implements Dictionary{
	private static String[] lettersL4 = { "load", "loadable", "loaded", "loader", "loaders", "loading", "loadings", "loads", "loaf", "loafed", "loafer", "loafers", "loafing", "loafs", "loam", "loams", "loamy", "loan", "loanable", "loaned", "loaner", "loaning", "loans", "loanword", "loanwords", "loath", "loathe", "loathed", "loathes", "loathing", "loathsome", "loathsomely", "loathsomeness", "loaves", "lob", "lobbed", "lobbied", "lobbies", "lobbing", "lobby", "lobbying", "lobbyist", "lobbyists", "lobe", "lobed", "lobelia", "lobes", "lobotomies", "lobotomised", "lobotomising", "lobotomist", "lobotomy", "lobs", "lobster", "lobsters", "lobular", "local", "locale", "locales", "localisation", "localisations", "localise", "localised", "localises", "localising", "localities", "locality", "locally", "locals", "locatable", "locate", "located", "locates", "locating", "location", "locational", "locations", "locative", "locator", "locators", "loch", "lochness", "lochs", "loci", "lock", "lockable", "lockage", "locked", "locker", "lockers", "locket", "locking", "lockjaw", "lockout", "lockouts", "locks", "locksmith", "loco", "locomote", "locomotion", "locomotive", "locomotives", "locus", "locust", "locusts", "lode", "lodestar", "lodestone", "lodge", "lodged", "lodgement", "lodger", "lodgers", "lodges", "lodging", "lodgings", "loess", "loft", "lofted", "loftier", "loftiest", "loftily", "loftiness", "lofts", "lofty", "log", "loganberries", "loganberry", "logarithm", "logarithmic", "logarithmically", "logarithms", "logbook", "logbooks", "logged", "logger", "loggerheads", "loggers", "logging", "logic", "logical", "logicality", "logically", "logician", "logicians", "logics", "logistic", "logistical", "logistically", "logistics", "logjam", "logo", "logoff", "logos", "logs", "loin", "loincloth", "loins", "loire", "loiter", "loitered", "loiterer", "loiterers", "loitering", "loiters", "loll", "lolled", "lollies", "lolling", "lollipop", "lollipops", "lolly", "london", "londoner", "lone", "lonelier", "loneliest", "loneliness", "lonely", "loner", "loners", "lonesome", "lonesomeness", "long", "longawaited", "longed", "longer", "longest", "longevity", "longfaced", "longhand", "longing", "longingly", "longings", "longish", "longitude", "longitudes", "longitudinal", "longitudinally", "longlasting", "longlived", "longlost", "longs", "longstanding", "longsuffering", "longwinded", "longwindedness", "loo", "look", "lookalike", "lookalikes", "looked", "looker", "lookers", "looking", "lookingglass", "lookingglasses", "lookout", "lookouts", "looks", "loom", "loomed", "looming", "looms", "loon", "looney", "loony", "loop", "looped", "loophole", "loopholes", "looping", "loops", "loopy", "loose", "loosed", "loosely", "loosen", "loosened", "looseness", "loosening", "loosens", "looser", "looses", "loosest", "loosing", "loot", "looted", "looter", "looters", "looting", "loots", "lop", "lope", "loped", "lopes", "loping", "lopped", "lopper", "loppers", "lopping", "lopsided", "lopsidedly", "loquacious", "loquacity", "lord", "lording", "lordly", "lords", "lordship", "lordships", "lore", "lorelei", "lorries", "lorry", "lorryload", "lorryloads", "losable", "lose", "loser", "losers", "loses", "losing", "losings", "loss", "losses", "lost", "lot", "loth", "lotion", "lotions", "lots", "lotteries", "lottery", "lotto", "lotus", "louche", "loud", "louder", "loudest", "loudhailer", "loudhailers", "loudly", "loudmouthed", "loudness", "loudspeaker", "loudspeakers", "louis", "lounge", "lounged", "lounger", "loungers", "lounges", "lounging", "louse", "lousiest", "lousily", "lousy", "lout", "loutish", "loutishness", "louts", "louver", "louvers", "louvre", "louvred", "louvres", "lovable", "love", "loveable", "lovebirds", "loved", "loveless", "lovelier", "lovelies", "loveliest", "loveliness", "lovelorn", "lovely", "lovemaking", "lover", "lovers", "loves", "lovesick", "lovestruck", "loving", "lovingly", "low", "lower", "lowercase", "lowered", "lowering", "lowers", "lowest", "lowing", "lowish", "lowkey", "lowland", "lowlanders", "lowlands", "lowlier", "lowliest", "lowly", "lowlying", "lowness", "lowpitched", "lows", "lowspirited", "loyal", "loyalist", "loyalists", "loyally", "loyalties", "loyalty", "lozenge", "lozenges" };
	private int searchIndex;
	
	public DictionaryL4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersL4.length; i++){
			if(lettersL4[i].equalsIgnoreCase(value)){
				return lettersL4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersL4.length; i++){
			if(lettersL4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}