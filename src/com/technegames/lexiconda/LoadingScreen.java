package com.technegames.lexiconda;

import com.technegames.framework.Game;
import com.technegames.framework.Graphics;
import com.technegames.framework.Graphics.PixmapFormat;
import com.technegames.framework.Screen;

public class LoadingScreen extends Screen{
	Game game;
	Graphics g;
	
	public LoadingScreen(Game game) {
		super(game);
		this.game = game;
		g = game.getGraphics();
	}

	@Override
	public void update(float deltaTime) {
		SaveData.load();
		loadTools();
		loadGraphics();
		loadSound();
		loadMusic();
	}
	
	private void loadTools(){
		Assets.dict = new DictionaryLoader(); //Provides intuitive access to the massive dictionary
		Assets.usedWords = new UsedWords(); //Stores the used words in a string array, so that the game can prevent reused words from scoring points!
	}
	
	private void loadGraphics(){
		//Load pretty, clean Graphics
		Assets.bg = game.getGraphics().newPixmap("bg.png", PixmapFormat.RGB565);
		Assets.head = game.getGraphics().newPixmap("hparts.png", PixmapFormat.ARGB4444);
		Assets.stats = game.getGraphics().newPixmap("stats.png", PixmapFormat.ARGB4444);
		Assets.item1 = game.getGraphics().newPixmap("i1.png", PixmapFormat.ARGB4444);
		Assets.item2 = game.getGraphics().newPixmap("i2.png", PixmapFormat.ARGB4444);
		Assets.item3 = game.getGraphics().newPixmap("i3.png", PixmapFormat.ARGB4444);
		Assets.newhs = game.getGraphics().newPixmap("newhs.png", PixmapFormat.ARGB4444);
		Assets.go = game.getGraphics().newPixmap("go.png", PixmapFormat.ARGB4444);
		Assets.options = game.getGraphics().newPixmap("options.png", PixmapFormat.ARGB4444);
		Assets.submit = game.getGraphics().newPixmap("submit.png", PixmapFormat.ARGB4444);
		Assets.delete = game.getGraphics().newPixmap("delete.png", PixmapFormat.ARGB4444);
	}

	private void loadSound(){
		//Load some catchy sound effects!
		Assets.click = game.getAudio().newSound("click.ogg"); //ANY TYPE OF CLICK!!!
		Assets.eat = game.getAudio().newSound("eat.ogg"); //EAT A LETTER!
		Assets.boom = game.getAudio().newSound("boom.ogg"); //A WORD IS SPELT!
		Assets.death = game.getAudio().newSound("death.ogg"); //OH NOES!
	}
	
	private void loadMusic(){
		//Load some awesome background music tracks???
		Assets.bgm = game.getAudio().newMusic("bgm.ogg");
		Assets.intro = game.getAudio().newMusic("intro.ogg");
		Assets.bgm.setLooping(true);
	}
	
	@Override
	public void present(float deltaTime) {
		game.setScreen(new GameScreen(game));
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void unpause() {
		
	}

	@Override
	public int identity() {
		return 1;
	}

}
