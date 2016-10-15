package com.example.nlipski.myapplication;

/**
 * Created by Nlipski on 2016-10-15.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Plantr.db";
    public static final String PLANTS_TABLE_NAME = "plants";
    public static final String PLANTS_COLUMN_ID = "id";
    public static final String PLANTS_COLUMN_NAME = "name";
    public static final String PLANTS_COLUMN_DESCRIPTION = "description";
    public static final String PLANTS_COLUMN_AMOUNT = "amount_watering";
    public static final String PLANTS_COLUMN_FREQUENCY = "frequency_watering";
    public static final String PLANTS_COLUMN_SUNLIGHT = "sunlight";
    private HashMap hp;

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table plants " +
                        "(id integer primary key, name text,description text,watering_amount integer, watering_frequency integer,sunlight integer)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS plants");
        onCreate(db);
    }

    public boolean insertPlant  (String name, String description, int  watering_amount, int watering_frequency,String place)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("description", description);
        contentValues.put("watering_amount", watering_amount);
        contentValues.put("watering_frequency", watering_frequency);
        contentValues.put("place", place);
        db.insert("plants", null, contentValues);
        return true;
    }

    public Cursor getData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts where id="+id+"", null );
        return res;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, PLANTS_TABLE_NAME);
        return numRows;
    }


    public Integer deletePlant (Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("plants",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }

    public ArrayList<String> getAllPlants()
    {
        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from plants", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(PLANTS_COLUMN_NAME)));
            res.moveToNext();
        }
        return array_list;
    }
}