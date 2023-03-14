package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class SecondActivity extends AppCompatActivity {
    private EditText txt_3;
    private AppCompatButton btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt_3=findViewById(R.id.edit_txt_3);
        btn3=findViewById(R.id.btn_3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txt_3.getText().toString().isEmpty()) {
                    String age = txt_3.getText().toString();
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("age_key", age);
                    intent.putExtra("surname",getIntent().getStringExtra("surname"));
                    intent.putExtra("name_key",getIntent().getStringExtra("name_key"));
                    startActivity(intent);

                } else {
                    Toast.makeText(SecondActivity.this, "Where is age ? ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        if (getIntent().getStringExtra("surname") != null) {
            System.out.println("Surname " + getIntent().getStringExtra("surname"));
            System.out.println("Name " + getIntent().getStringExtra("name_key"));

        } else {
            System.out.println("Where is surname ?");
        }



    }
}