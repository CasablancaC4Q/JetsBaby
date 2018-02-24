package comli.example.c4q.jets.mainactivities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import comli.example.c4q.jets.R;

/**
 * Created by c4q on 1/27/18.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView ;
    TextView textView;
    Context context;

    public ViewHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        textView = itemView.findViewById(R.id.text_view);
        imageView = itemView.findViewById(R.id.image_view);
    }

    public void bind(Play play){

        Glide.with(context)
                .load(play.getURL())
                .into(imageView);
        textView.setText(play.getText());
    }
}
