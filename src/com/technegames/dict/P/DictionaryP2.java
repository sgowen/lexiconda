package com.technegames.dict.P;

import com.technegames.framework.Dictionary;

public class DictionaryP2 implements Dictionary{
	private static String[] lettersP2 = { "pea", "peace", "peaceable", "peaceably", "peaceful", "peacefully", "peacefulness", "peacekeepers", "peacekeeping", "peacemaker", "peacemakers", "peacemaking", "peacetime", "peach", "peaches", "peachier", "peachiest", "peachy", "peacock", "peacocks", "peafowl", "peahens", "peak", "peaked", "peakiness", "peaking", "peaks", "peaky", "peal", "pealed", "pealing", "peals", "peanut", "peanuts", "pear", "pearl", "pearls", "pearly", "pears", "peartrees", "peas", "peasant", "peasantry", "peasants", "peat", "peatland", "peatlands", "peaty", "pebble", "pebbled", "pebbles", "pebbly", "pecan", "peccary", "peck", "pecked", "pecker", "peckers", "pecking", "peckish", "pecks", "pectin", "pectoral", "pectorals", "peculiar", "peculiarities", "peculiarity", "peculiarly", "pecuniary", "pedagogic", "pedagogical", "pedagogically", "pedagogue", "pedagogy", "pedal", "pedalled", "pedalling", "pedals", "pedant", "pedantic", "pedantically", "pedantry", "pedants", "peddle", "peddled", "peddler", "peddlers", "peddles", "peddling", "pederasts", "pedestal", "pedestals", "pedestrian", "pedestrianisation", "pedestrianised", "pedestrians", "pedigree", "pedigrees", "pediment", "pedimented", "pediments", "pedlar", "pedlars", "pedology", "pedometer", "peek", "peeked", "peeking", "peeks", "peel", "peeled", "peeler", "peelers", "peeling", "peelings", "peels", "peep", "peeped", "peeper", "peepers", "peephole", "peeping", "peeps", "peer", "peerage", "peerages", "peered", "peering", "peerless", "peers", "peevish", "peevishly", "peevishness", "peg", "pegasus", "pegged", "pegging", "pegs", "pejorative", "pejoratively", "pejoratives", "pekan", "peking", "pele", "pelican", "pelicans", "pellet", "pellets", "pelmet", "pelmets", "pelt", "pelted", "pelting", "pelts", "pelvic", "pelvis", "pelvises", "pen", "penal", "penalisation", "penalise", "penalised", "penalises", "penalising", "penalties", "penalty", "penance", "penances", "pence", "penchant", "pencil", "pencilled", "pencilling", "pencils", "pendant", "pendants", "pending", "pendulous", "pendulum", "pendulums", "penetrable", "penetrate", "penetrated", "penetrates", "penetrating", "penetratingly", "penetration", "penetrations", "penetrative", "penguin", "penguins", "penicillin", "penile", "peninsula", "peninsular", "peninsulas", "penitence", "penitent", "penitential", "penitentiary", "penitently", "penitents", "penknife", "penname", "pennames", "pennant", "pennants", "penned", "pennies", "penniless", "penning", "penny", "pennypinching", "penology", "pens", "pension", "pensionable", "pensioned", "pensioner", "pensioners", "pensioning", "pensions", "pensive", "pensively", "pensiveness", "pent", "pentagon", "pentagonal", "pentagons", "pentagram", "pentagrams", "pentameter", "pentameters", "pentasyllabic", "pentathlete", "pentathlon", "pentatonic", "pentecostal", "penthouse", "penultimate", "penultimately", "penumbra", "penurious", "penury", "peonies", "people", "peopled", "peoples", "pep", "peperoni", "pepper", "peppercorn", "peppercorns", "peppered", "peppering", "peppermint", "peppermints", "peppers", "peppery", "peps", "peptic", "peptide", "peptides", "per", "perambulate", "perambulated", "perambulating", "perambulations", "perambulator", "perannum", "percales", "perceivable", "perceive", "perceived", "perceives", "perceiving", "percent", "percentage", "percentages", "percentile", "percentiles", "percept", "perceptibility", "perceptible", "perceptibly", "perception", "perceptions", "perceptive", "perceptively", "perceptiveness", "percepts", "perceptual", "perceptually", "perch", "perchance", "perched", "percher", "perches", "perching", "perchlorate", "percipient", "percolate", "percolated", "percolates", "percolating", "percolation", "percolator", "percolators", "percuss", "percussed", "percusses", "percussing", "percussion", "percussionist", "percussionists", "percussive", "percussively", "percutaneous", "perdition", "peregrinations", "peregrine", "peregrines", "peremptorily", "peremptoriness", "peremptory", "perennial", "perennially", "perennials", "perestroika", "perfect", "perfected", "perfectibility", "perfecting", "perfection", "perfectionism", "perfectionist", "perfectionists", "perfections", "perfectly", "perfects", "perfidious", "perfidiously", "perfidy", "perforate", "perforated", "perforation", "perforations", "perforce", "perform", "performable", "performance", "performances", "performed", "performer", "performers", "performing", "performs", "perfume", "perfumed", "perfumery", "perfumes", "perfuming", "perfunctorily", "perfunctory", "perfused", "perfusion", "pergola", "pergolas", "perhaps", "peri", "periastron", "perigee", "periglacial", "perihelion", "peril", "perilous", "perilously", "perils", "perimeter", "perimeters", "perinatal", "perineal", "perineum", "period", "periodic", "periodical", "periodically", "periodicals", "periodicity", "periods", "perioperative", "peripatetic", "peripheral", "peripherally", "peripherals", "peripheries", "periphery", "periphrasis", "periphrastic", "periscope", "periscopes", "perish", "perishable", "perishables", "perished", "perishes", "perishing", "peritoneum", "perjure", "perjured", "perjurer", "perjury", "perk", "perked", "perkier", "perkiest", "perkily", "perking", "perks", "perky", "perm", "permafrost", "permanence", "permanency", "permanent", "permanently", "permanganate", "permeability", "permeable", "permeate", "permeated", "permeates", "permeating", "permeation", "permed", "perming", "permissibility", "permissible", "permission", "permissions", "permissive", "permissiveness", "permit", "permits", "permitted", "permitting", "permittivity", "perms", "permutation", "permutations", "permute", "permuted", "permutes", "permuting", "pernicious", "perniciousness", "peroration", "peroxidase", "peroxide", "peroxides", "perpendicular", "perpendicularly", "perpendiculars", "perpetrate", "perpetrated", "perpetrates", "perpetrating", "perpetration", "perpetrator", "perpetrators", "perpetual", "perpetually", "perpetuate", "perpetuated", "perpetuates", "perpetuating", "perpetuation", "perpetuity", "perplex", "perplexed", "perplexedly", "perplexing", "perplexities", "perplexity", "perquisite", "perquisites", "perron", "perry", "persecute", "persecuted", "persecuting", "persecution", "persecutions", "persecutor", "persecutors", "perseverance", "persevere", "persevered", "perseveres", "persevering", "perseveringly", "persia", "persian", "persist", "persisted", "persistence", "persistent", "persistently", "persisting", "persists", "person", "persona", "personable", "personae", "personage", "personages", "personal", "personalisation", "personalise", "personalised", "personalising", "personalities", "personality", "personally", "personification", "personifications", "personified", "personifies", "personify", "personifying", "personnel", "persons", "perspective", "perspectives", "perspex", "perspicacious", "perspicacity", "perspicuity", "perspicuous", "perspicuously", "perspiration", "perspire", "perspiring", "persuade", "persuaded", "persuaders", "persuades", "persuading", "persuasion", "persuasions", "persuasive", "persuasively", "persuasiveness", "pert", "pertain", "pertained", "pertaining", "pertains", "perth", "pertinacious", "pertinaciously", "pertinacity", "pertinence", "pertinent", "pertinently", "pertly", "pertness", "perturb", "perturbation", "perturbations", "perturbed", "perturbing", "peru", "perusal", "peruse", "perused", "peruses", "perusing", "peruvian", "pervade", "pervaded", "pervades", "pervading", "pervasive", "pervasiveness", "perverse", "perversely", "perverseness", "perversion", "perversions", "perversity", "pervert", "perverted", "perverting", "perverts", "peseta", "pesetas", "pesky", "pessimism", "pessimist", "pessimistic", "pessimistically", "pessimists", "pest", "pester", "pestered", "pestering", "pesticide", "pesticides", "pestilence", "pestilent", "pestilential", "pestle", "pests", "pet", "petal", "petals", "petard", "peter", "petered", "petering", "peters", "pethidine", "petit", "petite", "petition", "petitioned", "petitioner", "petitioners", "petitioning", "petitions", "petrel", "petrels", "petrification", "petrified", "petrifies", "petrify", "petrifying", "petrochemical", "petrochemicals", "petrographic", "petrographical", "petrol", "petroleum", "petrological", "petrology", "pets", "petted", "petticoat", "petticoats", "pettier", "pettiest", "pettifoggers", "pettifogging", "pettiness", "petting", "pettish", "pettishly", "pettishness", "petty", "petulance", "petulant", "petulantly", "petunia", "petunias", "pew", "pews", "pewter", "phalanx", "phantasy", "phantom", "phantoms", "pharaoh", "pharmaceutical", "pharmaceuticals", "pharmacies", "pharmacist", "pharmacists", "pharmacological", "pharmacologist", "pharmacologists", "pharmacology", "pharmacy", "pharynx", "phase", "phased", "phases", "phasing", "pheasant", "pheasants", "phenol", "phenols", "phenomena", "phenomenal", "phenomenally", "phenomenological", "phenomenologically", "phenomenologists", "phenomenology", "phenomenon", "phenotype", "phenotypes", "phenylalanine", "pheromone", "pheromones", "phew", "philanthropic", "philanthropist", "philanthropists", "philanthropy", "philatelic", "philatelists", "philately", "philharmonic", "philistine", "philological", "philologist", "philologists", "philology", "philosopher", "philosophers", "philosophic", "philosophical", "philosophically", "philosophies", "philosophise", "philosophising", "philosophy", "phlebotomy", "phlegm", "phlegmatic", "phlegmatically", "phlogiston", "phlox", "phobia", "phobias", "phobic", "phoenix", "phoenixes", "phone", "phoned", "phoneme", "phonemes", "phonemic", "phonemically", "phoner", "phones", "phonetic", "phonetically", "phoneticians", "phoneticist", "phonetics", "phoney", "phoneys", "phoning", "phonograph", "phonographic", "phonological", "phonologically", "phonology", "phonon", "phony", "phooey", "phosphatase", "phosphate", "phosphates", "phosphatic", "phospholipids", "phosphor", "phosphorescence", "phosphorescent", "phosphoric", "phosphorous", "phosphors", "phosphorus", "photo", "photocells", "photochemical", "photochemically", "photochemistry", "photocopied", "photocopier", "photocopiers", "photocopies", "photocopy", "photocopying", "photoelectric", "photoelectrically", "photogenic", "photograph", "photographed", "photographer", "photographers", "photographic", "photographically", "photographing", "photographs", "photography", "photolysis", "photolytic", "photometric", "photometrically", "photometry", "photomultiplier", "photon", "photons", "photoreceptor", "photos", "photosensitive", "photosphere", "photostat", "photosynthesis", "photosynthesising", "photosynthetic", "photosynthetically", "phototypesetter", "phototypesetting", "photovoltaic", "phrasal", "phrase", "phrasebook", "phrased", "phraseology", "phrases", "phrasing", "phrenological", "phrenologically", "phrenologists", "phrenology", "phyla", "phylactery", "phylogenetic", "phylogeny", "phylum", "physic", "physical", "physicality", "physically", "physician", "physicians", "physicist", "physicists", "physics", "physio", "physiognomies", "physiognomy", "physiological", "physiologically", "physiologist", "physiologists", "physiology", "physiotherapist", "physiotherapists", "physiotherapy", "physique", "phytoplankton" };
	private int searchIndex;
	
	public DictionaryP2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersP2.length; i++){
			if(lettersP2[i].equalsIgnoreCase(value)){
				return lettersP2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersP2.length; i++){
			if(lettersP2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}