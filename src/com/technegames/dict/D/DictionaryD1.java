package com.technegames.dict.D;

import com.technegames.framework.Dictionary;

public class DictionaryD1 implements Dictionary{
	private static String[] lettersD1 = { "dab", "dabbed", "dabbing", "dabble", "dabbled", "dabbler", "dabbles", "dabbling", "dabs", "dace", "dacha", "dachau", "dachshund", "dactyl", "dactylic", "dactyls", "dad", "daddies", "daddy", "daddylonglegs", "dado", "dads", "daemon", "daemonic", "daemons", "daffodil", "daffodils", "daffy", "daft", "dafter", "daftest", "daftness", "dagama", "dagga", "dagger", "daggers", "dahlia", "dahlias", "dahomey", "dailies", "daily", "daintier", "daintiest", "daintily", "daintiness", "dainty", "dairies", "dairy", "dairying", "dairyman", "dairymen", "dais", "daisies", "daisy", "dakar", "dakoits", "dale", "dales", "dallas", "dalliance", "dallied", "dally", "dallying", "dam", "damage", "damaged", "damages", "damaging", "damagingly", "damascus", "damask", "dame", "dames", "dammed", "damming", "damn", "damnable", "damnably", "damnation", "damned", "damnify", "damning", "damningly", "damns", "damp", "damped", "dampen", "dampened", "dampening", "dampens", "damper", "dampers", "dampest", "damping", "dampish", "damply", "dampness", "damps", "dams", "damsel", "damsels", "damson", "damsons", "dan", "dance", "danceable", "danced", "dancer", "dancers", "dances", "dancing", "dandelion", "dandelions", "dandies", "dandruff", "dandy", "dane", "danes", "danger", "dangerous", "dangerously", "dangerousness", "dangers", "dangle", "dangled", "dangles", "dangling", "daniel", "danish", "dank", "dankest", "dante", "danube", "danzig", "dapper", "dapple", "dappled", "dapples", "dare", "dared", "daredevil", "dares", "daring", "daringly", "dark", "darken", "darkened", "darkening", "darkens", "darker", "darkest", "darkish", "darkly", "darkness", "darkroom", "darkrooms", "darling", "darlings", "darn", "darned", "darning", "darns", "dart", "dartboard", "dartboards", "darted", "darter", "darters", "darting", "darts", "darwin", "dash", "dashboard", "dashed", "dashes", "dashing", "dassie", "dassies", "dastardly", "data", "database", "databases", "datable", "date", "dated", "dateline", "dates", "dating", "dative", "datum", "daub", "daubed", "dauber", "daubing", "daughter", "daughterinlaw", "daughters", "daughtersinlaw", "daunt", "daunted", "daunting", "dauntingly", "dauntless", "daunts", "dauphin", "dauphins", "david", "davinci", "dawdle", "dawdled", "dawdling", "dawn", "dawned", "dawning", "dawns", "day", "daybreak", "daycare", "daydream", "daydreaming", "daydreams", "daylight", "daylights", "daylong", "dayold", "days", "daytime", "daze", "dazed", "dazedly", "dazing", "dazzle", "dazzled", "dazzler", "dazzles", "dazzling", "dazzlingly", "dday" };
	private int searchIndex;
	
	public DictionaryD1(){
		searchIndex = 0;
	}
	
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersD1.length; i++){
			if(lettersD1[i].equalsIgnoreCase(value)){
				return lettersD1[i].length();
			}
		}
		return 0;
	}
	
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersD1.length; i++){
			if(lettersD1[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}