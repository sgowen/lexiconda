package com.technegames.dict.W;

import com.technegames.framework.Dictionary;

public class DictionaryW3 implements Dictionary{
	private static String[] lettersW3 = { "wick", "wicked", "wickedest", "wickedly", "wickedness", "wicker", "wickerwork", "wicket", "wicketkeeper", "wicketkeepers", "wicketkeeping", "wickets", "wicks", "wide", "wideeyed", "widely", "widen", "widened", "wideness", "widening", "widens", "wideopen", "wider", "wideranging", "wides", "widescreen", "widespread", "widest", "widgeon", "widget", "widow", "widowed", "widower", "widowers", "widowhood", "widows", "width", "widths", "wield", "wielded", "wielder", "wielding", "wields", "wife", "wifeless", "wifely", "wig", "wigeon", "wigeons", "wigging", "wiggle", "wiggled", "wiggler", "wiggles", "wiggling", "wigs", "wigwam", "wigwams", "wild", "wildcat", "wildcats", "wildebeest", "wilder", "wilderness", "wildernesses", "wildest", "wildeyed", "wildfire", "wildfires", "wildfowl", "wildlife", "wildly", "wildness", "wildoats", "wilds", "wile", "wiles", "wilful", "wilfully", "wilfulness", "wilier", "wiliest", "wiling", "will", "willed", "willing", "willingly", "willingness", "willow", "willows", "willowy", "willpower", "wills", "willynilly", "wilt", "wilted", "wilting", "wilts", "wily", "wimp", "wimple", "wimpy", "win", "wince", "winced", "winces", "winch", "winched", "winches", "winching", "wincing", "wind", "windbag", "windbags", "windbreak", "windcheater", "windcheaters", "winded", "winder", "winders", "windfall", "windfalls", "windier", "windiest", "windily", "winding", "windings", "windlass", "windless", "windmill", "windmills", "window", "windowed", "windowing", "windowless", "windows", "windowshop", "windowshopping", "windpipe", "winds", "windscreen", "windscreens", "windsock", "windsor", "windsurf", "windsurfer", "windsurfers", "windsurfing", "windswept", "windward", "windy", "wine", "wined", "wineglass", "wineglasses", "winemakers", "winery", "wines", "wineskin", "wing", "winged", "winger", "wingers", "winging", "wingless", "wings", "wingspan", "wining", "wink", "winked", "winker", "winkers", "winking", "winkle", "winkled", "winkles", "winks", "winnable", "winner", "winners", "winning", "winningly", "winnings", "winnow", "winnowing", "wins", "winsome", "winter", "wintered", "wintering", "winters", "wintertime", "wintery", "wintrier", "wintriest", "wintry", "wipe", "wiped", "wiper", "wipers", "wipes", "wiping", "wire", "wired", "wireless", "wirer", "wires", "wirier", "wiriest", "wiring", "wirings", "wiry", "wisdom", "wisdoms", "wise", "wisecracks", "wiseguys", "wisely", "wiser", "wisest", "wish", "wishbone", "wished", "wishes", "wishful", "wishfully", "wishing", "wishywashy", "wisp", "wisps", "wispy", "wistful", "wistfully", "wistfulness", "wit", "witch", "witchcraft", "witchdoctor", "witchdoctors", "witchery", "witches", "witchhunt", "witchhunts", "witchlike", "with", "withdraw", "withdrawal", "withdrawals", "withdrawing", "withdrawn", "withdraws", "withdrew", "wither", "withered", "withering", "witheringly", "withers", "withheld", "withhold", "withholding", "withholds", "within", "without", "withstand", "withstanding", "withstands", "withstood", "witless", "witness", "witnessed", "witnesses", "witnessing", "wits", "witter", "wittering", "witticism", "witticisms", "wittier", "wittiest", "wittily", "wittiness", "witting", "wittingly", "witty", "wives", "wizard", "wizardry", "wizards", "wizened" };
	private int searchIndex;
	
	public DictionaryW3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersW3.length; i++){
			if(lettersW3[i].equalsIgnoreCase(value)){
				return lettersW3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersW3.length; i++){
			if(lettersW3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}