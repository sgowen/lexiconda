package com.technegames.dict.F;

import com.technegames.framework.Dictionary;

public class DictionaryF5 implements Dictionary{
	private static String[] lettersF5 = { "fuchsia", "fuchsias", "fuddle", "fuddled", "fuddles", "fudge", "fudged", "fudges", "fudging", "fuel", "fuelled", "fuelling", "fuels", "fug", "fugal", "fugitive", "fugitives", "fugue", "fugues", "fuhrer", "fulcrum", "fulfil", "fulfilled", "fulfilling", "fulfilment", "fulfils", "full", "fullback", "fullbacks", "fullblooded", "fullblown", "fullbodied", "fullcolour", "fuller", "fullest", "fullgrown", "fulling", "fullish", "fulllength", "fullmoon", "fullness", "fullpage", "fullscale", "fullstop", "fullstops", "fulltime", "fulltimer", "fulltimers", "fully", "fulminant", "fulminate", "fulminating", "fulmination", "fulminations", "fulsome", "fulsomely", "fumarole", "fumaroles", "fumble", "fumbled", "fumbles", "fumbling", "fume", "fumed", "fumes", "fumigate", "fumigating", "fumigation", "fuming", "fumingly", "fun", "function", "functional", "functionalism", "functionalist", "functionalities", "functionality", "functionally", "functionaries", "functionary", "functioned", "functioning", "functionless", "functions", "fund", "fundamental", "fundamentalism", "fundamentalist", "fundamentalists", "fundamentally", "fundamentals", "funded", "fundholders", "fundholding", "funding", "fundings", "fundraiser", "fundraisers", "fundraising", "funds", "funeral", "funerals", "funerary", "funereal", "funfair", "fungal", "fungi", "fungicidal", "fungicide", "fungicides", "fungoid", "fungous", "fungus", "funguses", "funicular", "funk", "funked", "funkier", "funky", "funnel", "funnelled", "funnelling", "funnels", "funnier", "funnies", "funniest", "funnily", "funny", "fur", "furbished", "furbishing", "furies", "furious", "furiously", "furled", "furling", "furlong", "furlongs", "furlough", "furls", "furnace", "furnaces", "furnish", "furnished", "furnishers", "furnishes", "furnishing", "furnishings", "furniture", "furore", "furores", "furred", "furrier", "furriers", "furriest", "furriness", "furring", "furrow", "furrowed", "furrows", "furry", "furs", "further", "furtherance", "furthered", "furthering", "furthermore", "furthers", "furthest", "furtive", "furtively", "furtiveness", "fury", "furze", "fuse", "fused", "fuselage", "fuses", "fusible", "fusilier", "fusiliers", "fusillade", "fusing", "fusion", "fusions", "fuss", "fussed", "fusses", "fussier", "fussiest", "fussily", "fussiness", "fussing", "fussy", "fustian", "fusty", "futile", "futilely", "futility", "futon", "future", "futures", "futurism", "futurist", "futuristic", "futurists", "futurity", "futurologists", "fuzz", "fuzzed", "fuzzes", "fuzzier", "fuzziest", "fuzzily", "fuzziness", "fuzzy" };
	private int searchIndex;
	
	public DictionaryF5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersF5.length; i++){
			if(lettersF5[i].equalsIgnoreCase(value)){
				return lettersF5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersF5.length; i++){
			if(lettersF5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}