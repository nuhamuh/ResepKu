package com.cermat.resepku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvResep: RecyclerView
    private val list = ArrayList<Resep>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title= "Resep Makanan"

        rvResep = findViewById(R.id.rv_resepMakanan)
        rvResep.setHasFixedSize(true)
        list.addAll(ResepData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvResep.layoutManager = LinearLayoutManager(this)
        val listViewHeroAdapter = ListResepAdapter(list)
        rvResep.adapter = listViewHeroAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val About = Intent(this@MainActivity, About::class.java)
                startActivity(About)
            }
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
}