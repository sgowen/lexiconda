package com.technegames.dict.B;

import com.technegames.framework.Dictionary;

public class DictionaryB5 implements Dictionary{
	private static String[] lettersB5 = { "bub", "bubble", "bubbled", "bubblegum", "bubbles", "bubblier", "bubbliest", "bubbling", "bubbly", "bubonic", "buccaneer", "buccaneering", "buccaneers", "buck", "bucked", "bucket", "bucketful", "bucketfuls", "bucketing", "buckets", "bucking", "buckle", "buckled", "buckler", "bucklers", "buckles", "buckling", "buckminsterfullerene", "buckpassing", "bucks", "buckshot", "buckskin", "bucolic", "bud", "budapest", "budded", "buddhism", "buddhist", "buddies", "budding", "buddings", "buddy", "budge", "budged", "budgerigar", "budget", "budgetary", "budgeted", "budgeting", "budgets", "budgie", "budgies", "budging", "buds", "buff", "buffalo", "buffer", "buffered", "buffering", "buffers", "buffet", "buffeted", "buffeting", "buffetings", "buffets", "buffing", "buffoon", "buffoonery", "buffoons", "buffs", "bug", "bugbear", "bugbears", "bugeyed", "bugged", "bugger", "buggered", "buggering", "buggers", "buggery", "buggies", "bugging", "buggy", "bugle", "bugler", "buglers", "bugles", "bugs", "build", "builder", "builders", "building", "buildings", "builds", "buildup", "buildups", "built", "builtin", "builtup", "bulb", "bulbous", "bulbs", "bulgaria", "bulge", "bulged", "bulges", "bulging", "bulgy", "bulimia", "bulimic", "bulk", "bulkhead", "bulkheads", "bulkier", "bulkiest", "bulks", "bulky", "bull", "bulldog", "bulldogs", "bulldoze", "bulldozed", "bulldozer", "bulldozers", "bulldozing", "bullet", "bulletin", "bulletins", "bulletproof", "bullets", "bullfight", "bullfighting", "bullfinch", "bullfrog", "bullied", "bullies", "bullion", "bullish", "bullock", "bullocks", "bulls", "bully", "bullying", "bulrushes", "bulwark", "bulwarks", "bum", "bumble", "bumbled", "bumbler", "bumblers", "bumbles", "bumbling", "bump", "bumped", "bumper", "bumpers", "bumpier", "bumpiest", "bumping", "bumpkin", "bumpkins", "bumps", "bumptious", "bumpy", "bums", "bun", "bunch", "bunched", "bunches", "bunching", "bundle", "bundled", "bundles", "bundling", "bung", "bungalow", "bungalows", "bungee", "bungle", "bungled", "bungler", "bunglers", "bungles", "bungling", "bunion", "bunions", "bunk", "bunked", "bunker", "bunkered", "bunkers", "bunks", "bunkum", "bunnies", "bunny", "buns", "bunting", "bunyan", "buoy", "buoyancy", "buoyant", "buoyantly", "buoyed", "buoys", "bur", "burble", "burbled", "burbles", "burbling", "burden", "burdened", "burdening", "burdens", "burdensome", "burdock", "bureau", "bureaucracies", "bureaucracy", "bureaucrat", "bureaucratic", "bureaucratically", "bureaucratisation", "bureaucrats", "bureaus", "bureaux", "burette", "burg", "burgeon", "burgeoned", "burgeoning", "burgeons", "burger", "burgers", "burghers", "burglar", "burglaries", "burglars", "burglary", "burgle", "burgled", "burgles", "burgling", "burgundy", "burial", "burials", "buried", "buries", "burlesque", "burlesquing", "burlier", "burliest", "burly", "burma", "burmese", "burn", "burned", "burner", "burners", "burning", "burnings", "burnished", "burnishing", "burns", "burnt", "burp", "burped", "burping", "burps", "burr", "burrow", "burrowed", "burrowing", "burrows", "burs", "bursar", "bursaries", "bursars", "bursary", "burst", "bursted", "bursting", "bursts", "burundi", "bury", "burying", "bus", "buses", "bush", "bushel", "bushels", "bushes", "bushfire", "bushier", "bushiest", "bushiness", "bushing", "bushland", "bushman", "bushmen", "bushy", "busied", "busier", "busies", "busiest", "busily", "business", "businesses", "businesslike", "businessman", "businessmen", "businesswoman", "busk", "busker", "buskers", "busking", "busman", "busmen", "bussed", "bussing", "bust", "bustard", "bustards", "busted", "busters", "bustier", "busting", "bustle", "bustled", "bustles", "bustling", "busts", "busty", "busy", "busybodies", "busybody", "busying", "but", "butane", "butcher", "butchered", "butchering", "butchers", "butchery", "butler", "butlers", "buts", "butt", "butted", "butter", "buttercup", "buttercups", "buttered", "butterfat", "butterflies", "butterfly", "buttering", "buttermilk", "butters", "butterscotch", "buttery", "butting", "buttock", "buttocks", "button", "buttoned", "buttonhole", "buttonholed", "buttonholes", "buttoning", "buttons", "buttress", "buttressed", "buttresses", "buttressing", "butts", "buxom", "buy", "buyer", "buyers", "buying", "buyout", "buys", "buzz", "buzzard", "buzzards", "buzzed", "buzzer", "buzzers", "buzzes", "buzzing", "buzzwords", "by", "bye", "byebye", "byelaw", "byelaws", "byelection", "byelections", "byes", "bygone", "bygones", "bylaw", "bylaws", "byline", "bypass", "bypassed", "bypasses", "bypassing", "bypath", "bypaths", "byproduct", "byproducts", "bystander", "bystanders", "byte", "bytes", "byway", "byways", "byword" };
	private int searchIndex;
	
	public DictionaryB5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersB5.length; i++){
			if(lettersB5[i].equalsIgnoreCase(value)){
				return lettersB5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersB5.length; i++){
			if(lettersB5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}