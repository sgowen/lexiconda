package com.technegames.dict.M;

import com.technegames.framework.Dictionary;

public class DictionaryM5 implements Dictionary{
	private static String[] lettersM5 = { "mu", "much", "muchness", "muck", "mucked", "mucking", "mucks", "mucky", "mucosa", "mucous", "mucus", "mud", "muddied", "muddier", "muddies", "muddiest", "muddle", "muddled", "muddles", "muddling", "muddy", "muddying", "mudflats", "mudflow", "mudflows", "mudguard", "mudguards", "mudlarks", "muds", "muesli", "muff", "muffed", "muffin", "muffins", "muffle", "muffled", "muffler", "mufflers", "muffling", "muffs", "mufti", "mug", "mugged", "mugger", "muggers", "muggier", "mugging", "muggings", "muggy", "mugs", "mugshots", "mulberries", "mulberry", "mulch", "mulches", "mulching", "mule", "mules", "mull", "mullah", "mullahs", "mulled", "mullet", "mulling", "mullioned", "mullions", "multichannel", "multicolour", "multicoloured", "multicultural", "multiculturalism", "multidimensional", "multifarious", "multiform", "multifunction", "multifunctional", "multilateral", "multilateralism", "multilayer", "multilevel", "multilingual", "multimedia", "multimeter", "multimillion", "multinational", "multinationals", "multiphase", "multiple", "multiples", "multiplex", "multiplexed", "multiplexer", "multiplexers", "multiplexes", "multiplexing", "multiplexor", "multiplexors", "multiplication", "multiplications", "multiplicative", "multiplicities", "multiplicity", "multiplied", "multiplier", "multipliers", "multiplies", "multiply", "multiplying", "multiprocessing", "multiprocessor", "multiprocessors", "multiprogramming", "multiracial", "multitude", "multitudes", "mum", "mumble", "mumbled", "mumbler", "mumbles", "mumbling", "mumblings", "mumbojumbo", "mummies", "mummification", "mummified", "mummify", "mummy", "mumps", "mums", "munch", "munched", "muncher", "munchers", "munches", "munching", "mundane", "mundanely", "munich", "municipal", "municipalities", "municipality", "munificence", "munificent", "munificently", "munition", "munitions", "muons", "mural", "murals", "murder", "murdered", "murderer", "murderers", "murderess", "murdering", "murderous", "murderously", "murders", "murk", "murkier", "murkiest", "murkiness", "murky", "murmur", "murmured", "murmurer", "murmuring", "murmurings", "murmurs", "murray", "muscadel", "muscat", "muscle", "muscled", "muscles", "muscling", "muscular", "muscularity", "musculature", "musculoskeletal", "muse", "mused", "muses", "museum", "museums", "mush", "mushes", "mushroom", "mushroomed", "mushrooming", "mushrooms", "mushy", "music", "musical", "musicality", "musically", "musicals", "musician", "musicians", "musicianship", "musicologist", "musicologists", "musicology", "musing", "musingly", "musings", "musk", "musket", "musketeer", "musketeers", "muskets", "muskier", "muskiest", "musks", "musky", "muslim", "muslims", "muslin", "mussel", "mussels", "must", "mustache", "mustang", "mustangs", "mustard", "muster", "mustered", "mustering", "musters", "mustier", "mustiest", "mustily", "mustiness", "musts", "musty", "mutability", "mutable", "mutagens", "mutant", "mutants", "mutate", "mutated", "mutates", "mutating", "mutation", "mutational", "mutations", "mute", "muted", "mutely", "muteness", "mutes", "mutilate", "mutilated", "mutilates", "mutilating", "mutilation", "mutilations", "mutineer", "mutineers", "muting", "mutinied", "mutinies", "mutinous", "mutinously", "mutiny", "mutt", "mutter", "muttered", "mutterer", "mutterers", "muttering", "mutterings", "mutters", "mutton", "muttons", "mutts", "mutual", "mutuality", "mutually", "muzak", "muzzle", "muzzled", "muzzles", "muzzling", "my", "myalgic", "myelin", "myna", "mynahs", "myocardial", "myope", "myopia", "myopic", "myopically", "myriad", "myriads", "myrrh", "myself", "mysteries", "mysterious", "mysteriously", "mystery", "mystic", "mystical", "mystically", "mysticism", "mystics", "mystification", "mystified", "mystifies", "mystify", "mystifying", "mystique", "myth", "mythic", "mythical", "mythological", "mythologies", "mythologised", "mythology", "myths", "myxomatosis" };
	private int searchIndex;
	
	public DictionaryM5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersM5.length; i++){
			if(lettersM5[i].equalsIgnoreCase(value)){
				return lettersM5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersM5.length; i++){
			if(lettersM5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}