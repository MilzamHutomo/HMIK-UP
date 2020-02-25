package com.project.hmikup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var stafViewer: RecyclerView
    private var list: ArrayList< Staf > = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stafViewer = findViewById( R.id.view_staf )
        stafViewer.setHasFixedSize( true )

        list.addAll( StafData.listData )
        showRecyclerList()
    }

    private fun showRecyclerList(){
        stafViewer.layoutManager = LinearLayoutManager( this )
        val stafListAdapter = StafListViewAdapter( list )
        stafViewer.adapter = stafListAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate( R.menu.menu_main, menu )
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when( item.itemId ){
            R.id.dev_profile -> {
                val devProfile = Intent( this@MainActivity, DevProfile::class.java)
                startActivity( devProfile )
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
