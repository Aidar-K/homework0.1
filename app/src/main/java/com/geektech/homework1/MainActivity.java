package com.geektech.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView textViewVhod, textViewWelcome1, textViewWelcome2, textViewWelcome3, textViewZabylParol, textViewClickHere;
    ImageView imageView;
    EditText edText1, edText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewVhod = findViewById(R.id.textViewVhod);
        textViewWelcome1 = findViewById(R.id.textViewWelcome1);
        textViewWelcome2 = findViewById(R.id.textViewWelcome2);
        textViewWelcome3 = findViewById(R.id.textViewWelcome3);
        textViewZabylParol = findViewById(R.id.textViewZabylParol);
        textViewClickHere = findViewById(R.id.textViewClickHere);
        imageView = findViewById(R.id.imageView);
        edText1 = findViewById(R.id.edText1);
        edText2 = findViewById(R.id.edText2);
        button = findViewById(R.id.button);

        button.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Вы вошли",Toast.LENGTH_SHORT).show();
            }
        });

        textViewVhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы вошли в систему", Toast.LENGTH_SHORT).show();
            }
        });

        textViewZabylParol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Извините мы не можем вам помочь", Toast.LENGTH_SHORT).show();
            }
        });

        textViewClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы нажали на кнопку", Toast.LENGTH_SHORT).show();
            }
        });

    }
}