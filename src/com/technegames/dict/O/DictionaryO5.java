package com.technegames.dict.O;

import com.technegames.framework.Dictionary;

public class DictionaryO5 implements Dictionary{
	private static String[] lettersO5 = { "ouch", "ought", "ounce", "ounces", "our", "ours", "ourselves", "oust", "ousted", "ouster", "ousting", "ousts", "out", "outage", "outages", "outback", "outbid", "outbids", "outboard", "outbound", "outbreak", "outbreaks", "outbred", "outbuilding", "outbuildings", "outburst", "outbursts", "outcall", "outcast", "outcasts", "outclassed", "outcome", "outcomes", "outcries", "outcrop", "outcrops", "outcry", "outdated", "outdid", "outdo", "outdoes", "outdoing", "outdone", "outdoor", "outdoors", "outer", "outermost", "outface", "outfall", "outfalls", "outfield", "outfit", "outfits", "outfitters", "outflank", "outflanked", "outflow", "outflows", "outfox", "outfoxed", "outfoxes", "outgo", "outgoing", "outgoings", "outgrew", "outgrow", "outgrowing", "outgrown", "outgrowth", "outgrowths", "outguess", "outhouse", "outhouses", "outing", "outings", "outlandish", "outlast", "outlasted", "outlasts", "outlaw", "outlawed", "outlawing", "outlawry", "outlaws", "outlay", "outlays", "outlet", "outlets", "outlier", "outliers", "outline", "outlined", "outlines", "outlining", "outlive", "outlived", "outlives", "outliving", "outlook", "outlooks", "outlying", "outmanoeuvre", "outmanoeuvred", "outmoded", "outmost", "outnumber", "outnumbered", "outnumbering", "outnumbers", "outpace", "outpaced", "outpacing", "outpatient", "outpatients", "outperform", "outperformed", "outperforming", "outperforms", "outplacement", "outplay", "outplayed", "outpointed", "outpointing", "outpost", "outposts", "outpouring", "outpourings", "output", "outputs", "outputting", "outrage", "outraged", "outrageous", "outrageously", "outrages", "outraging", "outran", "outrank", "outreach", "outride", "outrider", "outriders", "outrigger", "outright", "outrun", "outruns", "outs", "outsell", "outset", "outsets", "outshine", "outshines", "outshining", "outshone", "outside", "outsider", "outsiders", "outsides", "outsize", "outskirts", "outsmart", "outsold", "outsourcing", "outspan", "outspoken", "outspokenly", "outspokenness", "outspread", "outstanding", "outstandingly", "outstation", "outstations", "outstay", "outstayed", "outstep", "outstretched", "outstrip", "outstripped", "outstripping", "outstrips", "outvoted", "outward", "outwardly", "outwards", "outweigh", "outweighed", "outweighing", "outweighs", "outwit", "outwith", "outwits", "outwitted", "outwitting", "outwork", "outworking", "ova", "oval", "ovals", "ovarian", "ovaries", "ovary", "ovate", "ovation", "ovations", "oven", "ovens", "over", "overact", "overacted", "overacting", "overactive", "overacts", "overall", "overallocation", "overalls", "overambitious", "overanxious", "overate", "overbearing", "overboard", "overburdened", "overcame", "overcapacity", "overcast", "overcharge", "overcharged", "overcharging", "overcoat", "overcoats", "overcome", "overcomes", "overcoming", "overcommitment", "overcommitments", "overcompensate", "overcomplexity", "overcomplicated", "overconfident", "overcook", "overcooked", "overcrowd", "overcrowded", "overcrowding", "overdetermined", "overdid", "overdo", "overdoes", "overdoing", "overdone", "overdose", "overdosed", "overdoses", "overdosing", "overdraft", "overdrafts", "overdramatic", "overdraw", "overdrawn", "overdressed", "overdrive", "overdubbing", "overdue", "overeat", "overeating", "overeats", "overemotional", "overemphasis", "overemphasise", "overemphasised", "overenthusiastic", "overestimate", "overestimated", "overestimates", "overestimating", "overestimation", "overexposed", "overexposure", "overextended", "overfamiliarity", "overfed", "overfeed", "overfeeding", "overfill", "overfishing", "overflow", "overflowed", "overflowing", "overflown", "overflows", "overfly", "overflying", "overfull", "overgeneralised", "overgeneralising", "overgrazing", "overground", "overgrown", "overgrowth", "overhand", "overhang", "overhanging", "overhangs", "overhasty", "overhaul", "overhauled", "overhauling", "overhauls", "overhead", "overheads", "overhear", "overheard", "overhearing", "overhears", "overheat", "overheated", "overheating", "overhung", "overincredulous", "overindulgence", "overindulgent", "overinflated", "overjoyed", "overkill", "overladen", "overlaid", "overlain", "overland", "overlap", "overlapped", "overlapping", "overlaps", "overlay", "overlaying", "overlays", "overleaf", "overlie", "overlies", "overload", "overloaded", "overloading", "overloads", "overlong", "overlook", "overlooked", "overlooking", "overlooks", "overlord", "overlords", "overly", "overlying", "overmanning", "overmantel", "overmatching", "overmuch", "overnight", "overoptimistic", "overpaid", "overpass", "overpay", "overpayment", "overplay", "overplayed", "overplaying", "overpopulated", "overpopulation", "overpopulous", "overpower", "overpowered", "overpowering", "overpoweringly", "overpowers", "overpressure", "overpriced", "overprint", "overprinted", "overprinting", "overprints", "overproduced", "overproduction", "overqualified", "overran", "overrate", "overrated", "overreach", "overreached", "overreaching", "overreact", "overreacted", "overreacting", "overreaction", "overreacts", "overrepresented", "overridden", "override", "overrides", "overriding", "overripe", "overrode", "overrule", "overruled", "overruling", "overrun", "overrunning", "overruns", "overs", "oversampled", "oversampling", "oversaw", "overseas", "oversee", "overseeing", "overseen", "overseer", "overseers", "oversees", "oversensitive", "oversensitivity", "oversexed", "overshadow", "overshadowed", "overshadowing", "overshadows", "overshoot", "overshooting", "overshoots", "overshot", "oversight", "oversights", "oversimplification", "oversimplifications", "oversimplified", "oversimplifies", "oversimplify", "oversimplifying", "oversize", "oversized", "oversleep", "overslept", "overspend", "overspending", "overspent", "overspill", "overstaffed", "overstate", "overstated", "overstatement", "overstates", "overstating", "overstep", "overstepped", "overstepping", "oversteps", "overstocked", "overstocking", "overstress", "overstressed", "overstretch", "overstretched", "overstrung", "overstuffed", "oversubscribed", "oversupply", "overt", "overtake", "overtaken", "overtaker", "overtakers", "overtakes", "overtaking", "overtax", "overthetop", "overthrew", "overthrow", "overthrowing", "overthrown", "overthrows", "overtightened", "overtime", "overtly", "overtness", "overtone", "overtones", "overtook", "overtops", "overture", "overtures", "overturn", "overturned", "overturning", "overturns", "overuse", "overused", "overuses", "overvalue", "overvalued", "overview", "overviews", "overweening", "overweight", "overwhelm", "overwhelmed", "overwhelming", "overwhelmingly", "overwhelms", "overwinter", "overwintered", "overwintering", "overwork", "overworked", "overworking", "overwrite", "overwrites", "overwriting", "overwritten", "overwrote", "overwrought", "oviduct", "ovoid", "ovular", "ovulation", "ovum", "ow", "owe", "owed", "owes", "owing", "owl", "owlet", "owlets", "owlish", "owlishly", "owls", "own", "owned", "owner", "owners", "ownership", "ownerships", "owning", "owns", "ox", "oxalate", "oxalic", "oxcart", "oxen", "oxford", "oxidant", "oxidants", "oxidation", "oxide", "oxides", "oxidisation", "oxidise", "oxidised", "oxidiser", "oxidising", "oxtail", "oxtails", "oxygen", "oxygenated", "oxygenating", "oxygenation", "oxymoron", "oyster", "oysters", "ozone", "ozonefriendly" };
	private int searchIndex;
	
	public DictionaryO5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersO5.length; i++){
			if(lettersO5[i].equalsIgnoreCase(value)){
				return lettersO5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersO5.length; i++){
			if(lettersO5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}