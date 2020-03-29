package com.technegames.dict.G;

import com.technegames.framework.Dictionary;

public class DictionaryG5 implements Dictionary{
	private static String[] lettersG5 = { "guacamole", "guanaco", "guanine", "guano", "guarantee", "guaranteed", "guaranteeing", "guarantees", "guarantor", "guarantors", "guard", "guarded", "guardedly", "guardedness", "guardhouse", "guardian", "guardians", "guardianship", "guarding", "guardroom", "guards", "guardsman", "guardsmen", "guava", "guavas", "gubernatorial", "gudgeon", "guerilla", "guerillas", "guerrilla", "guerrillas", "guess", "guessable", "guessed", "guesses", "guessing", "guesswork", "guest", "guesting", "guests", "guffaw", "guffawed", "guffaws", "guidance", "guide", "guidebook", "guidebooks", "guided", "guideline", "guidelines", "guider", "guiders", "guides", "guiding", "guidings", "guild", "guilder", "guilders", "guilds", "guile", "guileless", "guilelessness", "guillemot", "guillemots", "guillotine", "guillotined", "guillotines", "guillotining", "guilt", "guiltier", "guiltiest", "guiltily", "guiltiness", "guiltless", "guilts", "guilty", "guinea", "guineas", "guise", "guises", "guitar", "guitarist", "guitarists", "guitars", "gulf", "gulfs", "gulfwar", "gull", "gullet", "gullets", "gulley", "gulleys", "gullibility", "gullible", "gullies", "gulls", "gully", "gulp", "gulped", "gulping", "gulps", "gum", "gumboil", "gumboils", "gumboots", "gumdrop", "gumdrops", "gummed", "gumming", "gums", "gumshoe", "gumtree", "gumtrees", "gun", "gunboat", "gunboats", "gunfight", "gunfire", "gunfires", "gunite", "gunk", "gunman", "gunmen", "gunmetal", "gunned", "gunner", "gunners", "gunnery", "gunning", "gunpoint", "gunpowder", "guns", "gunship", "gunships", "gunshot", "gunshots", "gunsight", "gunsmith", "gunsmiths", "gunwale", "gunwales", "guppies", "guppy", "gurgle", "gurgled", "gurgles", "gurgling", "guru", "gurus", "gush", "gushed", "gusher", "gushes", "gushing", "gusset", "gust", "gusted", "gustier", "gustiest", "gusting", "gusto", "gusts", "gusty", "gut", "gutless", "guts", "gutsier", "gutsy", "gutted", "gutter", "guttered", "guttering", "gutters", "guttersnipe", "guttersnipes", "gutting", "guttural", "gutturally", "guy", "guys", "guzzle", "guzzled", "guzzler", "guzzlers", "guzzling", "gym", "gymkhana", "gymnasia", "gymnasium", "gymnasiums", "gymnast", "gymnastic", "gymnastics", "gymnasts", "gyms", "gynaecological", "gynaecologist", "gynaecologists", "gynaecology", "gypsies", "gypsum", "gypsy", "gyrate", "gyrated", "gyrates", "gyrating", "gyration", "gyrations", "gyro", "gyromagnetic", "gyroscope", "gyroscopes", "gyroscopic" };
	private int searchIndex;
	
	public DictionaryG5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersG5.length; i++){
			if(lettersG5[i].equalsIgnoreCase(value)){
				return lettersG5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersG5.length; i++){
			if(lettersG5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}