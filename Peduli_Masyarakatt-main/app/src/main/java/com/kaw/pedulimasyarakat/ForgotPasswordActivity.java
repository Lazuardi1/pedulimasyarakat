package com.kaw.pedulimasyarakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
    public void loginActivity(View view) {
        Intent I=new Intent(ForgotPasswordActivity.this,LoginActivity.class);
        startActivity(I);
    }
}