package com.ggsg.vaksinb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

//    Deklarasi
    Button btn_signup_pengguna,btn_signup_instansi;
    ImageView left_arrow;
    TextView tv_buatakun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//        Inisiasi
        btn_signup_pengguna = (Button)findViewById(R.id.btn_signup_pengguna);
        btn_signup_instansi = (Button)findViewById(R.id.btn_signup_instansi);

           left_arrow = (ImageView)findViewById(R.id.left_arrow);
        tv_buatakun = (TextView)findViewById(R.id.tv_buatakun);

        left_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signup.this,Login.class);
                startActivity(i);;
            }
        });

        tv_buatakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signup.this,Login.class);
                startActivity(i);;
            }
        });


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
