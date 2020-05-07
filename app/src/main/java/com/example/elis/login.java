package com.example.elis;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {
    private TextInputLayout Email;
    private TextInputLayout Password;
    private ImageButton Login;
    private TextView Daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email= findViewById(R.id.emailField);
        Password= findViewById(R.id.passwordField);
        Login= findViewById(R.id.buttonLogin);
        Daftar= findViewById(R.id.daftar);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Email.getEditText().getText().toString(),Password.getEditText().getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){

        if((userName.equals("admin")) && (userPassword.equals("1234"))){

            final AlertDialog.Builder builder = new AlertDialog.Builder(
                    login.this,R.style.AlertDialogStyle
            );
            builder.setIcon(R.drawable.ic_check);
            builder.setTitle("Login Sukses!");
            builder.setMessage("Selamat datang di Elis");
            builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                    Intent intent = new Intent(login.this,homeActivity.class);
                    startActivity(intent);
                }
            });

            final AlertDialog alert=builder.create();
            alert.show();

        }else{
            Toast.makeText(getApplicationContext(),
                    "Email atau Password Salah",Toast.LENGTH_SHORT).show();
        }
    }
}
