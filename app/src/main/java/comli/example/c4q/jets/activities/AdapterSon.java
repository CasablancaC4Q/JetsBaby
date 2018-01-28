package comli.example.c4q.jets.activities;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import comli.example.c4q.jets.R;

/**
 * Created by c4q on 1/27/18.
 */

public class AdapterSon extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Play> practicePB;

    public AdapterSon(ArrayList<Play> practicePB) {
        this.practicePB = practicePB;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.o_practice_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(practicePB.get(position));
    }

    @Override
    public int getItemCount() {
        return practicePB.size();
    }
}
