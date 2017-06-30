package com.azad.sudoku;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

public class EasyLevel extends AppCompatActivity {

    int[][] matrix = new int[4][4];

    EditText e11;
    EditText e12;
    EditText e13;
    EditText e14;
    EditText e21;
    EditText e22;
    EditText e23;
    EditText e24;
    EditText e31;
    EditText e32;
    EditText e33;
    EditText e34;
    EditText e41;
    EditText e42;
    EditText e43;
    EditText e44;

    int point = 1000;

    Chronometer cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int n = getIntent().getIntExtra("StageNumber",0);
        switch (n)
        {
            case 0:
                setContentView(R.layout.easy_level);
                break;
            case 1:
                setContentView(R.layout.easy_level_2);
                break;
            case 2:
                setContentView(R.layout.easy_level_3);
                break;
            default:
                setContentView(R.layout.easy_level);
                break;
        }

        e11 = (EditText)findViewById(R.id.E11);
        e12 = (EditText)findViewById(R.id.E12);
        e13 = (EditText)findViewById(R.id.E13);
        e14 = (EditText)findViewById(R.id.E14);
        e21 = (EditText)findViewById(R.id.E21);
        e22 = (EditText)findViewById(R.id.E22);
        e23 = (EditText)findViewById(R.id.E23);
        e24 = (EditText)findViewById(R.id.E24);
        e31 = (EditText)findViewById(R.id.E31);
        e32 = (EditText)findViewById(R.id.E32);
        e33 = (EditText)findViewById(R.id.E33);
        e34 = (EditText)findViewById(R.id.E34);
        e41 = (EditText)findViewById(R.id.E41);
        e42 = (EditText)findViewById(R.id.E42);
        e43 = (EditText)findViewById(R.id.E43);
        e44 = (EditText)findViewById(R.id.E44);
        e11.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e12.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e13.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e14.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e21.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e22.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e23.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e24.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e31.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e32.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e33.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e34.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e41.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e42.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e43.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        e44.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 4)});
        cm = (Chronometer)findViewById(R.id.easychronometer);
        cm.start();
    }

    public void CheckButton(View view)
    {
        try {
            matrix[0][0] = Integer.parseInt(e11.getText().toString());
            matrix[0][1] = Integer.parseInt(e12.getText().toString());
            matrix[0][2] = Integer.parseInt(e13.getText().toString());
            matrix[0][3] = Integer.parseInt(e14.getText().toString());
            matrix[1][0] = Integer.parseInt(e21.getText().toString());
            matrix[1][1] = Integer.parseInt(e22.getText().toString());
            matrix[1][2] = Integer.parseInt(e23.getText().toString());
            matrix[1][3] = Integer.parseInt(e24.getText().toString());
            matrix[2][0] = Integer.parseInt(e31.getText().toString());
            matrix[2][1] = Integer.parseInt(e32.getText().toString());
            matrix[2][2] = Integer.parseInt(e33.getText().toString());
            matrix[2][3] = Integer.parseInt(e34.getText().toString());
            matrix[3][0] = Integer.parseInt(e41.getText().toString());
            matrix[3][1] = Integer.parseInt(e42.getText().toString());
            matrix[3][2] = Integer.parseInt(e43.getText().toString());
            matrix[3][3] = Integer.parseInt(e44.getText().toString());
        }
        catch (Exception i)
        {
            return;
        }
        boolean check = checkSudokuStatus(matrix);
        if(check)
        {
            Toast.makeText(this, "it's true", Toast.LENGTH_SHORT).show();
            DBGame db = new DBGame(this);
            cm.stop();
            long time = cm.getBase();
            long elapsedMillis = SystemClock.elapsedRealtime() - time;
            db.insertScore(point, (int)elapsedMillis/1000, 10+getIntent().getIntExtra("StageNumber",0));
        }
        else
        {
            Toast.makeText(this, "you fucked up bro!!!", Toast.LENGTH_SHORT).show();
            point-=10;

        }
    }

    private boolean checkSudokuStatus(int[][] grid) {
        for (int i = 0; i < 4; i++) {

            int[] row = new int[4];
            int[] square = new int[4];
            int[] column = grid[i].clone();

            for (int j = 0; j < 4; j ++) {
                row[j] = grid[j][i];
                square[j] = grid[(i / 2) * 2 + j / 2][i * 2 % 4 + j % 2];
            }
            if (!(validate(column) && validate(row) && validate(square)))
                return false;
        }
        return true;
    }

    private boolean validate(int[] check) {
        int i = 0;
        Arrays.sort(check);
        for (int number : check) {
            if (number != ++i)
                return false;
        }
        return true;
    }
}
