package comli.example.c4q.jets.splashs;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comli.example.c4q.jets.mainactivities.MainActivity;
import comli.example.c4q.jets.R;
import comli.example.c4q.jets.mainactivities.PositionSelect;

public class Splashbitch extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashbitch);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashbitch.this, PositionSelect.class);
                startActivity(intent);

            }
        }, SPLASH_TIME_OUT);
    }
}
