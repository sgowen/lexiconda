package com.technegames.dict.C;

import com.technegames.framework.Dictionary;

public class DictionaryC2 implements Dictionary{
	private static String[] lettersC2 = { "cease", "ceased", "ceasefire", "ceasefires", "ceaseless", "ceaselessly", "ceases", "ceasing", "cedar", "cedars", "cedarwood", "cede", "ceded", "cedilla", "ceding", "ceilidh", "ceilidhs", "ceiling", "ceilings", "celandine", "celeb", "celebrant", "celebrants", "celebrate", "celebrated", "celebrates", "celebrating", "celebration", "celebrations", "celebratory", "celebrities", "celebrity", "celeriac", "celery", "celestial", "celestially", "celibacy", "celibate", "cell", "cellar", "cellars", "cellist", "cellists", "cello", "cellophane", "cells", "cellular", "cellulite", "celluloid", "cellulose", "celsius", "celtic", "cement", "cemented", "cementing", "cements", "cemeteries", "cemetery", "cenotaph", "censer", "censor", "censored", "censorial", "censoring", "censorious", "censoriousness", "censors", "censorship", "censure", "censured", "censures", "censuring", "census", "censuses", "cent", "centaur", "centaurs", "centenarians", "centenary", "centennial", "centigrade", "centime", "centimes", "centimetre", "centimetres", "centipede", "centipedes", "central", "centralisation", "centralise", "centralised", "centraliser", "centralisers", "centralises", "centralising", "centralism", "centralist", "centrality", "centrally", "centre", "centred", "centrefold", "centrefolds", "centreing", "centrepiece", "centrepieces", "centres", "centric", "centrifugal", "centrifugally", "centrifugation", "centrifuge", "centrifuged", "centrifuges", "centrifuging", "centring", "centripetal", "centrist", "centrists", "centroid", "centroids", "cents", "centuries", "centurion", "centurions", "century", "cephalopods", "ceramic", "ceramics", "ceramist", "cereal", "cereals", "cerebellum", "cerebral", "cerebrum", "ceremonial", "ceremonially", "ceremonials", "ceremonies", "ceremonious", "ceremoniously", "ceremony", "ceres", "cerise", "certain", "certainly", "certainties", "certainty", "certifiable", "certifiably", "certificate", "certificated", "certificates", "certification", "certified", "certifies", "certify", "certifying", "certitude", "certitudes", "cervical", "cervix", "cess", "cessation", "cessations", "cession", "cesspit", "cesspool", "cesspools", "cetacean", "ceylon", "chacha", "chad", "chafe", "chafed", "chafes", "chaff", "chaffed", "chaffinch", "chaffinches", "chaffing", "chafing", "chagrin", "chagrined", "chain", "chained", "chaining", "chains", "chainsaw", "chainsaws", "chainsmoke", "chainsmoked", "chainsmoking", "chair", "chaired", "chairing", "chairlift", "chairman", "chairmanship", "chairmanships", "chairmen", "chairperson", "chairpersons", "chairs", "chairwoman", "chairwomen", "chaldron", "chalet", "chalets", "chalice", "chalices", "chalk", "chalked", "chalking", "chalks", "chalky", "challenge", "challenged", "challenger", "challengers", "challenges", "challenging", "challengingly", "chamber", "chambered", "chamberlain", "chamberlains", "chambermaid", "chambermaids", "chamberpot", "chamberpots", "chambers", "chameleon", "chameleons", "chamfer", "chamfered", "chamois", "chamomile", "champ", "champagne", "champagnes", "champing", "champion", "championed", "championing", "champions", "championship", "championships", "champs", "chance", "chanced", "chancel", "chancellery", "chancellor", "chancellors", "chancellorship", "chancer", "chancery", "chances", "chancier", "chanciest", "chancing", "chancy", "chandelier", "chandeliers", "chandler", "change", "changeability", "changeable", "changed", "changeless", "changeling", "changeover", "changeovers", "changer", "changers", "changes", "changing", "channel", "channelled", "channelling", "channels", "chant", "chanted", "chanter", "chanteuse", "chanting", "chantings", "chantries", "chantry", "chants", "chaos", "chaotic", "chaotically", "chap", "chapel", "chapels", "chaperon", "chaperone", "chaperoned", "chaperones", "chaplain", "chaplaincy", "chaplains", "chaplain", "chapman", "chapped", "chapping", "chaps", "chapter", "chapters", "char", "charabanc", "character", "characterful", "characterisation", "characterisations", "characterise", "characterised", "characterises", "characterising", "characteristic", "characteristically", "characteristics", "characterless", "characters", "charade", "charades", "charcoal", "charcuterie", "chared", "charge", "chargeable", "charged", "charger", "chargers", "charges", "charging", "chariot", "charioteer", "charioteers", "chariots", "charisma", "charismas", "charismatic", "charismatically", "charismatics", "charitable", "charitably", "charities", "charity", "charlady", "charlatan", "charlatans", "charles", "charlie", "charm", "charmed", "charmer", "charmers", "charming", "charmingly", "charmless", "charms", "charon", "charred", "charring", "chars", "chart", "charted", "charter", "chartered", "chartering", "charters", "charting", "chartists", "charts", "charwoman", "chary", "chase", "chased", "chaser", "chasers", "chases", "chasing", "chasm", "chasms", "chassis", "chaste", "chastely", "chastened", "chastening", "chastise", "chastised", "chastisement", "chastises", "chastising", "chastity", "chat", "chateau", "chats", "chatted", "chattel", "chattels", "chatter", "chatterbox", "chattered", "chatterer", "chattering", "chatters", "chattily", "chatting", "chatty", "chauffeur", "chauffeured", "chauffeurs", "chauvinism", "chauvinist", "chauvinistic", "chauvinists", "cheap", "cheapen", "cheapened", "cheapening", "cheapens", "cheaper", "cheapest", "cheapish", "cheaply", "cheapness", "cheapskates", "cheat", "cheated", "cheater", "cheaters", "cheating", "cheats", "check", "checked", "checker", "checkered", "checkering", "checkers", "checkin", "checking", "checklist", "checklists", "checkmate", "checkout", "checkouts", "checkpoint", "checkpoints", "checks", "checkup", "checkups", "cheddar", "cheek", "cheekbone", "cheekbones", "cheeked", "cheekier", "cheekiest", "cheekily", "cheeking", "cheeks", "cheeky", "cheep", "cheeping", "cheer", "cheered", "cheerful", "cheerfully", "cheerfulness", "cheerier", "cheeriest", "cheerily", "cheering", "cheerio", "cheerleader", "cheerleaders", "cheerless", "cheerlessness", "cheers", "cheery", "cheese", "cheeseboard", "cheeseburger", "cheeseburgers", "cheesecake", "cheesecloth", "cheesemaking", "cheeses", "cheesy", "cheetah", "cheetahs", "chef", "chefs", "chekov", "chemic", "chemical", "chemically", "chemicals", "chemiluminescence", "chemiluminescent", "chemise", "chemist", "chemistry", "chemists", "chemosynthesis", "chemotherapeutic", "chemotherapy", "cheque", "chequebook", "chequebooks", "chequer", "chequerboard", "chequered", "chequering", "chequers", "cheques", "cherish", "cherished", "cherishes", "cherishing", "cheroot", "cheroots", "cherries", "cherry", "cherryred", "cherub", "cherubic", "cherubim", "cherubs", "chess", "chessboard", "chessboards", "chessmen", "chest", "chested", "chester", "chesterfield", "chestnut", "chestnuts", "chests", "chesty", "chevalier", "chevron", "chevrons", "chew", "chewable", "chewed", "chewer", "chewier", "chewiest", "chewing", "chews", "chewy", "chic", "chicago", "chicane", "chicanery", "chick", "chicken", "chickens", "chicks", "chicory", "chide", "chided", "chides", "chiding", "chief", "chiefly", "chiefs", "chieftain", "chieftains", "chiffon", "chihuahua", "chihuahuas", "chilblain", "chilblains", "child", "childbearing", "childbirth", "childcare", "childhood", "childhoods", "childish", "childishly", "childishness", "childless", "childlessness", "childlike", "childly", "childminders", "childproof", "children", "chilean", "chili", "chill", "chilled", "chiller", "chillers", "chilli", "chillier", "chillies", "chilliest", "chilliness", "chilling", "chillingly", "chills", "chilly", "chimaera", "chimaerical", "chime", "chimed", "chimera", "chimeras", "chimerical", "chimes", "chiming", "chimney", "chimneys", "chimp", "chimpanzee", "chimpanzees", "chimps", "chin", "china", "chinese", "chink", "chinked", "chinking", "chinks", "chinless", "chinoiserie", "chins", "chintz", "chintzy", "chip", "chipboard", "chipmunk", "chipped", "chipping", "chippings", "chips", "chiral", "chiropodist", "chiropody", "chiropractic", "chiropractor", "chiropractors", "chirp", "chirped", "chirping", "chirps", "chirpy", "chirruped", "chisel", "chiseled", "chiselled", "chiselling", "chisels", "chit", "chits", "chivalric", "chivalrous", "chivalrously", "chivalry", "chives", "chivvied", "chivvy", "chivvying", "chlamydia", "chlorate", "chloride", "chlorinated", "chlorination", "chlorine", "chlorofluorocarbon", "chlorofluorocarbons", "chloroform", "chloroformed", "chloroforming", "chlorophyll", "chloroquine", "chock", "chockablock", "chockfull", "chocks", "chocolate", "chocolates", "choice", "choices", "choicest", "choir", "choirboy", "choirboys", "choirmaster", "choirs", "choke", "choked", "choker", "chokes", "choking", "cholera", "cholesterol", "choline", "chomp", "chomped", "chomping", "chomps", "choose", "chooser", "choosers", "chooses", "choosey", "choosier", "choosing", "choosy", "chop", "chopin", "chopped", "chopper", "choppers", "choppier", "choppiest", "chopping", "choppy", "chops", "chopsticks", "choral", "chorale", "chorales", "chorals", "chord", "chordal", "chords", "chore", "chorea", "choreographed", "choreographer", "choreographers", "choreographic", "choreographing", "choreography", "chores", "chorister", "choristers", "chortle", "chortled", "chortles", "chortling", "chorus", "chorused", "choruses", "chose", "chosen", "choughs", "chow", "christ", "christen", "christened", "christening", "christenings", "christian", "chroma", "chromatic", "chromaticism", "chromatograph", "chromatographic", "chromatography", "chrome", "chromed", "chromite", "chromium", "chromosomal", "chromosome", "chromosomes", "chronic", "chronically", "chronicle", "chronicled", "chronicler", "chroniclers", "chronicles", "chronicling", "chronograph", "chronological", "chronologically", "chronologies", "chronology", "chronometer", "chronometric", "chrysalis", "chrysanthemum", "chrysanthemums", "chubbiness", "chubby", "chuck", "chucked", "chucking", "chuckle", "chuckled", "chuckles", "chuckling", "chucks", "chuff", "chuffed", "chug", "chugged", "chugging", "chugs", "chum", "chump", "chums", "chunk", "chunkier", "chunks", "chunky", "chunnel", "chuntering", "church", "churches", "churchgoer", "churchgoers", "churchman", "churchmen", "churchwarden", "churchwardens", "churchyard", "churchyards", "churlish", "churlishly", "churlishness", "churn", "churned", "churning", "churns", "chute", "chutes", "chutney", "chutzpah" };
	private int searchIndex;
	
	public DictionaryC2(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersC2.length; i++){
			if(lettersC2[i].equalsIgnoreCase(value)){
				return lettersC2[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersC2.length; i++){
			if(lettersC2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}