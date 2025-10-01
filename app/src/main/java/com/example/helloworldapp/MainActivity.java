package com.example.helloworldapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonChangeBackground;  // Keep as field since it's used in multiple places

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Convert fields to local variables as suggested
        TextView textView = findViewById(R.id.textView);
        Button buttonChangeText = findViewById(R.id.buttonChangeText);
        Button buttonChangeColor = findViewById(R.id.buttonChangeColor);
        buttonChangeBackground = findViewById(R.id.buttonChangeBackground);

        // Use correct lambda expressions
        buttonChangeText.setOnClickListener(v ->
                textView.setText("Text changed successfully!")
        );

        buttonChangeColor.setOnClickListener(v -> {
            textView.setTextColor(Color.RED);
        });

        buttonChangeBackground.setOnClickListener(v -> {
            textView.setBackgroundColor(Color.YELLOW);
        });
    }
    // Code for revert
}