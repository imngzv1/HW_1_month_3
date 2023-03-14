package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    private TextView txt_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
      txt_view=findViewById(R.id.txtView);
      Intent intent=getIntent();
      String name= intent.getStringExtra("age_key");
        String name1= intent.getStringExtra("surname");
        String name2= intent.getStringExtra("name_key");
      txt_view.setText("Возраст: "+name+" лет "+"Фамилие: "+name1+" Имя "+name2);
    }
}