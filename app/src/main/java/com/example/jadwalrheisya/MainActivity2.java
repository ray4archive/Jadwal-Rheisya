package com.example.jadwalrheisya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {
    private Button button, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        button.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), MainActivity3.class));
        });

        button2.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), MainActivity11.class));
        });

        button3.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), MainActivity12.class));
        });
    }
}