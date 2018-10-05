package com.example.uf1_p03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GreetPersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet_person);

        Intent intent = getIntent();
        String personName = intent.getStringExtra(MainActivity.EXTRA_PERSON_NAME);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Hola" + personName);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_greet_person);
        layout.addView(textView);


    }
}
