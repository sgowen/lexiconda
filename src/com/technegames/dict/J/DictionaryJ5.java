package com.technegames.dict.J;

import com.technegames.framework.Dictionary;

public class DictionaryJ5 implements Dictionary{
	private static String[] lettersJ5 = { "jubilant", "jubilantly", "jubilate", "jubilation", "jubilee", "jubilees", "judaic", "judaism", "judas", "judder", "juddered", "juddering", "judders", "judge", "judged", "judgement", "judgemental", "judgements", "judges", "judging", "judgment", "judgmental", "judgments", "judicature", "judicial", "judicially", "judiciaries", "judiciary", "judicious", "judiciously", "judo", "jug", "jugged", "juggernaut", "juggernauts", "juggle", "juggled", "juggler", "jugglers", "juggles", "juggling", "jugs", "jugular", "juice", "juices", "juicier", "juiciest", "juiciness", "juicy", "jukebox", "jukeboxes", "julep", "juleps", "july", "jumble", "jumbled", "jumbles", "jumbo", "jump", "jumped", "jumper", "jumpers", "jumpier", "jumpiest", "jumpiness", "jumping", "jumps", "jumpstart", "jumpstarting", "jumpsuit", "jumpy", "junction", "junctions", "juncture", "june", "jungle", "jungles", "junior", "juniority", "juniors", "juniper", "junk", "junker", "junket", "junkie", "junkies", "junkmail", "junks", "junkyard", "juno", "junta", "juntas", "jupiter", "jurassic", "juridic", "juridical", "juries", "jurisdiction", "jurisdictional", "jurisdictions", "jurisprudence", "jurisprudential", "jurist", "juristic", "jurists", "juror", "jurors", "jury", "juryman", "jurymen", "jussive", "just", "justice", "justices", "justifiability", "justifiable", "justifiably", "justification", "justifications", "justificatory", "justified", "justifies", "justify", "justifying", "justly", "justness", "jut", "jute", "juts", "jutted", "jutting", "juvenile", "juveniles", "juxtapose", "juxtaposed", "juxtaposes", "juxtaposing", "juxtaposition", "juxtapositions" };
	private int searchIndex;
	
	public DictionaryJ5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersJ5.length; i++){
			if(lettersJ5[i].equalsIgnoreCase(value)){
				return lettersJ5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersJ5.length; i++){
			if(lettersJ5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}