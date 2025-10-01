package com.example.helloworldapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Convert fields to local variables as suggested
        TextView textView = findViewById(R.id.textView);
        Button buttonChangeText = findViewById(R.id.buttonChangeText);
        Button buttonChangeColor = findViewById(R.id.buttonChangeColor);

        // Use lambda expressions as suggested
        buttonChangeText.setOnClickListener(v ->
                textView.setText("Text changed successfully!")
        );

        buttonChangeColor.setOnClickListener(v -> {
            // Fixed: setTextColor instead of setTextColon
            textView.setTextColor(Color.RED);
        });
    }
}