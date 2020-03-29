package com.technegames.dict.G;

import com.technegames.framework.Dictionary;

public class DictionaryG2 implements Dictionary{
	private static String[] lettersG2 = { "gear", "gearbox", "gearboxes", "geared", "gearing", "gears", "gearstick", "gecko", "geek", "geeks", "geese", "geezer", "geiger", "geisha", "geishas", "gel", "gelatin", "gelatine", "gelatinous", "gelding", "geldings", "gelignite", "gelled", "gels", "gem", "gemini", "gemmed", "gems", "gemsbok", "gemstone", "gemstones", "gen", "gender", "gendered", "genderless", "genders", "gene", "genealogical", "genealogies", "genealogist", "genealogy", "genera", "general", "generalisable", "generalisation", "generalisations", "generalise", "generalised", "generalises", "generalising", "generalist", "generalists", "generalities", "generality", "generally", "generals", "generalship", "generate", "generated", "generates", "generating", "generation", "generational", "generations", "generative", "generator", "generators", "generic", "generically", "generosities", "generosity", "generous", "generously", "genes", "genesis", "genetic", "genetically", "geneticist", "geneticists", "genetics", "genets", "geneva", "genial", "geniality", "genially", "genie", "genii", "genital", "genitalia", "genitals", "genitive", "genitives", "genius", "geniuses", "genoa", "genocidal", "genocide", "genome", "genomes", "genomic", "genotype", "genotypes", "genre", "genres", "gent", "genteel", "genteelest", "genteelly", "gentians", "gentile", "gentiles", "gentility", "gentle", "gentlefolk", "gentleman", "gentlemanly", "gentlemen", "gentleness", "gentler", "gentlest", "gentling", "gently", "gentrification", "gentrified", "gentrifying", "gentry", "gents", "genuflect", "genuflections", "genuine", "genuinely", "genuineness", "genus", "geocentric", "geochemical", "geochemistry", "geodesic", "geodesics", "geographer", "geographers", "geographic", "geographical", "geographically", "geography", "geologic", "geological", "geologically", "geologist", "geologists", "geology", "geomagnetic", "geomagnetically", "geomagnetism", "geometer", "geometers", "geometric", "geometrical", "geometrically", "geometries", "geometry", "geomorphological", "geomorphologists", "geomorphology", "geophysical", "geophysicist", "geophysicists", "geophysics", "geopolitical", "george", "georgia", "geoscientific", "geostationary", "geosynchronous", "geothermal", "geranium", "geraniums", "gerbil", "gerbils", "geriatric", "geriatrics", "germ", "german", "germane", "germanic", "germanium", "germans", "germany", "germicidal", "germicides", "germinal", "germinate", "germinated", "germinating", "germination", "germs", "gerontocracy", "gerontologist", "gerontology", "gerrymander", "gerrymandered", "gerund", "gerundive", "gestalt", "gestapo", "gestate", "gestating", "gestation", "gestational", "gesticulate", "gesticulated", "gesticulating", "gesticulation", "gesticulations", "gestural", "gesture", "gestured", "gestures", "gesturing", "get", "getable", "getaway", "getrichquick", "gets", "gettable", "getter", "getting", "geyser", "geysers", "ghana", "ghanian", "ghastlier", "ghastliest", "ghastliness", "ghastly", "gherkin", "gherkins", "ghetto", "ghost", "ghosted", "ghosting", "ghostlier", "ghostliest", "ghostlike", "ghostly", "ghosts", "ghoul", "ghoulish", "ghouls" };
	private int searchIndex;
	
	public DictionaryG2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersG2.length; i++){
			if(lettersG2[i].equalsIgnoreCase(value)){
				return lettersG2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersG2.length; i++){
			if(lettersG2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}