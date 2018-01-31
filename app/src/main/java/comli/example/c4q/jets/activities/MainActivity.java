package comli.example.c4q.jets.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import comli.example.c4q.jets.R;
import comli.example.c4q.jets.retrofitmodel.NewsAdapter;
import comli.example.c4q.jets.retrofitmodel.NewsAPI;
import comli.example.c4q.jets.retrofitmodel.NewsModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button playBookButton, workOutButton, drillsButton, practiceButton;

    private RecyclerView recyclerView ;
    private NewsAdapter newsAdapter ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recycler);
        setRecView();
        createRetrofit();


        playBookButton = findViewById(R.id.playbook_button);
        workOutButton= findViewById(R.id.workout_button);
        drillsButton= findViewById(R.id.drills_button);
        practiceButton= findViewById(R.id.practice_button);

        playBookButton.setOnClickListener(this);
        workOutButton.setOnClickListener(this);
        drillsButton.setOnClickListener(this);
        practiceButton.setOnClickListener(this);


    }

    private void createRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.nytimes.com/svc/topstories/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NewsAPI newsService = retrofit.create(NewsAPI.class);
        Call<NewsModel> newsModelCall = newsService.getNewsModel();
        newsModelCall.enqueue(new Callback<NewsModel>() {
            @Override
            public void onResponse(Call<NewsModel> call, Response<NewsModel> response) {
                NewsModel newsModel = response.body();
                Log.d(TAG, "onResponse: " + newsModel.getCopyright());
                Log.d(TAG, "onResponse: ");
                newsAdapter.setDocs(newsModel.getResults());
            }

            @Override
            public void onFailure(Call<NewsModel> call, Throwable t) {

            }
        });
    }

    private void setRecView() {
        newsAdapter = new NewsAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setAdapter(newsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
        public void onClick (View view){
            Intent intent = new Intent();

            switch (view.getId()) {


                case R.id.drills_button:
                    intent = new Intent(MainActivity.this, DrillsActivity.class);
                    break;
                case R.id.workout_button:
                    intent = new Intent(MainActivity.this, WorkoutActivity.class);
                    break;
                case R.id.practice_button:
                    intent = new Intent(MainActivity.this, PracticeActivity.class);
                    break;
                case R.id.playbook_button:
                    intent = new Intent(MainActivity.this, PlaybookActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }










    /*
        Button playBookbutton = findViewById(R.id.playbook_button);
        playBookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaybookActivity.class);
                startActivity(intent);
            }
        });

        Button practiceButton = findViewById(R.id.practice_button);
        practiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PracticeActivity.class);
                startActivity(intent);
            }
        });

        Button exercsizeButton = findViewById(R.id.drills_button);
        exercsizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrillsActivity.class);
                startActivity(intent);
            }
        });

        Button workOutButton = findViewById(R.id.workout_button);
        workOutButton.setOnClickListener(this);
*/

