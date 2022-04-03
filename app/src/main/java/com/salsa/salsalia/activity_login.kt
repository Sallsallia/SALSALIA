package com.salsa.salsalia
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class activity_login: AppCompatActivity() {
    //menginisialisasi atribut yang ingin di gunakan
    private lateinit var btnLogin: Button
    private lateinit var email: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //menghubungkan atribut btnKembali dengan button yang ada di file activity_login.xml
        //dengan menggunakan id
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        btnLogin = findViewById(R.id.btn_login)

        val emailSaya: String = "salsalia@gmail.com"
        val paswordSaya: String = "salsalia"
        //apabila inputan email dan password sesuai dengan isi pada variabel email saya dan password saya benar
        //maka layout akan berpindah ke activity activity_main, dan menampilkan toast.
        //apabila button login di jalankan
        //maka ada pengecekan
        //apabila inputan text kosong maka menampilkan feedback berupa toast dengan
        //text email tidak boleh kosong, sama halnya dengan password.
        //apabila inputan emial dan password  kosong
        //maka akan tampil toast email dan password salah
        btnLogin.setOnClickListener(View.OnClickListener {
            // jika email "salsalia@gmail.com && password "salsalia" maka pindah layout ke halaman main activity
            if(email.text.toString().equals(emailSaya) && password.text.toString().equals(paswordSaya)){
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
                pindahHalamaMain();
            } else if (email.text.isEmpty()){
                // jika email kosong Toast akan tampil
                Toast.makeText(this, "Email harus disi", Toast.LENGTH_SHORT).show()
            }else if(password.text.isEmpty()){
                Toast.makeText(this, "Password harus disi", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Email dan password salah", Toast.LENGTH_SHORT).show()
            }
        })

    }

    fun pindahHalamaMain(){
        //berpindah activity Intent(activity-saat-ini, activity-tujuan)
        val go = Intent(this, activity_main::class.java)

        //menjalankan intent
        startActivity(go)
    }
}