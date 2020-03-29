package com.technegames.dict.T;

import com.technegames.framework.Dictionary;

public class DictionaryT3 implements Dictionary{
	private static String[] lettersT3 = { "tiara", "tiaras", "tibia", "tibiae", "tic", "tick", "ticked", "ticker", "tickers", "ticket", "ticketed", "tickets", "ticking", "tickle", "tickled", "tickler", "tickles", "tickling", "ticklish", "ticks", "tics", "tidal", "tidbit", "tidbits", "tiddlers", "tiddlywinks", "tide", "tideless", "tides", "tideway", "tidied", "tidier", "tidies", "tidiest", "tidily", "tidiness", "tiding", "tidings", "tidy", "tidying", "tie", "tiebreak", "tied", "tier", "tiered", "tiers", "ties", "tiger", "tigerish", "tigers", "tight", "tighten", "tightened", "tightening", "tightens", "tighter", "tightest", "tightfisted", "tightlipped", "tightly", "tightness", "tightrope", "tights", "tightwad", "tigress", "tigris", "tikka", "tilde", "tildes", "tile", "tiled", "tiler", "tiles", "tiling", "tilings", "till", "tillage", "tilled", "tiller", "tillers", "tilling", "tills", "tilt", "tilted", "tilting", "tilts", "timber", "timbered", "timbre", "time", "timebase", "timeconsuming", "timed", "timeframe", "timehonoured", "timekeeper", "timekeepers", "timekeeping", "timelapse", "timeless", "timelessness", "timeliness", "timely", "timeout", "timepiece", "timer", "timers", "times", "timescale", "timescales", "timeshare", "timetable", "timetabled", "timetables", "timetabling", "timid", "timidity", "timidly", "timing", "timings", "tin", "tincan", "tincture", "tinctured", "tinder", "tinderbox", "tinfoil", "tinge", "tinged", "tinges", "tingle", "tingled", "tingles", "tinglier", "tingliest", "tingling", "tingly", "tinier", "tiniest", "tinker", "tinkered", "tinkering", "tinkers", "tinkle", "tinkled", "tinkling", "tinkly", "tinned", "tinner", "tinnier", "tinniest", "tinnily", "tinnitus", "tinny", "tinopener", "tinpot", "tins", "tinsel", "tinsels", "tint", "tinted", "tinting", "tintings", "tints", "tinware", "tiny", "tip", "tipoff", "tipoffs", "tipped", "tipper", "tipping", "tipple", "tippling", "tips", "tipster", "tipsters", "tipsy", "tiptoe", "tiptoed", "tiptoeing", "tiptoes", "tiptop", "tirade", "tirades", "tire", "tired", "tiredly", "tiredness", "tireless", "tirelessly", "tires", "tiresome", "tiresomely", "tiring", "tiro", "tissue", "tissues", "tit", "titan", "titanic", "titanically", "titanium", "titans", "titbit", "titbits", "titfortat", "tithe", "tithes", "tithing", "titillate", "titillated", "titillating", "titillation", "title", "titled", "titles", "titling", "titrated", "titration", "titre", "titres", "tits", "titter", "tittered", "tittering", "titters", "titular" };
	private int searchIndex;
	
	public DictionaryT3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersT3.length; i++){
			if(lettersT3[i].equalsIgnoreCase(value)){
				return lettersT3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersT3.length; i++){
			if(lettersT3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}