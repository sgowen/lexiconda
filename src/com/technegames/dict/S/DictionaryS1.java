package com.technegames.dict.S;

import com.technegames.framework.Dictionary;

public class DictionaryS1 implements Dictionary{
	private static String[] lettersS1 = { "sabbat", "sabbath", "sabbaths", "sabbatical", "sabbaticals", "saber", "sable", "sables", "sabotage", "sabotaged", "sabotages", "sabotaging", "saboteur", "saboteurs", "sabra", "sabras", "sabre", "sabres", "sabretoothed", "sac", "saccharides", "saccharin", "saccharine", "sacerdotal", "sachet", "sachets", "sack", "sackcloth", "sacked", "sackful", "sackfuls", "sacking", "sacks", "sacral", "sacrament", "sacramental", "sacraments", "sacred", "sacredly", "sacredness", "sacrifice", "sacrificed", "sacrifices", "sacrificial", "sacrificing", "sacrilege", "sacrilegious", "sacristy", "sacrosanct", "sacrum", "sacs", "sad", "sadden", "saddened", "saddening", "saddens", "sadder", "saddest", "saddle", "saddlebag", "saddlebags", "saddled", "saddler", "saddlers", "saddles", "saddling", "sadism", "sadist", "sadistic", "sadistically", "sadists", "sadly", "sadness", "sadomasochism", "sadomasochistic", "sadsack", "safari", "safaris", "safe", "safeguard", "safeguarded", "safeguarding", "safeguards", "safely", "safeness", "safer", "safes", "safest", "safeties", "safety", "saffron", "sag", "saga", "sagacious", "sagaciously", "sagacity", "sagas", "sage", "sagely", "sages", "sagest", "sagged", "sagging", "sago", "sags", "sahara", "sahib", "said", "saigon", "sail", "sailcloth", "sailed", "sailer", "sailing", "sailings", "sailmaker", "sailor", "sailors", "sails", "saint", "sainted", "sainthood", "saintlier", "saintliest", "saintliness", "saintly", "saints", "saipan", "sake", "sakes", "saki", "salaam", "salacious", "salad", "salads", "salamander", "salamanders", "salami", "salamis", "salaried", "salaries", "salary", "sale", "saleability", "saleable", "salem", "sales", "salesgirl", "salesman", "salesmanship", "salesmen", "salespeople", "salesperson", "saleswoman", "salicylic", "salience", "salient", "saline", "salinity", "saliva", "salivary", "salivas", "salivate", "salivating", "salivation", "salivations", "sallied", "sallies", "sallow", "sally", "sallying", "salmon", "salmonella", "salmons", "salome", "salon", "salons", "saloon", "saloons", "salsa", "salt", "salted", "saltier", "saltiest", "saltiness", "saltpetre", "salts", "saltwater", "salty", "salubrious", "salubrity", "salutary", "salutation", "salutations", "salute", "saluted", "salutes", "saluting", "salvage", "salvageable", "salvaged", "salvager", "salvages", "salvaging", "salvation", "salve", "salved", "salver", "salvers", "salving", "salvo", "sam", "samba", "sambas", "same", "sameness", "samizdat", "samoa", "samosas", "samovar", "sampan", "sample", "sampled", "sampler", "samplers", "samples", "sampling", "samplings", "samurai", "san", "sanatorium", "sanctification", "sanctified", "sanctifies", "sanctify", "sanctifying", "sanctimonious", "sanction", "sanctioned", "sanctioning", "sanctions", "sanctity", "sanctuaries", "sanctuary", "sanctum", "sand", "sandal", "sandalled", "sandals", "sandalwood", "sandbag", "sandbagged", "sandbags", "sandbank", "sandbanks", "sandcastle", "sandcastles", "sanddune", "sanded", "sander", "sandier", "sandiest", "sanding", "sandman", "sandpaper", "sandpapering", "sandpiper", "sandpipers", "sandpit", "sands", "sandstone", "sandstones", "sandwich", "sandwiched", "sandwiches", "sandwiching", "sandy", "sane", "sanely", "saner", "sanest", "sang", "sanguine", "sanitary", "sanitation", "sanitise", "sanitised", "sanitiser", "sanitisers", "sanity", "sank", "sanserif", "sanskrit", "santiago", "sap", "sapient", "sapling", "saplings", "sapped", "sapper", "sappers", "sapphire", "sapphires", "sapping", "saps", "sarcasm", "sarcasms", "sarcastic", "sarcastically", "sarcoma", "sarcophagi", "sarcophagus", "sardine", "sardines", "sardinia", "sardonic", "sardonically", "sarge", "sari", "saris", "sarong", "sartorial", "sartorially", "sash", "sashes", "sat", "satan", "satanic", "satanically", "satanism", "satchel", "satchels", "sated", "satellite", "satellites", "satiate", "satiated", "satiation", "satin", "sating", "satins", "satinwood", "satiny", "satire", "satires", "satiric", "satirical", "satirically", "satirise", "satirised", "satirises", "satirising", "satirist", "satirists", "satisfaction", "satisfactions", "satisfactorily", "satisfactory", "satisfiable", "satisfied", "satisfies", "satisfy", "satisfying", "satisfyingly", "satrap", "satraps", "satsumas", "saturate", "saturated", "saturates", "saturating", "saturation", "saturday", "saturn", "saturnalia", "saturnine", "satyr", "satyric", "satyrs", "sauce", "saucepan", "saucepans", "saucer", "saucers", "sauces", "saucier", "sauciest", "saucily", "sauciness", "saucy", "saudi", "saudis", "sauerkraut", "sauna", "saunas", "saunter", "sauntered", "sauntering", "saunters", "sausage", "sausages", "saute", "savage", "savaged", "savagely", "savagery", "savages", "savaging", "savanna", "savannah", "savant", "savants", "save", "saved", "saveloy", "saver", "savers", "saves", "saving", "savings", "saviour", "saviours", "savour", "savoured", "savouring", "savours", "savoury", "savvy", "saw", "sawdust", "sawed", "sawing", "sawmill", "sawmills", "sawn", "saws", "sawtooth", "sawyer", "sawyers", "saxon", "saxons", "saxony", "saxophone", "saxophones", "saxophonist", "say", "saying", "sayings", "says", "scab", "scabbard", "scabbards", "scabbed", "scabby", "scabies", "scabs", "scaffold", "scaffolding", "scaffolds", "scalability", "scalable", "scalar", "scalars", "scald", "scalded", "scalding", "scalds", "scale", "scaled", "scalene", "scales", "scaling", "scallop", "scalloped", "scallops", "scalp", "scalped", "scalpel", "scalpels", "scalping", "scalps", "scaly", "scam", "scamp", "scamped", "scamper", "scampered", "scampering", "scampi", "scams", "scan", "scandal", "scandalise", "scandalised", "scandalous", "scandalously", "scandals", "scanned", "scanner", "scanners", "scanning", "scans", "scansion", "scant", "scantier", "scantiest", "scantily", "scantiness", "scanty", "scape", "scapegoat", "scapegoats", "scapula", "scar", "scarab", "scarce", "scarcely", "scarceness", "scarcer", "scarcest", "scarcities", "scarcity", "scare", "scarecrow", "scarecrows", "scared", "scaremonger", "scaremongering", "scares", "scarf", "scarfs", "scarier", "scariest", "scarified", "scarify", "scarifying", "scarily", "scaring", "scarlet", "scarlets", "scarp", "scarred", "scarring", "scars", "scarves", "scary", "scat", "scathe", "scathed", "scathing", "scathingly", "scatological", "scatter", "scattered", "scatterer", "scatterers", "scattering", "scatterings", "scatters", "scavenge", "scavenged", "scavenger", "scavengers", "scavenging", "scenario", "scene", "scenery", "scenes", "scenic", "scenically", "scent", "scented", "scenting", "scentless", "scents", "sceptic", "sceptical", "sceptically", "scepticism", "sceptics", "sceptre", "sceptred", "sceptres", "schedule", "scheduled", "scheduler", "schedulers", "schedules", "scheduling", "schema", "schemas", "schemata", "schematic", "schematically", "schematics", "scheme", "schemed", "schemer", "schemes", "scheming", "scherzi", "scherzo", "schism", "schismatic", "schismatics", "schisms", "schist", "schistosomiasis", "schists", "schizoid", "schizophrenia", "schizophrenic", "schizophrenically", "schizophrenics", "schmalz", "schnapps", "scholar", "scholarly", "scholars", "scholarship", "scholarships", "scholastic", "scholasticism", "school", "schoolboy", "schoolboys", "schoolchild", "schoolchildren", "schooldays", "schooled", "schoolgirl", "schoolgirls", "schoolhouse", "schooling", "schoolmaster", "schoolmasters", "schoolmates", "schoolmistress", "schoolroom", "schools", "schoolteacher", "schoolteachers", "schooner", "schooners", "schwa", "schwas", "sciatica", "science", "sciences", "scientific", "scientifically", "scientist", "scientists", "scifi", "scimitar", "scimitars", "scintigraphy", "scintillate", "scintillated", "scintillating", "scintillation", "scintillations", "scintillator", "scintillators", "scissor", "scissored", "scissors", "sclerosis", "scoff", "scoffed", "scoffing", "scold", "scolded", "scolder", "scolding", "scolds", "scone", "scones", "scoop", "scooped", "scooper", "scoopful", "scooping", "scoops", "scoot", "scooter", "scooters", "scooting", "scoots", "scope", "scopes", "scorch", "scorched", "scorcher", "scorches", "scorching", "score", "scoreboard", "scoreboards", "scorecard", "scorecards", "scored", "scoreless", "scoreline", "scorer", "scorers", "scores", "scoring", "scorn", "scorned", "scornful", "scornfully", "scorning", "scorns", "scorpion", "scorpions", "scot", "scotch", "scotched", "scotches", "scotfree", "scotland", "scots", "scotsman", "scottish", "scoundrel", "scoundrels", "scour", "scoured", "scourge", "scourged", "scourges", "scourging", "scouring", "scours", "scout", "scouted", "scouting", "scoutmaster", "scoutmasters", "scouts", "scowl", "scowled", "scowling", "scowls", "scrabble", "scrabbled", "scrabbling", "scram", "scramble", "scrambled", "scrambler", "scramblers", "scrambles", "scrambling", "scrams", "scrap", "scrapbook", "scrapbooks", "scrape", "scraped", "scraper", "scrapers", "scrapes", "scrapie", "scraping", "scrapings", "scrapped", "scrappier", "scrappiest", "scrapping", "scrappy", "scraps", "scrapyard", "scrapyards", "scratch", "scratched", "scratches", "scratchier", "scratchiest", "scratchiness", "scratching", "scratchings", "scratchy", "scrawl", "scrawled", "scrawling", "scrawls", "scrawnier", "scrawniest", "scrawny", "scream", "screamed", "screamer", "screamers", "screaming", "screamingly", "screams", "scree", "screech", "screeched", "screeches", "screechier", "screechiest", "screeching", "screechy", "screed", "screeds", "screen", "screened", "screening", "screenings", "screenplay", "screenplays", "screens", "screenwriter", "screw", "screwdriver", "screwdrivers", "screwed", "screwing", "screws", "screwy", "scribal", "scribble", "scribbled", "scribbler", "scribblers", "scribbles", "scribbling", "scribblings", "scribe", "scribed", "scribes", "scribing", "scrimped", "script", "scripted", "scripting", "scriptorium", "scripts", "scriptural", "scripture", "scriptures", "scriptwriter", "scriptwriters", "scriptwriting", "scroll", "scrollable", "scrolled", "scrolling", "scrolls", "scrooge", "scrooges", "scrotum", "scrub", "scrubbed", "scrubber", "scrubbers", "scrubbing", "scrubby", "scrubland", "scrubs", "scruff", "scruffier", "scruffy", "scrum", "scrumhalf", "scrummage", "scrummaging", "scrums", "scrunched", "scruple", "scruples", "scrupulous", "scrupulously", "scrupulousness", "scrutineers", "scrutinies", "scrutinise", "scrutinised", "scrutinises", "scrutinising", "scrutiny", "scuba", "scubas", "scud", "scudded", "scudding", "scuds", "scuff", "scuffed", "scuffing", "scuffle", "scuffled", "scuffles", "scuffling", "scull", "sculled", "sculler", "sculleries", "scullery", "sculling", "sculls", "sculpt", "sculpted", "sculpting", "sculptor", "sculptors", "sculptress", "sculptural", "sculpture", "sculptured", "sculptures", "scum", "scupper", "scuppered", "scurried", "scurries", "scurrilous", "scurry", "scurrying", "scurryings", "scurvy", "scuttle", "scuttled", "scuttles", "scuttling", "scythe", "scythed", "scythes", "scything" };
	private int searchIndex;
	
	public DictionaryS1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersS1.length; i++){
			if(lettersS1[i].equalsIgnoreCase(value)){
				return lettersS1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersS1.length; i++){
			if(lettersS1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}