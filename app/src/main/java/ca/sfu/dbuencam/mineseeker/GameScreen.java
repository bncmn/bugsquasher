package ca.sfu.dbuencam.mineseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import ca.sfu.dbuencam.mineseeker.model.UserOptions;

public class GameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        populate();
    }

    private void populate() {
        TableLayout table = findViewById(R.id.game_minebuttons);

        for(int row = 0; row < UserOptions.getInstance().getRows(); row++){
            TableRow tableRow = new TableRow(this);

            tableRow.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.MATCH_PARENT,
                    1.0f ));

            table.addView(tableRow);

            for(int col = 0; col < UserOptions.getInstance().getColumns(); col++){
                final int FINAL_COL = col;
                final int FINAL_ROW = row;

                Button button = new Button(this);

                button.setLayoutParams(new TableRow.LayoutParams(
                        TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.MATCH_PARENT,
                        1.0f ));
                button.setText(col + ", " + row);
                button.setPadding(0, 0, 0, 0);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(FINAL_COL, FINAL_ROW);
                    }
                });

                tableRow.addView(button);
            }
        }
    }

    private void buttonClicked(int x, int y) {
        Toast.makeText(this, "Button clicked " + x + "," + y, Toast.LENGTH_SHORT).show();
    }


}