package com.example.google;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;

            btn=(Button)findViewById(R.id.button1);
            btn.setOnClickListener(this);

        }
        public void onClick(View v)
        {
            startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.youtube.com")));
           // startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.amazon.com")));
        }
    }
