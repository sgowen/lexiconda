package com.technegames.dict.V;

import com.technegames.framework.Dictionary;

public class DictionaryV3 implements Dictionary{
	private static String[] lettersV3 = { "via", "viability", "viable", "viably", "viaduct", "viaducts", "vial", "vials", "vibes", "vibrancy", "vibrant", "vibrantly", "vibrate", "vibrated", "vibrates", "vibrating", "vibration", "vibrational", "vibrationally", "vibrations", "vibrato", "vibrator", "vibrators", "vibratory", "vicar", "vicarage", "vicarages", "vicarious", "vicariously", "vicars", "vice", "vicechancellor", "vicechancellors", "vicepresidency", "vicepresident", "vicepresidential", "vicepresidents", "viceroy", "viceroys", "vices", "vicinities", "vicinity", "vicious", "viciously", "viciousness", "vicissitude", "vicissitudes", "victim", "victimisation", "victimise", "victimised", "victimises", "victimising", "victimless", "victims", "victor", "victoria", "victories", "victorious", "victoriously", "victors", "victory", "victualling", "victuals", "video", "videoconferencing", "videodisc", "videoed", "videoing", "videophone", "videos", "videotape", "videotaped", "videotapes", "videotaping", "vie", "vied", "vienna", "vier", "vies", "view", "viewable", "viewed", "viewer", "viewers", "viewfinder", "viewfinders", "viewing", "viewings", "viewpoint", "viewpoints", "views", "vigil", "vigilance", "vigilant", "vigilante", "vigilantes", "vigilantly", "vigils", "vignette", "vignettes", "vigorous", "vigorously", "vigour", "viking", "vikings", "vile", "vilely", "vileness", "viler", "vilest", "vilification", "vilified", "vilify", "vilifying", "villa", "village", "villager", "villagers", "villages", "villain", "villainous", "villains", "villainy", "villas", "vim", "vims", "vindicate", "vindicated", "vindicates", "vindicating", "vindication", "vindictive", "vindictively", "vindictiveness", "vine", "vinegar", "vinegars", "vines", "vineyard", "vineyards", "vino", "vintage", "vintages", "vintner", "vinyl", "vinyls", "viol", "viola", "violas", "violate", "violated", "violates", "violating", "violation", "violations", "violator", "violators", "violence", "violent", "violently", "violet", "violets", "violin", "violinist", "violinists", "violins", "violist", "viper", "vipers", "virago", "viral", "virgil", "virgin", "virginal", "virginia", "virginity", "virgins", "virile", "virility", "virology", "virtual", "virtually", "virtue", "virtues", "virtuosi", "virtuosic", "virtuosity", "virtuoso", "virtuous", "virtuously", "virulence", "virulent", "virulently", "virus", "viruses", "visa", "visage", "visas", "viscose", "viscosity", "viscount", "viscounts", "viscous", "vise", "visibilities", "visibility", "visible", "visibly", "vision", "visionaries", "visionary", "visions", "visit", "visitable", "visitant", "visitation", "visitations", "visited", "visiting", "visitor", "visitors", "visits", "visor", "visors", "vista", "vistas", "visual", "visualisation", "visualise", "visualised", "visualising", "visually", "visuals", "vital", "vitalise", "vitality", "vitally", "vitals", "vitamin", "vitamins", "vitiate", "vitiated", "vitiates", "vitiating", "vitreous", "vitrified", "vitriol", "vitriolic", "vituperate", "vituperation", "vituperative", "viva", "vivacious", "vivaciously", "vivacity", "vivid", "vividly", "vividness", "vivified", "vivisected", "vivisection", "vivisectionist", "vivisectionists", "vixen", "vixens", "vizier" };
	private int searchIndex;
	
	public DictionaryV3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersV3.length; i++){
			if(lettersV3[i].equalsIgnoreCase(value)){
				return lettersV3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersV3.length; i++){
			if(lettersV3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}