package com.azad.sudoku;

import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HardMidActivity extends AppCompatActivity {

    DBGame db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_mid);
        db = new DBGame(this);
    }
    public void Stage1Click(View view)
    {
        // custom dialog
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.stage1midlayout);
        dialog.setTitle("Dou you want to continue?");
        Button btnyes = (Button) dialog.findViewById(R.id.buttonyes);
        TextView tx = (TextView)dialog.findViewById(R.id.textView_complete);
        try {
            Cursor c = db.getTop(30);
            c.moveToFirst();
            int i = c.getColumnIndex("Point");
            String x = c.getString(i);
            i = c.getColumnIndex("Time");
            String y = c.getString(i);
            tx.setText("Best record is " + x + " in " + y + "s");
        }
        catch (Exception e)
        {
            tx.setText("No record submited!");
        }
        Button btnno = (Button) dialog.findViewById(R.id.buttonno);
        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),HardLevel.class);
                i.putExtra("StageNumber",0);
                startActivity(i);
                dialog.cancel();
            }
        });
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dialog.show();
    }
    public void Stage2Click(View view)
    {
        // custom dialog
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.stage1midlayout);
        dialog.setTitle("Dou you want to continue?");
        Button btnyes = (Button) dialog.findViewById(R.id.buttonyes);
        TextView tx = (TextView)dialog.findViewById(R.id.textView_complete);
        try {
            Cursor c = db.getTop(31);
            c.moveToFirst();
            int i = c.getColumnIndex("Point");
            String x = c.getString(i);
            i = c.getColumnIndex("Time");
            String y = c.getString(i);
            tx.setText("Best record is " + x + " in " + y + "s");
        }
        catch (Exception e)
        {
            tx.setText("No record submited!");
        }
        Button btnno = (Button) dialog.findViewById(R.id.buttonno);
        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),HardLevel.class);
                i.putExtra("StageNumber",1);
                startActivity(i);
                dialog.cancel();
            }
        });
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dialog.show();
    }
    public void Stage3Click(View view)
    {
        // custom dialog
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.stage1midlayout);
        dialog.setTitle("Dou you want to continue?");
        Button btnyes = (Button) dialog.findViewById(R.id.buttonyes);
        TextView tx = (TextView)dialog.findViewById(R.id.textView_complete);
        try {
            Cursor c = db.getTop(32);
            c.moveToFirst();
            int i = c.getColumnIndex("Point");
            String x = c.getString(i);
            i = c.getColumnIndex("Time");
            String y = c.getString(i);
            tx.setText("Best record is " + x + " in " + y + "s");
        }
        catch (Exception e)
        {
            tx.setText("No record submited!");
        }
        Button btnno = (Button) dialog.findViewById(R.id.buttonno);
        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),HardLevel.class);
                i.putExtra("StageNumber",2);
                startActivity(i);
                dialog.cancel();
            }
        });
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dialog.show();
    }

}
