package comli.example.c4q.jets.mainoptions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.DrillsActivity;
import comli.example.c4q.jets.R;

public class Drills_Option extends AppCompatActivity {

    private Button offense;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drills__option);

        Button offense = findViewById(R.id.offense_button_drills);
        offense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drills_Option.this, DrillsActivity.class);
                startActivity(intent);
            }
        });
    }
}
