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

public class DrillsOption extends AppCompatActivity {

    private Button offense;
   private RecyclerView recyclerView;
    private ArrayList<Play> playArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drills__option);

        recyclerView = findViewById(R.id.d_drills);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3 , playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("https://youthfootballonline.com/wp-content/uploads/2016/09/W-drill-copy.jpg");
        playimage1.setText("One of the best drills for practicing breaks is the W Drill. This is a classic defensive back drill that has been used for years to help players improve their ability to change direction. Many times the drill is done in a full effort pattern where the players are going full speed on all parts of the drill. Another variant for the drill is the length of the break and drop. Some coaches will use a longer drop and break to work conditioning while others will make the drill smaller to focus specifically on foot speed.");

        playimage2 = new Play();
        playimage2.setURL("http://www.y-coach.com/CD/mazedrill.gif");
        playimage2.setText("The maze drill combines sprint, parallel shuffle, back pedal, and 45 degree drop. Players begin by sprinting to cone #1 and sprinting around it and then they pivot into a shuffle. At cone #2 pivot into a back pedal at a 45 degree angle towards cone #3 while still in a back pedal. Once coming around cone #3, turn and sprint at a 45 degree angle around cone #4 and then go into a shuffle, keep the feet shoulder width apart, \"Z\" in the knees and chin over the knees. Finish the drill by turning and running a hard five yards once hitting the fifth cone.");

        playimage3 = new Play();
        playimage3.setURL("http://www.y-coach.com/CD/weavedrill.gif");
        playimage3.setText("On the coaches command with football in hand and ready to throw, will signal by pointing the ball in the direction that he wants the defender to plant and change directions.\n" +
                "\n" +
                "On command the coach will signal the defender to turn and run. Finish the drill by turning and running a hard ten yards.\n" +
                "\n" +
                "The defender must keep his eyes on the coach.");

        playimage4 = new Play();
        playimage4.setURL("http://www.y-coach.com/CD/4corner.gif");
        playimage4.setText("The FIRST PHASE of the 4 corner drill is the straight ahead sprint. Your linebacker starts by freeze stepping and then sprints 10 yards, once reaching the 10 yard cone he then pivots around off his inside foot which will put him facing the coach.\n" +
                "\n" +
                "The SECOND PHASE of 4 corners is CARIOCA, once your linebacker comes out of his pivot he will then step with one foot and crossover with the other, then step again and crossover behind. Keep Shoulders square to the line of scrimmage while maintaining a \"Z\" in the knees and keep eyes focused on the coach. Go as fast as you can and stay low. Once reaching the second cone you come out of your carioca shuffle by pivoting and go into a back pedal.\n" +
                "\n" +
                "The THIRD PHASE is a BACK PEDAL which requires your linebacker to begin backward movement with a good body lean with the chin in line with the knees. Make sure when back pedaling your weight is distributed over the knees and in line with the hips. Always keep arms pumping when back pedaling.\n" +
                "\n" +
                "The FORTH PHASE of 4 corners is the shuffle, once reaching the third cone, pivot and keep shoulders square to the LOS. Shuffle for ten yards to the next cone by keeping feet shoulder width apart, never allow the feet to come together or crossover. Keep the \"Z\" in the knees and shoulders square to the LOS while always maintaining eye contact with the coach.\n" +
                "\n" +
                "When you reach the forth and final cone turn and finish the drill with a hard 5 yard sprint.\n" +
                "\n");

        playimage5 = new Play();
        playimage5.setURL("https://footballtoolbox.net/wp-content/uploads/2017/04/db-techniques-drills1.jpg");
        playimage5.setText("The skate drill is used to teach block protection and containment fundamentals. The coach must control the tempo of the drill. Don’t allow the blocker’s to come to fast until the defender has mastered the proper technique desired. Line up three blockers and a ball carrier. Have the blockers and a ball carrier. Have the blockers come up field to stalk block or kickout block the defender. Mix up the blocks as the defender gets the technique down.");






        playArrayList.add(playimage1);
        playArrayList.add(playimage2);
        playArrayList.add(playimage3);
        playArrayList.add(playimage4);
        playArrayList.add(playimage5);

        AdapterSon adapterSon = new AdapterSon(playArrayList);
        recyclerView.setAdapter(adapterSon);

        Button offense = findViewById(R.id.offense_button_drills);
        offense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrillsOption.this, DrillsActivity.class);
                startActivity(intent);
            }
        });
    }
}
