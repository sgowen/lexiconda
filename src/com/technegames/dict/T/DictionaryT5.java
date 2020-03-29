package com.technegames.dict.T;

import com.technegames.framework.Dictionary;

public class DictionaryT5 implements Dictionary{
	private static String[] lettersT5 = { "tuareg", "tuaregs", "tuatara", "tub", "tuba", "tubas", "tubby", "tube", "tubed", "tubeless", "tuber", "tubercular", "tuberculosis", "tubers", "tubes", "tubing", "tubs", "tubular", "tubules", "tuck", "tucked", "tucker", "tuckers", "tucking", "tucks", "tues", "tuesday", "tuesdays", "tuft", "tufted", "tufting", "tufts", "tug", "tugela", "tugged", "tugging", "tugs", "tuition", "tulip", "tulips", "tumble", "tumbled", "tumbledown", "tumbler", "tumblers", "tumbles", "tumbling", "tumbrils", "tumescent", "tummies", "tummy", "tumour", "tumours", "tumult", "tumults", "tumultuous", "tumultuously", "tumulus", "tun", "tuna", "tunable", "tunas", "tundra", "tundras", "tune", "tuned", "tuneful", "tunefully", "tuneless", "tunelessly", "tuner", "tuners", "tunes", "tungsten", "tunic", "tunics", "tuning", "tunings", "tunisia", "tunisian", "tunnel", "tunnelled", "tunnellers", "tunnelling", "tunnels", "tunny", "tuns", "tuppence", "tuppences", "turban", "turbans", "turbid", "turbidity", "turbine", "turbines", "turbo", "turbocharged", "turbocharger", "turboprop", "turbot", "turbulence", "turbulent", "tureen", "tureens", "turf", "turfed", "turfs", "turfy", "turgid", "turgidity", "turgidly", "turin", "turk", "turkey", "turkeys", "turkish", "turks", "turmeric", "turmoil", "turmoils", "turn", "turnabout", "turnaround", "turncoat", "turncoats", "turned", "turner", "turners", "turning", "turnings", "turnip", "turnips", "turnkey", "turnout", "turnouts", "turnover", "turnovers", "turnpike", "turnround", "turns", "turnstile", "turnstiles", "turntable", "turntables", "turpentine", "turpitude", "turquoise", "turret", "turreted", "turrets", "turtle", "turtleneck", "turtles", "tuscany", "tusk", "tusked", "tusker", "tusks", "tussle", "tussles", "tussling", "tussock", "tussocks", "tussocky", "tutelage", "tutelary", "tutor", "tutored", "tutorial", "tutorials", "tutoring", "tutors", "tutu", "tuxedo", "twain", "twang", "twanged", "twanging", "twangs", "tweak", "tweaked", "tweaking", "tweaks", "twee", "tweed", "tweeds", "tweedy", "tweeness", "tweet", "tweeter", "tweeters", "tweets", "tweezers", "twelfth", "twelfths", "twelve", "twelves", "twenties", "twentieth", "twenty", "twice", "twiddle", "twiddled", "twiddler", "twiddles", "twiddling", "twiddly", "twig", "twigged", "twiggy", "twigs", "twilight", "twilit", "twill", "twin", "twine", "twined", "twines", "twinge", "twinges", "twining", "twinkle", "twinkled", "twinkles", "twinkling", "twinned", "twinning", "twins", "twirl", "twirled", "twirling", "twirls", "twist", "twisted", "twister", "twisters", "twisting", "twists", "twisty", "twit", "twitch", "twitched", "twitches", "twitching", "twitchy", "twitter", "twittered", "twittering", "two", "twodimensional", "twofaced", "twofold", "twosome", "tycoon", "tycoons", "tying", "tyke", "tykes", "type", "typecast", "typecasting", "typed", "typeface", "typefaces", "typeless", "types", "typescript", "typescripts", "typeset", "typesets", "typesetter", "typesetters", "typesetting", "typewriter", "typewriters", "typewriting", "typewritten", "typhoid", "typhoon", "typhoons", "typhus", "typical", "typicality", "typically", "typified", "typifies", "typify", "typifying", "typing", "typings", "typist", "typists", "typographer", "typographers", "typographic", "typographical", "typographically", "typography", "typological", "typologically", "typologies", "typology", "tyrannic", "tyrannical", "tyrannically", "tyrannicide", "tyrannies", "tyrannise", "tyrannised", "tyrannous", "tyranny", "tyrant", "tyrants", "tyre", "tyres" };
	private int searchIndex;
	
	public DictionaryT5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersT5.length; i++){
			if(lettersT5[i].equalsIgnoreCase(value)){
				return lettersT5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersT5.length; i++){
			if(lettersT5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}