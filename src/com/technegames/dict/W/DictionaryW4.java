package com.technegames.dict.W;

import com.technegames.framework.Dictionary;

public class DictionaryW4 implements Dictionary{
	private static String[] lettersW4 = { "woad", "wobble", "wobbled", "wobbler", "wobbles", "wobblier", "wobbliest", "wobbling", "wobbly", "wodan", "wodge", "woe", "woebegone", "woeful", "woefully", "woes", "wok", "woke", "woken", "woks", "wold", "wolds", "wolf", "wolfcubs", "wolfed", "wolfhound", "wolfhounds", "wolfish", "wolfishly", "wolfwhistles", "wolves", "woman", "womanhood", "womanise", "womaniser", "womanish", "womanising", "womankind", "womanliness", "womanly", "womans", "womb", "wombat", "wombats", "wombs", "women", "womenfolk", "won", "wonder", "wondered", "wonderful", "wonderfully", "wonderfulness", "wondering", "wonderingly", "wonderland", "wonderment", "wonders", "wondrous", "wondrously", "wont", "woo", "wood", "woodbine", "woodcock", "woodcocks", "woodcut", "woodcuts", "woodcutter", "woodcutters", "wooded", "wooden", "woodenly", "woodenness", "woodland", "woodlands", "woodlice", "woodlouse", "woodman", "woodmen", "woodpecker", "woodpeckers", "woodpile", "woods", "woodshed", "woodsman", "woodsmoke", "woodwind", "woodwork", "woodworker", "woodworkers", "woodworking", "woodworm", "woody", "wooed", "wooer", "woof", "woofer", "woofers", "wooing", "wool", "woolen", "woolens", "woolier", "woolies", "woollike", "wooliness", "wooly", "wools", "wooly", "woos", "word", "wordage", "worded", "wordgame", "wordier", "wordiest", "wordiness", "wording", "wordings", "wordless", "wordlessly", "wordplay", "wordprocessing", "words", "wordsmith", "wordy", "wore", "work", "workability", "workable", "workaday", "workbench", "workbook", "workbooks", "workday", "workdays", "worked", "worker", "workers", "workfare", "workforce", "workforces", "workhorse", "workhorses", "workhouse", "workhouses", "working", "workings", "workless", "workload", "workloads", "workman", "workmanlike", "workmanship", "workmate", "workmates", "workmen", "workout", "workouts", "workpeople", "workpiece", "workpieces", "workplace", "workplaces", "workroom", "workrooms", "works", "worksheet", "worksheets", "workshop", "workshops", "workshy", "workspace", "workstation", "workstations", "worktop", "worktops", "workweek", "world", "worldclass", "worldfamous", "worldliness", "worldly", "worlds", "worldwar", "worldwide", "worm", "wormhole", "wormholes", "worming", "wormlike", "worms", "wormy", "worn", "worried", "worriedly", "worrier", "worriers", "worries", "worrisome", "worry", "worrying", "worryingly", "worse", "worsen", "worsened", "worsening", "worsens", "worser", "worship", "worshipful", "worshipped", "worshipper", "worshippers", "worshipping", "worships", "worst", "worsted", "worth", "worthier", "worthies", "worthiest", "worthily", "worthiness", "worthless", "worthlessness", "worthwhile", "worthy", "would", "wound", "wounded", "wounding", "wounds", "wove", "woven", "wow", "wowed", "wows", "wrack", "wracked", "wraith", "wraiths", "wrangle", "wrangled", "wrangler", "wrangles", "wrangling", "wrap", "wraparound", "wrapped", "wrapper", "wrappers", "wrapping", "wrappings", "wraps", "wrasse", "wrath", "wrathful", "wrathfully", "wraths", "wreak", "wreaked", "wreaking", "wreaks", "wreath", "wreathe", "wreathed", "wreathes", "wreathing", "wreaths", "wreck", "wreckage", "wrecked", "wrecker", "wreckers", "wrecking", "wrecks", "wren", "wrench", "wrenched", "wrenches", "wrenching", "wrens", "wrest", "wrested", "wresting", "wrestle", "wrestled", "wrestler", "wrestlers", "wrestles", "wrestling", "wretch", "wretched", "wretchedly", "wretchedness", "wretches", "wriggle", "wriggled", "wriggles", "wriggling", "wriggly", "wright", "wring", "wringer", "wringing", "wrings", "wrinkle", "wrinkled", "wrinkles", "wrinkling", "wrinkly", "wrist", "wristband", "wristbands", "wrists", "wristwatch", "writ", "writable", "write", "writer", "writers", "writes", "writhe", "writhed", "writhes", "writhing", "writing", "writings", "writs", "written", "wrong", "wrongdoer", "wrongdoers", "wrongdoing", "wrongdoings", "wronged", "wronger", "wrongest", "wrongful", "wrongfully", "wronging", "wrongly", "wrongness", "wrongs", "wrote", "wrought", "wroughtiron", "wrung", "wry", "wryly", "wryness" };
	private int searchIndex;
	
	public DictionaryW4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersW4.length; i++){
			if(lettersW4[i].equalsIgnoreCase(value)){
				return lettersW4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersW4.length; i++){
			if(lettersW4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}