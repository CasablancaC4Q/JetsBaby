package comli.example.c4q.jets.secondaryactivities;

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
import comli.example.c4q.jets.mainactivities.WorkoutActivity;

public class WorkoutOptions extends AppCompatActivity {
    private Button weights;
    private RecyclerView recyclerView;
    private ArrayList<Play>playArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_options);

        recyclerView = findViewById(R.id.stretch_re);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3 , playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("http://www.sparkpeople.com/assets/uploads/intervalbeginner.jpg");
        playimage1.setText("Want to boost your fitness level and burn more calories? This program uses intervals (short bursts of higher-intensity activity followed by lower intensity recovery periods), which can be a more effective way to train than exercising at one intensity level. If you're new to running or exercise, start with the Beginner program. As you progress, slowly increase your time and eventually move to the Intermediate and Advanced workouts. Because this is a general program, you may need to adjust the recommended speeds, intensities, and times to suit your fitness level.\n");

        playimage2 = new Play();
        playimage2.setURL("http://www.real-moms-real-fit.com/images/whidbey-run-workout.jpg");
        playimage2.setText("In short, the intervals force the body to adapt and become more efficient at delivering oxygen to the working muscles (legs in this case) and, in turn, break down the lactic acid build up that is responsible for the burning sensation you get in your legs. At the same time, the higher intensity portion of the intervals enable the muscles to develop an increased tolerance to the lactic acid build-up, while also strengthening your heart and naturally improving your cardiovascular ability.\n" +
                "\n" +
                "As I have said before,we have been programmed to think that steady-paced cardio of 30, 45, or even 60 minutes is the key to weight loss. That is where we are going wrong!");

        playimage3 = new Play();
        playimage3.setURL("https://cdn2.omidoo.com/sites/default/files/imagecache/full_width/images/bydate/sep_20_2012_-_120pm/screen_shot_2012-09-20_at_1.17.26_pm.png");
        playimage3.setText("For circuit-type exercise modes (non-running, biking, swimming, etc.), the same thing applies:\n" +
                "\n" +
                " \n" +
                "\n" +
                "Increase the number of stations/exercises.\n" +
                "Increase the intensity of effort.\n" +
                "Increase the work period time.\n" +
                "Decrease the rest time between stations/exercises.\n" +
                " \n" +
                "\n" +
                "For continuous modes of exercises such as distance running or work on an exercise machine (i.e., elliptical), it’s the same:\n" +
                "\n" +
                " \n" +
                "\n" +
                "Work longer at the same pace.\n" +
                "Work harder at the same time/distance\n" +
                "Work longer and harder.");

        playimage4 = new Play();
        playimage4.setURL("https://fitfabcities.files.wordpress.com/2012/02/35-min-treadmill-workout.jpg?w=490&h=711");
        playimage4.setText("Tips\n" +
                "\n" +
                "To modify try walking the workout instead of running or jogging. The changing incline will give you a great workout without needing to up your speed.\n" +
                "The speeds and inclines I’ve used are just a guide…feel free to modify up or down if you need to. This is especially true on sections B and C which are pretty intense.\n" +
                "This workout is intense with sprints and hills so take as many breaks as you need to and drink plenty of water!\n" +
                "Happy Workout!");

        playimage5 = new Play();
        playimage5.setURL("http://blog.nasm.org/wp-content/uploads/2013/12/cardio-workout.png");
        playimage5.setText("Start by first identifying cardio activities you currently participate in that you find enjoyable and feel confident in accomplishing. These are the activities you should participate in to get started.\n" +
                "Next, following a simplified version of FITT-VP mentioned previously (what we will call VIP), let’s develop your program:\n" +
                "Determine your realistic availability and commitment to your cardio program – identify the frequency and duration (i.e., volume) you are willing to commit to for exercise for the next four weeks. This should be based upon your current volume, but also consider your availability and confidence in completing this selected volume.\n" +
                "Use the scale presented below to select an intensity you feel confident you can sustain for the duration of your cardio sessions (4). Keep in mind you will be able to choose between exercising at a steady-state intensity (fixed pace), performing intervals (e.g., a few minutes pushing a little harder followed by a lighter recovery, repeated several times), or following a combination of both.");


        playArrayList.add(playimage1);
        playArrayList.add(playimage2);
        playArrayList.add(playimage3);
        playArrayList.add(playimage4);
        playArrayList.add(playimage5);

        AdapterSon adapterSon = new AdapterSon(playArrayList);
        recyclerView.setAdapter(adapterSon);


        Button weights = findViewById(R.id.weight_button);
        weights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutOptions.this, WorkoutActivity.class);
                startActivity(intent);

            }
        });
    }
}
