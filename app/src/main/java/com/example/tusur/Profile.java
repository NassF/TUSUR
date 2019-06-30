package com.example.tusur;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView famView = (TextView) findViewById(R.id.fam);
        famView.setText("Фамилия");

        TextView nameView = (TextView) findViewById(R.id.name);
        nameView.setText("Имя");

        TextView otchView = (TextView) findViewById(R.id.otch);
        otchView.setText("Отчество");
    }

}
class LinkButtons extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void goToVk(View view) {
        goToUrl("http://vk.com");
    }

    public void goToLern(View view) {
        goToUrl("http://superuser.com/");
    }

    public void goToTable(View view) {
        goToUrl("https://timetable.tusur.ru/");
    }
}

class Phone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button mDialButton = (Button) findViewById(R.id.Call);
        @SuppressLint("WrongViewCast") final EditText mPhoneNoEt = (EditText) findViewById(R.id.PhoneNum);

        mDialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String phoneNo = mPhoneNoEt.getText().toString();
                if(!TextUtils.isEmpty(phoneNo)) {
                    String dial = "tel:" + phoneNo;
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                }
            }
        });
    }
}