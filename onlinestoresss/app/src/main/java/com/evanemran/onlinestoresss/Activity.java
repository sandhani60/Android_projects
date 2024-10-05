package com.evanemran.onlinestoresss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.evanemran.onlinestoresss.databinding.ActivityActivityBinding;
import com.evanemran.onlinestoresss.databinding.ActivityDashboardBinding;

// SecondActivity.java


public class Activity extends AppCompatActivity {
    @NonNull ActivityActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityActivityBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_activity);
        ImageView i1 = findViewById(R.id.img100);
        ImageView i2 = findViewById(R.id.img12);
        ImageView i3 = findViewById(R.id.img3);
        ImageView  i4 = findViewById(R.id.img4);



        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity1 when button1 is clicked
                startActivity(new Intent(Activity.this, Food.class));

            }
        });

       /* i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity2 when button2 is clicked
                startActivity(new Intent(Activity.this, Food.class));

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity2 when button2 is clicked
                startActivity(new Intent(Activity.this, Food.class));

            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity2 when button2 is clicked
                startActivity(new Intent(Activity.this, Food.class));

            }
        });*/





        // Any initialization or setup code for SecondActivity can go here
    }
}
