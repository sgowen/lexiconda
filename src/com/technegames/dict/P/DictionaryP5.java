package com.technegames.dict.P;

import com.technegames.framework.Dictionary;

public class DictionaryP5 implements Dictionary{
	private static String[] lettersP5 = { "pub", "puberty", "pubescent", "pubic", "public", "publican", "publicans", "publication", "publications", "publicise", "publicised", "publicises", "publicising", "publicist", "publicists", "publicity", "publicly", "publish", "publishable", "published", "publisher", "publishers", "publishes", "publishing", "pubs", "pudding", "puddings", "puddle", "puddles", "puerile", "puerility", "puerperal", "puff", "puffballs", "puffed", "puffer", "puffin", "puffiness", "puffing", "puffins", "puffs", "puffy", "pug", "pugilist", "pugilistic", "pugnacious", "pugnaciously", "pugnacity", "pugs", "puissant", "puke", "puking", "pulchritude", "puling", "pull", "pulled", "puller", "pullets", "pulley", "pulleys", "pulling", "pullover", "pullovers", "pulls", "pulmonary", "pulp", "pulped", "pulping", "pulpit", "pulpits", "pulps", "pulpy", "pulsar", "pulsars", "pulsate", "pulsated", "pulsates", "pulsating", "pulsation", "pulsations", "pulse", "pulsed", "pulses", "pulsing", "pulverisation", "pulverise", "pulverised", "pulverising", "puma", "pumas", "pumice", "pummel", "pummelled", "pummelling", "pummels", "pump", "pumped", "pumping", "pumpkin", "pumpkins", "pumps", "pun", "punch", "punchable", "punchbowl", "punchcard", "punched", "puncher", "punches", "punching", "punchline", "punchlines", "punchy", "punctate", "punctilious", "punctiliously", "punctual", "punctuality", "punctually", "punctuate", "punctuated", "punctuates", "punctuating", "punctuation", "punctuational", "punctuations", "puncture", "punctured", "punctures", "puncturing", "pundit", "pundits", "pungency", "pungent", "pungently", "punier", "puniest", "punish", "punishable", "punished", "punishes", "punishing", "punishment", "punishments", "punitive", "punitively", "punk", "punks", "punky", "punned", "punnet", "punning", "puns", "punster", "punt", "punted", "punter", "punters", "punting", "punts", "puny", "pup", "pupa", "pupae", "pupal", "pupated", "pupates", "pupating", "pupil", "pupillage", "pupils", "puppet", "puppeteer", "puppetry", "puppets", "puppies", "puppy", "puppyhood", "pups", "purblind", "purchasable", "purchase", "purchased", "purchaser", "purchasers", "purchases", "purchasing", "purdah", "pure", "puree", "purees", "purely", "pureness", "purer", "purest", "purgative", "purgatorial", "purgatory", "purge", "purged", "purges", "purging", "purgings", "purification", "purified", "purifier", "purifies", "purify", "purifying", "purims", "purines", "purist", "purists", "puritan", "puritanical", "puritanism", "puritans", "purities", "purity", "purl", "purlieus", "purling", "purlins", "purloin", "purloined", "purls", "purple", "purples", "purplish", "purport", "purported", "purportedly", "purporting", "purports", "purpose", "purposed", "purposeful", "purposefully", "purposefulness", "purposeless", "purposelessly", "purposely", "purposes", "purposing", "purposive", "purr", "purred", "purring", "purrs", "purse", "pursed", "purser", "purses", "pursing", "pursuance", "pursuant", "pursue", "pursued", "pursuer", "pursuers", "pursues", "pursuing", "pursuit", "pursuits", "purvey", "purveyance", "purveyed", "purveying", "purveyor", "purveyors", "purview", "pus", "push", "pushable", "pushed", "pusher", "pushers", "pushes", "pushier", "pushing", "pushovers", "pushups", "pushy", "puss", "pussy", "pussycat", "pussyfooting", "pustular", "pustule", "pustules", "put", "putative", "putatively", "putput", "putrefaction", "putrefy", "putrefying", "putrescent", "putrid", "putridity", "puts", "putsch", "putt", "putted", "putter", "putters", "putti", "putting", "putts", "putty", "puzzle", "puzzled", "puzzlement", "puzzler", "puzzles", "puzzling", "puzzlingly", "pygmies", "pygmy", "pyjama", "pyjamas", "pylon", "pylons", "pyracantha", "pyramid", "pyramidal", "pyramids", "pyre", "pyres", "pyridine", "pyrite", "pyrites", "pyrolyse", "pyrolysis", "pyromaniac", "pyromaniacs", "pyrotechnic", "pyrotechnics", "pyroxene", "pyroxenes", "python", "pythons" };
	private int searchIndex;
	
	public DictionaryP5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersP5.length; i++){
			if(lettersP5[i].equalsIgnoreCase(value)){
				return lettersP5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersP5.length; i++){
			if(lettersP5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}