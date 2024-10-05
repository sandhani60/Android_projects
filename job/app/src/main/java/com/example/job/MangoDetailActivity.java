package com.example.job;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MangoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango_detail);

        TextView detailTextView = findViewById(R.id.detailTextView);
        String mangoDetails = getIntent().getStringExtra("MANGO_DETAILS");
        detailTextView.setText(mangoDetails);
    }
}
