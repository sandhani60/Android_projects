package com.evanemran.onlinestoresss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.evanemran.onlinestoresss.databinding.ActivityFoodBinding;

public class Food extends AppCompatActivity {
    ActivityFoodBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFoodBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_food);
        ImageView b1 = findViewById(R.id.img11);
        ImageView b2 = findViewById(R.id.img12);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity1 when button1 is clicked
                startActivity(new Intent(Food.this, NonVeg.class));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity2 when button2 is clicked
                startActivity(new Intent(Food.this, VegActivity.class));

            }
        });




        // Add more buttons as needed
    }
}

