package comli.example.c4q.jets.defense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import comli.example.c4q.jets.mainactivities.AdapterSon;
import comli.example.c4q.jets.mainactivities.Play;
import comli.example.c4q.jets.offense.GameDayOffense;
import comli.example.c4q.jets.R;

public class GameDayDefense extends AppCompatActivity {

    private Button offense ;
   private RecyclerView recyclerView;
   private ArrayList<Play>playArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_day_defenseeeeee);

        recyclerView = findViewById(R.id.d_playbook_options);



        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
       // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
       // recyclerView.setLayoutManager(linearLayoutManager);


        playArrayList = new ArrayList<>();
        Play playimage1, playimage2,  playimage3 , playimage4, playimage5;

        playimage1 = new Play();
        playimage1.setURL("http://img.bleacherreport.net/img/article/media_slots/photos/001/517/570/27c2f35e71b704fac0de47bcd23c9e91_crop_exact.png?h=533&w=800&q=70&crop_x=center&crop_y=top");
        playimage1.setText("With a two-high safety alignment (and corners in a press position), the defense will roll the coverage at the snap to create a three-deep look.\n" +
                "\n" +
                "To the closed side, the strong safety (SS) rolls to the deep outside third with the free safety (FS) moving to the deep middle of the field. To the open side, the cornerback (RC) drops to the outside third using a \"bail\" technique.");

        playimage2 = new Play();
        playimage2.setURL("http://img.bleacherreport.net/img/article/media_slots/photos/001/517/564/39faf4c8c70021db5b4227bab03dbf4d_crop_exact.png?h=533&w=800&q=70&crop_x=center&crop_y=top");
        playimage2.setText("In Cover 3, the cornerbacks can align off at a depth of seven to eight yards or use a \"press-bail\" technique (align in press, open and sink) to get to the deep outside third.\n" +
                "\n" +
                "Here, both of the Panthers' cornerbacks are in a press-look and will use a \"bail\" technique to sink before the snap (create a cushion versus the wide receiver). The corners are responsible for playing any vertical concepts (split two verticals to the same side of the field) and must funnel the deep inside breaking routes (dig, post, etc.) to the free safety.\n" +
                "\n");



        playimage3 = new Play();
        playimage3.setURL("http://img.bleacherreport.net/img/article/media_slots/photos/001/517/565/45e92b043bcbb869c6b01cff195dd3b4_crop_exact.png?h=533&w=800&q=70&crop_x=center&crop_y=top");
        playimage3.setText("As you can see, the cornerback walks down to the closed side of the formation (two tight ends in a wing set) and becomes the primary run support defender (contain/force).\n" +
                "\n" +
                "Once the cornerback clears his run/pass keys (tight end), he will sink with a \"bail\" technique to the outside third. This is where NFL offenses often attack the cornerback with vertical releases from the two-tight-end wing alignment.\n" +
                "\n" +
                "To the open side of the formation (slot alignment), the strong safety (Troy Polamalu) rolls down over No. 2.\n" +
                "\n" +
                "Polamalu must reroute any vertical release from No. 2 before working to his curl-flat drop to take some stress off the open-side cornerback and free safety on a possible inside seam route.");

        playimage4 = new Play();
        playimage4.setURL("http://img.bleacherreport.net/img/article/media_slots/photos/001/517/566/e10c7961a049f7c905ac9e4ddaaa8fe1_crop_exact.png?h=533&w=800&q=70&crop_x=center&crop_y=top");
        playimage4.setText("The underneath zone defenders (curl-flat/middle hook) play the same landmark drops/techniques as we talked about above in the base Cover 3 examples.\n" +
                "\n" +
                "However, look at Sherman and Maxwell. Both cornerbacks are aligned in press (with an outside shade). This allows the Seattle corners to jam the No. 1 wide receivers and run with any vertical stem down the field (pattern match).");

        playimage5 = new Play();
        playimage5.setURL("http://img.bleacherreport.net/img/article/media_slots/photos/001/517/567/0329f7c2d5704398e7ed3fa3cb44208d_crop_exact.png?h=533&w=800&q=70&crop_x=center&crop_y=top");
        playimage5.setText("With the Rams using max-protection (two-man route scheme), both Maxwell and Sherman match the vertical release of the receivers (from an outside leverage position) to funnel both the post and dig to Thomas in the deep middle of the field.\n" +
                "\n" +
                "Underneath, the four zone defenders gain depth and get their eyes back to the quarterback. This puts them in a position to drive downhill aggressively on the checkdown or tight end in the flat.\n" +
                "\n" +
                "Given the top-tier ability/range of Thomas in the middle of the field, plus the press skills of Sherman and Maxwell, Seattle can use this style of technique in its Cover 3 defense.\n" +
                "\n" +
                "But we can't expect the rest of the league to follow until they can match the overall talent in Pete Carroll's secondary.\n" +
                "\n" +
                " ");

        playArrayList.add(playimage1);
        playArrayList.add(playimage2);
        playArrayList.add(playimage3);
        playArrayList.add(playimage4);
        playArrayList.add(playimage5);

        AdapterSon adapterSon = new AdapterSon(playArrayList);
        recyclerView.setAdapter(adapterSon);

        Button offense = findViewById(R.id.offense_button);
        offense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameDayDefense.this, GameDayOffense.class);
                startActivity(intent);

            }
        });
    }
}
