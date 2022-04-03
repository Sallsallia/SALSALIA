package com.salsa.salsalia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class activity_profile : AppCompatActivity() {
    //menginisialisasi atribut yang ingin di gunakan
    private lateinit var btnsimpan:Button
    private lateinit var etNama:EditText
    private lateinit var etNim: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        //menghubungkan atribut btnKembali dengan button yang ada di file profile_parsing_data.xml
        //dengan menggunakan id
        etNama = findViewById(R.id.et_nama)
        etNim= findViewById(R.id.et_nim)
        btnsimpan = findViewById(R.id.button)

        //apabila button simpan di jalankan
        //maka ada pengecekan
        //apabila inputan text kosong maka menampilkan feedback berupa toast dengan
        //text Nama tidak boleh kosong, sama halnya dengan nim.
        //apabila inputan nama dan nim tidak kosong
        //maka layout akan berpindah ke activity profile_parsing_data, dan menampilkan toast.
        btnsimpan.setOnClickListener(View.OnClickListener {
            if (etNama.text.isEmpty()){
                Toast.makeText(this, "Nama Tidak Boleh Kosong", Toast.LENGTH_SHORT, ).show();
            }else if (etNim.text.isEmpty()){
                Toast.makeText(this, "Nim Tidak Boleh Kosong", Toast.LENGTH_SHORT, ).show();
            }else{
                pindahhalaman();

                Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT, ).show();
            }
        })
    }

    fun pindahhalaman(){
        //berpindah activity Intent(activity-saat-ini, activity-tujuan)
        val intent = Intent(this, activity_profile_parsing_data::class.java)
        intent.putExtra("Nama", etNama.text.toString())
        intent.putExtra("Nim", etNim.text.toString())
        //menjalankan intent
        startActivity(intent)
    }
}