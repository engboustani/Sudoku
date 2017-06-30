package com.azad.sudoku;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Hossein Boustani on 6/24/2017.
 */

public class DBGame extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "SudokuPoints.db";
    Context context;

    public DBGame(Context context) {
        super(context, DATABASE_NAME , null, 1);
        this.context = context;
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE \"Scores\" (\n" +
                "\t`_ID`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\t`Time`\tINTEGER,\n" +
                "\t`Point`\tINTEGER,\n" +
                "\t`Date`\tTEXT,\n" +
                "\t`Level`\tINTEGER\n" +
                ");\n");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean insertScore(int point, int time, int level)
    {
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("Time",time);
            contentValues.put("Point",point);
            contentValues.put("Level",level);
            contentValues.put("Date", DateFormat.getDateInstance().format(new Date()));
            db.insert("Scores", null, contentValues);
            Toast.makeText(context,"fuck yeah",Toast.LENGTH_SHORT).show();
            return true;
        }
        catch (Exception e)
        {
            Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public Cursor getTop(int level) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "SELECT * FROM Scores WHERE Level = "+level+" ORDER BY Point DESC, Time ASC LIMIT 1", null );
        return res;
    }

}
