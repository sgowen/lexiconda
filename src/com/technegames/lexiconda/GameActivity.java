package com.technegames.lexiconda;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.technegames.framework.Screen;
import com.technegames.framework.imp.AndroidGame;

public class GameActivity extends AndroidGame {
	@Override
	public Screen getStartScreen() {
		Toast.makeText(getBaseContext(), "Playing with " + Mode.CONTROLS[SaveData.controlPref] + " Controls", Toast.LENGTH_SHORT).show();
		return new LoadingScreen(this);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event){
		if(keyCode == android.view.KeyEvent.KEYCODE_MENU){
			getCurrentScreen().pause();
		} else if(keyCode == android.view.KeyEvent.KEYCODE_BACK){
			onBackPressed();
		}
		return false;
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		if(getCurrentScreen().identity() == 0){
			createMenu(menu);
			return true;
		} else{
			return false;
		}
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		if(Assets.click != null){
			Assets.click.play(1);
		}
		switch(item.getItemId()){
		case 0:
			getCurrentScreen().unpause();
			return true;
		case 1:
			showDialog(0);
			return true;
		case 2:
			finish();
			return true;
		default:
			return false;
		}
	}
	
	@Override
    protected Dialog onCreateDialog(int id) {
		CharSequence[] items = {"TAP", "KEYBOARD"};
	    int controlSelected = 0;
        switch (id) {
            case 0:
                return new AlertDialog.Builder(this).setIcon(R.drawable.icon).setTitle("Set Control Method")
                .setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
					public void onClick(DialogInterface dialog, int whichButton) {
                    	Assets.click.play(1);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
					public void onClick(DialogInterface dialog, int whichButton) {
                    	Assets.click.play(1);
                    }
                }).setSingleChoiceItems(items, controlSelected, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						SaveData.controlPref = which;
						Mode.setControls(Mode.CONTROLTYPES[which]);
						Toast.makeText(getBaseContext(), Mode.CONTROLS[which] + " Selected", Toast.LENGTH_SHORT).show();
					}
				}).create();
        }
        return null;
    }
	
	private void createMenu(Menu menu){
		menu.add(0, 0, 0, "RESUME");
		menu.add(0, 1, 1, "CONTROLS");
		menu.add(0, 2, 2, "QUIT");
	}
}