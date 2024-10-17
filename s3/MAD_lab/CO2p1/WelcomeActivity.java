package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private TextView textViewWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Find the TextView in the layout
        textViewWelcomeMessage = findViewById(R.id.textViewWelcomeMessage);

        // Retrieve the data from the Intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");
        String gender = intent.getStringExtra("gender");

        // Create the welcome message
        String welcomeMessage = "Welcome " + username + "!\nEmail: " + email + "\nGender: " + gender;

        // Display the welcome message in the TextView
        textViewWelcomeMessage.setText(welcomeMessage);
    }
}
