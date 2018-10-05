package com.example.uf1_p03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_PERSON_NAME;
   // public String EXTRA_PERSON_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendPersonName(View view){
        EditText editTextPersonName = (EditText) findViewById(R.id.edit_person_name);
        String personName = editTextPersonName.getText().toString();

        Intent intent = new Intent(this, GreetPersonActivity.class);
        intent.putExtra(EXTRA_PERSON_NAME, personName);
        startActivity(intent);
    }
}
