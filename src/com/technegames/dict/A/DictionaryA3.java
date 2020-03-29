package com.technegames.dict.A;

import com.technegames.framework.Dictionary;

public class DictionaryA3 implements Dictionary{
	private static String[] lettersA3 = { "aid", "aide", "aided", "aidedecamp", "aider", "aiders", "aides", "aidesdecamp", "aiding", "aids", "ail", "aileron", "ailerons", "ailing", "ailment", "ailments", "ails", "aim", "aimed", "aimer", "aiming", "aimless", "aimlessly", "aimlessness", "aims", "aint", "air", "airbase", "airborne", "airbrush", "airbus", "airconditioned", "airconditioner", "airconditioning", "aircraft", "aircrew", "aircrews", "aire", "aired", "airfield", "airfields", "airflow", "airforce", "airframe", "airframes", "airgun", "airier", "airiest", "airily", "airiness", "airing", "airings", "airless", "airlift", "airlifted", "airlifting", "airlifts", "airline", "airliner", "airliners", "airlines", "airlock", "airlocks", "airmail", "airman", "airmen", "airplane", "airplay", "airport", "airports", "airraid", "airs", "airship", "airships", "airsick", "airsickness", "airspace", "airstream", "airstrip", "airstrips", "airtight", "airtime", "airwave", "airwaves", "airway", "airways", "airworthiness", "airworthy", "airy", "aisle", "aisles", "aitches", "ajar", "akimbo", "akin", "ala", "alabama", "alabaster", "alacarte", "alack", "alacrity", "aladdin", "alanine", "alarm", "alarmed", "alarming", "alarmingly", "alarmism", "alarmist", "alarms", "alas", "alaska", "alaskan", "alb", "albania", "albany", "albatross", "albatrosses", "albeit", "albinism", "albino", "album", "albumen", "albumin", "albums", "alchemical", "alchemist", "alchemists", "alchemy", "alcohol", "alcoholic", "alcoholics", "alcoholism", "alcohols", "alcove", "alcoves", "aldehyde", "aldehydes", "alder", "alderman", "aldermen", "aldrin", "ale", "alehouse", "alembic", "alert", "alerted", "alerting", "alertly", "alertness", "alerts", "ales", "alfalfa", "alfatah", "alga", "algae", "algal", "algebra", "algebraic", "algebraical", "algebraically", "algebraist", "algebras", "algeria", "algerian", "algiers", "algorithm", "algorithmic", "algorithmically", "algorithms", "alias", "aliases", "alibaba", "alibi", "alibis", "alien", "alienate", "alienated", "alienates", "alienating", "alienation", "aliened", "aliening", "aliens", "alight", "alighted", "alighting", "alights", "align", "aligned", "aligning", "alignment", "alignments", "aligns", "alike", "alimentary", "alimony", "aline", "alined", "alines", "alining", "aliphatic", "aliquot", "aliquots", "alive", "alkali", "alkalic", "alkaline", "alkalinity", "alkalis", "alkalise", "alkaloid", "alkaloids", "alkanes", "alkyl", "all", "allay", "allayed", "allaying", "allays", "allegation", "allegations", "allege", "alleged", "allegedly", "alleges", "allegiance", "allegiances", "alleging", "allegorical", "allegorically", "allegories", "allegory", "allegri", "allegro", "allele", "alleles", "allelic", "allergen", "allergens", "allergic", "allergies", "allergy", "alleviate", "alleviated", "alleviates", "alleviating", "alleviation", "alleviations", "alley", "alleys", "alleyway", "alleyways", "alliance", "alliances", "allied", "allies", "alligator", "alligators", "alliterate", "alliterated", "alliterating", "alliteration", "alliterations", "alliterative", "allocatable", "allocate", "allocated", "allocates", "allocating", "allocation", "allocations", "allocator", "allocators", "allophones", "allot", "allotment", "allotments", "allotrope", "allotropic", "allots", "allotted", "allotting", "allow", "allowable", "allowance", "allowances", "allowed", "allowing", "allows", "alloy", "alloyed", "alloying", "alloys", "allude", "alluded", "alludes", "alluding", "allure", "allured", "allurement", "allurements", "allures", "alluring", "alluringly", "allusion", "allusions", "allusive", "alluvia", "alluvial", "alluvium", "ally", "allying", "almanac", "almanacs", "almighty", "almond", "almonds", "almost", "alms", "almshouse", "almshouses", "aloe", "aloes", "aloft", "aloha", "alone", "aloneness", "along", "alongside", "aloof", "aloofness", "aloud", "alp", "alpaca", "alpacas", "alpha", "alphabet", "alphabetic", "alphabetical", "alphabetically", "alphabets", "alphanumeric", "alphas", "alpine", "alps", "already", "alright", "also", "alt", "altar", "altarpiece", "altarpieces", "altars", "alter", "alterable", "alteration", "alterations", "altercate", "altercation", "altercations", "altered", "alterego", "altering", "alternate", "alternated", "alternately", "alternates", "alternating", "alternation", "alternations", "alternative", "alternatively", "alternatives", "alternator", "alternators", "alters", "although", "altimeter", "altimeters", "altitude", "altitudes", "alto", "altogether", "altruism", "altruist", "altruistic", "altruistically", "alts", "alum", "aluminium", "aluminum", "alumni", "alumnus", "alveolar", "alveoli", "always", "am", "amalgam", "amalgamate", "amalgamated", "amalgamates", "amalgamating", "amalgamation", "amalgamations", "amalgams", "amanuensis", "amass", "amassed", "amasses", "amassing", "amateur", "amateurish", "amateurishly", "amateurishness", "amateurism", "amateurs", "amatory", "amaze", "amazed", "amazement", "amazes", "amazing", "amazingly", "amazon", "amazons", "ambassador", "ambassadorial", "ambassadors", "amber", "ambergris", "ambiance", "ambidextrous", "ambience", "ambient", "ambiguities", "ambiguity", "ambiguous", "ambiguously", "ambit", "ambition", "ambitions", "ambitious", "ambitiously", "ambivalence", "ambivalent", "ambivalently", "amble", "ambled", "ambler", "ambles", "ambling", "ambrosia", "ambulance", "ambulances", "ambulant", "ambulate", "ambulatory", "ambuscade", "ambuscades", "ambush", "ambushed", "ambushers", "ambushes", "ambushing", "ameliorate", "ameliorated", "ameliorates", "ameliorating", "amelioration", "amen", "amenability", "amenable", "amend", "amendable", "amended", "amending", "amendment", "amendments", "amends", "amenities", "amenity", "amenorrhoea", "amens", "america", "american", "americans", "americium", "amethyst", "amethystine", "amethysts", "amiability", "amiable", "amiableness", "amiably", "amicability", "amicable", "amicably", "amid", "amide", "amidships", "amidst", "amigo", "amine", "amines", "amino", "amir", "amiss", "amity", "amman", "ammeter", "ammeters", "ammo", "ammonia", "ammonites", "ammonium", "ammunition", "amnesia", "amnesiac", "amnesic", "amnesties", "amnesty", "amniotic", "amoeba", "amoebae", "amoebic", "amok", "among", "amongst", "amoral", "amorality", "amorist", "amorous", "amorously", "amorphous", "amortisation", "amortise", "amortised", "amount", "amounted", "amounting", "amounts", "amour", "amours", "amp", "ampere", "amperes", "ampersand", "ampersands", "amphetamine", "amphetamines", "amphibia", "amphibian", "amphibians", "amphibious", "amphitheatre", "amphitheatres", "amphora", "ample", "ampler", "amplification", "amplifications", "amplified", "amplifier", "amplifiers", "amplifies", "amplify", "amplifying", "amplitude", "amplitudes", "amply", "ampoules", "amps", "ampule", "ampules", "ampuls", "amputate", "amputated", "amputating", "amputation", "amputations", "amputee", "amputees", "amuck", "amulet", "amulets", "amuse", "amused", "amusement", "amusements", "amuses", "amusing", "amusingly", "an", "ana", "anabolic", "anachronism", "anachronisms", "anachronistic", "anachronistically", "anaconda", "anacondas", "anaemia", "anaemic", "anaerobic", "anaerobically", "anaesthesia", "anaesthetic", "anaesthetics", "anaesthetise", "anaesthetised", "anaesthetising", "anaesthetist", "anaesthetists", "anagram", "anagrammatic", "anagrammatically", "anagrams", "anal", "analgesia", "analgesic", "analgesics", "anally", "analogical", "analogies", "analogise", "analogous", "analogously", "analogue", "analogues", "analogy", "analysable", "analyse", "analysed", "analyser", "analysers", "analyses", "analysing", "analysis", "analyst", "analysts", "analytic", "analytical", "analytically", "anamorphic", "ananas", "anaphora", "anaphoric", "anarchic", "anarchical", "anarchism", "anarchist", "anarchistic", "anarchists", "anarchy", "anathema", "anatomic", "anatomical", "anatomically", "anatomies", "anatomist", "anatomists", "anatomy", "ancestor", "ancestors", "ancestral", "ancestries", "ancestry", "anchor", "anchorage", "anchorages", "anchored", "anchoring", "anchorite", "anchors", "anchovies", "anchovy", "ancient", "anciently", "ancients", "ancillary", "and", "andante", "andes", "andrew", "androgynous", "android", "androids", "anecdotal", "anecdotally", "anecdote", "anecdotes", "anechoic", "anemia", "anemic", "anemone", "anemones", "anergy", "aneroid", "aneurysm", "aneurysms", "anew", "angel", "angelic", "angelica", "angels", "angelus", "anger", "angered", "angering", "angers", "angina", "anginal", "angioplasty", "angle", "angled", "anglepoise", "angler", "anglers", "angles", "anglian", "anglican", "angling", "angola", "angolan", "angolans", "angora", "angoras", "angrier", "angriest", "angrily", "angry", "angst", "angstroms", "anguish", "anguished", "anguishes", "angular", "angularity", "anhydrous", "anil", "aniline", "animal", "animals", "animate", "animated", "animatedly", "animates", "animating", "animation", "animations", "animator", "animators", "animism", "animist", "animists", "animosities", "animosity", "animus", "anion", "anionic", "anions", "anise", "aniseed", "aniseeds", "anisotropic", "anisotropies", "anisotropy", "ankara", "ankle", "ankles", "anklet", "anklets", "anna", "annal", "annals", "anneal", "annealed", "annealer", "annealing", "annex", "annexation", "annexations", "annexe", "annexed", "annexes", "annexing", "annihilate", "annihilated", "annihilates", "annihilating", "annihilation", "anniversaries", "anniversary", "annotate", "annotated", "annotates", "annotating", "annotation", "annotations", "announce", "announced", "announcement", "announcements", "announcer", "announcers", "announces", "announcing", "annoy", "annoyance", "annoyances", "annoyed", "annoyer", "annoyers", "annoying", "annoyingly", "annoys", "annual", "annualised", "annually", "annuals", "annuities", "annuity", "annul", "annular", "annuli", "annulled", "annulling", "annulment", "annuls", "annulus", "annunciation", "anode", "anodes", "anodised", "anodyne", "anoint", "anointed", "anointing", "anoints", "anomalies", "anomalous", "anomalously", "anomaly", "anomic", "anon", "anonym", "anonymity", "anonymous", "anonymously", "anonyms", "anorak", "anoraks", "anorexia", "anorexic", "another", "answer", "answerable", "answered", "answerer", "answering", "answers", "ant", "antacid", "antacids", "antagonise", "antagonised", "antagonises", "antagonising", "antagonism", "antagonisms", "antagonist", "antagonistic", "antagonists", "ante", "anteater", "anteaters", "antecedent", "antecedents", "antechamber", "antedate", "antedates", "antedating", "antediluvian", "antelope", "antelopes", "antenatal", "antenna", "antennae", "antennas", "anterior", "anteriorly", "anteroom", "anthem", "anthems", "anther", "anthologies", "anthologise", "anthologised", "anthology", "anthracite", "anthrax", "anthropic", "anthropocentric", "anthropogenic", "anthropogenically", "anthropoid", "anthropological", "anthropologist", "anthropologists", "anthropology", "anthropometric", "anthropomorphic", "anthropomorphising", "anthropomorphism", "anti", "antiabortionists", "antiaircraft", "antibiotic", "antibiotics", "antibodies", "antibody", "antic", "anticipate", "anticipated", "anticipates", "anticipating", "anticipation", "anticipations", "anticipative", "anticipatory", "anticlimax", "anticlockwise", "anticoagulants", "anticonstitutional", "antics", "anticyclone", "antidepressant", "antidepressants", "antidote", "antidotes", "antifreeze", "antigen", "antigenic", "antigens", "antihistamines", "antilope", "antimatter", "antimony", "antioxidants", "antiparticles", "antipathetic", "antipathies", "antipathy", "antipodes", "antiquarian", "antiquarianism", "antiquarians", "antiquaries", "antiquary", "antiquated", "antique", "antiques", "antiquities", "antiquity", "antiseptic", "antiseptics", "antisocial", "antistatic", "antisymmetric", "antisymmetry", "antitheses", "antithesis", "antithetic", "antithetical", "antithetically", "antitrust", "antiviral", "antler", "antlers", "antlion", "antlions", "antonym", "antonyms", "antral", "antrum", "ants", "antwerp", "anus", "anvil", "anvils", "anxieties", "anxiety", "anxious", "anxiously", "any", "anybody", "anyhow", "anymore", "anyone", "anyplace", "anything", "anyway", "anyways", "anywhere" };
	private int searchIndex;
	
	public DictionaryA3(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersA3.length; i++){
			if(lettersA3[i].equalsIgnoreCase(value)){
				return lettersA3[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersA3.length; i++){
			if(lettersA3[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}