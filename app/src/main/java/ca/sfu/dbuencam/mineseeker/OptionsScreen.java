package ca.sfu.dbuencam.mineseeker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import ca.sfu.dbuencam.mineseeker.model.UserOptions;

public class OptionsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_screen);

        radioDimensions();
        radioNumMines();
    }

    private void radioDimensions() {
        RadioGroup radioGroup = findViewById(R.id.options_radio_dimensions);
        int[] rows = getResources().getIntArray(R.array.rows);
        int[] cols = getResources().getIntArray(R.array.columns);

        for(int i = 0; i < rows.length; i++){
            final int row = rows[i];
            final int col = cols[i];

            RadioButton button = new RadioButton(this);
            button.setText(row + " rows by " + col + " columns");

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    UserOptions.getInstance().setRows(row);
                    UserOptions.getInstance().setColumns(col);

                    Toast.makeText(OptionsScreen.this, "dimensions in UserOptions: " + UserOptions.getInstance().getRows() + " x " + UserOptions.getInstance().getColumns(), Toast.LENGTH_SHORT).show();
                }
            });

            radioGroup.addView(button);
        }
    }

    private void radioNumMines() {
        RadioGroup radioGroup = findViewById(R.id.options_radio_numMines);
        int[] numMines = getResources().getIntArray(R.array.numMines);

        for(int i = 0; i < numMines.length; i++){
            final int numMine = numMines[i];

            RadioButton button = new RadioButton(this);
            button.setText(numMine + " mines");

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    UserOptions.getInstance().setNumMines(numMine);

                    Toast.makeText(OptionsScreen.this, "numMines in UserOptions: " + UserOptions.getInstance().getNumMines(), Toast.LENGTH_SHORT).show();
                }
            });

            radioGroup.addView(button);
        }
    }
}