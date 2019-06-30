package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private TextView loginLocked;
    private TextView attempts;
    private TextView numberOfAttempts;
    private Button recorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_password);
        recorder=(Button) findViewById(R.id.button_recorder);
        login = (Button) findViewById(R.id.button_login);
        loginLocked = (TextView) findViewById(R.id.login_locked);
        attempts = (TextView) findViewById(R.id.attempts);
        numberOfAttempts = (TextView) findViewById(R.id.number_of_attempts);


    }


    public void Login(View view) {


        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("123")) {
            Toast.makeText(getApplicationContext(), "ВЫ ВОШЛИ",Toast.LENGTH_SHORT).show();


            Intent intent = new Intent(MainActivity.this,Second.class);
            startActivity(intent);
        }


        else {
            Toast.makeText(getApplicationContext(), "Неверные данные",Toast.LENGTH_SHORT).show();



            attempts.setVisibility(View.VISIBLE);
            numberOfAttempts.setVisibility(View.VISIBLE);

        }
    }

    public void recorder(View view) {
    }
}