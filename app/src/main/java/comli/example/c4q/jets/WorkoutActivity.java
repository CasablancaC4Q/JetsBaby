package comli.example.c4q.jets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.mainoptions.WorkoutOptions;

public class WorkoutActivity extends AppCompatActivity {

    private Button running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Button running = findViewById(R.id.running_button);
        running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutActivity.this, WorkoutOptions.class);
                startActivity(intent);

            }
        });

    }
}
