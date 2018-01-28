package comli.example.c4q.jets.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button playBookButton, workOutButton, drillsButton, practiceButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBookButton = findViewById(R.id.playbook_button);
        workOutButton= findViewById(R.id.workout_button);
        drillsButton= findViewById(R.id.drills_button);
        practiceButton= findViewById(R.id.practice_button);

        playBookButton.setOnClickListener(this);
        workOutButton.setOnClickListener(this);
        drillsButton.setOnClickListener(this);
        practiceButton.setOnClickListener(this);


    }

        @Override
        public void onClick (View view){
            Intent intent = new Intent();

            switch (view.getId()) {


                case R.id.drills_button:
                    intent = new Intent(MainActivity.this, DrillsActivity.class);
                    break;
                case R.id.workout_button:
                    intent = new Intent(MainActivity.this, WorkoutActivity.class);
                    break;
                case R.id.practice_button:
                    intent = new Intent(MainActivity.this, PracticeActivity.class);
                    break;
                case R.id.playbook_button:
                    intent = new Intent(MainActivity.this, PlaybookActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }










    /*
        Button playBookbutton = findViewById(R.id.playbook_button);
        playBookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaybookActivity.class);
                startActivity(intent);
            }
        });

        Button practiceButton = findViewById(R.id.practice_button);
        practiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PracticeActivity.class);
                startActivity(intent);
            }
        });

        Button exercsizeButton = findViewById(R.id.drills_button);
        exercsizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrillsActivity.class);
                startActivity(intent);
            }
        });

        Button workOutButton = findViewById(R.id.workout_button);
        workOutButton.setOnClickListener(this);
*/

