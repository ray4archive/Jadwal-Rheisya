package com.example.jadwalrheisya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button4=findViewById(R.id.button4);
        button4.setOnClickListener(V->{
            startActivity(new Intent(getApplicationContext(), MainActivity2.class));
        });
    }
}