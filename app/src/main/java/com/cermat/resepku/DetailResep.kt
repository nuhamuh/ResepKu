package com.cermat.resepku

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailResep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_resep)

        val actionbar = supportActionBar
        actionbar!!.title = "Cara Pembuatan"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_set_name)
        val tvBahan: TextView = findViewById(R.id.tv_set_bahan)
        val tvCaraPembuatan: TextView = findViewById(R.id.tv_set_cara)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tBahan = intent.getStringExtra(EXTRA_BAHAN)
        val tCara = intent.getStringExtra(EXTRA_CARA)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        imgSetPhoto.setImageResource(tImg)

        tvSetName.text = tName
        tvBahan.text = tBahan
        tvCaraPembuatan.text = tCara
    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_BAHAN = "extra_bahan"
        const val EXTRA_CARA = "extra_cara"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}