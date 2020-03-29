package com.technegames.dict.H;

import com.technegames.framework.Dictionary;

public class DictionaryH4 implements Dictionary{
	private static String[] lettersH4 = { "ho", "hoar", "hoard", "hoarded", "hoarder", "hoarders", "hoarding", "hoardings", "hoards", "hoarfrost", "hoarse", "hoarsely", "hoarseness", "hoarser", "hoary", "hoax", "hoaxed", "hoaxer", "hoaxers", "hoaxes", "hoaxing", "hob", "hobbies", "hobbit", "hobble", "hobbled", "hobbles", "hobbling", "hobby", "hobbyist", "hobbyists", "hobgoblin", "hobgoblins", "hobnailed", "hobnails", "hobo", "hobs", "hock", "hockey", "hocks", "hocus", "hocuspocus", "hod", "hoe", "hoed", "hoeing", "hoes", "hog", "hogg", "hogged", "hogger", "hogging", "hoggs", "hogs", "hogwash", "hoist", "hoisted", "hoisting", "hoists", "hold", "holdable", "holdall", "holdalls", "holder", "holders", "holding", "holdings", "holdout", "holds", "holdup", "holdups", "hole", "holed", "holeinone", "holes", "holiday", "holidaying", "holidaymaker", "holidaymakers", "holidays", "holier", "holies", "holiest", "holily", "holiness", "holing", "holism", "holistic", "holistically", "holland", "holler", "hollered", "hollies", "hollow", "hollowed", "hollowly", "hollowness", "hollows", "holly", "hollyhocks", "holmes", "holocaust", "holocausts", "hologram", "holograms", "holographic", "holography", "holster", "holsters", "holy", "homage", "homages", "hombre", "home", "homecoming", "homecomings", "homed", "homeland", "homelands", "homeless", "homelessness", "homelier", "homeliness", "homely", "homemade", "homeowner", "homeowners", "homes", "homesick", "homesickness", "homespun", "homestead", "homesteads", "homeward", "homewardbound", "homewards", "homework", "homicidal", "homicide", "homicides", "homiest", "homilies", "homily", "homing", "hominid", "hominids", "homoeopathic", "homoeopathy", "homogenates", "homogeneity", "homogeneous", "homogeneously", "homogenisation", "homogenise", "homogenised", "homogenising", "homological", "homologies", "homologous", "homologue", "homologues", "homology", "homomorphism", "homomorphisms", "homonym", "homonyms", "homophobes", "homophobia", "homophobic", "homophones", "homophony", "homosexual", "homosexuality", "homosexually", "homosexuals", "homotopy", "homozygous", "homunculus", "homy", "hone", "honed", "hones", "honest", "honestly", "honesty", "honey", "honeybee", "honeycomb", "honeycombed", "honeycombing", "honeydew", "honeyed", "honeymoon", "honeymooners", "honeymoons", "honeysuckle", "honeysuckles", "honing", "honk", "honking", "honks", "honorarium", "honorary", "honorific", "honors", "honour", "honourable", "honourably", "honoured", "honouring", "honours", "honshu", "hood", "hooded", "hoodlum", "hoodlums", "hoods", "hoodwink", "hoodwinked", "hoodwinking", "hoof", "hoofs", "hook", "hookah", "hooked", "hooker", "hookers", "hooking", "hooknosed", "hooks", "hooky", "hooligan", "hooliganism", "hooligans", "hoop", "hooped", "hoops", "hooray", "hoot", "hooted", "hooter", "hooters", "hooting", "hoots", "hoover", "hoovered", "hoovering", "hooves", "hop", "hope", "hoped", "hopeful", "hopefully", "hopefulness", "hopefuls", "hopeless", "hopelessly", "hopelessness", "hopes", "hoping", "hopped", "hopper", "hoppers", "hopping", "hops", "horde", "hordes", "horizon", "horizons", "horizontal", "horizontally", "horizontals", "hormonal", "hormonally", "hormone", "hormones", "horn", "hornbeam", "hornbills", "horned", "hornet", "hornets", "hornpipe", "hornpipes", "horns", "horny", "horoscope", "horoscopes", "horrendous", "horrendously", "horrible", "horribly", "horrid", "horridly", "horrific", "horrifically", "horrified", "horrifies", "horrify", "horrifying", "horrifyingly", "horror", "horrors", "horrorstricken", "horse", "horseback", "horsebox", "horseflesh", "horsefly", "horsehair", "horseless", "horseman", "horsemen", "horseplay", "horsepower", "horseradish", "horses", "horseshoe", "horseshoes", "horsewhip", "horsewhipped", "horsey", "horsing", "horticultural", "horticulture", "horticulturist", "horticulturists", "hosanna", "hosannas", "hose", "hosed", "hosepipe", "hoses", "hosier", "hosiery", "hosing", "hospice", "hospices", "hospitable", "hospitably", "hospital", "hospitalisation", "hospitalised", "hospitality", "hospitals", "host", "hosta", "hostage", "hostages", "hosted", "hostel", "hostelries", "hostelry", "hostels", "hostess", "hostesses", "hostile", "hostilely", "hostilities", "hostility", "hosting", "hostler", "hosts", "hot", "hotair", "hotbed", "hotbeds", "hotblooded", "hotchpotch", "hotdog", "hotdogs", "hotel", "hotelier", "hoteliers", "hotels", "hotheaded", "hotheads", "hothouse", "hothouses", "hotline", "hotly", "hotness", "hotplate", "hotplates", "hotpot", "hotrod", "hotspot", "hotspots", "hottempered", "hotter", "hottest", "hotting", "hound", "hounded", "hounding", "hounds", "hour", "hourglass", "hourly", "hours", "house", "houseboat", "houseboats", "housebound", "housebreaker", "housebreakers", "housebreaking", "housebuilder", "housebuilders", "housebuilding", "housebuyers", "housed", "houseflies", "houseful", "household", "householder", "householders", "households", "househunting", "housekeeper", "housekeepers", "housekeeping", "housemaid", "housemaids", "houseroom", "houses", "housewife", "housewives", "housework", "housing", "housings", "houston", "hove", "hovel", "hovels", "hover", "hovercraft", "hovered", "hoverer", "hovering", "hovers", "how", "howdy", "however", "howitzer", "howitzers", "howl", "howled", "howler", "howlers", "howling", "howlings", "howls", "howsoever" };
	private int searchIndex;
	
	public DictionaryH4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersH4.length; i++){
			if(lettersH4[i].equalsIgnoreCase(value)){
				return lettersH4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersH4.length; i++){
			if(lettersH4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}