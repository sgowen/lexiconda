package com.technegames.dict.G;

import com.technegames.framework.Dictionary;

public class DictionaryG3 implements Dictionary{
	private static String[] lettersG3 = { "giant", "giantess", "giantism", "giantkiller", "giantkillers", "giants", "gibber", "gibbered", "gibbering", "gibberish", "gibbet", "gibbets", "gibbon", "gibbons", "gibbous", "gibed", "gibes", "giblets", "giddier", "giddiest", "giddily", "giddiness", "giddy", "gift", "gifted", "gifting", "gifts", "giftware", "gig", "gigabytes", "gigantic", "gigantically", "gigavolt", "giggle", "giggled", "giggles", "giggling", "giggly", "gigolo", "gilded", "gilders", "gilding", "gilds", "gill", "gillie", "gills", "gilt", "giltedged", "gilts", "gimcrack", "gimlet", "gimlets", "gimmick", "gimmickry", "gimmicks", "gimmicky", "gin", "ginger", "gingerbread", "gingerly", "gingers", "gingery", "gingham", "gingivitis", "gins", "ginseng", "gipsies", "gipsy", "giraffe", "giraffes", "gird", "girded", "girder", "girders", "girding", "girdle", "girdled", "girdles", "girdling", "girl", "girlfriend", "girlfriends", "girlhood", "girlie", "girlish", "girlishly", "girlishness", "girls", "giro", "girt", "girth", "girths", "gist", "give", "giveaway", "given", "giver", "givers", "gives", "giving", "givings", "gizzard", "glace", "glacial", "glacially", "glaciated", "glaciation", "glaciations", "glacier", "glaciers", "glaciological", "glaciologist", "glaciologists", "glaciology", "glad", "gladden", "gladdened", "gladdening", "gladdens", "gladder", "gladdest", "glade", "glades", "gladiator", "gladiatorial", "gladiators", "gladioli", "gladiolus", "gladly", "gladness", "glamorous", "glamour", "glance", "glanced", "glances", "glancing", "gland", "glands", "glandular", "glans", "glare", "glared", "glares", "glaring", "glaringly", "glasgow", "glasnost", "glass", "glassed", "glasses", "glassful", "glasshouse", "glasshouses", "glassier", "glassiest", "glassless", "glassware", "glassy", "glaucoma", "glaucous", "glaze", "glazed", "glazer", "glazes", "glazier", "glaziers", "glazing", "gleam", "gleamed", "gleaming", "gleams", "glean", "gleaned", "gleaning", "gleanings", "gleans", "glebe", "glee", "gleeful", "gleefully", "gleefulness", "glen", "glenn", "glens", "glia", "glib", "glibly", "glibness", "glide", "glided", "glider", "gliders", "glides", "gliding", "glim", "glimmer", "glimmered", "glimmering", "glimmerings", "glimmers", "glimpse", "glimpsed", "glimpses", "glimpsing", "glint", "glinted", "glinting", "glints", "glisten", "glistened", "glistening", "glistens", "glitter", "glittered", "glittering", "glitters", "glittery", "glitzy", "gloaming", "gloat", "gloated", "gloating", "glob", "global", "globalisation", "globally", "globe", "globed", "globes", "globetrotters", "globetrotting", "globose", "globular", "globule", "globules", "gloom", "gloomful", "gloomier", "gloomiest", "gloomily", "gloominess", "glooms", "gloomy", "gloried", "glories", "glorification", "glorified", "glorifies", "glorify", "glorifying", "glorious", "gloriously", "glory", "glorying", "gloss", "glossaries", "glossary", "glossed", "glosses", "glossier", "glossiest", "glossily", "glossing", "glossy", "glottal", "glove", "gloved", "gloves", "glow", "glowed", "glower", "glowered", "glowering", "glowers", "glowing", "glowingly", "glows", "glowworm", "glowworms", "glucose", "glue", "glued", "glueing", "glues", "gluey", "gluing", "glum", "glumly", "gluon", "glut", "glutamate", "gluten", "glutinous", "glutted", "glutton", "gluttonous", "gluttons", "gluttony", "glycerine", "glycerol", "glycine", "glycol", "glyph", "glyphs", "gnarl", "gnarled", "gnarling", "gnarls", "gnash", "gnashed", "gnashes", "gnashing", "gnat", "gnats", "gnaw", "gnawed", "gnawer", "gnawers", "gnawing", "gnaws", "gneiss", "gnome", "gnomes", "gnomic", "gnostic", "gnosticism", "gnu", "gnus" };
	private int searchIndex;
	
	public DictionaryG3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersG3.length; i++){
			if(lettersG3[i].equalsIgnoreCase(value)){
				return lettersG3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersG3.length; i++){
			if(lettersG3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}