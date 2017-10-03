package id.co.gitsolution.androidchallege.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import id.co.gitsolution.androidchallege.R;

/**
 * Created by Git Solution on 03/10/2017.
 */

public class HelpViewHolder extends RecyclerView.ViewHolder {

    TextView txtQuestion, txtAnswer, txtDate, txtViewer;

    public HelpViewHolder(View v) {
        super(v);

        txtQuestion = v.findViewById(R.id.question);
        txtAnswer = v.findViewById(R.id.answer);
        txtDate = v.findViewById(R.id.date);
        txtViewer = v.findViewById(R.id.viewer);
    }
}
