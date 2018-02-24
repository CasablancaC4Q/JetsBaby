package comli.example.c4q.jets.mainactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import comli.example.c4q.jets.R;
import comli.example.c4q.jets.secondaryactivities.WorkoutOptions;

public class WorkoutActivity extends AppCompatActivity {

    private Button running;
  private   RecyclerView recyclerView;
 private    ArrayList<Play>playArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        recyclerView = findViewById(R.id.workoutre);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3, playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("https://i.pinimg.com/564x/f8/49/72/f84972819b255303555950bda91c9cbc.jpg");
        playimage1.setText("For those obsessed with all things pumpkin, there's really no end to where this antioxidant-rich squash can be used. Breakfast smoothies are no exception! This\n" +
                "Ingredients\n" +
                "Vegan, Gluten free\n" +
                "∙ Serves 1\n" +
                "Produce\n" +
                "1/2 Banana, frozen\n" +
                "1 Pinch Ginger, ground\n" +
                "1/2 cup Pumpkin, canned or freshly cooked\n" +
                "Refrigerated\n" +
                "3/4 cup Almond milk\n" +
                "Canned Goods\n" +
                "1/2 scoop Vanilla protein powder\n" +
                "Baking & Spices\n" +
                "1 tsp Cinnamon\n" +
                "1/2 tsp Pumpkin pie spice");

        playimage2 = new Play();
        playimage2.setURL("https://2.bp.blogspot.com/-OSqYYX3rafI/V8F8Xgyc6yI/AAAAAAAADww/NxB-7hSQLckzxKxcEllbaC91kGBINKYogCLcB/s1600/Top%2BMuscle%2BBuilding%2BWorkouts%2BFor%2BMen.jpg");
        playimage2.setText("DEADLIFTS\n" +
                "Example: barbell deadlifts, and straight-leg lifts.\n" +
                "SQUATS\n" +
                "Example: barbell back and front squats, and dumbbell variations.\n" +
                "SINGLE LEGS\n" +
                "Example: lunges, and single-leg squats.\n" +
                "HORIZONTAL PUSH\n" +
                "Example: pushup, bench press with barbell or dumbbells, and dips.\n" +
                "HORIZONTAL PULL\n" +
                "Example: dumbbell row, seated (cable) row, inverted rows, and face pulls.\n" +
                "VERTICAL PUSH\n" +
                "Example: shoulder press.\n" +
                "VERTICAL PULL\n" +
                "Example: pullups, chinup and lat pull downs.\n" +
                "What Exercises Should You Do first?\n" +
                "Generally, the first exercise in your workout should be the one that requires the most work. For increasing muscle mass, and strength I recommend switching your routine every once in a while. For example, if on chest day you always start off with bench press try starting off with dumbbell flys, and then do bench press. Switching the order of your exercise you help make your gym experience less boring, causing you to have more effort, which leads to serious results.\n" +
                "How Many Sets/Reps Should I Do?\n" +
                "Generally, most people see great results with mix of heavy weight for strength, medium weight for muscle size, and light weights for muscular endurance.\n" +
                "Your set count should be related to your number of reps per set. For example, if you're doing high reps 1 to 2 sets might be enough. For 10 to 12 reps, do 2 or 3 sets. For 8 reps, 4 sets are great.");

        playimage3 = new Play();
        playimage3.setURL("https://4.bp.blogspot.com/-fHy8xbCXBv4/V_uUH26rItI/AAAAAAAACm8/_rvXe9fq6-QiAjyOBsd4-J2N-WWGDZEzACLcB/s400/AAEAAQAAAAAAAAhDAAAAJGYzM2JlZTMyLTBhMjMtNGZjNi1iNmYxLTRhYzc5ZmQwNmIwMA.jpg");
        playimage3.setText("1 -Seated Dumbbell Shoulder Press\n" +
                "\n" +
                "2 -Seated Barbell Shoulder Press\n" +
                "\n" +
                "3 -Dumbbell Lateral Raise\n" +
                "\n" +
                "4 -Face Pull\n" +
                "\n" +
                "5 -Wide-Grip Smith-Machine Upright Row\n" +
                "\n" +
                "6 -Push Press\n" +
                "\n" +
                "7 -Cable Front Raise\n" +
                "\n" +
                "8 -One-Arm Cable Lateral Raise\n" +
                "\n" +
                "9 -Bent-Over Dumbbell Lateral Raise\n" +
                "\n" +
                "10 -Cable Reverse Flye");

        playimage4 = new Play();
        playimage4.setURL("https://1.bp.blogspot.com/-Ps4lSgH-rds/V9SkA38ROyI/AAAAAAAAD1A/BrsLIb3GoDwt8cEi044-y7rdchRmYbUuQCLcB/s640/Best%2BLeg%2BExercises.jpg");
        playimage4.setText("The best exercise out of all the leg exercises is probably the squat. This is the one exercise that will build the most the most mass out of all the leg exercises. It is also known to stimulate testosterone, improve your overall strength, and exercises the quads - one of the biggest muscles in your body.\n" +
                "To do a squat you should have a barbell on a squat rack and rest it across your shoulders, behind your head. When you have a good grip and balance of the bar, raise it up straight then proceed by bending your knees until your thighs are almost in line with the floor. Make sure that you move all the way up and hold for a few seconds before bending your knees for another rep.\n" +
                "Another exercise to build your legs is the leg press. You've probably seen it being used by many people in the gym. It is the machine in which you lie on your back and push up with your legs upwards the incline. Because there is back support available in this exercise, you should be able to press more than a regular squat. Simply lower the weight by bending your knees back then push it back up until the next repetition of the exercise.");

        playimage5 = new Play();
        playimage5.setURL("https://4.bp.blogspot.com/-k1djTG4Gvtc/V7BWq1pp6CI/AAAAAAAADrw/8PWWpDHjlAQss_YDQAV_fy4TLrEGFpv2wCLcB/s640/Exercises%2Bto%2BInclude%2BIn%2BYour%2BMuscle.jpg");
        playimage5.setText("Also, these exercises are best muscle builders because they recruit most muscle fibers and produce most hormones necessary for growth. These hormones include testosterone, insulin-like growth factor 1, and growth hormone. The testosterone alone is single most important hormone for men and increasing it's count in the blood will benefit your greatly not only strength and growth-wise.\n" +
                "Here are they:\n" +
                "Legs:\n" +
                "Squat\n" +
                "Dead lifts\n" +
                "Lunges\n" +
                "Back:\n" +
                "Dead lifts\n" +
                "Barbell Rows\n" +
                "Dumbbell Rows\n" +
                "Pull ups\n" +
                "Chin ups\n" +
                "Shoulders:\n" +
                "Overhead Presses\n" +
                "Chest:\n" +
                "Bench presses\n" +
                "Dips\n" +
                "Dumbbell flies\n" +
                "Push ups\n" +
                "Arms:\n" +
                "Dips a\n" +
                "Diamond push ups\n" +
                "French presses\n" +
                "Abs:\n" +
                "Plank\n" +
                "Do them and I promise you will be having better results ;)\n");

        playArrayList.add(playimage1);
        playArrayList.add(playimage2);
        playArrayList.add(playimage3);
        playArrayList.add(playimage4);
        playArrayList.add(playimage5);

        AdapterSon adapterSon = new AdapterSon(playArrayList);
        recyclerView.setAdapter(adapterSon);

        Button running = findViewById(R.id.running_button);
        running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutActivity.this, WorkoutOptions.class);
                startActivity(intent);

            }
        });

    }
}
