package comli.example.c4q.jets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.mainoptions.PlaybookOptions;

public class PlaybookActivity extends AppCompatActivity {

    private Button defense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playbook);

        Button defense = findViewById(R.id.defense_button);
        defense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(PlaybookActivity.this, PlaybookOptions.class);
                startActivity(newintent);
            }
        });
    }
}
