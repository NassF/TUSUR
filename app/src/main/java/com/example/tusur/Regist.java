package com.example.tusur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Regist extends AppCompatActivity {
    private EditText last_name;
    private EditText first_name;
    private EditText fathersname;
    private EditText email;
    private EditText passw;
    private EditText group;
    private Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        last_name = (EditText) findViewById(R.id.eFam);
        first_name = (EditText) findViewById(R.id.eName);
        fathersname = (EditText) findViewById(R.id.eSecondname);
        group = (EditText) findViewById(R.id.groupp);
        email = (EditText) findViewById(R.id.mail);
        passw = (EditText) findViewById(R.id.pass);
        SignIn = (Button) findViewById(R.id.butReg);
    }
    private View.OnFocusChangeListener listener= new View.OnFocusChangeListener(){
        @Override
        public void onFocusChange(View vi, boolean hasFocus){
            if(!hasFocus)hideKeyboard();
        }
    };
    private void hideKeyboard(){
        InputMethodManager im=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(),0);
    }
    public void SignIn(View view) {
        Toast.makeText(getApplicationContext(), "Успешно!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Regist.this, Profile.class);
        startActivity(intent);
    }
}
