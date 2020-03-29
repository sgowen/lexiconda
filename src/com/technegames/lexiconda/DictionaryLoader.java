package com.technegames.lexiconda;

public class DictionaryLoader {
	private String word;
	private char firstLetter; //First letter determines which package to look in
	private char secondLetter; //which class to load inside package (e.g. 1,2,3,4, or 5)
	
	public DictionaryLoader(){
		//Simply instantiate this class in the LoadingScreen, so that it can be reused many, many, MANY TIMES!
	}
	
	//Determines which loader to call
	public int packageLoader(String word){
		if(word.length() >=2){
			this.word = word.toLowerCase();
			this.firstLetter = this.word.charAt(0);
			this.secondLetter = this.word.charAt(1);
			
			switch(firstLetter){
			case 'a':
				return aLoader();
			case 'b':
				return bLoader();
			case 'c':
				return cLoader();
			case 'd':
				return dLoader();
			case 'e':
				return eLoader();
			case 'f':
				return fLoader();
			case 'g':
				return gLoader();
			case 'h':
				return hLoader();
			case 'i':
				return iLoader();
			case 'j':
				return jLoader();
			case 'k':
				return kLoader();
			case 'l':
				return lLoader();
			case 'm':
				return mLoader();
			case 'n':
				return nLoader();
			case 'o':
				return oLoader();
			case 'p':
				return pLoader();
			case 'q':
				return qLoader();
			case 'r':
				return rLoader();
			case 's':
				return sLoader();
			case 't':
				return tLoader();
			case 'u':
				return uLoader();
			case 'v':
				return vLoader();
			case 'w':
				return wLoader();
			case 'x':
				return xLoader();
			case 'y':
				return yLoader();
			case 'z':
				return zLoader();
			default:
				return 0;
			}
		} else{
			return 0;
		}
	}
	
	public boolean packageLoaderMatcher(String word){
		if(word.length() >=2){
			this.word = word.toLowerCase();
			this.firstLetter = this.word.charAt(0);
			this.secondLetter = this.word.charAt(1);
			
			switch(firstLetter){
			case 'a':
				return aLoader2();
			case 'b':
				return bLoader2();
			case 'c':
				return cLoader2();
			case 'd':
				return dLoader2();
			case 'e':
				return eLoader2();
			case 'f':
				return fLoader2();
			case 'g':
				return gLoader2();
			case 'h':
				return hLoader2();
			case 'i':
				return iLoader2();
			case 'j':
				return jLoader2();
			case 'k':
				return kLoader2();
			case 'l':
				return lLoader2();
			case 'm':
				return mLoader2();
			case 'n':
				return nLoader2();
			case 'o':
				return oLoader2();
			case 'p':
				return pLoader2();
			case 'q':
				return qLoader2();
			case 'r':
				return rLoader2();
			case 's':
				return sLoader2();
			case 't':
				return tLoader2();
			case 'u':
				return uLoader2();
			case 'v':
				return vLoader2();
			case 'w':
				return wLoader2();
			case 'x':
				return xLoader2();
			case 'y':
				return yLoader2();
			case 'z':
				return zLoader2();
			default:
				return false;
			}
		} else if(word.length() == 1){
			return true;
		} else{
			return false;
		}
	}
	
	//All 26 Primary Loaders!!
	private int aLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictA1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictA2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictA3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictA4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictA5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int bLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictB1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictB2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictB3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictB4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictB5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int cLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictC1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictC2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictC3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictC4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictC5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int dLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictD1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictD2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictD3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictD4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictD5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int eLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictE1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictE2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictE3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictE4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictE5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int fLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictF1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictF2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictF3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictF4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictF5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int gLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictG1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictG2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictG3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictG4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictG5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int hLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictH1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictH2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictH3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictH4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictH5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int iLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictI1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictI2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictI3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictI4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictI5.getWordValue(word);
		} else{
			return 0;
		}
	}
	
	private int jLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictJ1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictJ2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictJ3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictJ4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictJ5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int kLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictK1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictK2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictK3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictK4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictK5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int lLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictL1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictL2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictL3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictL4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictL5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int mLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictM1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictM2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictM3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictM4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictM5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int nLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictN1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictN2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictN3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictN4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictN5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int oLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictO1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictO2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictO3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictO4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictO5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int pLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictP1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictP2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictP3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictP4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictP5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int qLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictQ1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return 0;//Assets.dictQ2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return 0;//Assets.dictQ3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return 0;//Assets.dictQ4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictQ5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int rLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictR1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictR2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictR3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictR4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictR5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int sLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictS1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictS2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictS3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictS4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictS5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int tLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictT1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictT2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictT3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictT4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictT5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int uLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictU1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictU2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictU3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictU4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictU5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int vLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictV1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictV2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictV3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictV4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictV5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int wLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictW1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictW2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictW3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictW4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictW5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int xLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return 0;//Assets.dictX1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictX2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictX3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictX4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictX5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int yLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictY1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictY2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictY3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictY4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictY5.getWordValue(word);
		} else{
			return 0;
		}
	}
	private int zLoader(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictZ1.getWordValue(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictZ2.getWordValue(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictZ3.getWordValue(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictZ4.getWordValue(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictZ5.getWordValue(word);
		} else{
			return 0;
		}
	}
	
	//All 26 Matcher Loaders!!
	private boolean aLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictA1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictA2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictA3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictA4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictA5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean bLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictB1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictB2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictB3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictB4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictB5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean cLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictC1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictC2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictC3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictC4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictC5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean dLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictD1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictD2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictD3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictD4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictD5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean eLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictE1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictE2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictE3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictE4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictE5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean fLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictF1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictF2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictF3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictF4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictF5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean gLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictG1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictG2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictG3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictG4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictG5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean hLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictH1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictH2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictH3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictH4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictH5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean iLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictI1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictI2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictI3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictI4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictI5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	
	private boolean jLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictJ1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictJ2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictJ3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictJ4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictJ5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean kLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictK1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictK2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictK3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictK4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictK5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean lLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictL1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictL2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictL3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictL4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictL5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean mLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictM1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictM2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictM3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictM4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictM5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean nLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictN1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictN2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictN3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictN4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictN5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean oLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictO1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictO2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictO3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictO4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictO5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean pLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictP1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictP2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictP3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictP4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictP5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean qLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictQ1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return false;
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return false;
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return false;
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictQ5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean rLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictR1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictR2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictR3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictR4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictR5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean sLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictS1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictS2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictS3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictS4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictS5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean tLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictT1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictT2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictT3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictT4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictT5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean uLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictU1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictU2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictU3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictU4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictU5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean vLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictV1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictV2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictV3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictV4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictV5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean wLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictW1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictW2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictW3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictW4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictW5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean xLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return false;
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictX2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictX3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictX4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictX5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean yLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictY1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictY2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictY3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictY4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictY5.isPotentialWord(word);
		} else{
			return false;
		}
	}
	private boolean zLoader2(){
		if(secondLetter == 'a' || secondLetter == 'b' || secondLetter == 'c' || secondLetter == 'd'){
			return Assets.dictZ1.isPotentialWord(word);
		} else if(secondLetter == 'e' || secondLetter == 'f' || secondLetter == 'g' || secondLetter == 'h'){
			return Assets.dictZ2.isPotentialWord(word);
		} else if(secondLetter == 'i' || secondLetter == 'j' || secondLetter == 'k' || secondLetter == 'l' || secondLetter == 'm' || secondLetter == 'n'){
			return Assets.dictZ3.isPotentialWord(word);
		} else if(secondLetter == 'o' || secondLetter == 'p' || secondLetter == 'q' || secondLetter == 'r' || secondLetter == 's' || secondLetter == 't'){
			return Assets.dictZ4.isPotentialWord(word);
		} else if(secondLetter == 'u' || secondLetter == 'v' || secondLetter == 'w' || secondLetter == 'x' || secondLetter == 'y' || secondLetter == 'z'){
			return Assets.dictZ5.isPotentialWord(word);
		} else{
			return false;
		}
	}
}