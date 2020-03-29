package com.technegames.dict.T;

import com.technegames.framework.Dictionary;

public class DictionaryT2 implements Dictionary{
	private static String[] lettersT2 = { "tea", "teabag", "teabags", "teach", "teachable", "teacher", "teachers", "teaches", "teaching", "teachings", "teacloth", "teacup", "teacups", "teak", "teal", "team", "teamed", "teaming", "teammate", "teammates", "teams", "teamster", "teamwork", "teaparty", "teapot", "teapots", "tear", "tearaway", "teardrop", "teardrops", "tearful", "tearfully", "tearfulness", "teargas", "tearing", "tearless", "tearoom", "tearooms", "tears", "tearstained", "teas", "tease", "teased", "teaser", "teasers", "teases", "teashop", "teashops", "teasing", "teasingly", "teaspoon", "teaspoonful", "teaspoonfuls", "teaspoons", "teat", "teatime", "teatimes", "teats", "tech", "technical", "technicalities", "technicality", "technically", "technician", "technicians", "technique", "techniques", "technocracies", "technocracy", "technocrat", "technocratic", "technocrats", "technological", "technologically", "technologies", "technologist", "technologists", "technology", "technophiles", "technophobia", "technophobic", "tectonic", "tectonically", "tectonics", "ted", "teddies", "teddy", "tedious", "tediously", "tediousness", "tedium", "tediums", "teds", "tee", "teed", "teehee", "teeing", "teem", "teemed", "teeming", "teems", "teen", "teenage", "teenaged", "teenager", "teenagers", "teeniest", "teens", "teensy", "teeny", "teenyweeny", "teepee", "teepees", "tees", "teeter", "teetered", "teetering", "teeth", "teethe", "teethed", "teethes", "teething", "teethmarks", "teetotal", "teetotalism", "teetotaller", "teetotallers", "teheran", "telaviv", "telecommunication", "telecommunications", "telecommuting", "telecoms", "teleconference", "telegram", "telegrams", "telegraph", "telegraphed", "telegraphic", "telegraphing", "telegraphs", "telegraphy", "telekinesis", "telemetry", "teleological", "teleology", "telepathic", "telepathically", "telepathy", "telephone", "telephoned", "telephones", "telephonic", "telephoning", "telephonist", "telephonists", "telephony", "telephoto", "teleprinter", "teleprinters", "telesales", "telescope", "telescoped", "telescopes", "telescopic", "telescoping", "teletext", "telethon", "teletype", "teletypes", "televise", "televised", "televising", "television", "televisions", "televisual", "teleworking", "telex", "telexes", "tell", "teller", "tellers", "telling", "tellingly", "tells", "telltale", "telly", "temerity", "temper", "tempera", "temperament", "temperamental", "temperamentally", "temperaments", "temperance", "temperate", "temperately", "temperature", "temperatures", "tempered", "tempering", "tempers", "tempest", "tempests", "tempestuous", "tempi", "template", "templates", "temple", "temples", "tempo", "temporal", "temporality", "temporally", "temporaries", "temporarily", "temporary", "tempt", "temptation", "temptations", "tempted", "tempter", "tempters", "tempting", "temptingly", "temptress", "tempts", "ten", "tenability", "tenable", "tenacious", "tenaciously", "tenacity", "tenancies", "tenancy", "tenant", "tenanted", "tenantry", "tenants", "tench", "tend", "tended", "tendencies", "tendency", "tendentious", "tendentiously", "tender", "tendered", "tenderer", "tenderest", "tendering", "tenderly", "tenderness", "tenders", "tending", "tendon", "tendons", "tendril", "tendrils", "tends", "tenement", "tenements", "tenet", "tenets", "tenfold", "tenners", "tennis", "tenon", "tenor", "tenors", "tens", "tense", "tensed", "tensely", "tenseness", "tenser", "tenses", "tensest", "tensile", "tensing", "tension", "tensional", "tensioned", "tensions", "tensity", "tensor", "tensors", "tent", "tentacle", "tentacled", "tentacles", "tentative", "tentatively", "tented", "tenterhooks", "tenth", "tenths", "tents", "tenuous", "tenuously", "tenure", "tenured", "tenures", "tenurial", "tepee", "tepid", "tequila", "tercentenary", "term", "termed", "terminal", "terminally", "terminals", "terminate", "terminated", "terminates", "terminating", "termination", "terminations", "terminator", "terminators", "terming", "termini", "terminological", "terminologies", "terminology", "terminus", "termite", "termites", "termly", "terms", "tern", "ternary", "terns", "terrace", "terraced", "terraces", "terracing", "terracotta", "terraform", "terraformed", "terrain", "terrains", "terrapin", "terrapins", "terrazzo", "terrestrial", "terrible", "terribly", "terrier", "terriers", "terrific", "terrifically", "terrified", "terrifies", "terrify", "terrifying", "terrifyingly", "terrine", "territorial", "territoriality", "territorially", "territories", "territory", "terror", "terrorise", "terrorised", "terrorising", "terrorism", "terrorist", "terrorists", "terrors", "terrorstricken", "terry", "terse", "tersely", "terseness", "terser", "tertiaries", "tertiary", "tessellated", "tessellation", "tessellations", "tesseral", "test", "testability", "testable", "testament", "testamentary", "testaments", "testdrive", "testdriving", "tested", "tester", "testers", "testes", "testicle", "testicles", "testicular", "testier", "testiest", "testified", "testifies", "testify", "testifying", "testily", "testimonial", "testimonials", "testimonies", "testimony", "testiness", "testing", "testings", "testis", "testosterone", "tests", "testtube", "testy", "tetanus", "tetchily", "tetchy", "tether", "tethered", "tethering", "tethers", "tetra", "tetrachloride", "tetrahedra", "tetrahedral", "tetrahedron", "tetrahedrons", "tetrameters", "tetroxide", "texan", "texans", "texas", "text", "textbook", "textbooks", "textile", "textiles", "texts", "textual", "textuality", "textually", "textural", "texturally", "texture", "textured", "textures", "thai", "thalamus", "thalidomide", "thallium", "thames", "than", "thane", "thank", "thanked", "thankful", "thankfully", "thankfulness", "thanking", "thankless", "thanklessly", "thanks", "thanksgiving", "that", "thatch", "thatched", "thatcher", "thatchers", "thatching", "thaumaturge", "thaw", "thawed", "thawing", "thaws", "the", "theatre", "theatres", "theatrical", "theatricality", "theatrically", "theatricals", "thebes", "thee", "theft", "thefts", "their", "theirs", "theism", "theist", "theistic", "theists", "them", "themas", "thematic", "thematically", "theme", "themed", "themes", "themselves", "then", "thence", "thenceforth", "thenceforward", "theocracies", "theocracy", "theodolite", "theodolites", "theologian", "theologians", "theological", "theologically", "theologies", "theologists", "theology", "theorem", "theorems", "theoretic", "theoretical", "theoretically", "theoretician", "theoreticians", "theories", "theorisation", "theorise", "theorised", "theorises", "theorising", "theorist", "theorists", "theory", "theosophy", "therapeutic", "therapeutically", "therapies", "therapist", "therapists", "therapy", "there", "thereabouts", "thereafter", "thereby", "therefor", "therefore", "therefrom", "therein", "thereof", "thereon", "thereto", "thereunder", "thereupon", "therewith", "thermal", "thermally", "thermals", "thermochemical", "thermodynamic", "thermodynamical", "thermodynamically", "thermodynamics", "thermoelectric", "thermometer", "thermometers", "thermoplastic", "thermostat", "thermostatic", "thermostatically", "thermostats", "therms", "thesauri", "thesaurus", "these", "thesis", "thespian", "thespians", "theta", "they", "thick", "thicken", "thickened", "thickening", "thickens", "thicker", "thickest", "thicket", "thickets", "thickish", "thickly", "thickness", "thicknesses", "thickset", "thickskinned", "thief", "thieve", "thieved", "thievery", "thieves", "thieving", "thievish", "thievishness", "thigh", "thighs", "thimble", "thimbleful", "thimblefuls", "thimbles", "thin", "thine", "thing", "things", "think", "thinkable", "thinker", "thinkers", "thinking", "thinks", "thinktank", "thinly", "thinned", "thinner", "thinners", "thinness", "thinnest", "thinning", "thinnish", "thins", "third", "thirdly", "thirds", "thirst", "thirsted", "thirstier", "thirstiest", "thirstily", "thirsting", "thirsts", "thirsty", "thirteen", "thirteenth", "thirties", "thirtieth", "thirty", "this", "thistle", "thistles", "thither", "thomas", "thong", "thongs", "thor", "thoracic", "thorax", "thorium", "thorn", "thornier", "thorniest", "thorns", "thorny", "thorough", "thoroughbred", "thoroughbreds", "thoroughfare", "thoroughfares", "thoroughgoing", "thoroughly", "thoroughness", "those", "thou", "though", "thought", "thoughtful", "thoughtfully", "thoughtfulness", "thoughtless", "thoughtlessly", "thoughtlessness", "thoughtprovoking", "thoughts", "thousand", "thousandfold", "thousands", "thousandth", "thousandths", "thrall", "thrash", "thrashed", "thrasher", "thrashes", "thrashing", "thrashings", "thread", "threadbare", "threaded", "threading", "threads", "threat", "threaten", "threatened", "threatening", "threateningly", "threatens", "threats", "three", "threedimensional", "threefold", "threequarters", "threes", "threesome", "threesomes", "thresh", "threshed", "thresher", "threshers", "threshing", "threshold", "thresholds", "threw", "thrice", "thrift", "thriftier", "thriftiest", "thriftless", "thrifts", "thrifty", "thrill", "thrilled", "thriller", "thrillers", "thrilling", "thrillingly", "thrills", "thrive", "thrived", "thrives", "thriving", "throat", "throatier", "throatiest", "throatily", "throats", "throaty", "throb", "throbbed", "throbbing", "throbs", "thromboses", "thrombosis", "thrombus", "throne", "throned", "thrones", "throng", "thronged", "thronging", "throngs", "throroughly", "throttle", "throttled", "throttles", "throttling", "through", "throughout", "throughput", "throw", "throwaway", "throwback", "thrower", "throwers", "throwing", "thrown", "throws", "thrum", "thrush", "thrushes", "thrust", "thruster", "thrusters", "thrusting", "thrusts", "thud", "thudded", "thudding", "thuds", "thug", "thuggery", "thuggish", "thugs", "thumb", "thumbed", "thumbing", "thumbnail", "thumbprint", "thumbs", "thumbscrew", "thumbscrews", "thump", "thumped", "thumping", "thumps", "thunder", "thunderbolt", "thunderbolts", "thunderclap", "thunderclaps", "thundercloud", "thundered", "thunderflashes", "thundering", "thunderous", "thunderously", "thunders", "thunderstorm", "thunderstorms", "thunderstruck", "thundery", "thursday", "thus", "thwack", "thwart", "thwarted", "thwarting", "thwarts", "thy", "thyme", "thymus", "thyristor", "thyristors", "thyroid", "thyroids", "thyself" };
	private int searchIndex;
	
	public DictionaryT2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersT2.length; i++){
			if(lettersT2[i].equalsIgnoreCase(value)){
				return lettersT2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersT2.length; i++){
			if(lettersT2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}