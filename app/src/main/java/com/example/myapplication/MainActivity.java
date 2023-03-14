package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton btn1;
    private EditText txt1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.main_btn);
        txt1 = findViewById(R.id.edit_txt_1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txt1.getText().toString().isEmpty()) {
                    String name = txt1.getText().toString();
                    Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                    intent.putExtra("name_key", name);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "Where is name ? ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}