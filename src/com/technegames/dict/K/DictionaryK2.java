package com.technegames.dict.K;

import com.technegames.framework.Dictionary;

public class DictionaryK2 implements Dictionary{
	private static String[] lettersK2 = { "kebab", "kebabs", "kedgeree", "keel", "keeled", "keelhaul", "keeling", "keels", "keen", "keener", "keenest", "keening", "keenly", "keenness", "keep", "keeper", "keepers", "keeping", "keeps", "keepsake", "keepsakes", "keg", "kegs", "kelp", "kelpers", "kelt", "kelts", "kelvin", "ken", "kennedy", "kennel", "kennelled", "kennels", "kent", "kentucky", "kenya", "kenyan", "kept", "keratin", "kerb", "kerbs", "kerbside", "kerchief", "kerned", "kernel", "kernels", "kerning", "kerosene", "kestrel", "kestrels", "ketch", "ketchup", "kettle", "kettleful", "kettles", "key", "keyboard", "keyboardist", "keyboards", "keyed", "keyhole", "keyholes", "keying", "keynote", "keynotes", "keypad", "keypads", "keyring", "keys", "keystone", "keystones", "keystroke", "keystrokes", "keyword", "keywords", "khaki", "khalif", "khan", "khans", "khoikhoi", "khoisan" };
	private int searchIndex;
	
	public DictionaryK2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersK2.length; i++){
			if(lettersK2[i].equalsIgnoreCase(value)){
				return lettersK2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersK2.length; i++){
			if(lettersK2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}