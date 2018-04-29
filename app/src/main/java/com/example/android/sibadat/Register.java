package com.example.android.sibadat;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import static android.R.attr.name;
import static android.R.attr.progress;
import static android.R.attr.start;
import static com.example.android.sibadat.R.id.score;

public class Register extends AppCompatActivity {

    private Button selesaiButton;
    private EditText namaField;
    private EditText usernameField;
    private EditText emailField;
    private EditText passwordField;
    private EditText confPassField;
    private EditText phoneField;

    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firebaseAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");

        selesaiButton = (Button) findViewById(R.id.finishbutton);
        namaField = (EditText) findViewById(R.id.namaField);
        usernameField = (EditText) findViewById(R.id.usernameField);
        emailField = (EditText) findViewById(R.id.emailField);
        passwordField = (EditText) findViewById(R.id.passwordField);
        confPassField = (EditText) findViewById(R.id.confirmField);
        phoneField = (EditText) findViewById(R.id.phoneField);

        progressDialog = new ProgressDialog(this);

        selesaiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser(){
        String nama = namaField.getText().toString().trim();
        final String username = usernameField.getText().toString().trim();
        final String email = emailField.getText().toString().trim();
        final String password = passwordField.getText().toString().trim();
        String confpass = confPassField.getText().toString().trim();
        String phone = phoneField.getText().toString().trim();

        if(TextUtils.isEmpty(username)){
            //email is empty
            Toast.makeText(this,"Masukkan semua kolom",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(nama)){
            Toast.makeText(this,"Masukkan semua kolom",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(email)){
            //email is empty
            Toast.makeText(this,"Masukkan semua kolom",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            //pass is empty
            Toast.makeText(this,"Masukkan semua kolom",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(confpass)){
            Toast.makeText(this,"Masukkan semua kolom",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(phone)){
            Toast.makeText(this,"Masukkan semua kolom",Toast.LENGTH_SHORT).show();
            return;
        }


        AlertDialog.Builder builder=new AlertDialog.Builder(Register.this);
        builder.setCancelable(true);
        builder.setTitle("Konfirmasi");
        builder.setMessage("Apakah anda yakin?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                progressDialog.setMessage("Tunggu Sebentar...");
                progressDialog.show();
                firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            String user_id = firebaseAuth.getCurrentUser().getUid();
                            DatabaseReference current_user_db = mDatabase.child(user_id);
                            current_user_db.child("name").setValue(username);
                            Intent intent = new Intent(Register.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                        else{
                            progressDialog.dismiss();
                            Toast.makeText(Register.this,"Register Gagal, Silahkan mencoba lagi", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create().show();
    }
}
