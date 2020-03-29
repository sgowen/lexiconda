package com.technegames.dict.L;

import com.technegames.framework.Dictionary;

public class DictionaryL2 implements Dictionary{
	private static String[] lettersL2 = { "lea", "leach", "leached", "leaches", "leaching", "lead", "leaded", "leaden", "leader", "leaderless", "leaders", "leadership", "leaderships", "leadfree", "leading", "leads", "leaf", "leafed", "leafier", "leafiest", "leafiness", "leafing", "leafless", "leaflet", "leaflets", "leafy", "league", "leagues", "leak", "leakage", "leakages", "leaked", "leakier", "leakiest", "leakiness", "leaking", "leaks", "leaky", "lean", "leaned", "leaner", "leanest", "leaning", "leanings", "leanness", "leans", "leant", "leap", "leaped", "leaper", "leapfrog", "leapfrogging", "leaping", "leaps", "leapt", "leapyear", "learn", "learnable", "learned", "learnedly", "learner", "learners", "learning", "learns", "learnt", "lease", "leased", "leasehold", "leaseholder", "leaseholders", "leases", "leash", "leashed", "leashes", "leashing", "leasing", "least", "leat", "leather", "leathers", "leathery", "leave", "leaved", "leaven", "leavened", "leavening", "leaver", "leavers", "leaves", "leaving", "leavings", "lebanon", "lebensraum", "lecher", "lecherous", "lecherousness", "lechery", "lectern", "lector", "lectors", "lecture", "lectured", "lecturer", "lecturers", "lectures", "lectureship", "lectureships", "lecturing", "led", "ledge", "ledger", "ledgers", "ledges", "lee", "leech", "leeches", "leeching", "leeds", "leek", "leeks", "leer", "leered", "leering", "leeringly", "leers", "lees", "leeward", "leeway", "left", "lefthanded", "lefthandedly", "lefthandedness", "lefthander", "lefthanders", "lefties", "leftish", "leftist", "leftists", "leftmost", "leftover", "leftovers", "lefts", "leftward", "leftwards", "lefty", "leg", "legacies", "legacy", "legal", "legalese", "legalisation", "legalise", "legalised", "legalising", "legalism", "legalistic", "legalities", "legality", "legally", "legate", "legatee", "legatees", "legates", "legation", "legato", "legator", "legend", "legendary", "legends", "legerdemain", "legged", "legging", "leggings", "leggy", "leghorn", "leghorns", "legibility", "legible", "legibly", "legion", "legionaries", "legionary", "legionnaires", "legions", "legislate", "legislated", "legislating", "legislation", "legislative", "legislatively", "legislator", "legislators", "legislature", "legislatures", "legitimacy", "legitimate", "legitimated", "legitimately", "legitimating", "legitimation", "legitimisation", "legitimise", "legitimised", "legitimising", "legless", "legman", "legroom", "legs", "legume", "legumes", "leguminous", "legwork", "leipzig", "leisure", "leisured", "leisurely", "leisurewear", "leitmotif", "leitmotifs", "leitmotiv", "leitmotivs", "lemma", "lemmas", "lemming", "lemmings", "lemon", "lemonade", "lemons", "lemur", "lemurs", "lend", "lender", "lenders", "lending", "lends", "length", "lengthen", "lengthened", "lengthening", "lengthens", "lengthier", "lengthiest", "lengthily", "lengths", "lengthways", "lengthwise", "lengthy", "leniency", "lenient", "leniently", "lenin", "lens", "lenses", "lensing", "lent", "lentil", "lentils", "lento", "leonardo", "leone", "leopard", "leopards", "leopardskin", "leotard", "leotards", "leper", "lepers", "leprechaun", "leprechauns", "leprose", "leprosy", "leprous", "lepton", "leptons", "lesbian", "lesbianism", "lesbians", "lesion", "lesions", "lesotho", "less", "lessee", "lessees", "lessen", "lessened", "lessening", "lessens", "lesser", "lesson", "lessons", "lessor", "lessors", "lest", "let", "lethal", "lethality", "lethally", "lethargic", "lethargically", "lethargy", "lets", "letter", "letterbox", "letterboxes", "lettered", "letterhead", "letterheads", "lettering", "letterpress", "letters", "letterwriter", "letting", "lettings", "lettish", "lettuce", "lettuces", "leucine", "leukaemia", "leukemia", "level", "levelheaded", "levelled", "leveller", "levelling", "levelly", "levels", "lever", "leverage", "leveraged", "levered", "levering", "levers", "levi", "leviathan", "levied", "levies", "levitate", "levitated", "levitates", "levitating", "levitation", "levity", "levy", "levying", "lewd", "lewdness", "lexeme", "lexemes", "lexical", "lexically", "lexicographer", "lexicographers", "lexicographic", "lexicographical", "lexicographically", "lexicography", "lexicon", "lexicons", "leyden" };
	private int searchIndex;
	
	public DictionaryL2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersL2.length; i++){
			if(lettersL2[i].equalsIgnoreCase(value)){
				return lettersL2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersL2.length; i++){
			if(lettersL2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}