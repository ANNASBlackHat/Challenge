package id.co.gitsolution.androidchallege.help;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import id.co.gitsolution.androidchallege.Constant;
import id.co.gitsolution.androidchallege.R;
import id.co.gitsolution.androidchallege.model.HelpAdapter;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new HelpAdapter(Constant.getHelp()));
    }
}
