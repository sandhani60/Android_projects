package com.evanemran.onlinestoresss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.evanemran.onlinestoresss.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {
    ActivityDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);
        ImageView button1 = findViewById(R.id.image);
        ImageView button2 = findViewById(R.id.image1);
        ImageView button3 = findViewById(R.id.image2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity1 when button1 is clicked
                startActivity(new Intent(DashboardActivity.this, Activity.class));

            }
        });

        /*button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity2 when button2 is clicked
                startActivity(new Intent(DashboardActivity.this, Activity.class));

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start AnotherActivity2 when button2 is clicked
                startActivity(new Intent(DashboardActivity.this, Activity.class));

            }
        });*/

        // Add more buttons as needed
    }
}

