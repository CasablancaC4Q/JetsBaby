package comli.example.c4q.jets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.mainoptions.Drills_Option;

public class DrillsActivity extends AppCompatActivity {

    private Button defense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drills);

        Button defense = findViewById(R.id.defense_button_drills);
        defense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrillsActivity.this, Drills_Option.class);
                startActivity(intent);
            }
        });
    }
}
