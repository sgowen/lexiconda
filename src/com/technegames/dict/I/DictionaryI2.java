package com.technegames.dict.I;

import com.technegames.framework.Dictionary;

public class DictionaryI2 implements Dictionary{
	private static String[] lettersI2 = { "if", "ifs", "igloo", "igloos", "iglu", "igneous", "ignite", "ignited", "igniter", "ignites", "igniting", "ignition", "ignoble", "ignobly", "ignominious", "ignominiously", "ignominy", "ignorable", "ignoramus", "ignoramuses", "ignorance", "ignorant", "ignorantly", "ignore", "ignored", "ignores", "ignoring", "iguana", "iguanas" };
	private int searchIndex;
	
	public DictionaryI2(){
		searchIndex = 0;
	}
	
	@Override
	public int getWordValue(String value){
		for(int i = searchIndex; i < lettersI2.length; i++){
			if(lettersI2[i].equalsIgnoreCase(value)){
				return lettersI2[i].length();
			}
		}
		return 0;
	}
	
	@Override
	public boolean isPotentialWord(String value){
		for(int i = 0; i < lettersI2.length; i++){
			if(lettersI2[i].matches(value+".*")){
				searchIndex = i;
				return true;
			}
		}
		return false;
	}
	
}