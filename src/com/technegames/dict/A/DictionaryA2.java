package com.technegames.dict.A;

import com.technegames.framework.Dictionary;

public class DictionaryA2 implements Dictionary{
	private static String[] lettersA2 = { "aegean", "aegina", "aegis", "aeolian", "aeon", "aeons", "aerate", "aerated", "aerates", "aerating", "aeration", "aerator", "aerial", "aerially", "aerials", "aerify", "aerobatic", "aerobatics", "aerobe", "aerobes", "aerobic", "aerobically", "aerobics", "aerobraking", "aerodrome", "aerodromes", "aerodynamic", "aerodynamically", "aerodynamics", "aerofoil", "aerofoils", "aeronaut", "aeronautic", "aeronautical", "aeronautics", "aeroplane", "aeroplanes", "aerosol", "aerosols", "aerospace", "aesop", "aesthete", "aesthetes", "aesthetic", "aesthetically", "aestheticism", "aestheticsy", "afar", "affability", "affable", "affably", "affair", "affairs", "affect", "affectation", "affectations", "affected", "affectedly", "affecting", "affection", "affectionate", "affectionately", "affections", "affective", "affects", "afferent", "affidavit", "affidavits", "affiliate", "affiliated", "affiliates", "affiliating", "affiliation", "affiliations", "affine", "affinities", "affinity", "affirm", "affirmation", "affirmations", "affirmative", "affirmatively", "affirmed", "affirming", "affirms", "affix", "affixed", "affixes", "affixing", "afflict", "afflicted", "afflicting", "affliction", "afflictions", "afflicts", "affluence", "affluent", "afflux", "afford", "affordability", "affordable", "afforded", "affording", "affords", "afforestation", "afforested", "affray", "affront", "affronted", "affronts", "afghan", "afghani", "afghans", "afield", "afire", "aflame", "afloat", "afoot", "aforementioned", "aforesaid", "aforethought", "afraid", "afresh", "africa", "african", "africans", "afro", "afros", "aft", "after", "afterbirth", "aftercare", "aftereffect", "aftereffects", "afterglow", "afterlife", "afterlives", "aftermath", "afternoon", "afternoons", "aftershave", "aftershocks", "aftertaste", "afterthought", "afterthoughts", "afterward", "afterwards", "aga", "again", "against", "agakhan", "agape", "agar", "agaragar", "agave", "agaves", "age", "aged", "ageing", "ageings", "ageism", "ageless", "agencies", "agency", "agenda", "agendas", "agendums", "agent", "agents", "ageold", "ages", "agglomerated", "agglomerating", "agglomeration", "agglomerations", "agglutinative", "aggravate", "aggravated", "aggravates", "aggravating", "aggravation", "aggravations", "aggregate", "aggregated", "aggregates", "aggregating", "aggregation", "aggregations", "aggression", "aggressions", "aggressive", "aggressively", "aggressiveness", "aggressor", "aggressors", "aggrieved", "aggrievedly", "aghast", "agile", "agiler", "agility", "aging", "agings", "agio", "agitate", "agitated", "agitatedly", "agitates", "agitating", "agitation", "agitations", "agitator", "agitators", "agitprop", "agleam", "aglow", "agnostic", "agnosticism", "agnostics", "ago", "agog", "agonies", "agonise", "agonised", "agonises", "agonising", "agonisingly", "agonist", "agonists", "agony", "agora", "agoraphobia", "agoraphobic", "agouti", "agrarian", "agree", "agreeable", "agreeableness", "agreeably", "agreed", "agreeing", "agreement", "agreements", "agrees", "agribusiness", "agricultural", "agriculturalist", "agriculturalists", "agriculturally", "agriculture", "agrimony", "agrochemical", "agrochemicals", "agronomist", "agronomists", "agronomy", "aground", "ague", "ah", "aha", "ahead", "ahem", "ahoy" };
	private int searchIndex;
	
	public DictionaryA2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersA2.length; i++){
			if(lettersA2[i].equalsIgnoreCase(value)){
				return lettersA2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersA2.length; i++){
			if(lettersA2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}