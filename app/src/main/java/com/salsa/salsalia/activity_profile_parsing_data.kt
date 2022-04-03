package com.salsa.salsalia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class activity_profile_parsing_data : AppCompatActivity() {

    //menginisialisasi atribut yang ingin di gunakan
    private lateinit var btnKemabali: Button
    private lateinit var tvNama: TextView
    private lateinit var tvNim: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_parsing_data)

        //menghubungkan atribut btnKembali dengan button yang ada di file profile_parsing_data.xml
        //dengan menggunakan id
        btnKemabali = findViewById(R.id.button)
        tvNama = findViewById(R.id.tv_nama)
        tvNim = findViewById(R.id.tv_nim)

        // menampilkan data yang di kirim dari intput text pada activity profile menggukana intent
        tvNama.setText(intent.getStringExtra("Nama"))
        tvNim.setText(intent.getStringExtra("Nim"))

        // Untuk pindah ke halaman main
        btnKemabali.setOnClickListener(View.OnClickListener {
            pindahkehalamanMain()
        })
    }

    fun pindahkehalamanMain(){
        //berpindah activity Intent(activity-saat-ini, activity-tujuan)
        val intent = Intent(this, activity_main::class.java)
        //menjalankan intent
        startActivity(intent)
    }
}