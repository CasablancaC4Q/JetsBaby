package comli.example.c4q.jets.mainactivities;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import comli.example.c4q.jets.R;

/**
 * Created by c4q on 2/24/18.
 */

public class Positon_adapter extends RecyclerView.Adapter<Positon_adapter.ViewHolder> {

    ArrayList<String> positions ;

    public Positon_adapter(ArrayList<String> positions) {
        this.positions = positions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.position_itemview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.textView.setText(positions.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),MainActivity.class);
                holder.itemView.getContext().startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return positions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView ;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.position_textview);
        }
    }
}
