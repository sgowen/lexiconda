package com.technegames.dict.W;

import com.technegames.framework.Dictionary;

public class DictionaryW2 implements Dictionary{
	private static String[] lettersW2 = { "we", "weak", "weaken", "weakened", "weakening", "weakens", "weaker", "weakest", "weakish", "weakkneed", "weakling", "weaklings", "weakly", "weakminded", "weakness", "weaknesses", "weal", "wealth", "wealthier", "wealthiest", "wealthy", "wean", "weaned", "weaning", "weanling", "weans", "weapon", "weaponry", "weapons", "wear", "wearable", "wearer", "wearers", "wearied", "wearier", "wearies", "weariest", "wearily", "weariness", "wearing", "wearisome", "wears", "weary", "wearying", "wearyingly", "weasel", "weaselling", "weaselly", "weasels", "weather", "weatherbeaten", "weatherbound", "weathercock", "weathercocks", "weathered", "weathering", "weatherman", "weathermen", "weatherproof", "weathers", "weathervane", "weatherworn", "weave", "weaved", "weaver", "weavers", "weaves", "weaving", "weavings", "web", "webbed", "webbing", "webby", "webfoot", "webs", "website", "wed", "wedded", "wedding", "weddings", "wedge", "wedged", "wedges", "wedging", "wedlock", "weds", "wee", "weed", "weeded", "weedier", "weediest", "weeding", "weedkiller", "weedkillers", "weeds", "weedy", "week", "weekday", "weekdays", "weekend", "weekenders", "weekends", "weeklies", "weekly", "weeks", "ween", "weeny", "weep", "weeper", "weeping", "weepings", "weeps", "weepy", "weevil", "weevils", "weigh", "weighbridge", "weighed", "weighing", "weighs", "weight", "weighted", "weightier", "weightiest", "weightily", "weighting", "weightings", "weightless", "weightlessly", "weightlessness", "weightlifter", "weightlifters", "weightlifting", "weights", "weighty", "weir", "weird", "weirder", "weirdest", "weirdly", "weirdness", "weirdo", "weirs", "welcome", "welcomed", "welcomer", "welcomes", "welcoming", "weld", "welded", "welder", "welders", "welding", "welds", "welfare", "well", "welladjusted", "wellbalanced", "wellbehaved", "wellbeing", "wellbeloved", "wellborn", "wellbred", "wellbuilt", "wellchosen", "wellconnected", "welldefined", "welldeserved", "welldesigned", "welldeveloped", "welldisposed", "welldressed", "wellearned", "welled", "welleducated", "wellendowed", "wellequipped", "wellestablished", "wellfed", "wellformed", "wellfounded", "wellgrounded", "wellhead", "wellinformed", "welling", "wellington", "wellingtons", "wellintentioned", "wellkept", "wellknown", "wellliked", "wellloved", "wellmade", "wellmannered", "wellmarked", "wellmatched", "wellmeaning", "wellmeant", "welloff", "wellordered", "wellorganised", "wellpaid", "wellplaced", "wellprepared", "wellpreserved", "wellread", "wellreceived", "wellrounded", "wells", "wellspoken", "wellstructured", "wellsupported", "welltaken", "wellthoughtout", "welltimed", "welltodo", "welltried", "wellused", "wellwisher", "wellwishers", "wellworn", "welly", "welsh", "welshman", "welt", "welter", "weltering", "welters", "welterweight", "welts", "wench", "wenches", "wend", "wended", "wending", "wends", "went", "wept", "were", "werewolf", "werewolves", "west", "westbound", "westerly", "western", "westerner", "westerners", "westernisation", "westernised", "westernmost", "westerns", "westward", "westwards", "wet", "wether", "wetland", "wetlands", "wetly", "wetness", "wets", "wetsuit", "wetsuits", "wettable", "wetted", "wetter", "wettest", "wetting", "whack", "whacked", "whacker", "whacko", "whacks", "whale", "whalebone", "whaler", "whalers", "whales", "whaling", "wham", "whap", "wharf", "wharfs", "wharves", "what", "whatever", "whatnot", "whatsoever", "wheals", "wheat", "wheatears", "wheaten", "wheatgerm", "wheats", "whee", "wheedle", "wheedled", "wheedling", "wheel", "wheelbarrow", "wheelbarrows", "wheelbase", "wheelchair", "wheelchairs", "wheeled", "wheeler", "wheelers", "wheelhouse", "wheelie", "wheeling", "wheels", "wheelwright", "wheelwrights", "wheeze", "wheezed", "wheezes", "wheezing", "wheezy", "whelk", "whelked", "whelks", "whelp", "when", "whence", "whenever", "where", "whereabouts", "whereas", "whereby", "wherefore", "wherefores", "wherein", "whereof", "whereon", "wheresoever", "whereto", "whereupon", "wherever", "wherewith", "wherewithal", "wherry", "whet", "whether", "whetstone", "whetstones", "whetted", "whetting", "whey", "which", "whichever", "whiff", "whiffs", "while", "whiled", "whiles", "whiling", "whilst", "whim", "whimper", "whimpered", "whimpering", "whimpers", "whims", "whimsical", "whimsically", "whimsy", "whine", "whined", "whines", "whining", "whinnied", "whinny", "whinnying", "whip", "whipcord", "whiplash", "whipped", "whipper", "whippet", "whippets", "whipping", "whippy", "whips", "whir", "whirl", "whirled", "whirligig", "whirling", "whirlpool", "whirlpools", "whirls", "whirlwind", "whirlwinds", "whirr", "whirred", "whirring", "whisk", "whisked", "whisker", "whiskers", "whiskery", "whiskey", "whiskeys", "whiskies", "whisking", "whisks", "whisky", "whisper", "whispered", "whisperers", "whispering", "whisperings", "whispers", "whist", "whistle", "whistled", "whistler", "whistles", "whistling", "whists", "white", "whitebait", "whiteboards", "whitecollar", "whitely", "whiten", "whitened", "whitener", "whiteness", "whitening", "whitens", "whiter", "whites", "whitest", "whitewash", "whitewashed", "whitewashing", "whither", "whiting", "whitish", "whittle", "whittled", "whittling", "whizkids", "whizz", "whizzkid", "who", "whoa", "whodunit", "whodunnit", "whoever", "whole", "wholefood", "wholegrain", "wholehearted", "wholeheartedly", "wholemeal", "wholeness", "wholes", "wholesale", "wholesaler", "wholesalers", "wholesaling", "wholesome", "wholesomely", "wholesomeness", "wholewheat", "wholly", "whom", "whomever", "whomsoever", "whoop", "whooped", "whooping", "whoops", "whoosh", "whop", "whore", "whorehouse", "whores", "whoring", "whorled", "whorls", "whose", "whosoever", "why", "whys" };
	private int searchIndex;
	
	public DictionaryW2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersW2.length; i++){
			if(lettersW2[i].equalsIgnoreCase(value)){
				return lettersW2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersW2.length; i++){
			if(lettersW2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}