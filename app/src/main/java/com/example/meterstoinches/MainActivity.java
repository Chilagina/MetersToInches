package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     private EditText meters;
     private Button convertBtn;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meters = findViewById(R.id.meterEditText);
        convertBtn = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultText);

        // set on click listener

        convertBtn.setOnClickListener(v -> {
            // here we do all the logic

            double multiplier = 39.37;
            double result = 0.0;

            if (meters.getText().toString().equals("")) {
                resultTextView.setText(R.string.error_message);
                resultTextView.setTextColor(Color.RED);

            } else {
                double meterValue = Double.parseDouble(meters.getText().toString());
                result = meterValue * multiplier;

                // This is so that it resets to the color white in case it ever turns red
                resultTextView.setTextColor(Color.WHITE);

                // the format method is going to be used so that we can have only 2 decimal places
                resultTextView.setText(String.format("%.2f", result) + " inches");

            }
        });
    }
}









