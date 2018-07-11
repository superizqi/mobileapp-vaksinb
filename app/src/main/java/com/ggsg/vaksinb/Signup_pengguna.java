package com.ggsg.vaksinb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup_pengguna extends AppCompatActivity {

    ImageView left_arrow;
    TextView tv_pengguna;
    Button btn_signup_pengguna;
    EditText edt_nama_pengguna,edt_email_pengguna,edt_username_pengguna,edt_password_pengguna,edt_alamat_pengguna,edt_notelp_pengguna;
    RadioGroup rbtn_jeniskelamin_pengguna;
    RadioButton pilihan_pengguna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_pengguna);
        left_arrow = (ImageView)findViewById(R.id.left_arrow);
        tv_pengguna = (TextView)findViewById(R.id.tv_pengguna);
        btn_signup_pengguna = (Button)findViewById(R.id.btn_signup_pengguna);
        edt_nama_pengguna = (EditText)findViewById(R.id.edt_nama_pengguna);
        edt_email_pengguna = (EditText)findViewById(R.id.edt_email_pengguna);
        edt_username_pengguna = (EditText)findViewById(R.id.edt_username_pengguna);
        edt_password_pengguna = (EditText)findViewById(R.id.edt_password_pengguna);
        edt_alamat_pengguna = (EditText)findViewById(R.id.edt_alamat_pengguna);
        edt_notelp_pengguna = (EditText)findViewById(R.id.edt_notelp_pengguna);

// ============== Cara Ambil Nilai Dari Radio Group ================
        rbtn_jeniskelamin_pengguna = (RadioGroup)findViewById(R.id.rbtn_jeniskelamin_pengguna);
// ==================================================================


        btn_signup_pengguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ===== Show Toast =====
                Context context = getApplicationContext();
                CharSequence text = "Berhasil Daftar !";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
//                ======================
                int selected = rbtn_jeniskelamin_pengguna.getCheckedRadioButtonId();
                pilihan_pengguna = (RadioButton)findViewById(selected);
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("daftar_user/pengguna/" + edt_username_pengguna.getText().toString() + "/");
                myRef.child("nama").setValue(edt_nama_pengguna.getText().toString());
                myRef.child("email").setValue(edt_email_pengguna.getText().toString());
                myRef.child("username").setValue(edt_username_pengguna.getText().toString());
                myRef.child("password").setValue(edt_password_pengguna.getText().toString());
                myRef.child("alamat").setValue(edt_alamat_pengguna.getText().toString());
                myRef.child("notelp").setValue(edt_notelp_pengguna.getText().toString());
                myRef.child("jenis_kelamin").setValue(pilihan_pengguna.getText().toString());
            }
        });



//        left_arrow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(Signup_pengguna.this,Signup.class);
//                startActivity(i);
//            }
//        });
//
//        tv_pengguna.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(Signup_pengguna.this,Signup.class);
//                startActivity(i);
//            }
//        });


    }


}
