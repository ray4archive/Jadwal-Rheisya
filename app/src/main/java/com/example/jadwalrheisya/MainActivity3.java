package com.example.jadwalrheisya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button sepuluh, sepuluh2, sepuluh3, sebelas1, sebelas2, duabelas1, duabelas2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        sepuluh=findViewById(R.id.sepuluh);
        sepuluh2=findViewById(R.id.sepuluh2);
        sepuluh3=findViewById(R.id.sepuluh3);
        sebelas1=findViewById(R.id.sebelas1);
        sebelas2=findViewById(R.id.sebelas2);
        duabelas1=findViewById(R.id.duabelas1);
        duabelas2=findViewById(R.id.duabelas2);

        sepuluh.setOnClickListener(V ->{
            startActivity(new Intent(getApplicationContext(), MainActivity4.class));
        });
        sepuluh2.setOnClickListener(V ->{
            startActivity(new Intent(getApplicationContext(), MainActivity5.class));
        });
        sepuluh3.setOnClickListener(V ->{
            startActivity(new Intent(getApplicationContext(), MainActivity6.class));
        });
        sebelas1.setOnClickListener(V ->{
            startActivity(new Intent(getApplicationContext(), MainActivity7.class));
        });
        sebelas2.setOnClickListener(V ->{
            startActivity(new Intent(getApplicationContext(), MainActivity8.class));
        });
        duabelas1.setOnClickListener(V ->{
            startActivity(new Intent(getApplicationContext(), MainActivity9.class));
        });
        duabelas2.setOnClickListener(V ->{
            startActivity(new Intent(getApplicationContext(), MainActivity10.class));
        });
    }
}