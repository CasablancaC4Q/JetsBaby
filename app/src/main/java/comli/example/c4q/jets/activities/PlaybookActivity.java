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
import comli.example.c4q.jets.mainoptions.PlaybookOptions;

public class PlaybookActivity extends AppCompatActivity {

    private Button defense;

   private RecyclerView recyclerView;
    private ArrayList<Play>playArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playbook);


        recyclerView = findViewById(R.id.o_playbook_plays);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3, playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("https://youthfootballzone.files.wordpress.com/2013/01/spin-reverse-play.jpg");
        playimage1.setText("The play starts out like a Spin 2MO 27 Sweep.  QB receives the snaps spins toward the motion back, pitches or hands off to the 2 back and instead of spinning into the LOS he boots to block the DE or CB.  The FB counter jabs playside then hits middle of LOS trying to log block the playside LB.  The O-Line blocks Gap on Linebacker or GOL.  The WB will jab step forward then run a deep sweep lane behind the 2 back sweeping with the ball and receive the ball via pitch / east toss from the 2 back behind the backside OT/OG.  The longer you can wait on the second exchange the better because the defense will flow with the ball.  The WB will run the sweep wide to the numbers unless the DE has gained to much ground which he will then cut underneath the DE and look for open field and goal line. ");

        playimage2 = new Play();
        playimage2.setURL("http://www.footballoutsiders.com/images/Minicamps/slantflats4.jpg");
        playimage2.setText("The diagram to the right shows a classic slant play. This play is often called Slant-and-Flats or Slant-and-Shoot. In Jon Gruden's terminology, it is part of the Jet Smoke series: a set of plays featuring two slants and two flat routes. The play shown here is interpreted from a diagram Gruden used during a presentation at the 2004 coaching clinic, but similar plays can be seen in books like Football's West Coast Offense by Frank Henderson and Mel Olson and various other sources.");

        playimage3 = new Play();
        playimage3.setURL("http://a.espncdn.com/NFL/Cross-Country%20Dagger.jpg");
        playimage3.setText("That's what we see here on the cross-country dagger out of a standard pro I slot formation with wide receivers Julio Jones (Z) and Mohamed Sanu (X) stacked outside. This is a deep clear-out concept, with quarterback Matt Ryan (Q) using the weakside play-action to running back Devonta Freeman (H) to bring the second-level defenders to the line of scrimmage.\n" +
                "\n" +
                "That opens up an inside throwing window to hit Jones on the 15-yard dig-route (square-in) while Sanu bends the seam to run off the top of the secondary. It's a high-percentage throw for Ryan (inside breaking route) with Jones working to the vacated area of the field.");

        playimage4 = new Play();
        playimage4.setURL("http://a.espncdn.com/NFL/R%20Follow.jpg");
        playimage4.setText("With Sanu (Z) and Hooper (Y) in reduced splits, and Freeman (H) aligned on the outside leg of the offensive tackle, the Falcons create a bunch formation (three players close together). This allows Hooper to release upfield on the corner route to generate a mess of bodies as Sanu runs the shallow crosser and Freeman hits the angle route.\n" +
                "\n" +
                "Freeman beat the Seahawks for a big gain in the divisional round with this concept and scored a TD against the Packers in the red zone. Tough to defend.");

        playimage5 = new Play();
        playimage5.setURL("http://a.espncdn.com/NFL/Hi-Lo%20Mesh.jpg");
        playimage5.setText("With two tight ends and two receivers in the game, aligned in a double-stack look, the Falcons can create pick situations at the release with Toilolo (U) running the corner route and Jones (X) coming on the shallow crosser. That gives Ryan a two-level read inside with Jones underneath (low) and Hooper (Y) on the dig (high).\n" +
                "\n" +
                "The key, however, is the release and route of the running back (H). This forces the linebacker in coverage to work through the releases and crossing routes to match the back. That's trouble for the defense when Ryan can get the ball out. Get stuck behind the back, and it could mean six on the board for the Falcons.\n" +
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
                Intent newintent = new Intent(PlaybookActivity.this, PlaybookOptions.class);
                startActivity(newintent);
            }
        });
    }
}
