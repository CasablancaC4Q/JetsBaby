package comli.example.c4q.jets.offense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import comli.example.c4q.jets.R;
import comli.example.c4q.jets.mainactivities.AdapterSon;
import comli.example.c4q.jets.mainactivities.Play;
import comli.example.c4q.jets.defense.GameDayDefense;

public class GameDayOffense extends AppCompatActivity {

    private Button defense;

   private RecyclerView recyclerView;
    private ArrayList<Play>playArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_day_offense);


        recyclerView = findViewById(R.id.o_playbook_plays);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3, playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("https://youthfootballzone.files.wordpress.com/2013/01/spin-reverse-play.jpg");
        playimage1.setText(getString(R.string.play1));

        playimage2 = new Play();
        playimage2.setURL("http://www.footballoutsiders.com/images/Minicamps/slantflats4.jpg");
        playimage2.setText(getString(R.string.play2));

        playimage3 = new Play();
        playimage3.setURL("http://a.espncdn.com/NFL/Cross-Country%20Dagger.jpg");
        playimage3.setText(getString(R.string.play3) +
                "\n" +
                getString(R.string.play3_2));

        playimage4 = new Play();
        playimage4.setURL("http://a.espncdn.com/NFL/R%20Follow.jpg");
        playimage4.setText(getString(R.string.play4) +
                "\n" +
                getString(R.string.play4_2));

        playimage5 = new Play();
        playimage5.setURL("http://a.espncdn.com/NFL/Hi-Lo%20Mesh.jpg");
        playimage5.setText(getString(R.string.play5) +
                "\n" +
                getString(R.string.play5_2) +
                "\n");


        playArrayList.add(playimage1);
        playArrayList.add(playimage2);
        playArrayList.add(playimage3);
        playArrayList.add(playimage4);
        playArrayList.add(playimage5);

        AdapterSon adapterSon = new AdapterSon(playArrayList);
        recyclerView.setAdapter(adapterSon);

        Button defense = findViewById(R.id.defense_button);
        defense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(GameDayOffense.this, GameDayDefense.class);
                startActivity(newintent);
            }
        });
    }
}
