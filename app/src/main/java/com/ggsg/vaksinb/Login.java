package com.ggsg.vaksinb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

//    Deklarasi
    TextView tv_lupa,tv_signup;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        Inisiasi
        tv_lupa     = (TextView) findViewById(R.id.tv_lupa);
        tv_signup   = (TextView) findViewById(R.id.tv_signup);

        tv_lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,Lupa.class);
                startActivity(i);
            }
        });
        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,Signup.class);
                startActivity(i);
            }
        });



    }
}
