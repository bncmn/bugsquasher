package ca.sfu.dbuencam.mineseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class TitleScreen extends AppCompatActivity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        skip();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TitleScreen.this, MenuScreen.class);
                startActivity(intent);
            }
        }, 4000);
    }

    private void skip() {
        Button btn = findViewById(R.id.title_skipbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (handler != null)
                    handler.removeCallbacksAndMessages(null);

                Intent intent = new Intent(TitleScreen.this, MenuScreen.class);
                startActivity(intent);
            }
        });
    }
}