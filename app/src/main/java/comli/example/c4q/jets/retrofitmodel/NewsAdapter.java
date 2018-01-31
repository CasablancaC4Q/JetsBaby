package comli.example.c4q.jets.retrofitmodel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import comli.example.c4q.jets.R;

/**
 * Created by c4q on 1/28/18.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private ArrayList<Docs> docs;

    public NewsAdapter() {
        docs = new ArrayList<>();
    }

    public void setDocs(ArrayList<Docs> docs){
        this.docs = docs;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item_view, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.headline.setText(docs.get(position).getTitle());
        if (docs.get(position).getMultimedia() != null && docs.get(position).getMultimedia().length > 0) {
            Glide.with(holder.itemView.getContext())
                    .load( docs.get(position).getMultimedia()[0].getUrl())
                    .into(holder.newsImage);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(docs.get(position).getURL()));
                view.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return docs.size();
    }

    public class ViewHolder extends comli.example.c4q.jets.activities.ViewHolder  {
        TextView headline ;
        TextView snippet;
        ImageView newsImage;
        String url;

        public ViewHolder(View itemView) {
            super(itemView);
            headline = itemView.findViewById(R.id.headline);
            snippet = itemView.findViewById(R.id.snippet);
            newsImage = itemView.findViewById(R.id.image_news);

        }

    }
}
