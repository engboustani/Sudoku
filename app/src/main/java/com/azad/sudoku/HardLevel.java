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

public class HardLevel extends AppCompatActivity {

    int[][] matrix = new int[9][9];

    EditText h11;
    EditText h12;
    EditText h13;
    EditText h14;
    EditText h15;
    EditText h16;
    EditText h17;
    EditText h18;
    EditText h19;
    EditText h21;
    EditText h22;
    EditText h23;
    EditText h24;
    EditText h25;
    EditText h26;
    EditText h27;
    EditText h28;
    EditText h29;
    EditText h31;
    EditText h32;
    EditText h33;
    EditText h34;
    EditText h35;
    EditText h36;
    EditText h37;
    EditText h38;
    EditText h39;
    EditText h41;
    EditText h42;
    EditText h43;
    EditText h44;
    EditText h45;
    EditText h46;
    EditText h47;
    EditText h48;
    EditText h49;
    EditText h51;
    EditText h52;
    EditText h53;
    EditText h54;
    EditText h55;
    EditText h56;
    EditText h57;
    EditText h58;
    EditText h59;
    EditText h61;
    EditText h62;
    EditText h63;
    EditText h64;
    EditText h65;
    EditText h66;
    EditText h67;
    EditText h68;
    EditText h69;
    EditText h71;
    EditText h72;
    EditText h73;
    EditText h74;
    EditText h75;
    EditText h76;
    EditText h77;
    EditText h78;
    EditText h79;
    EditText h81;
    EditText h82;
    EditText h83;
    EditText h84;
    EditText h85;
    EditText h86;
    EditText h87;
    EditText h88;
    EditText h89;
    EditText h91;
    EditText h92;
    EditText h93;
    EditText h94;
    EditText h95;
    EditText h96;
    EditText h97;
    EditText h98;
    EditText h99;


    int point = 1000;

    Chronometer cm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int n = getIntent().getIntExtra("StageNumber",0);
        switch (n)
        {
            case 0:
                setContentView(R.layout.hard_level);
                break;
            case 1:
                setContentView(R.layout.hard_level_2);
                break;
            case 2:
                setContentView(R.layout.hard_level_3);
                break;
            default:
                setContentView(R.layout.hard_level);
                break;
        }
        //setContentView(R.layout.hard_level);
        h11 = (EditText)findViewById(R.id.H11);
        h12 = (EditText)findViewById(R.id.H12);
        h13 = (EditText)findViewById(R.id.H13);
        h14 = (EditText)findViewById(R.id.H14);
        h15 = (EditText)findViewById(R.id.H15);
        h16 = (EditText)findViewById(R.id.H16);
        h17 = (EditText)findViewById(R.id.H17);
        h18 = (EditText)findViewById(R.id.H18);
        h19 = (EditText)findViewById(R.id.H19);
        h21 = (EditText)findViewById(R.id.H21);
        h22 = (EditText)findViewById(R.id.H22);
        h23 = (EditText)findViewById(R.id.H23);
        h24 = (EditText)findViewById(R.id.H24);
        h25 = (EditText)findViewById(R.id.H25);
        h26 = (EditText)findViewById(R.id.H26);
        h27 = (EditText)findViewById(R.id.H27);
        h28 = (EditText)findViewById(R.id.H28);
        h29 = (EditText)findViewById(R.id.H29);
        h31 = (EditText)findViewById(R.id.H31);
        h32 = (EditText)findViewById(R.id.H32);
        h33 = (EditText)findViewById(R.id.H33);
        h34 = (EditText)findViewById(R.id.H34);
        h35 = (EditText)findViewById(R.id.H35);
        h36 = (EditText)findViewById(R.id.H36);
        h37 = (EditText)findViewById(R.id.H37);
        h38 = (EditText)findViewById(R.id.H38);
        h39 = (EditText)findViewById(R.id.H39);
        h41 = (EditText)findViewById(R.id.H41);
        h42 = (EditText)findViewById(R.id.H42);
        h43 = (EditText)findViewById(R.id.H43);
        h44 = (EditText)findViewById(R.id.H44);
        h45 = (EditText)findViewById(R.id.H45);
        h46 = (EditText)findViewById(R.id.H46);
        h47 = (EditText)findViewById(R.id.H47);
        h48 = (EditText)findViewById(R.id.H48);
        h49 = (EditText)findViewById(R.id.H49);
        h51 = (EditText)findViewById(R.id.H51);
        h52 = (EditText)findViewById(R.id.H52);
        h53 = (EditText)findViewById(R.id.H53);
        h54 = (EditText)findViewById(R.id.H54);
        h55 = (EditText)findViewById(R.id.H55);
        h56 = (EditText)findViewById(R.id.H56);
        h57 = (EditText)findViewById(R.id.H57);
        h58 = (EditText)findViewById(R.id.H58);
        h59 = (EditText)findViewById(R.id.H59);
        h61 = (EditText)findViewById(R.id.H61);
        h62 = (EditText)findViewById(R.id.H62);
        h63 = (EditText)findViewById(R.id.H63);
        h64 = (EditText)findViewById(R.id.H64);
        h65 = (EditText)findViewById(R.id.H65);
        h66 = (EditText)findViewById(R.id.H66);
        h67 = (EditText)findViewById(R.id.H67);
        h68 = (EditText)findViewById(R.id.H68);
        h69 = (EditText)findViewById(R.id.H69);
        h71 = (EditText)findViewById(R.id.H71);
        h72 = (EditText)findViewById(R.id.H72);
        h73 = (EditText)findViewById(R.id.H73);
        h74 = (EditText)findViewById(R.id.H74);
        h75 = (EditText)findViewById(R.id.H75);
        h76 = (EditText)findViewById(R.id.H76);
        h77 = (EditText)findViewById(R.id.H77);
        h78 = (EditText)findViewById(R.id.H78);
        h79 = (EditText)findViewById(R.id.H79);
        h81 = (EditText)findViewById(R.id.H81);
        h82 = (EditText)findViewById(R.id.H82);
        h83 = (EditText)findViewById(R.id.H83);
        h84 = (EditText)findViewById(R.id.H84);
        h85 = (EditText)findViewById(R.id.H85);
        h86 = (EditText)findViewById(R.id.H86);
        h87 = (EditText)findViewById(R.id.H87);
        h88 = (EditText)findViewById(R.id.H88);
        h89 = (EditText)findViewById(R.id.H89);
        h91 = (EditText)findViewById(R.id.H91);
        h92 = (EditText)findViewById(R.id.H92);
        h93 = (EditText)findViewById(R.id.H93);
        h94 = (EditText)findViewById(R.id.H94);
        h95 = (EditText)findViewById(R.id.H95);
        h96 = (EditText)findViewById(R.id.H96);
        h97 = (EditText)findViewById(R.id.H97);
        h98 = (EditText)findViewById(R.id.H98);
        h99 = (EditText)findViewById(R.id.H99);
        h11.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)});
        h12.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //12);
        h13.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //13);
        h14.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //14);
        h15.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //15);
        h16.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //16);
        h17.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //17);
        h18.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //18);
        h19.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //19);
        h21.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //21);
        h22.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //22);
        h23.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //23);
        h24.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //24);
        h25.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //25);
        h26.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //26);
        h27.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //27);
        h28.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //28);
        h29.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //29);
        h31.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //31);
        h32.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //32);
        h33.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //33);
        h34.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //34);
        h35.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //35);
        h36.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //36);
        h37.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //37);
        h38.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //38);
        h39.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //39);
        h41.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //41);
        h42.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //42);
        h43.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //43);
        h44.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //44);
        h45.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //45);
        h46.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //46);
        h47.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //47);
        h48.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //48);
        h49.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //49);
        h51.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //51);
        h52.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //52);
        h53.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //53);
        h54.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //54);
        h55.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //55);
        h56.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //56);
        h57.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //57);
        h58.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //58);
        h59.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //59);
        h61.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //61);
        h62.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //62);
        h63.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //63);
        h64.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //64);
        h65.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //65);
        h66.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //66);
        h67.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //67);
        h68.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //68);
        h69.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //69);
        h71.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //71);
        h72.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //72);
        h73.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //73);
        h74.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //74);
        h75.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //75);
        h76.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //76);
        h77.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //77);
        h78.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //78);
        h79.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //79);
        h81.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //81);
        h82.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //82);
        h83.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //83);
        h84.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //84);
        h85.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //85);
        h86.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //86);
        h87.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //87);
        h88.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //88);
        h89.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //89);
        h91.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //91);
        h92.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //92);
        h93.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //93);
        h94.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //94);
        h95.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //95);
        h96.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //96);
        h97.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //97);
        h98.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //98);
        h99.setFilters(new InputFilter[]{ new InputFilterMinMax(1, 9)}); //99);
        cm = (Chronometer)findViewById(R.id.easychronometer);
        cm.start();
    }

    public void CheckButton(View view)
    {
        try {
            matrix[0][0] = Integer.parseInt(h11.getText().toString());
            matrix[0][1] = Integer.parseInt(h12.getText().toString());
            matrix[0][2] = Integer.parseInt(h13.getText().toString());
            matrix[0][3] = Integer.parseInt(h14.getText().toString());
            matrix[0][4] = Integer.parseInt(h15.getText().toString());
            matrix[0][5] = Integer.parseInt(h16.getText().toString());
            matrix[0][6] = Integer.parseInt(h17.getText().toString());
            matrix[0][7] = Integer.parseInt(h18.getText().toString());
            matrix[0][8] = Integer.parseInt(h19.getText().toString());
            matrix[1][0] = Integer.parseInt(h21.getText().toString());
            matrix[1][1] = Integer.parseInt(h22.getText().toString());
            matrix[1][2] = Integer.parseInt(h23.getText().toString());
            matrix[1][3] = Integer.parseInt(h24.getText().toString());
            matrix[1][4] = Integer.parseInt(h25.getText().toString());
            matrix[1][5] = Integer.parseInt(h26.getText().toString());
            matrix[1][6] = Integer.parseInt(h27.getText().toString());
            matrix[1][7] = Integer.parseInt(h28.getText().toString());
            matrix[1][8] = Integer.parseInt(h29.getText().toString());
            matrix[2][0] = Integer.parseInt(h31.getText().toString());
            matrix[2][1] = Integer.parseInt(h32.getText().toString());
            matrix[2][2] = Integer.parseInt(h33.getText().toString());
            matrix[2][3] = Integer.parseInt(h34.getText().toString());
            matrix[2][4] = Integer.parseInt(h35.getText().toString());
            matrix[2][5] = Integer.parseInt(h36.getText().toString());
            matrix[2][6] = Integer.parseInt(h37.getText().toString());
            matrix[2][7] = Integer.parseInt(h38.getText().toString());
            matrix[2][8] = Integer.parseInt(h39.getText().toString());
            matrix[3][0] = Integer.parseInt(h41.getText().toString());
            matrix[3][1] = Integer.parseInt(h42.getText().toString());
            matrix[3][2] = Integer.parseInt(h43.getText().toString());
            matrix[3][3] = Integer.parseInt(h44.getText().toString());
            matrix[3][4] = Integer.parseInt(h45.getText().toString());
            matrix[3][5] = Integer.parseInt(h46.getText().toString());
            matrix[3][6] = Integer.parseInt(h47.getText().toString());
            matrix[3][7] = Integer.parseInt(h48.getText().toString());
            matrix[3][8] = Integer.parseInt(h49.getText().toString());
            matrix[4][0] = Integer.parseInt(h51.getText().toString());
            matrix[4][1] = Integer.parseInt(h52.getText().toString());
            matrix[4][2] = Integer.parseInt(h53.getText().toString());
            matrix[4][3] = Integer.parseInt(h54.getText().toString());
            matrix[4][4] = Integer.parseInt(h55.getText().toString());
            matrix[4][5] = Integer.parseInt(h56.getText().toString());
            matrix[4][6] = Integer.parseInt(h57.getText().toString());
            matrix[4][7] = Integer.parseInt(h58.getText().toString());
            matrix[4][8] = Integer.parseInt(h59.getText().toString());
            matrix[5][0] = Integer.parseInt(h61.getText().toString());
            matrix[5][1] = Integer.parseInt(h62.getText().toString());
            matrix[5][2] = Integer.parseInt(h63.getText().toString());
            matrix[5][3] = Integer.parseInt(h64.getText().toString());
            matrix[5][4] = Integer.parseInt(h65.getText().toString());
            matrix[5][5] = Integer.parseInt(h66.getText().toString());
            matrix[5][6] = Integer.parseInt(h67.getText().toString());
            matrix[5][7] = Integer.parseInt(h68.getText().toString());
            matrix[5][8] = Integer.parseInt(h69.getText().toString());
            matrix[6][0] = Integer.parseInt(h71.getText().toString());
            matrix[6][1] = Integer.parseInt(h72.getText().toString());
            matrix[6][2] = Integer.parseInt(h73.getText().toString());
            matrix[6][3] = Integer.parseInt(h74.getText().toString());
            matrix[6][4] = Integer.parseInt(h75.getText().toString());
            matrix[6][5] = Integer.parseInt(h76.getText().toString());
            matrix[6][6] = Integer.parseInt(h77.getText().toString());
            matrix[6][7] = Integer.parseInt(h78.getText().toString());
            matrix[6][8] = Integer.parseInt(h79.getText().toString());
            matrix[7][0] = Integer.parseInt(h81.getText().toString());
            matrix[7][1] = Integer.parseInt(h82.getText().toString());
            matrix[7][2] = Integer.parseInt(h83.getText().toString());
            matrix[7][3] = Integer.parseInt(h84.getText().toString());
            matrix[7][4] = Integer.parseInt(h85.getText().toString());
            matrix[7][5] = Integer.parseInt(h86.getText().toString());
            matrix[7][6] = Integer.parseInt(h87.getText().toString());
            matrix[7][7] = Integer.parseInt(h88.getText().toString());
            matrix[7][8] = Integer.parseInt(h89.getText().toString());
            matrix[8][0] = Integer.parseInt(h91.getText().toString());
            matrix[8][1] = Integer.parseInt(h92.getText().toString());
            matrix[8][2] = Integer.parseInt(h93.getText().toString());
            matrix[8][3] = Integer.parseInt(h94.getText().toString());
            matrix[8][4] = Integer.parseInt(h95.getText().toString());
            matrix[8][5] = Integer.parseInt(h96.getText().toString());
            matrix[8][6] = Integer.parseInt(h97.getText().toString());
            matrix[8][7] = Integer.parseInt(h98.getText().toString());
            matrix[8][8] = Integer.parseInt(h99.getText().toString());
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
            db.insertScore(point, (int)elapsedMillis/1000, 30+getIntent().getIntExtra("StageNumber",0));
        }
        else
        {
            Toast.makeText(this, "you fucked up bro!!!", Toast.LENGTH_SHORT).show();
            point-=10;

        }
    }

    private boolean checkSudokuStatus(int[][] grid) {
        for (int i = 0; i < 9; i++) {

            int[] row = new int[9];
            int[] square = new int[9];
            int[] column = grid[i].clone();

            for (int j = 0; j < 9; j ++) {
                row[j] = grid[j][i];
                square[j] = grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
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
