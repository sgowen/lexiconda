package com.technegames.dict.Q;

import com.technegames.framework.Dictionary;

public class DictionaryQ5 implements Dictionary{
	private static String[] lettersQ5 = { "qua", "quack", "quacked", "quacking", "quackish", "quacks", "quadrangle", "quadrangles", "quadrangular", "quadrant", "quadrants", "quadratic", "quadratically", "quadratics", "quadrature", "quadratures", "quadrilateral", "quadrilaterals", "quadrille", "quadrilles", "quadripartite", "quadrophonic", "quadruped", "quadrupeds", "quadruple", "quadrupled", "quadruples", "quadruplets", "quadruplicate", "quadrupling", "quadruply", "quadrupole", "quaff", "quaffed", "quaffing", "quagga", "quaggas", "quagmire", "quagmires", "quail", "quailed", "quails", "quaint", "quainter", "quaintly", "quaintness", "quake", "quaked", "quaker", "quakers", "quakes", "quaking", "qualification", "qualifications", "qualified", "qualifier", "qualifiers", "qualifies", "qualify", "qualifying", "qualitative", "qualitatively", "qualities", "quality", "qualm", "qualms", "quantifiable", "quantification", "quantified", "quantifier", "quantifiers", "quantifies", "quantify", "quantifying", "quantisation", "quantise", "quantised", "quantitative", "quantitatively", "quantities", "quantity", "quantum", "quarantine", "quarantined", "quark", "quarks", "quarrel", "quarrelled", "quarrelling", "quarrels", "quarrelsome", "quarried", "quarries", "quarry", "quarrying", "quarrymen", "quart", "quarter", "quarterback", "quartered", "quartering", "quarterly", "quartermaster", "quarters", "quarterstaff", "quarterstaffs", "quartet", "quartets", "quartic", "quartics", "quartile", "quartiles", "quarto", "quarts", "quartz", "quartzite", "quasar", "quasars", "quash", "quashed", "quashing", "quasi", "quasilinear", "quaternary", "quaternion", "quaternions", "quatrain", "quatrains", "quaver", "quavered", "quavering", "quavers", "quay", "quays", "quayside", "queasiness", "queasy", "quebec", "queen", "queenly", "queens", "queer", "queerest", "queerly", "quell", "quelled", "quelling", "quells", "quench", "quenched", "quencher", "quenchers", "quenches", "quenching", "queried", "queries", "quern", "querulous", "querulously", "querulousness", "query", "querying", "quest", "questing", "question", "questionable", "questionably", "questioned", "questioner", "questioners", "questioning", "questioningly", "questionings", "questionnaire", "questionnaires", "questions", "quests", "queue", "queued", "queueing", "queues", "queuing", "quibble", "quibbles", "quibbling", "quiche", "quiches", "quick", "quicken", "quickened", "quickening", "quickens", "quicker", "quickest", "quicklime", "quickly", "quickness", "quicksand", "quicksands", "quicksilver", "quickwitted", "quid", "quids", "quiesce", "quiesced", "quiescence", "quiescent", "quiet", "quieted", "quieten", "quietened", "quietening", "quietens", "quieter", "quietest", "quieting", "quietly", "quietness", "quiets", "quietus", "quiff", "quill", "quills", "quilt", "quilted", "quilting", "quilts", "quince", "quincentenary", "quinces", "quinine", "quinquennial", "quintessence", "quintessential", "quintessentially", "quintet", "quintets", "quintic", "quintillion", "quintuple", "quip", "quipped", "quipper", "quips", "quire", "quirk", "quirkier", "quirkiest", "quirkiness", "quirks", "quirky", "quisling", "quit", "quite", "quits", "quitted", "quitter", "quitting", "quiver", "quivered", "quivering", "quiveringly", "quivers", "quixotic", "quiz", "quizzed", "quizzes", "quizzical", "quizzically", "quizzing", "quoins", "quoits", "quondam", "quorate", "quorum", "quota", "quotable", "quotas", "quotation", "quotations", "quote", "quoted", "quoter", "quotes", "quotidian", "quotient", "quotients", "quoting", "quovadis" };
	private int searchIndex;
	
	public DictionaryQ5(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersQ5.length; i++){
			if(lettersQ5[i].equalsIgnoreCase(value)){
				return lettersQ5[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersQ5.length; i++){
			if(lettersQ5[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}