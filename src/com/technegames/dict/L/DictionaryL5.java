package com.technegames.dict.L;

import com.technegames.framework.Dictionary;

public class DictionaryL5 implements Dictionary{
	private static String[] lettersL5 = { "luanda", "lubber", "lubbers", "lubricant", "lubricants", "lubricate", "lubricated", "lubricates", "lubricating", "lubrication", "lubricious", "lucid", "lucidity", "lucidly", "lucifer", "luck", "luckier", "luckiest", "luckily", "luckless", "lucky", "lucrative", "lucre", "ludicrous", "ludicrously", "ludicrousness", "ludo", "lug", "luggage", "lugged", "lugging", "lugs", "lugubrious", "lugubriously", "luke", "lukewarm", "lull", "lullabies", "lullaby", "lulled", "lulling", "lulls", "lulu", "lumbago", "lumbar", "lumber", "lumbered", "lumbering", "lumberjack", "lumberjacks", "lumbers", "lumen", "luminal", "luminance", "luminaries", "luminary", "luminescence", "luminescent", "luminosities", "luminosity", "luminous", "luminously", "lump", "lumped", "lumpen", "lumpier", "lumpiest", "lumpiness", "lumping", "lumpish", "lumps", "lumpy", "luna", "lunacies", "lunacy", "lunar", "lunate", "lunatic", "lunatics", "lunch", "lunched", "luncheon", "luncheons", "lunchers", "lunches", "lunching", "lunchpack", "lunchtime", "lunchtimes", "lune", "lung", "lunge", "lunged", "lunges", "lungfish", "lungful", "lungfuls", "lunging", "lungs", "lupin", "lupines", "lupins", "lur", "lurch", "lurched", "lurchers", "lurches", "lurching", "lure", "lured", "lures", "lurex", "lurid", "luridly", "luring", "lurk", "lurked", "lurker", "lurkers", "lurking", "lurks", "lusaka", "luscious", "lusciously", "lush", "lusher", "lushest", "lushness", "lust", "lusted", "lustful", "lustfully", "lustier", "lustiest", "lustily", "lusting", "lustre", "lustreless", "lustrous", "lusts", "lusty", "lute", "lutes", "luther", "lux", "luxor", "luxuriance", "luxuriant", "luxuriantly", "luxuriate", "luxuriating", "luxuries", "luxurious", "luxuriously", "luxury", "lychee", "lychees", "lye", "lying", "lymph", "lymphatic", "lymphocyte", "lymphocytes", "lymphocytic", "lymphoid", "lymphoma", "lymphomas", "lynch", "lynched", "lynches", "lynching", "lynchpin", "lynx", "lynxes", "lyon", "lyons", "lyra", "lyre", "lyres", "lyric", "lyrical", "lyrically", "lyricism", "lyricist", "lyricists", "lyrics", "lyrist", "lysine" };
	private int searchIndex;
	
	public DictionaryL5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersL5.length; i++){
			if(lettersL5[i].equalsIgnoreCase(value)){
				return lettersL5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersL5.length; i++){
			if(lettersL5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}