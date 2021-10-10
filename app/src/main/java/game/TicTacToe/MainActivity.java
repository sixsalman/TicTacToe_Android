package game.TicTacToe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    private Button[] btn = new Button[9];
    private String comp;
    private String player;
    private HashSet<Integer> empSpots = new HashSet<>(9);
    private TextView txtWinner;
    private boolean end = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn[0] = findViewById(R.id.btn0);
        btn[1] = findViewById(R.id.btn1);
        btn[2] = findViewById(R.id.btn2);
        btn[3] = findViewById(R.id.btn3);
        btn[4] = findViewById(R.id.btn4);
        btn[5] = findViewById(R.id.btn5);
        btn[6] = findViewById(R.id.btn6);
        btn[7] = findViewById(R.id.btn7);
        btn[8] = findViewById(R.id.btn8);
        txtWinner = findViewById(R.id.txtWinner);

    }

    public void btnNewAsX(View view) {

        reset();

        player = "X";
        comp = "O";

    }

    public void btnNewAsO(View view) {

        reset();

        player = "O";
        comp = "X";

    }

    public void btn0(View view) {

        if (btn[0].getText().equals("") && !end) {
            btn[0].setText(player);
            empSpots.remove(0);
            commonSteps();
        }

    }

    public void btn1(View view) {

        if (btn[1].getText().equals("") && !end) {
            btn[1].setText(player);
            empSpots.remove(1);
            commonSteps();
        }

    }

    public void btn2(View view) {

        if (btn[2].getText().equals("") && !end) {
            btn[2].setText(player);
            empSpots.remove(2);
            commonSteps();
        }

    }

    public void btn3(View view) {

        if (btn[3].getText().equals("") && !end) {
            btn[3].setText(player);
            empSpots.remove(3);
            commonSteps();
        }

    }

    public void btn4(View view) {

        if (btn[4].getText().equals("") && !end) {
            btn[4].setText(player);
            empSpots.remove(4);
            commonSteps();
        }

    }

    public void btn5(View view) {

        if (btn[5].getText().equals("") && !end) {
            btn[5].setText(player);
            empSpots.remove(5);
            commonSteps();
        }

    }

    public void btn6(View view) {

        if (btn[6].getText().equals("") && !end) {
            btn[6].setText(player);
            empSpots.remove(6);
            commonSteps();
        }

    }

    public void btn7(View view) {

        if (btn[7].getText().equals("") && !end) {
            btn[7].setText(player);
            empSpots.remove(7);
            commonSteps();
        }

    }

    public void btn8(View view) {

        if (btn[8].getText().equals("") && !end) {
            btn[8].setText(player);
            empSpots.remove(8);
            commonSteps();
        }

    }

    private void compTurn() {

        if ((btn[0].getText().equals(player) && btn[2].getText().equals(player) ||
                btn[0].getText().equals(comp) && btn[2].getText().equals(comp)) &&
                empSpots.contains(1)) {
            btn[1].setText(comp);
            empSpots.remove(1);
        } else if ((btn[3].getText().equals(player) && btn[5].getText().equals(player) ||
                btn[3].getText().equals(comp) && btn[5].getText().equals(comp)) &&
                empSpots.contains(4)) {
            btn[4].setText(comp);
            empSpots.remove(4);
        } else if ((btn[6].getText().equals(player) && btn[8].getText().equals(player) ||
                btn[6].getText().equals(comp) && btn[8].getText().equals(comp)) &&
                empSpots.contains(7)) {
            btn[7].setText(comp);
            empSpots.remove(7);
        } else if ((btn[0].getText().equals(player) && btn[6].getText().equals(player) ||
                btn[0].getText().equals(comp) && btn[6].getText().equals(comp)) &&
                empSpots.contains(3)) {
            btn[3].setText(comp);
            empSpots.remove(3);
        } else if ((btn[1].getText().equals(player) && btn[7].getText().equals(player) ||
                btn[1].getText().equals(comp) && btn[7].getText().equals(comp)) &&
                empSpots.contains(4)) {
            btn[4].setText(comp);
            empSpots.remove(4);
        } else if ((btn[2].getText().equals(player) && btn[8].getText().equals(player) ||
                btn[2].getText().equals(comp) && btn[8].getText().equals(comp)) &&
                empSpots.contains(5)) {
            btn[5].setText(comp);
            empSpots.remove(5);
        } else if ((btn[0].getText().equals(player) && btn[8].getText().equals(player) ||
                btn[0].getText().equals(comp) && btn[8].getText().equals(comp)) &&
                empSpots.contains(4)) {
            btn[4].setText(comp);
            empSpots.remove(4);
        } else if ((btn[2].getText().equals(player) && btn[6].getText().equals(player) ||
                btn[2].getText().equals(comp) && btn[6].getText().equals(comp)) &&
                empSpots.contains(4)) {
            btn[4].setText(comp);
            empSpots.remove(4);
        } else if ((btn[0].getText().equals(player) && btn[1].getText().equals(player) ||
                btn[0].getText().equals(comp) && btn[1].getText().equals(comp)) &&
                empSpots.contains(2)) {
            btn[2].setText(comp);
            empSpots.remove(2);
        } else if ((btn[3].getText().equals(player) && btn[4].getText().equals(player) ||
                btn[3].getText().equals(comp) && btn[4].getText().equals(comp)) &&
                empSpots.contains(5)) {
            btn[5].setText(comp);
            empSpots.remove(5);
        } else if ((btn[6].getText().equals(player) && btn[7].getText().equals(player) ||
                btn[6].getText().equals(comp) && btn[7].getText().equals(comp)) &&
                empSpots.contains(8)) {
            btn[8].setText(comp);
            empSpots.remove(8);
        } else if ((btn[0].getText().equals(player) && btn[3].getText().equals(player) ||
                btn[0].getText().equals(comp) && btn[3].getText().equals(comp)) &&
                empSpots.contains(6)) {
            btn[6].setText(comp);
            empSpots.remove(6);
        } else if ((btn[1].getText().equals(player) && btn[4].getText().equals(player) ||
                btn[1].getText().equals(comp) && btn[4].getText().equals(comp)) &&
                empSpots.contains(7)) {
            btn[7].setText(comp);
            empSpots.remove(7);
        } else if ((btn[2].getText().equals(player) && btn[5].getText().equals(player) ||
                btn[2].getText().equals(comp) && btn[5].getText().equals(comp)) &&
                empSpots.contains(8)) {
            btn[8].setText(comp);
            empSpots.remove(8);
        } else if ((btn[1].getText().equals(player) && btn[2].getText().equals(player) ||
                btn[1].getText().equals(comp) && btn[2].getText().equals(comp)) &&
                empSpots.contains(0)) {
            btn[0].setText(comp);
            empSpots.remove(0);
        } else if ((btn[4].getText().equals(player) && btn[5].getText().equals(player) ||
                btn[4].getText().equals(comp) && btn[5].getText().equals(comp)) &&
                empSpots.contains(3)) {
            btn[3].setText(comp);
            empSpots.remove(3);
        } else if ((btn[7].getText().equals(player) && btn[8].getText().equals(player) ||
                btn[7].getText().equals(comp) && btn[8].getText().equals(comp)) &&
                empSpots.contains(6)) {
            btn[6].setText(comp);
            empSpots.remove(6);
        } else if ((btn[3].getText().equals(player) && btn[6].getText().equals(player) ||
                btn[3].getText().equals(comp) && btn[6].getText().equals(comp)) &&
                empSpots.contains(0)) {
            btn[0].setText(comp);
            empSpots.remove(0);
        } else if ((btn[4].getText().equals(player) && btn[7].getText().equals(player) ||
                btn[4].getText().equals(comp) && btn[7].getText().equals(comp)) &&
                empSpots.contains(1)) {
            btn[1].setText(comp);
            empSpots.remove(1);
        } else if ((btn[5].getText().equals(player) && btn[8].getText().equals(player) ||
                btn[5].getText().equals(comp) && btn[8].getText().equals(comp)) &&
                empSpots.contains(2)) {
            btn[2].setText(comp);
            empSpots.remove(2);
        } else if ((btn[0].getText().equals(player) && btn[4].getText().equals(player) ||
                btn[0].getText().equals(comp) && btn[4].getText().equals(comp)) &&
                empSpots.contains(8)) {
            btn[8].setText(comp);
            empSpots.remove(8);
        } else if ((btn[4].getText().equals(player) && btn[8].getText().equals(player) ||
                btn[4].getText().equals(comp) && btn[8].getText().equals(comp)) &&
                empSpots.contains(0)) {
            btn[0].setText(comp);
            empSpots.remove(0);
        } else if ((btn[6].getText().equals(player) && btn[4].getText().equals(player) ||
                btn[6].getText().equals(comp) && btn[4].getText().equals(comp)) &&
                empSpots.contains(2)) {
            btn[2].setText(comp);
            empSpots.remove(2);
        } else if ((btn[2].getText().equals(player) && btn[4].getText().equals(player) ||
                btn[2].getText().equals(comp) && btn[4].getText().equals(comp)) &&
                empSpots.contains(6)) {
            btn[6].setText(comp);
            empSpots.remove(6);
        } else {
            Iterator empSpotsItr = empSpots.iterator();
            btn[(int) empSpotsItr.next()].setText(comp);
            empSpotsItr.remove();
        }

    }

    private void commonSteps () {
        if (checkWin(player)) {
            txtWinner.setText("YOU WIN!");
            txtWinner.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            end = true;
            return;
        }
        compTurn();
        if (checkWin(comp)) {
            txtWinner.setText("BOT WON");
            txtWinner.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            end = true;
            return;
        }
        if(empSpots.size() == 1)
            checkDraw();
    }

    private boolean checkWin(String sign) {

        if (btn[0].getText().equals(sign) && btn[1].getText().equals(sign) &&
                btn[2].getText().equals(sign)) {
            highlightBoxes(0, 1, 2);
            return true;
        } else if (btn[3].getText().equals(sign) && btn[4].getText().equals(sign) &&
                btn[5].getText().equals(sign)) {
            highlightBoxes(3, 4, 5);
            return true;
        } else if (btn[6].getText().equals(sign) && btn[7].getText().equals(sign) &&
                btn[8].getText().equals(sign)) {
            highlightBoxes(6, 7, 8);
            return true;
        } else if (btn[0].getText().equals(sign) && btn[3].getText().equals(sign) &&
                btn[6].getText().equals(sign)) {
            highlightBoxes(0, 3, 6);
            return true;
        } else if (btn[1].getText().equals(sign) && btn[4].getText().equals(sign) &&
                btn[7].getText().equals(sign)) {
            highlightBoxes(1, 4, 7);
            return true;
        } else if (btn[2].getText().equals(sign) && btn[5].getText().equals(sign) &&
                btn[8].getText().equals(sign)) {
            highlightBoxes(2, 5, 8);
            return true;
        } else if (btn[0].getText().equals(sign) && btn[4].getText().equals(sign) &&
                btn[8].getText().equals(sign)) {
            highlightBoxes(0, 4, 8);
            return true;
        } else if (btn[2].getText().equals(sign) && btn[4].getText().equals(sign) &&
                btn[6].getText().equals(sign)) {
            highlightBoxes(2, 4, 6);
            return true;
        }

        return false;

    }

    private void checkDraw() {

        if(checkWin(player)){
            txtWinner.setText("YOU WIN!");
            txtWinner.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        } else if (checkWin(comp)){
            txtWinner.setText("BOT WON");
            txtWinner.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        } else {
            txtWinner.setText("IT'S A DRAW");
            txtWinner.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        }
        end = true;

    }

    private void highlightBoxes (int i, int j, int k) {

        btn[i].setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        btn[i].setTextColor(Color.parseColor("#FF9800"));

        btn[j].setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        btn[j].setTextColor(Color.parseColor("#FF9800"));

        btn[k].setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        btn[k].setTextColor(Color.parseColor("#FF9800"));

    }

    private void reset () {
        txtWinner.setText("");
        txtWinner.setBackgroundColor(Color.parseColor("#FF9800"));
        for (Button thisBtn : btn) {
            thisBtn.setBackgroundColor(Color.parseColor("#FF9800"));
            thisBtn.setTextColor(Color.parseColor("#FFFFFF"));
            thisBtn.setText("");
        }
        empSpots.clear();
        for (int i = 0; i < 9; i++)
            empSpots.add(i);
        end = false;
    }

}