package com.salsa.salsalia

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView

class activity_main : AppCompatActivity() {
    //menginisialisasi atribut yang ingin di gunakan
    private lateinit var cardProfile :CardView;
    private lateinit var cardRumahku : CardView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Memanggil id pada card yang ada di xml layout main activity
        cardProfile = findViewById(R.id.card_view2)
        cardRumahku = findViewById(R.id.card_view1)

        // Card agar bisa di click dan dapat berpidah ke halaman berikutnya
        cardProfile.setOnClickListener(View.OnClickListener {
            pindahHalamanProfile();
        });

        // Card agar bisa di click
        cardRumahku.setOnClickListener(View.OnClickListener {
            // implementasi Intent Implisit
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Pancasila+City+Park/@-7.3310786,110.500892,17.04z/data=!4m5!3m4!1s0x2e7a7837b12f2fbb:0xe28734a1bdad6b2d!8m2!3d-7.3303567!4d110.4996568"));
            startActivity(intent);
        })
    }

    fun pindahHalamanProfile(){
        // Implementasi Intent Explisit
        val go = Intent(this, activity_profile::class.java)

        //menjalankan intent
        startActivity(go)
    }
}