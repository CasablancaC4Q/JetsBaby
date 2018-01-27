package comli.example.c4q.jets.mainoptions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.PlaybookActivity;
import comli.example.c4q.jets.R;

public class PlaybookOptions extends AppCompatActivity {

    private Button offense ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playbook_options);

        Button offense = findViewById(R.id.offense_button);
        offense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaybookOptions.this, PlaybookActivity.class);
                startActivity(intent);

            }
        });
    }
}
