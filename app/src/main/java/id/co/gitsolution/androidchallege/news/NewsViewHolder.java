package id.co.gitsolution.androidchallege.news;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import id.co.gitsolution.androidchallege.R;

/**
 * Created by Git Solution on 03/10/2017.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder{

    TextView txtContent;
    ImageView img;
    Button btnShare;

    public NewsViewHolder(final View v) {
        super(v);

        txtContent = v.findViewById(R.id.txt_content);
        img = v.findViewById(R.id.img);
        btnShare =v.findViewById(R.id.btn_share);
        
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(v.getContext(), "You have shared!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
