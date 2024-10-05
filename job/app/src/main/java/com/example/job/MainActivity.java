package com.example.job;

// MainActivity.java
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mangoListView;
    private List<Mango> mangoes;
    private EditText addressEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addressEditText = findViewById(R.id.addressEditText);

        // Initialize mango data
        mangoes = new ArrayList<>();
        mangoes.add(new Mango("Large Mango", "Large mango (banginapalli)", 2.0, 100.0, R.drawable.large_mango, "123 Mango Street"));
        mangoes.add(new Mango("Medium Mango", "Medium mango(banginapall)", 2.0, 75.0, R.drawable.medium_mango, "456 Mango Avenue"));

        // Setup ListView and adapter
        mangoListView = findViewById(R.id.mangoListView);
        MangoAdapter adapter = new MangoAdapter(this, mangoes);
        mangoListView.setAdapter(adapter);

        // Handle item click to display detailed information
        mangoListView.setOnItemClickListener((parent, view, position, id) -> {
            Mango selectedMango = mangoes.get(position);
            displayMangoDetails(selectedMango);
        });

        // Handle Pay Now button click
        Button payNowButton = findViewById(R.id.payNowButton);
        payNowButton.setOnClickListener(v -> {
            // Replace with actual PhonePe payment integration
            Intent phonePeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("phonepe://pay?pa=8639167139&pn=Your Name&am=amount"));
            startActivity(phonePeIntent);
        });

        // Handle WhatsApp button click
        Button whatsappButton = findViewById(R.id.whatsappButton);
        whatsappButton.setOnClickListener(v -> {
            String message = "Hi, I would like to inquire about your mangoes.";
            Intent whatsappIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/8639167139?text=" + message));
            startActivity(whatsappIntent);
        });
    }

    private void displayMangoDetails(Mango mango) {
        // Replace with actual implementation to display detailed information
        String message = "Title: " + mango.getTitle() + "\nDescription: " + mango.getDescription() +
                "\nAddress: " + mango.getAddress() + "\nPrice: ₹" + mango.getTotalPrice();
        Intent intent = new Intent(MainActivity.this, MangoDetailActivity.class);
        intent.putExtra("MANGO_DETAILS", message);
        startActivity(intent);
    }
}
