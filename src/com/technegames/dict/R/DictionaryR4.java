package com.technegames.dict.R;

import com.technegames.framework.Dictionary;

public class DictionaryR4 implements Dictionary{
	private static String[] lettersR4 = { "roach", "roaches", "road", "roadblock", "roadblocks", "roadhouse", "roadmap", "roads", "roadshow", "roadshows", "roadside", "roadsides", "roadsigns", "roadster", "roadsweepers", "roadway", "roadways", "roadworks", "roadworthy", "roam", "roamed", "roamer", "roaming", "roams", "roan", "roar", "roared", "roarer", "roaring", "roars", "roast", "roasted", "roaster", "roasting", "roasts", "rob", "robbed", "robber", "robberies", "robbers", "robbery", "robbing", "robe", "robed", "robes", "robin", "robins", "robot", "robotic", "robotics", "robots", "robs", "robust", "robustly", "robustness", "roc", "rock", "rockbottom", "rocked", "rocker", "rockers", "rockery", "rocket", "rocketed", "rocketing", "rocketry", "rockets", "rockfall", "rockfalls", "rockier", "rockiest", "rocking", "rocks", "rocksolid", "rocky", "rococo", "rocs", "rod", "rode", "rodent", "rodents", "rodeo", "rodeos", "rods", "roe", "roebuck", "roentgen", "roes", "rogue", "roguery", "rogues", "roguish", "roguishly", "roguishness", "roister", "roistering", "role", "roles", "roll", "rollcall", "rolled", "roller", "rollercoaster", "rollers", "rollerskating", "rollicking", "rolling", "rolls", "rolypoly", "rom", "roman", "romance", "romanced", "romancer", "romances", "romancing", "romans", "romantic", "romantically", "romanticised", "romanticises", "romanticising", "romanticism", "romantics", "romany", "rome", "rommel", "romp", "romped", "romper", "romping", "romps", "romulus", "rondavel", "roo", "roof", "roofed", "roofer", "roofgarden", "roofing", "roofings", "roofless", "roofs", "rooftop", "rooftops", "rooibos", "rook", "rookeries", "rookery", "rookies", "rooks", "room", "roomful", "roomier", "roomiest", "roommate", "rooms", "roomy", "roost", "roosted", "rooster", "roosters", "roosting", "roosts", "root", "rooted", "rooting", "rootings", "rootless", "roots", "rope", "roped", "ropes", "roping", "rosaries", "rosary", "rose", "rosebud", "rosebuds", "rosebush", "rosemary", "roses", "rosette", "rosettes", "rosewood", "rosier", "rosiest", "rosily", "rosin", "roster", "rostering", "rosters", "rostrum", "rostrums", "rosy", "rot", "rota", "rotary", "rotas", "rotatable", "rotate", "rotated", "rotates", "rotating", "rotation", "rotational", "rotationally", "rotations", "rotator", "rotators", "rotatory", "rote", "rotor", "rotors", "rots", "rotted", "rotten", "rottenly", "rottenness", "rotter", "rotting", "rotund", "rotunda", "rotundity", "rouble", "roubles", "rouge", "rouged", "rouges", "rough", "roughage", "roughed", "roughen", "roughened", "roughens", "rougher", "roughest", "roughie", "roughing", "roughly", "roughness", "roughs", "roughshod", "roulette", "round", "roundabout", "roundabouts", "rounded", "roundel", "roundels", "rounder", "rounders", "roundest", "roundhouse", "rounding", "roundish", "roundly", "roundness", "rounds", "roundtheclock", "roundup", "roundups", "rouse", "roused", "rouses", "rousing", "rout", "route", "routed", "routeing", "router", "routers", "routes", "routine", "routinely", "routines", "routing", "routs", "rove", "roved", "rover", "rovers", "roves", "roving", "rovings", "row", "rowboat", "rowboats", "rowdier", "rowdiest", "rowdily", "rowdiness", "rowdy", "rowdyism", "rowed", "rower", "rowers", "rowing", "rows", "royal", "royalist", "royalists", "royally", "royals", "royalties", "royalty" };
	private int searchIndex;
	
	public DictionaryR4(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersR4.length; i++){
			if(lettersR4[i].equalsIgnoreCase(value)){
				return lettersR4[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersR4.length; i++){
			if(lettersR4[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}