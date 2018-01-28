package comli.example.c4q.jets.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import comli.example.c4q.jets.R;
import comli.example.c4q.jets.mainoptions.PracticeOptions;

public class PracticeActivity extends AppCompatActivity {

    private Button defense;
   private RecyclerView recyclerView;
   private ArrayList<Play>playArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        recyclerView = findViewById(R.id.o_practice_plays);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3, playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("http://cdn.cloudfiles.mosso.com/c1910342/media_center/images/static/media_box/Boots.png");
       playimage1.setText("– We are seeing this concept every Sunday in the NFL inside of the 5-yard line. Open (or weak) side play action with the Flat-7 (corner) combo. The same route scheme Eli Manning and the Giants ran to beat the Patriots in Foxborough.\n" +
               "\n" +
               "– What is a “Swap Boot?” Different than the Manning TD pass (Lead Open play pass), the Jets want to show action to the closed (or strong) side of the formation with Sanchez rolling back to his left. The FB will step to the play side and come back underneath to the Flat with TE Dustin Keller taking a vertical stem to the 7-cut.");

        playimage2 = new Play();
        playimage2.setURL("http://cdn.cloudfiles.mosso.com/c1910342/media_center/images/static/media_box/Jets.png");
        playimage2.setText("The Jets are working the Smash-7 combo to the open side (No.2 on the ball is a pre-snap key to that combination) with the “Pin” concept to the closed side. The RB will release on the “whip” angle route, but Sanchez wants to work Plaxico Burress and Keller to the short side of the field.\n" +
                "\n" +
                "– To simplify the “Pin” route, think of a deep inside breaking route with an underneath concept. It is a classic Cover 4 (quarters) beater when you target the SS and it also works vs. Cover 1 (man-free) with a CB playing the post (or dig) from outside leverage.");



        playimage3 = new Play();
        playimage3.setURL("http://cdn.cloudfiles.mosso.com/c1910342/media_center/images/static/media_box/tightend.png");
        playimage3.setText("– The Hi-Lo concept shows up in the Eagles' playbook every Sunday and is also a top third down scheme from Mike Martz and the Bears. A intermediate dig route (“Hi”) paired with an underneath crosser (“Lo’'). Two levels for the QB to read on routes that break between the numbers and the hash marks.\n" +
                "\n" +
                "– Check out the formation alignment for the Jets. This looks like a three WR set, but with Ace personnel on the field, the Jets are using some added window dressing to get Holmes in a favorable matchup in the slot. Remove the No.2 TE from the core of the formation as the Z receiver to the closed side.\n" +
                "\n");

        playimage4 = new Play();
        playimage4.setURL("http://cdn.cloudfiles.mosso.com/c1910342/media_center/images/static/media_box/GB40.png");
        playimage4.setText("– A route concept we see every Sunday vs. multiple coverages. No.1 (Jones) on the underneath Smash with No.2 (Cobb) on the deep 7 cut (corner) route. A quick tip: No.2 on the ball (“Exchange”) is an automatic alert to the 7 route.\n" +
                "\n" +
                "– The Lions are playing man-free with the SS (red) using a “cut” technique vs. No.1. With the CB playing from an outside leverage position, the safety will drive downhill on the Smash. Another way to eliminate inside breaking concepts.");

        playimage5 = new Play();
        playimage5.setURL("http://cdn.cloudfiles.mosso.com/c1910342/media_center/images/static/media_box/VJAX1.png");
        playimage5.setText("– Look at Jackson’s initial alignment. Why is he inside of the numbers as the No.3 to the closed (strong) side of the formation? To get the ball. Always alert to a playmaker aligned out of position in a crucial game situation.\n" +
                "\n" +
                "– The Bucs want to create a one-on-one matchup vs. Panthers MLB Luke Kuechly. Remember, in Cover 2 (Tampa 2), the Mike Backer is going to carry the inside vertical seam. Yes, the safeties will overlap on the throw, but this is on the LB to run with speed down the middle of the field.");

        playArrayList.add(playimage1);
        playArrayList.add(playimage2);
        playArrayList.add(playimage3);
        playArrayList.add(playimage4);
        playArrayList.add(playimage5);

        AdapterSon adapterSon = new AdapterSon(playArrayList);
        recyclerView.setAdapter(adapterSon);

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
