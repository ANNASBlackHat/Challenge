package id.co.gitsolution.androidchallege.model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import id.co.gitsolution.androidchallege.R;

/**
 * Created by Git Solution on 03/10/2017.
 */

public class HelpAdapter extends RecyclerView.Adapter<HelpViewHolder> {

    private List<Help> helpList;

    public HelpAdapter(List<Help> helpList) {
        this.helpList = helpList;
    }

    @Override
    public HelpViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_help, parent, false);
        return new HelpViewHolder(v);
    }

    @Override
    public void onBindViewHolder(HelpViewHolder holder, int position) {
        holder.txtQuestion.setText(helpList.get(position).getQuestion());
        holder.txtAnswer.setText(helpList.get(position).getAnswer());
        holder.txtDate.setText(helpList.get(position).getDate());
        holder.txtViewer.setText(helpList.get(position).getAnswer());
    }

    @Override
    public int getItemCount() {
        return helpList.size();
    }
}
