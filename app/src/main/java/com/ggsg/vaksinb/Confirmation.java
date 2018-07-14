package com.ggsg.vaksinb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Confirmation extends AppCompatActivity {

    Button btn_proses_konfirmasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        btn_proses_konfirmasi = (Button)findViewById(R.id.btn_proses_konfirmasi);
        btn_proses_konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Confirmation.this,Payment.class);
                startActivity(i);
            }
        });

    }
}
