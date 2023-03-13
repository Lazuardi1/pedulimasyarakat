package com.kaw.pedulimasyarakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText email, password, passwordconf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
        passwordconf = findViewById(R.id.Password_conf);
    }
    public void loginActivity(View view) {
        Intent I=new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(I);
    }


    public void registerActivity(View view) {
        String input_email = email.getText().toString();
        String input_password = password.getText().toString();
        String input_passwordconf = passwordconf.getText().toString();

        if(input_email.isEmpty() || input_password.isEmpty() || input_passwordconf.isEmpty()){
            Toast.makeText(this, "Harap isi semua data", Toast.LENGTH_SHORT).show();
        }else {
            Intent I=new Intent(RegisterActivity.this,MainActivity.class);
            startActivity(I);
        }
    }
}