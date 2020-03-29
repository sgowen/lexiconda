package com.technegames.framework.imp;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter {
	public static final String KEY_ID = "id";
    public static final String KEY_WORD = "word";
    private static final String TAG = "DBAdapter";
    
    private static final String DATABASE_NAME = "usedwords";
    private static final String DATABASE_TABLE = "words";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE =
        "create table " + DATABASE_TABLE + " ( " 
        + KEY_ID + " integer primary key autoincrement, "
        + KEY_WORD + " text unique not null" 
        + ");";
        
    private final Context context; 
    
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public DBAdapter(Context ctx){
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }
        
    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
            Log.w(TAG, "Upgrading database from version " + oldVersion 
                    + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
            onCreate(db);
        }
    }
    
    public DBAdapter open() throws SQLException{
        db = DBHelper.getWritableDatabase();
        return this;
    }
    
    public void close(){
        DBHelper.close();
    }
    
    public void insertWord(String word){
    	try{
    		db.execSQL("INSERT INTO " + DATABASE_TABLE + "(" + KEY_WORD + ") VALUES ('" + word + "')");
    	} catch(SQLiteConstraintException ex){
    		Log.w(TAG, word + " is not unique");
    	}
    }

    public Cursor getUniqueSortedWords(){
    	Cursor mCursor = db.query(DATABASE_TABLE, new String[] {
    			KEY_WORD }, null, null, null, null, KEY_WORD + " ASC", null);
    	return mCursor;
    }
    
    public Cursor getAllWords(){
        return db.query(DATABASE_TABLE, new String[] {
        		KEY_WORD }, null, null, null, null, null);
    }
    
}