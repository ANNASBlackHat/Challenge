package id.co.gitsolution.androidchallege.help

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import id.co.gitsolution.androidchallege.Constant
import id.co.gitsolution.androidchallege.R
import id.co.gitsolution.androidchallege.global.GlobalAdapter
import kotlinx.android.synthetic.main.activity_help.*

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        rec_view.layoutManager = LinearLayoutManager(this)
        rec_view.adapter = object: GlobalAdapter(R.layout.list_item_help, Constant.getHelp()){}
    }
}
