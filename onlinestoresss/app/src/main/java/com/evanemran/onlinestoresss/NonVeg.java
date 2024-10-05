package com.evanemran.onlinestoresss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evanemran.onlinestoresss.databinding.NonvegBinding;

public class NonVeg extends AppCompatActivity {
    NonvegBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=NonvegBinding.inflate(getLayoutInflater());
        setContentView(R.layout.nonveg);
        Button button1 = findViewById(R.id.button);

        Button button3 = findViewById(R.id.button2);
        Button button4 = findViewById(R.id.button3);
        Button button5 = findViewById(R.id.button4);
        Button button6 = findViewById(R.id.button5);
        Button button7 = findViewById(R.id.button6);
        Button button8 = findViewById(R.id.button7);
        Button button9 = findViewById(R.id.button8);
        Button button10 = findViewById(R.id.button9);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
                //
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code to open a URL in a browser
                        String url = "https://forms.gle/BBrcTyYdhosab19U7"; // Change this URL to the desired link file
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });

            }
        });


        // Add more buttons as needed


        // Add more buttons as needed
    }
}

