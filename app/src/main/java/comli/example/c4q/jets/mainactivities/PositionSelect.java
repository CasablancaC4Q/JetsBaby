package comli.example.c4q.jets.mainactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import comli.example.c4q.jets.R;

public class PositionSelect extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.position_select);

        RecyclerView recyclerView = findViewById(R.id.position_id);

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("QB");
        arrayList.add("RB");
        arrayList.add("FB");
        arrayList.add("WR");
        arrayList.add("TE");
        arrayList.add("OT");
        arrayList.add("OG");
        arrayList.add("C");
        arrayList.add("DT");
        arrayList.add("DE");
        arrayList.add("LB");
        arrayList.add("OLB");
        arrayList.add("CB");
        arrayList.add("SS");
        arrayList.add("FS");
        arrayList.add("P");
        arrayList.add("K");
        Positon_adapter positon_adapter = new Positon_adapter(arrayList);
        recyclerView.setAdapter(positon_adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
