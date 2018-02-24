package comli.example.c4q.jets.workouts;

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

public class DrillsActivity extends AppCompatActivity {

    private Button defense;
   private RecyclerView recyclerView;
    private ArrayList<Play> playArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drills);

        recyclerView = findViewById(R.id.o_drills);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3 , playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("https://www.footballdrills.com/wp-content/uploads/qb-the-ritual-4-cone-z-drill.gif");
        playimage1.setText("Make a box of four flat cone/markers, 6-7 yards apart. On the coaches command the quarterback executes a 5 step drop from the forward cone/marker which should have the plant foot of his fifth step at the back cone/marker. Off the plant the quarterback sprints diagonally to the forward cone/marker and again executes a five step drop to the back cone/marker. Again, off the plant foot of the fifth step he again sprints diagonally towards the forward cone/marker. Key points of emphasis:\n" +
                "1) QB head is up and forward and always looking at the coach running the drill.\n" +
                "2) This is a ‘speed’ drill were the drops and diagonal sprints are at full speed. This helps the QB develop speed in his 5 step drop.");

        playimage2 = new Play();
        playimage2.setURL("https://www.footballdrills.com/wp-content/uploads/qb-the-ritual-4-cone-z-drill.gif");
        playimage2.setText("In this drill you have 6 cone/markers aligned 3 yards apart form each other making a rectangle. On the coaches command the quarterback executes a 5 Step Drop, past the first cone/marker to the deepest cone/marker 6 yards away. On the plant/fifth step the QB slides left 3 yards to the next cone/marker then sprints forward 3 yards to a cone/marker then slides back right to the cone/marker. Again he plants and sprints forward to the original cone/marker and then slides left to the last cone/marker. After all QBs have executed the drill they repeat the drill in the opposite direction from where they ended. Key Points of emphasis:\n" +
                "\n" +
                "1) Again QBs head is up with eyes forward throughout every phase of this drill.\n" +
                "2) QBs are always on their toes, this drill helps work with the ‘scrambling’ aspect of the quarterback.");

        playimage3 = new Play();
        playimage3.setURL("https://coachad.com/wp-content/uploads/images/MAYFootball20BoxSlideDrill2008.jpg");
        playimage3.setText("In Drill 6, the cone/markers are aligned 3 yards apart forming a rectangle. On the coach’s command, the QB executes a five-step drop, past the first cone/marker to the deepest cone/marker 6 yards away.\n" +
                "\n" +
                "On the plant/fifth step, the QB slides left 3 yards to the next cone/marker then sprints forward 3 yards to a cone/marker, then slides back right to the cone/marker.\n" +
                "\n" +
                "Again he plants and sprints forward to the original cone/marker and then slides left to the last cone/marker. After every QB has executed the drill, they repeat it in the opposite direction from where they ended.\n" +
                "\n");

        playimage4 = new Play();
        playimage4.setURL("https://assets.sbnation.com/assets/2217413/rb_drills_1.jpg?_ga=2.188248367.683412404.1517098018-2142731249.1517098018");
        playimage4.setText("The principal running back drills ask the prospect to start in a two-point stance, take a handoff and navigate over bags or between cones, until he arrives at a coach moving a bag left or right. The back must simulate a cut by quickly reacting in the opposite direction from that in which the coach moves the bag. In an alternative exercise, the back takes a pitchout, simulates an end run and, once he gets to the \"second level\" weaves through a set of cones as if negotiating downfield traffic. Here they are in diagram form:\n" +
                "\n");

        playimage5 = new Play();
        playimage5.setURL("https://assets.sbnation.com/assets/2217429/wr_drills_1_medium.jpg");
        playimage5.setText("The gauntlet, shown above as the \"multiple catch drill,\" is a great measure of focus and concentration. Receivers need to look the ball into their hands and then instantaneously move on to a different target, for a total of seven catches. Further, it shows how well a receiver can maintain his body and speed as he runs in as perfect a line as he can, while focused on the various throws (as opposed to maintaining a straight line). As Mike Mayock pointed out recently, coaches hate this drill, as it runs counter to everything they preach about ball security, but scouts love it, as it provides them so much information about a prospect's hands. Because receivers don't have time for the ball to come into their bodies before the next ball is coming, it allows them to demonstrate how well they can make \"hands\" catches. Hands catchers tend to drop far fewer balls, and are better at extending to make tough catches, so scouts value this skill highly.");

        playArrayList.add(playimage1);
        playArrayList.add(playimage2);
        playArrayList.add(playimage3);
        playArrayList.add(playimage4);
        playArrayList.add(playimage5);

        AdapterSon adapterSon = new AdapterSon(playArrayList);
        recyclerView.setAdapter(adapterSon);


        Button defense = findViewById(R.id.defense_button_drills);
        defense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrillsActivity.this, DrillsOption.class);
                startActivity(intent);
            }
        });
    }
}
