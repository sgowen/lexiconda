package com.technegames.lexiconda;

public class Item {
	//private static final float TIME_ALLOWED = 30f;
	private static final float ITEM_CHANGE = 1.1f;
	private static final float ITEM_CHANGE_2 = 0.11f;
	//private float timeOnScreen;
	private float itemTime;
	private float itemTime2;
	public int x, y;
	public int index;
	public int item; //For the Pulsating Effect
	
	public Item(int x, int y, int index){
		this.x = x;
		this.y = y;
		this.index = index;
		//timeOnScreen = 0;
		itemTime = 0;
		itemTime2 = 0;
		item = 0;
	}
	
	public void update(float deltaTime){
//		//If letters are not being used, why not change them?
//		timeOnScreen += deltaTime;
//		if(timeOnScreen > TIME_ALLOWED){
//			timeOnScreen = 0;
//			index++;
//			if(index > 25){
//				index = 0;
//			}
//		}
		//For Pulsating Effect
		itemTime += deltaTime;
		if(itemTime > ITEM_CHANGE){
			itemTime2 += deltaTime;
			if(itemTime2 > ITEM_CHANGE_2){
				item++;
				itemTime2 = 0;
				if(item > 3){
					item = 0;
					itemTime = 0;
				}
			}
		}
	}
}
