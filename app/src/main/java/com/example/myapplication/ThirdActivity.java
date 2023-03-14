package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    private AppCompatButton btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btn4=findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ThirdActivity.this,FourthActivity.class);
                intent.putExtra("age_key",getIntent().getStringExtra("age_key"));
                intent.putExtra("surname",getIntent().getStringExtra("surname"));
                intent.putExtra("name_key",getIntent().getStringExtra("name_key"));
                startActivity(intent);
            }
        });


            System.out.println("Age " + getIntent().getStringExtra("age_key"));
            System.out.println("Surname " + getIntent().getStringExtra("surname"));
            System.out.println("Name " + getIntent().getStringExtra("name_key"));

    }
}