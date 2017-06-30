package com.azad.sudoku;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

public class NormalLevel extends AppCompatActivity {

    int[][] matrix = new int[6][6];

    EditText n11;
    EditText n12;
    EditText n13;
    EditText n14;
    EditText n15;
    EditText n16;
    EditText n21;
    EditText n22;
    EditText n23;
    EditText n24;
    EditText n25;
    EditText n26;
    EditText n31;
    EditText n32;
    EditText n33;
    EditText n34;
    EditText n35;
    EditText n36;
    EditText n41;
    EditText n42;
    EditText n43;
    EditText n44;
    EditText n45;
    EditText n46;
    EditText n51;
    EditText n52;
    EditText n53;
    EditText n54;
    EditText n55;
    EditText n56;
    EditText n61;
    EditText n62;
    EditText n63;
    EditText n64;
    EditText n65;
    EditText n66;


    int point = 1000;

    Chronometer cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int n = getIntent().getIntExtra("StageNumber",0);
        switch (n)
        {
            case 0:
                setContentView(R.layout.normal_level);
                break;
            case 1:
                setContentView(R.layout.normal_level_2);
                break;
            case 2:
                setContentView(R.layout.normal_level_3);
                break;
            default:
                setContentView(R.layout.normal_level);
                break;
        }
        //setContentView(R.layout.normal_level);
        n11 = (EditText)findViewById(R.id.N11);
        n12 = (EditText)findViewById(R.id.N12);
        n13 = (EditText)findViewById(R.id.N13);
        n14 = (EditText)findViewById(R.id.N14);
        n15 = (EditText)findViewById(R.id.N15);
        n16 = (EditText)findViewById(R.id.N16);
        n21 = (EditText)findViewById(R.id.N21);
        n22 = (EditText)findViewById(R.id.N22);
        n23 = (EditText)findViewById(R.id.N23);
        n24 = (EditText)findViewById(R.id.N24);
        n25 = (EditText)findViewById(R.id.N25);
        n26 = (EditText)findViewById(R.id.N26);
        n31 = (EditText)findViewById(R.id.N31);
        n32 = (EditText)findViewById(R.id.N32);
        n33 = (EditText)findViewById(R.id.N33);
        n34 = (EditText)findViewById(R.id.N34);
        n35 = (EditText)findViewById(R.id.N35);
        n36 = (EditText)findViewById(R.id.N36);
        n41 = (EditText)findViewById(R.id.N41);
        n42 = (EditText)findViewById(R.id.N42);
        n43 = (EditText)findViewById(R.id.N43);
        n44 = (EditText)findViewById(R.id.N44);
        n45 = (EditText)findViewById(R.id.N45);
        n46 = (EditText)findViewById(R.id.N46);
        n51 = (EditText)findViewById(R.id.N51);
        n52 = (EditText)findViewById(R.id.N52);
        n53 = (EditText)findViewById(R.id.N53);
        n54 = (EditText)findViewById(R.id.N54);
        n55 = (EditText)findViewById(R.id.N55);
        n56 = (EditText)findViewById(R.id.N56);
        n61 = (EditText)findViewById(R.id.N61);
        n62 = (EditText)findViewById(R.id.N62);
        n63 = (EditText)findViewById(R.id.N63);
        n64 = (EditText)findViewById(R.id.N64);
        n65 = (EditText)findViewById(R.id.N65);
        n66 = (EditText)findViewById(R.id.N66);
        n11.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n12.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n13.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n14.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n15.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n16.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n21.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n22.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n23.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n24.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n25.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n26.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n31.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n32.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n33.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n34.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n35.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n36.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n41.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n42.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n43.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n44.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n45.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n46.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n51.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n52.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n53.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n54.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n55.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n56.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n61.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n62.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n63.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n64.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n65.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        n66.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 6)});
        cm = (Chronometer)findViewById(R.id.easychronometer);
        cm.start();
    }

    public void CheckButton(View view)
    {
        try {
            matrix[0][0] = Integer.parseInt(n11.getText().toString());
            matrix[0][1] = Integer.parseInt(n12.getText().toString());
            matrix[0][2] = Integer.parseInt(n13.getText().toString());
            matrix[0][3] = Integer.parseInt(n14.getText().toString());
            matrix[0][4] = Integer.parseInt(n15.getText().toString());
            matrix[0][5] = Integer.parseInt(n16.getText().toString());
            matrix[1][0] = Integer.parseInt(n21.getText().toString());
            matrix[1][1] = Integer.parseInt(n22.getText().toString());
            matrix[1][2] = Integer.parseInt(n23.getText().toString());
            matrix[1][3] = Integer.parseInt(n24.getText().toString());
            matrix[1][4] = Integer.parseInt(n25.getText().toString());
            matrix[1][5] = Integer.parseInt(n26.getText().toString());
            matrix[2][0] = Integer.parseInt(n31.getText().toString());
            matrix[2][1] = Integer.parseInt(n32.getText().toString());
            matrix[2][2] = Integer.parseInt(n33.getText().toString());
            matrix[2][3] = Integer.parseInt(n34.getText().toString());
            matrix[2][4] = Integer.parseInt(n35.getText().toString());
            matrix[2][5] = Integer.parseInt(n36.getText().toString());
            matrix[3][0] = Integer.parseInt(n41.getText().toString());
            matrix[3][1] = Integer.parseInt(n42.getText().toString());
            matrix[3][2] = Integer.parseInt(n43.getText().toString());
            matrix[3][3] = Integer.parseInt(n44.getText().toString());
            matrix[3][4] = Integer.parseInt(n45.getText().toString());
            matrix[3][5] = Integer.parseInt(n46.getText().toString());
            matrix[4][0] = Integer.parseInt(n51.getText().toString());
            matrix[4][1] = Integer.parseInt(n52.getText().toString());
            matrix[4][2] = Integer.parseInt(n53.getText().toString());
            matrix[4][3] = Integer.parseInt(n54.getText().toString());
            matrix[4][4] = Integer.parseInt(n55.getText().toString());
            matrix[4][5] = Integer.parseInt(n56.getText().toString());
            matrix[5][0] = Integer.parseInt(n61.getText().toString());
            matrix[5][1] = Integer.parseInt(n62.getText().toString());
            matrix[5][2] = Integer.parseInt(n63.getText().toString());
            matrix[5][3] = Integer.parseInt(n64.getText().toString());
            matrix[5][4] = Integer.parseInt(n65.getText().toString());
            matrix[5][5] = Integer.parseInt(n66.getText().toString());
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
            db.insertScore(point, (int)elapsedMillis/1000, 20+getIntent().getIntExtra("StageNumber",0));
        }
        else
        {
            Toast.makeText(this, "you fucked up bro!!!", Toast.LENGTH_SHORT).show();
            point-=10;

        }
    }

    private boolean checkSudokuStatus(int[][] grid) {
        for (int i = 0; i < 6; i++) {

            int[] row = new int[6];
            int[] square = new int[6];
            int[] column = grid[i].clone();

            for (int j = 0; j < 6; j ++) {
                row[j] = grid[j][i];
                int x = (i / 2) * 2 + j / 3;
                int y = i * 3 % 6 + j % 3;
                square[j] = grid[x][y];
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
