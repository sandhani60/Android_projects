package com.evanemran.onlinestoresss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evanemran.onlinestoresss.databinding.VegBinding;

public class VegActivity extends AppCompatActivity {
    VegBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=VegBinding.inflate(getLayoutInflater());
        setContentView(R.layout.veg);
        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button1);
        Button button3 = findViewById(R.id.button2);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/qaVYS6o8KNJNvkL38"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/qaVYS6o8KNJNvkL38"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/qaVYS6o8KNJNvkL38"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });




    }
}

