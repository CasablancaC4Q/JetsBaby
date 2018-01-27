package comli.example.c4q.jets.mainoptions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.R;
import comli.example.c4q.jets.WorkoutActivity;

public class WorkoutOptions extends AppCompatActivity {
    private Button weights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_options);

        Button weights = findViewById(R.id.weight_button);
        weights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutOptions.this, WorkoutActivity.class);
                startActivity(intent);

            }
        });
    }
}
