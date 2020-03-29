package com.technegames.dict.T;

import com.technegames.framework.Dictionary;

public class DictionaryT1 implements Dictionary{
	private static String[] lettersT1 = { "taal", "tab", "tabasco", "tabbed", "tabbing", "tabby", "tabernacle", "tabernacles", "table", "tableau", "tableaux", "tablebay", "tablecloth", "tablecloths", "tabled", "tableland", "tables", "tablespoon", "tablespoonfuls", "tablespoons", "tablet", "tablets", "tableware", "tabling", "tabloid", "tabloids", "taboo", "taboos", "tabs", "tabular", "tabulate", "tabulated", "tabulates", "tabulating", "tabulation", "tabulations", "tabulator", "tachograph", "tachographs", "tachycardia", "tachyon", "tachyons", "tacit", "tacitly", "taciturn", "tack", "tacked", "tackier", "tackiest", "tackiness", "tacking", "tackle", "tackled", "tackler", "tackles", "tackling", "tacks", "tacky", "tact", "tactful", "tactfully", "tactic", "tactical", "tactically", "tactician", "tactics", "tactile", "tactless", "tactlessly", "tactlessness", "tactual", "tadpole", "tadpoles", "taffeta", "tag", "tagged", "tagging", "tags", "tahiti", "tahr", "tail", "tailed", "tailing", "tailless", "taillessness", "tailor", "tailorable", "tailored", "tailoring", "tailormade", "tailors", "tailpiece", "tailplane", "tails", "tailspin", "tailwind", "taint", "tainted", "tainting", "taints", "taipei", "taiwan", "take", "takeable", "takeaway", "takeaways", "taken", "takeover", "takeovers", "taker", "takers", "takes", "taking", "takings", "talc", "talcum", "tale", "talent", "talented", "talentless", "talents", "tales", "talisman", "talismans", "talk", "talkative", "talkativeness", "talkback", "talked", "talker", "talkers", "talkie", "talkies", "talking", "talkings", "talks", "tall", "tallboy", "taller", "tallest", "tallied", "tallies", "tallish", "tallness", "tallow", "tally", "tallyho", "tallying", "talmud", "talon", "talons", "tambourine", "tambourines", "tame", "tamed", "tamely", "tameness", "tamer", "tamers", "tames", "tamest", "taming", "tamp", "tamped", "tamper", "tampered", "tampering", "tampers", "tan", "tandem", "tandems", "tang", "tangelo", "tangent", "tangential", "tangentially", "tangents", "tangerine", "tangerines", "tangible", "tangibly", "tangle", "tangled", "tangles", "tangling", "tango", "tangy", "tank", "tankage", "tankard", "tankards", "tanked", "tanker", "tankers", "tankful", "tanking", "tanks", "tanned", "tanner", "tanneries", "tanners", "tannery", "tannic", "tannin", "tanning", "tannins", "tannoy", "tans", "tantalise", "tantalised", "tantalising", "tantalisingly", "tantalum", "tantamount", "tantrum", "tantrums", "tanzania", "tap", "tapas", "tapdance", "tapdancing", "tape", "taped", "taper", "taperecorded", "taperecording", "tapered", "taperer", "tapering", "tapers", "tapes", "tapestries", "tapestry", "tapeworm", "tapeworms", "taping", "tapioca", "tapir", "tapped", "tappers", "tapping", "tappings", "taproom", "taps", "tar", "taramasalata", "tarantula", "tarantulas", "tardily", "tardiness", "tardy", "tares", "target", "targeted", "targeting", "targets", "tariff", "tariffs", "tarmac", "tarmacadam", "tarn", "tarnish", "tarnished", "tarnishing", "tarns", "tarot", "tarp", "tarpaulin", "tarpaulins", "tarragon", "tarred", "tarried", "tarrier", "tarriest", "tarring", "tarry", "tarrying", "tars", "tarsal", "tarsus", "tart", "tartan", "tartans", "tartar", "tartaric", "tartly", "tartness", "tartrate", "tarts", "tarty", "tarzan", "task", "tasked", "tasking", "taskmaster", "tasks", "tasmania", "tassel", "tasselled", "tassels", "taste", "tasted", "tasteful", "tastefully", "tastefulness", "tasteless", "tastelessly", "tastelessness", "taster", "tasters", "tastes", "tastier", "tastiest", "tasting", "tastings", "tasty", "tat", "tattered", "tatters", "tattle", "tattoo", "tattooed", "tattooing", "tattoos", "tatty", "tau", "taught", "taunt", "taunted", "taunter", "taunting", "tauntingly", "taunts", "taut", "tauter", "tautest", "tautly", "tautness", "tautological", "tautologically", "tautologies", "tautologous", "tautology", "tavern", "taverna", "tavernas", "taverns", "tawdry", "tawny", "tax", "taxable", "taxation", "taxdeductible", "taxed", "taxes", "taxfree", "taxi", "taxicab", "taxidermist", "taxidermists", "taxidermy", "taxied", "taxies", "taxiing", "taxing", "taxis", "taxman", "taxonomic", "taxonomical", "taxonomies", "taxonomist", "taxonomists", "taxonomy", "taxpayer", "taxpayers", "taxpaying", "taylor" };
	private int searchIndex;
	
	public DictionaryT1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersT1.length; i++){
			if(lettersT1[i].equalsIgnoreCase(value)){
				return lettersT1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersT1.length; i++){
			if(lettersT1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}