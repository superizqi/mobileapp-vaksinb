package com.ggsg.vaksinb;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class Signup_instansi extends AppCompatActivity {

    ImageView img_pilih_gambar,img_surat_operasional,left_arrow_instansi;
    TextView tv_instansi;
    Button btn_signup_instansi;
    EditText edt_nama_instansi,edt_email_instansi,edt_username_instansi,edt_password_instansi,edt_alamat_instansi, edt_notelp_instansi;
//    Start Upload Image
//    FirebaseStorage storage;
//    StorageReference storageRef,imageRef;
//    private static final int Selected = 100;
//    ProgressDialog progressDialog;
//    UploadTask uploadTask;
//    Uri uriImage;
//    End Upload Image




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_instansi);
        edt_nama_instansi = (EditText)findViewById(R.id.edt_nama_instansi);
        edt_email_instansi = (EditText)findViewById(R.id.edt_email_instansi);
        edt_username_instansi = (EditText)findViewById(R.id.edt_username_instansi);
        edt_password_instansi = (EditText)findViewById(R.id.edt_password_instansi);
        edt_alamat_instansi = (EditText)findViewById(R.id.edt_alamat_instansi);
        edt_notelp_instansi = (EditText)findViewById(R.id.edt_notelp_instansi);
        img_pilih_gambar = (ImageView)findViewById(R.id.img_pilih_gambar);
        img_surat_operasional = (ImageView)findViewById(R.id.img_surat_operasional);
        left_arrow_instansi = (ImageView)findViewById(R.id.left_arrow_instansi);
        tv_instansi = (TextView)findViewById(R.id.tv_instansi);
        btn_signup_instansi = (Button)findViewById(R.id.btn_signup_instansi);
//        Upload
//        storage = FirebaseStorage.getInstance();
//        storageRef = storage.getReference();
//    End Upload
        img_pilih_gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseImage();
            }
        });
        btn_signup_instansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ===== Show Toast =====
                Context context = getApplicationContext();
                CharSequence text = "Berhasil Daftar !";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
//                ======================
//                Start Input User
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("daftar_user/instansi/" + edt_username_instansi.getText().toString() + "/");
                myRef.child("nama").setValue(edt_nama_instansi.getText().toString());
                myRef.child("email").setValue(edt_email_instansi.getText().toString());
                myRef.child("username").setValue(edt_username_instansi.getText().toString());
                myRef.child("password").setValue(edt_password_instansi.getText().toString());
                myRef.child("alamat").setValue(edt_alamat_instansi.getText().toString());
                myRef.child("notelp").setValue(edt_notelp_instansi.getText().toString());
//                End Input User
            }
        });


        left_arrow_instansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signup_instansi.this,Signup.class);
                startActivity(i);
            }
        });

        tv_instansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signup_instansi.this,Signup.class);
                startActivity(i);
            }
        });


//        img_surat_operasional.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
//                        "content://media/internal/images/media"));
//                startActivity(intent);
//            }
//        });
    }

    public void chooseImage(){
//        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
//        photoPickerIntent.setType("image/*");
//        startActivityForResult(photoPickerIntent, Selected);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
//        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
//        switch (requestCode) {
//            case Selected:
//                if (resultCode == RESULT_OK) {
//                    uriImage = imageReturnedIntent.getData();
//                    UploadFoto();
//                }
//        }
    }
    public void UploadFoto() {

//        imageRef = storageRef.child("myphotos/");
//        progressDialog = new ProgressDialog(this);
//        progressDialog.setMax(100);
//        progressDialog.setMessage("Uploading...");
//        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//        progressDialog.show();
//        progressDialog.setCancelable(false);
//
//        uploadTask = imageRef.putFile(uriImage);
//
//        uploadTask.addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
//            @Override
//            public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
//                double progress = (100.0 * taskSnapshot.getBytesTransferred()) / taskSnapshot.getTotalByteCount();
//
//                progressDialog.incrementProgressBy((int) progress);
//            }
//        });
//
//        uploadTask.addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(Exception exception) {
//                Toast.makeText(getApplicationContext(),"Failed!",Toast.LENGTH_SHORT).show();
//                progressDialog.dismiss();
//            }
//        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//            @Override
//            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//
//                Uri downloadUrl = taskSnapshot.getDownloadUrl();
//                String urlIMAGE = downloadUrl.toString();
//                progressDialog.dismiss();
//            }
//        });
    }






}
