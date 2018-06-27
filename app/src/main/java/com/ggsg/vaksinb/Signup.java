package com.ggsg.vaksinb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

//    Deklarasi
    Button btn_signup_pengguna,btn_signup_instansi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//        Inisiasi
        btn_signup_pengguna = (Button)findViewById(R.id.btn_signup_pengguna);
        btn_signup_instansi = (Button)findViewById(R.id.btn_signup_instansi);

        btn_signup_pengguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signup.this,Signup_pengguna.class);
                startActivity(i);
            }
        });
        btn_signup_instansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signup.this,Signup_instansi.class);
                startActivity(i);
            }
        });



    }
}
