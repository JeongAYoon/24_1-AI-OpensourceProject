package com.example.application_2ndweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int id = v.getId();
                if (id == R.id.btn1) {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media//internal//images//media"));
                    startActivity(intent1);
                } else if (id == R.id.btn2) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                    startActivity(intent2);
                } else if (id == R.id.btn3) {
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01046038624"));
                    startActivity(intent3);
                } else if (id == R.id.btn4) {
                    finish();
                }
            }
        };

        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
    }
}