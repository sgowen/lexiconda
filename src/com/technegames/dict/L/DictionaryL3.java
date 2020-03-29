package com.technegames.dict.L;

import com.technegames.framework.Dictionary;

public class DictionaryL3 implements Dictionary{
	private static String[] lettersL3 = { "liabilities", "liability", "liable", "liaise", "liaised", "liaises", "liaising", "liaison", "liaisons", "liar", "liars", "libation", "libations", "libel", "libeled", "libeler", "libelled", "libeller", "libelling", "libellous", "libels", "liberal", "liberalisation", "liberalise", "liberalised", "liberalising", "liberalism", "liberality", "liberally", "liberals", "liberate", "liberated", "liberates", "liberating", "liberation", "liberationists", "liberator", "liberators", "liberia", "libero", "libertarian", "libertarianism", "libertarians", "liberties", "libertine", "libertines", "liberty", "libidinous", "libido", "librarian", "librarians", "librarianship", "libraries", "library", "librate", "librated", "librates", "libretti", "librettist", "librettists", "libretto", "libya", "libyan", "libyans", "lice", "licence", "licences", "license", "licensed", "licensee", "licensees", "licenses", "licensing", "licentiate", "licentious", "licentiousness", "lichee", "lichen", "lichened", "lichens", "lichi", "lichis", "lick", "licked", "lickerish", "licking", "licks", "licorice", "lid", "lidded", "lidless", "lido", "lids", "lie", "lied", "lieder", "lien", "liens", "lies", "lieu", "lieutenancy", "lieutenant", "lieutenants", "life", "lifeanddeath", "lifebelt", "lifeblood", "lifeboat", "lifeboatmen", "lifeboats", "lifeforms", "lifegiving", "lifeguard", "lifeguards", "lifeless", "lifelessly", "lifelessness", "lifelike", "lifeline", "lifelines", "lifelong", "liferaft", "liferafts", "lifesaving", "lifesize", "lifesized", "lifespan", "lifespans", "lifestyle", "lifestyles", "lifetaking", "lifethreatening", "lifetime", "lifetimes", "lifework", "lift", "lifted", "lifter", "lifters", "lifting", "liftman", "liftmen", "liftoff", "lifts", "ligament", "ligaments", "ligand", "ligands", "ligature", "ligatured", "ligatures", "ligaturing", "light", "lighted", "lighten", "lightened", "lightening", "lightens", "lighter", "lighters", "lightest", "lightheaded", "lightheadedness", "lighthearted", "lightheartedly", "lightheartedness", "lighthouse", "lighthouses", "lighting", "lightless", "lightly", "lightness", "lightning", "lights", "lightship", "lightweight", "lightweights", "lignite", "likable", "like", "likeability", "likeable", "liked", "likelier", "likeliest", "likelihood", "likely", "likeminded", "liken", "likened", "likeness", "likenesses", "likening", "likens", "likes", "likewise", "liking", "likings", "lilac", "lilacs", "lilies", "lilliput", "lilliputian", "lilongwe", "lilt", "lilting", "lily", "lilylivered", "lilywhite", "lima", "limb", "limber", "limbering", "limbers", "limbless", "limbo", "limbs", "lime", "limekiln", "limelight", "limerick", "limericks", "limes", "limestone", "limestones", "limeys", "liminal", "liming", "limit", "limitation", "limitations", "limited", "limiter", "limiters", "limiting", "limitless", "limits", "limo", "limousin", "limousine", "limousines", "limp", "limped", "limpet", "limpets", "limpid", "limping", "limply", "limpopo", "limps", "linage", "linchpin", "lincoln", "linden", "line", "lineage", "lineages", "lineally", "lineaments", "linear", "linearised", "linearity", "linearly", "lined", "linefeed", "lineman", "linemen", "linen", "linens", "lineout", "lineouts", "liner", "liners", "lines", "linesman", "linesmen", "lineup", "lineups", "linger", "lingered", "lingerer", "lingerie", "lingering", "lingeringly", "lingers", "lingua", "lingual", "linguist", "linguistic", "linguistically", "linguistics", "linguists", "liniment", "liniments", "lining", "linings", "link", "linkable", "linkage", "linkages", "linked", "linker", "linkers", "linking", "links", "linkup", "linkups", "linnet", "linnets", "lino", "linoleum", "linseed", "lint", "lintel", "lintels", "liny", "lion", "lioness", "lionesses", "lionise", "lionised", "lions", "lip", "lipase", "lipid", "lipids", "lipped", "lipread", "lipreading", "lips", "lipservice", "lipstick", "lipsticks", "liquefaction", "liquefied", "liquefy", "liqueur", "liqueurs", "liquid", "liquidate", "liquidated", "liquidating", "liquidation", "liquidations", "liquidator", "liquidators", "liquidise", "liquidised", "liquidiser", "liquidising", "liquidity", "liquids", "liquify", "liquor", "liquorice", "liquorish", "liquors", "lira", "lire", "lisbon", "lisp", "lisped", "lisping", "lisps", "lissom", "lissome", "lissomeness", "lissomness", "list", "listed", "listen", "listened", "listener", "listeners", "listening", "listens", "listeria", "listing", "listings", "listless", "listlessly", "listlessness", "lists", "lit", "litanies", "litany", "litchi", "literacy", "literal", "literalism", "literalistic", "literally", "literals", "literary", "literate", "literati", "literature", "literatures", "lithe", "lithely", "lithium", "lithograph", "lithographic", "lithographs", "lithography", "lithological", "lithologies", "lithology", "lithosphere", "litigant", "litigants", "litigate", "litigating", "litigation", "litigious", "litigiousness", "litmus", "litotes", "litre", "litres", "litter", "littered", "littering", "litters", "little", "littleness", "littler", "littlest", "littoral", "liturgical", "liturgies", "liturgy", "livable", "live", "liveable", "lived", "livelier", "liveliest", "livelihood", "livelihoods", "liveliness", "lively", "liven", "livened", "livening", "livens", "liver", "liveried", "liveries", "liverish", "livers", "liverworts", "livery", "lives", "livestock", "livewire", "livid", "lividly", "living", "livings", "lizard", "lizards", "llama", "llamas", "lls" };
	private int searchIndex;
	
	public DictionaryL3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersL3.length; i++){
			if(lettersL3[i].equalsIgnoreCase(value)){
				return lettersL3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersL3.length; i++){
			if(lettersL3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}