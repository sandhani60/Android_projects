package com.example.job;

// MangoAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MangoAdapter extends ArrayAdapter<Mango> {

    public MangoAdapter(Context context, List<Mango> mangoes) {
        super(context, 0, mangoes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.mango_item, parent, false);
        }

        Mango mango = getItem(position);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewTitle = convertView.findViewById(R.id.textViewTitle);
        TextView textViewDescription = convertView.findViewById(R.id.textViewDescription);
        TextView textViewWeight = convertView.findViewById(R.id.textViewWeight);
        TextView textViewPrice = convertView.findViewById(R.id.textViewPrice);
        Button buttonDecrease = convertView.findViewById(R.id.buttonDecrease);
        Button buttonIncrease = convertView.findViewById(R.id.buttonIncrease);

        if (mango != null) {
            imageView.setImageResource(mango.getImageResource());
            textViewTitle.setText(mango.getTitle());
            textViewDescription.setText(mango.getDescription());
            textViewWeight.setText(mango.getWeight() + "kg");
            textViewPrice.setText("₹" + mango.getTotalPrice());

            buttonDecrease.setOnClickListener(v -> {
                if (mango.getWeight() > 2.0) {
                    mango.setWeight(mango.getWeight() - 0.5);
                    textViewWeight.setText(mango.getWeight() + "kg");
                    textViewPrice.setText("₹" + mango.getTotalPrice());
                }
            });

            buttonIncrease.setOnClickListener(v -> {
                mango.setWeight(mango.getWeight() + 0.5);
                textViewWeight.setText(mango.getWeight() + "kg");
                textViewPrice.setText("₹" + mango.getTotalPrice());
            });
        }

        return convertView;
    }
}
