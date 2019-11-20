package com.example.modular3;

import android.content.Intent;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.modular3.ui.login.Login;


public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnAboutUs;
    private Button btnEspecialidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnEspecialidad = (Button) findViewById(R.id.btnEspecialidad);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,
                        Login.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,
                        AboutUs.class);
                startActivity(i);
            }
        });
        btnEspecialidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,
                        Especialidad.class);
                startActivity(i);
            }
        });



    }
}
