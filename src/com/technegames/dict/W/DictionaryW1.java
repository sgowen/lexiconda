package com.technegames.dict.W;

import com.technegames.framework.Dictionary;

public class DictionaryW1 implements Dictionary{
	private static String[] lettersW1 = { "wackier", "wacky", "wad", "wadding", "waddle", "waddled", "waddles", "waddling", "wade", "waded", "wader", "waders", "wades", "wadi", "wading", "wadings", "wadis", "wads", "wafer", "wafers", "waffle", "waffled", "waffles", "waft", "wafted", "wafting", "wafts", "wafture", "wag", "wage", "waged", "wager", "wagered", "wagerer", "wagers", "wages", "wagged", "waggery", "wagging", "waggish", "waggishly", "waggle", "waggled", "waggles", "waggling", "waggly", "waggoners", "waggons", "waging", "wagon", "wagons", "wags", "wagtail", "wagtails", "waif", "waifs", "wail", "wailed", "wailer", "wailing", "wails", "wainscot", "wainscoting", "waist", "waistband", "waistcoat", "waistcoats", "waistline", "waists", "wait", "waited", "waiter", "waiters", "waiting", "waitress", "waitresses", "waits", "waive", "waived", "waiver", "waivers", "waives", "waiving", "wake", "waked", "wakeful", "wakefulness", "waken", "wakened", "wakening", "wakens", "wakes", "waking", "wales", "walk", "walkable", "walkabout", "walkabouts", "walked", "walker", "walkers", "walkietalkie", "walkietalkies", "walking", "walkout", "walkover", "walks", "walkway", "walkways", "wall", "wallabies", "wallaby", "wallchart", "walled", "wallet", "wallets", "wallflower", "wallflowers", "walling", "wallop", "wallow", "wallowed", "wallowing", "wallows", "wallpaper", "wallpapering", "wallpapers", "walls", "walltowall", "walnut", "walnuts", "walrus", "walruses", "waltz", "waltzed", "waltzes", "waltzing", "wan", "wand", "wander", "wandered", "wanderer", "wanderers", "wandering", "wanderings", "wanderlust", "wanders", "wands", "wane", "waned", "wanes", "waning", "wanly", "want", "wanted", "wanting", "wanton", "wantonly", "wantonness", "wants", "wapiti", "wapitis", "war", "warble", "warbled", "warbler", "warblers", "warbles", "warbling", "ward", "warded", "warden", "wardens", "warder", "warders", "warding", "wardrobe", "wardrobes", "wards", "wardship", "ware", "warehouse", "warehoused", "warehouseman", "warehousemen", "warehouses", "warehousing", "wares", "warfare", "warhead", "warheads", "warhorse", "warhorses", "wariest", "warily", "wariness", "waring", "warlike", "warlock", "warlocks", "warlord", "warlords", "warm", "warmblooded", "warmed", "warmer", "warmers", "warmest", "warmhearted", "warmheartedness", "warming", "warmish", "warmly", "warmness", "warmonger", "warms", "warmth", "warmup", "warn", "warned", "warners", "warning", "warningly", "warnings", "warns", "warp", "warpaint", "warpath", "warped", "warping", "warplanes", "warps", "warrant", "warranted", "warranties", "warranting", "warrants", "warranty", "warred", "warren", "warrens", "warring", "warrior", "warriors", "wars", "warsaw", "warship", "warships", "wart", "warthog", "warthogs", "wartime", "warts", "warty", "wary", "was", "wash", "washable", "washbasin", "washbasins", "washboard", "washday", "washed", "washer", "washers", "washerwoman", "washerwomen", "washes", "washing", "washings", "washington", "washout", "washstand", "washy", "wasp", "waspish", "waspishly", "wasps", "waspwaisted", "wast", "wastage", "wastages", "waste", "wasted", "wasteful", "wastefully", "wastefulness", "wasteland", "wastelands", "wastepaper", "waster", "wasters", "wastes", "wasting", "wastings", "wastrel", "watch", "watchable", "watchdog", "watchdogs", "watched", "watcher", "watchers", "watches", "watchful", "watchfully", "watchfulness", "watching", "watchmaker", "watchmakers", "watchman", "watchmen", "watchtower", "watchtowers", "watchword", "watchwords", "water", "waterbed", "waterbeds", "watercolour", "watercolourists", "watercolours", "watercooled", "watercourse", "watercourses", "watercress", "watered", "waterfall", "waterfalls", "waterfowl", "waterfront", "waterglass", "waterhole", "waterholes", "watering", "waterless", "waterline", "waterlogged", "waterloo", "waterman", "watermark", "watermarks", "watermelon", "watermelons", "watermen", "watermill", "watermills", "waterproof", "waterproofed", "waterproofing", "waterproofs", "waterresistant", "waters", "watershed", "watersheds", "waterside", "waterskiing", "watersoluble", "waterspouts", "watertable", "watertight", "waterway", "waterways", "waterwheel", "waterwheels", "waterworks", "watery", "watt", "wattage", "wattle", "watts", "wave", "waveband", "wavebands", "waved", "waveform", "waveforms", "wavefront", "waveguide", "waveguides", "wavelength", "wavelengths", "wavelet", "wavelets", "wavelike", "waver", "wavered", "waverers", "wavering", "wavers", "waves", "wavier", "waviest", "wavily", "waving", "wavings", "wavy", "wax", "waxed", "waxen", "waxes", "waxing", "waxpaper", "waxwork", "waxworks", "waxy", "way", "wayout", "ways", "wayside", "wayward", "waywardly", "waywardness" };
	private int searchIndex;
	
	public DictionaryW1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersW1.length; i++){
			if(lettersW1[i].equalsIgnoreCase(value)){
				return lettersW1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersW1.length; i++){
			if(lettersW1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}