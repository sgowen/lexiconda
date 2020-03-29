package com.technegames.dict.D;

import com.technegames.framework.Dictionary;

public class DictionaryD5 implements Dictionary{
	private static String[] lettersD5 = { "dual", "dualism", "dualisms", "dualist", "dualistic", "dualities", "duality", "dually", "duals", "dub", "dubbed", "dubbing", "dubious", "dubiously", "dubiousness", "dublin", "dubs", "duce", "duchess", "duchesses", "duchies", "duchy", "duck", "duckbill", "duckbilled", "duckboards", "ducked", "ducking", "duckings", "duckling", "ducklings", "duckpond", "ducks", "duct", "ducted", "ductile", "ducting", "ducts", "dud", "dude", "dudes", "dudgeon", "duds", "due", "duel", "duelled", "dueller", "duellers", "duelling", "duellist", "duels", "dues", "duet", "duets", "duff", "duffel", "dug", "dugout", "dugouts", "duiker", "duke", "dukedom", "dukedoms", "dukes", "dulcet", "dulcimer", "dull", "dullard", "dullards", "dulled", "duller", "dullest", "dulling", "dullness", "dulls", "dully", "dulness", "duly", "dumb", "dumbbell", "dumber", "dumbest", "dumbfound", "dumbfounded", "dumbfounding", "dumbfounds", "dumbly", "dumbness", "dumbstruck", "dumfound", "dumfounded", "dumfounding", "dumfounds", "dummied", "dummies", "dummy", "dump", "dumped", "dumper", "dumping", "dumpling", "dumplings", "dumps", "dumpy", "dun", "dunce", "dunces", "dune", "dunes", "dung", "dungarees", "dungbeetle", "dungeon", "dungeons", "dunghill", "dunked", "dunking", "dunkirk", "duo", "duodenal", "duodenum", "duologue", "duomo", "duopoly", "dupe", "duped", "dupes", "duplex", "duplicability", "duplicate", "duplicated", "duplicates", "duplicating", "duplication", "duplications", "duplicator", "duplicators", "duplicities", "duplicitous", "duplicity", "durability", "durable", "durables", "durance", "duration", "durations", "durban", "duress", "during", "dusk", "duskier", "dusky", "dust", "dustbin", "dustbins", "dustcart", "dusted", "duster", "dusters", "dustier", "dustily", "dusting", "dustman", "dustmen", "dustpan", "dusts", "dusty", "dutch", "dutchman", "dutchmen", "duties", "dutiful", "dutifully", "dutifulness", "duty", "dutyfree", "duvet", "duvets", "dux", "dwarf", "dwarfed", "dwarfing", "dwarfish", "dwarfs", "dwarves", "dwell", "dwelled", "dweller", "dwellers", "dwelling", "dwellings", "dwells", "dwelt", "dwindle", "dwindled", "dwindles", "dwindling", "dyad", "dyadic", "dye", "dyed", "dyeing", "dyeings", "dyer", "dyers", "dyes", "dyestuff", "dyestuffs", "dying", "dyke", "dykes", "dynamic", "dynamical", "dynamically", "dynamics", "dynamism", "dynamite", "dynamited", "dynamo", "dynast", "dynastic", "dynasties", "dynasts", "dynasty", "dyne", "dysentery", "dysfunction", "dysfunctional", "dysfunctions", "dyslexia", "dyslexic", "dyslexically", "dyslexics", "dyspepsia", "dyspeptic", "dystrophy" };
	private int searchIndex;
	
	public DictionaryD5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersD5.length; i++){
			if(lettersD5[i].equalsIgnoreCase(value)){
				return lettersD5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersD5.length; i++){
			if(lettersD5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}