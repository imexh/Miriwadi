package com.example.miriwadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class adType extends AppCompatActivity {
    Button Slippers, shoes, boots, sandals;
    TextView coins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_type);
        Slippers = findViewById(R.id.slippersBtn);
        shoes = findViewById(R.id.runningBtn);
        boots = findViewById(R.id.Boots);
        sandals = findViewById(R.id.sandalsBtn);
        coins = findViewById(R.id.CoinCount);


        Slippers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(adType.this, Slippers.class);
                startActivity(intent1);
            }
        });

        boots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(adType.this, Boots.class);
                startActivity(intent12);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(adType.this, Shoes.class);
                startActivity(intent13);

            }
        });

        sandals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(adType.this, Sandals.class);
                startActivity(intent15);
            }
        });
    }
}