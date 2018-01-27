package comli.example.c4q.jets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.mainoptions.PlaybookOptions;
import comli.example.c4q.jets.mainoptions.PracticeOptions;

public class PracticeActivity extends AppCompatActivity {

    private Button defense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


        Button defense = findViewById(R.id.defense_button_practice);
        defense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(PracticeActivity.this, PracticeOptions.class);
                startActivity(newintent);
            }
        });
    }
}
