package ca.sfu.dbuencam.mineseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        play();
        options();
        help();
    }

    private void play() {
        Button btn = findViewById(R.id.menu_playbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuScreen.this, GameScreen.class);
                startActivity(intent);
            }
        });
    }

    private void options() {
        Button btn = findViewById(R.id.menu_optionsbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuScreen.this, OptionsScreen.class);
                startActivity(intent);
            }
        });
    }

    private void help() {
        Button btn = findViewById(R.id.menu_helpbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuScreen.this, HelpScreen.class);
                startActivity(intent);
            }
        });
    }
}