package com.technegames.dict.K;

import com.technegames.framework.Dictionary;

public class DictionaryK3 implements Dictionary{
	private static String[] lettersK3 = { "kibbutz", "kick", "kickback", "kicked", "kicker", "kicking", "kicks", "kickstart", "kickstarted", "kickstarting", "kickstarts", "kid", "kidded", "kiddie", "kidding", "kidnap", "kidnapped", "kidnapper", "kidnappers", "kidnapping", "kidnappings", "kidnaps", "kidney", "kidneys", "kidneyshaped", "kids", "kiev", "kill", "killed", "killer", "killers", "killing", "killings", "killjoy", "killjoys", "kills", "kiln", "kilns", "kilo", "kilobits", "kilobyte", "kilobytes", "kilohertz", "kilojoules", "kilometre", "kilometres", "kiloton", "kilotons", "kilovolt", "kilowatt", "kilowatts", "kilt", "kilted", "kilter", "kilts", "kimono", "kin", "kina", "kinase", "kind", "kinder", "kindergarten", "kindergartens", "kindest", "kindhearted", "kindheartedness", "kindle", "kindled", "kindles", "kindlier", "kindliest", "kindliness", "kindling", "kindly", "kindness", "kindnesses", "kindred", "kinds", "kinematic", "kinematics", "kinetic", "kinetically", "kinetics", "kinfolk", "king", "kingdom", "kingdoms", "kingfisher", "kingfishers", "kingly", "kingpin", "kings", "kingship", "kingsize", "kingsized", "kink", "kinked", "kinks", "kinky", "kinsfolk", "kinshasa", "kinship", "kinsman", "kinsmen", "kinswoman", "kiosk", "kiosks", "kipper", "kippers", "kirk", "kismet", "kiss", "kissed", "kisser", "kisses", "kissing", "kit", "kitbag", "kitbags", "kitchen", "kitchenette", "kitchens", "kitchenware", "kite", "kites", "kith", "kits", "kitsch", "kitted", "kitten", "kittenish", "kittens", "kitting", "kittiwakes", "kitty", "kiwi", "kiwis", "klaxon", "klaxons", "kleptomania", "kleptomaniac", "kleptomaniacs", "klick", "kloof", "knack", "knacker", "knackers", "knacks", "knapsack", "knapsacks", "knave", "knavery", "knaves", "knavish", "knead", "kneaded", "kneading", "kneads", "knee", "kneecap", "kneecaps", "kneed", "kneedeep", "kneel", "kneeled", "kneeler", "kneeling", "kneels", "knees", "knell", "knelt", "knesset", "knew", "knickers", "knife", "knifed", "knifepoint", "knifes", "knifing", "knight", "knighted", "knighthood", "knighthoods", "knightly", "knights", "knit", "knits", "knitted", "knitter", "knitters", "knitting", "knitwear", "knives", "knob", "knobbly", "knobs", "knock", "knocked", "knocker", "knockers", "knocking", "knockings", "knockout", "knocks", "knoll", "knolls", "knot", "knots", "knotted", "knottier", "knottiest", "knotting", "knotty", "know", "knowable", "knowhow", "knowing", "knowingly", "knowledge", "knowledgeable", "knowledgeably", "known", "knows", "knuckle", "knuckled", "knuckleduster", "knuckledusters", "knuckles", "knuckling" };
	private int searchIndex;
	
	public DictionaryK3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersK3.length; i++){
			if(lettersK3[i].equalsIgnoreCase(value)){
				return lettersK3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersK3.length; i++){
			if(lettersK3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}