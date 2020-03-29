package com.technegames.framework.imp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;

import com.technegames.framework.Graphics;
import com.technegames.framework.Pixmap;

public class AndroidGraphics implements Graphics {
	Typeface font;
	Rect bounds = new Rect();
	AssetManager assets;
	Bitmap frameBuffer;
	Canvas canvas;
	Paint paint;
	Paint paint2; //For Letter Animation
	Paint paint3; //For Word Animation
	Rect srcRect = new Rect();
	Rect dstRect = new Rect();
	Rect dst = new Rect();
	
	public AndroidGraphics(AssetManager assets, Bitmap frameBuffer){
		this.assets = assets;
		this.frameBuffer = frameBuffer;
		this.canvas = new Canvas(frameBuffer);
		this.paint = new Paint();
		this.paint2 = new Paint();
		this.paint3 = new Paint();
		this.font = Typeface.createFromAsset(assets, "fonts" + File.separator + "teen_bold.ttf");
	}
	
	@Override
	public Pixmap newPixmap(String fileName, PixmapFormat format) {
		Config config = null;
		if(format == PixmapFormat.RGB565){
			config = Config.RGB_565;
		} else if(format == PixmapFormat.ARGB4444){
			config = Config.ARGB_4444;
		} else{
			config = Config.ARGB_8888;
		}
		
		Options options = new Options();
		options.inPreferredConfig = config;
		
		InputStream in = null;
		Bitmap bitmap = null;
		
		try{
			in = assets.open(fileName);
			bitmap = BitmapFactory.decodeStream(in);
			if(bitmap == null){
				throw new RuntimeException("Couldn't load bitmap from asset \"" + fileName + "\"");
			}
		} catch(IOException ex){
			throw new RuntimeException("Couldn't load bitmap from asset \"" + fileName + "\"");
		} finally{
			if(in != null){
				try{
					in.close();
				} catch(IOException ex){
					throw new RuntimeException("Seriously wtf is going on here...?");
				}
			}
		}
		
		if(bitmap.getConfig() == Config.RGB_565){
			format = PixmapFormat.RGB565;
		} else if(bitmap.getConfig() == Config.ARGB_4444){
			format = PixmapFormat.ARGB4444;
		} else{
			format = PixmapFormat.ARGB8888;
		}
		
		return new AndroidPixmap(bitmap, format);
	}

	@Override
	public void clear(int color) {
		canvas.drawRGB((color & 0xff0000) >> 16, (color & 0xff00) >> 8, (color & 0xff));
	}

	@Override
	public void drawPixel(int x, int y, int color) {
		paint.setColor(color);
		canvas.drawPoint(x,y,paint);
	}

	@Override
	public void drawLine(int x, int y, int x2, int y2, int color) {
		paint.setColor(color);
		canvas.drawLine(x,y,x2,y2,paint);
	}
	
	@Override
	public void drawLine(int x, int y, int x2, int y2, float thickness, int color) {
		paint3.setColor(color);
		paint3.setStrokeWidth(thickness);
		canvas.drawLine(x,y,x2,y2,paint3);
	}

	@Override
	public void drawRect(int x, int y, int width, int height, boolean isFilled, int color) {
		paint.setColor(color);
		if(isFilled){
			paint.setStyle(Style.FILL);
		} else{
			paint.setStyle(Style.STROKE);
		}
		canvas.drawRect(x,y,x+ width -1, y + height -1, paint);
	}
	
	@Override
	public void drawCircle(int x, int y, int radius, float thickness, boolean isFilled, int color){
		paint2.setColor(color);
		if(isFilled){
			paint2.setStyle(Style.FILL_AND_STROKE);
		} else{
			paint2.setStyle(Style.STROKE);
			paint2.setStrokeWidth(thickness);
		}
		canvas.drawCircle(x, y, radius, paint2);
	}

	@Override
	public void drawPixmap(Pixmap pixmap, int x, int y, int srcX, int srcY, int srcWidth, int srcHeight) {
		srcRect.left = srcX;
		srcRect.top = srcY;
		srcRect.right = srcX + srcWidth -1;
		srcRect.bottom = srcY + srcHeight -1;
		
		dstRect.left = x;
		dstRect.top = y;
		dstRect.right = x + srcWidth -1;
		dstRect.bottom = y + srcHeight -1;
		
		canvas.drawBitmap(((AndroidPixmap) pixmap).bitmap, srcRect, dstRect, null);
	}

	@Override
	public void drawToSize(Pixmap pixmap, int x, int y, int width, int height) {
		dst.set(x, y, x+width, y+height);
		canvas.drawBitmap(((AndroidPixmap) pixmap).bitmap, null, dst, null);
	}
	
	@Override
	public void drawPixmap(Pixmap pixmap, int x, int y) {
		canvas.drawBitmap(((AndroidPixmap)pixmap).bitmap, x, y, null);
	}

	@Override
	public int getWidth() {
		return frameBuffer.getWidth();
	}

	@Override
	public int getHeight() {
		return frameBuffer.getHeight();
	}

	@Override
	public void drawText(String text, int x, int y, int size, boolean isCentered, int color) {
		paint.setColor(color);
		paint.setTypeface(font);
		paint.setTextSize(size);
		if(isCentered){
			paint.setTextAlign(Paint.Align.CENTER);
		} else{
			paint.setTextAlign(Paint.Align.LEFT);
		}
		canvas.drawText(text, x, y, paint);
	}
}
