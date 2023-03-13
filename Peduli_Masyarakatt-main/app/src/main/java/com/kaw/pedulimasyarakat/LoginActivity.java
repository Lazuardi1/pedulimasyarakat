package com.kaw.pedulimasyarakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);

    }

    public void registActivity(View view) {
        Intent I=new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(I);
    }

    public void MainActivity (View view) {
        String input_email = email.getText().toString();
        String input_password = password.getText().toString();

        if(input_email.isEmpty() || input_password.isEmpty()){
            Toast.makeText(this, "Data harus diisi semua", Toast.LENGTH_SHORT).show();
        } else {
            Intent I=new Intent(LoginActivity.this,MainActivity.class);
            startActivity(I);
        }
    }
}