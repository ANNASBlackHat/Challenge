package id.co.gitsolution.androidchallege.news

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Button
import android.widget.Toast
import id.co.gitsolution.androidchallege.Constant
import id.co.gitsolution.androidchallege.R
import id.co.gitsolution.androidchallege.global.GlobalAdapter
import id.co.gitsolution.androidchallege.global.GlobalViewHolder
import id.co.gitsolution.androidchallege.help.HelpActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rec_view.layoutManager = LinearLayoutManager(this)
        rec_view.adapter = object : GlobalAdapter(R.layout.list_item_news, Constant.getNews()){
            override fun onBindViewHolder(holder: GlobalViewHolder?, position: Int) {
                super.onBindViewHolder(holder, position)
                holder?.getView()?.findViewById<Button>(R.id.btn_share)?.apply {
                    setOnClickListener({_ -> Toast.makeText(this@MainActivity, "You Shared!", Toast.LENGTH_SHORT).show() })
                }
            }
        }

        fab_help.setOnClickListener({_ ->
            startActivity(Intent(this, HelpActivity::class.java))})
    }
}
