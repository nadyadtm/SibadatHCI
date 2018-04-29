package com.example.android.sibadat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private TextView lupapass;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView messageWrongPass;

    private FirebaseAuth firebaseAuth;
    private DatabaseReference database;
    private DatabaseReference ref;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = (EditText) findViewById(R.id.username);
        editTextPassword = (EditText) findViewById(R.id.password);

        progressDialog = new ProgressDialog(this);
        firebaseAuth = FirebaseAuth.getInstance();

        lupapass = (TextView) findViewById(R.id.messageWrongPass);
        lupapass.setText("");
    }

    private void userLogin(){
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

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

        progressDialog.setMessage("Memuat....");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                        else{
                            messageWrongPass = (TextView) findViewById(R.id.messageWrongPass);
                            messageWrongPass.setText("Password dan Email salah, coba masukkan lagi");
                        }
                    }
                });
    }

    public void Masuk(View view){
        userLogin();
    }

    public void Daftar(View view){
        Intent intent = new Intent(LoginActivity.this,Register.class);
        startActivity(intent);
    }

    public void LupaPass(View view){
        Intent intent = new Intent(LoginActivity.this,LupaPassword.class);
        startActivity(intent);
    }
}
