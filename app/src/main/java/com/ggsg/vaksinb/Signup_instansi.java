package com.ggsg.vaksinb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Signup_instansi extends AppCompatActivity {

    ImageView img_pilih_gambar,img_surat_operasional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_instansi);

        img_pilih_gambar = (ImageView)findViewById(R.id.img_pilih_gambar);
        img_surat_operasional = (ImageView)findViewById(R.id.img_surat_operasional);

        img_pilih_gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "content://media/internal/images/media"));
                startActivity(intent);
            }
        });

        img_surat_operasional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "content://media/internal/images/media"));
                startActivity(intent);
            }
        });
    }





}
