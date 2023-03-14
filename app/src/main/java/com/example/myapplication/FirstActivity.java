package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

import java.text.BreakIterator;

public class FirstActivity extends AppCompatActivity {
    private AppCompatButton btn2;
    private EditText txt2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn2=findViewById(R.id.btn_2);
        txt2=findViewById(R.id.edit_txt_2);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = txt2.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("surname", name);
                intent.putExtra("name_key",getIntent().getStringExtra("name_key"));
                startActivity(intent);
            }
        });
        if (getIntent().getStringExtra("name_key") != null) {
            System.out.println("Name " + getIntent().getStringExtra("name_key"));

        } else {
            System.out.println("Where is name ?");
        }
    }
}