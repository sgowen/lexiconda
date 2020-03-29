package com.technegames.dict.R;

import com.technegames.framework.Dictionary;

public class DictionaryR5 implements Dictionary{
	private static String[] lettersR5 = { "ruanda", "rub", "rubbed", "rubber", "rubberised", "rubbers", "rubberstamp", "rubberstamped", "rubberstamping", "rubbery", "rubbing", "rubbings", "rubbish", "rubbished", "rubbishes", "rubbishing", "rubbishy", "rubble", "rubbles", "rubella", "rubicon", "rubicund", "rubidium", "rubies", "rubric", "rubs", "ruby", "ruck", "rucks", "rucksack", "rucksacks", "ruction", "ructions", "rudder", "rudderless", "rudders", "ruddiness", "ruddy", "rude", "rudely", "rudeness", "ruder", "rudest", "rudimentary", "rudiments", "rue", "rueful", "ruefully", "ruefulness", "rues", "ruff", "ruffian", "ruffians", "ruffle", "ruffled", "ruffles", "ruffling", "ruffs", "rug", "rugby", "rugged", "ruggedly", "ruggedness", "rugs", "ruin", "ruination", "ruinations", "ruined", "ruiner", "ruining", "ruinous", "ruinously", "ruins", "rule", "rulebook", "rulebooks", "ruled", "ruler", "rulers", "rules", "ruling", "rulings", "rum", "rumania", "rumba", "rumbas", "rumble", "rumbled", "rumbles", "rumbling", "rumblings", "rumbustious", "rumen", "ruminant", "ruminants", "ruminate", "ruminated", "ruminating", "rumination", "ruminations", "ruminative", "ruminatively", "rummage", "rummaged", "rummages", "rummaging", "rummy", "rumour", "rumoured", "rumours", "rump", "rumple", "rumpled", "rumpling", "rumps", "rumpus", "rumpuses", "run", "runaway", "rundown", "rune", "runes", "rung", "rungs", "runnable", "runner", "runners", "runnersup", "runnerup", "runnier", "runniest", "running", "runny", "runofthemill", "runs", "runt", "runts", "runway", "runways", "rupee", "rupees", "rupert", "rupture", "ruptured", "ruptures", "rupturing", "rural", "ruralist", "rurally", "ruse", "rush", "rushed", "rushes", "rushhour", "rushier", "rushing", "rusk", "rusks", "russet", "russia", "russian", "rust", "rusted", "rustic", "rustically", "rusticate", "rusticated", "rusticity", "rustics", "rustier", "rustiest", "rustiness", "rusting", "rustle", "rustled", "rustler", "rustlers", "rustles", "rustling", "rustproof", "rusts", "rusty", "rut", "ruth", "ruthless", "ruthlessly", "ruthlessness", "ruts", "rutted", "rwanda", "rye" };
	private int searchIndex;
	
	public DictionaryR5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersR5.length; i++){
			if(lettersR5[i].equalsIgnoreCase(value)){
				return lettersR5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersR5.length; i++){
			if(lettersR5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}