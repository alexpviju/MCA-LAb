package com.example.toggle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView image1, image2, image3;
    private Button btnToggle;
    private int currentImageIndex = 0; // To track the current visible image

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ImageViews
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);

        // Initialize the Button
        btnToggle = findViewById(R.id.btn_toggle);

        // Set onClickListener for button
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleImage();
            }
        });
    }

    private void toggleImage() {
        // Hide all images first
        image1.setVisibility(View.GONE);
        image2.setVisibility(View.GONE);
        image3.setVisibility(View.GONE);

        // Show the next image based on the current index
        switch (currentImageIndex) {
            case 0:
                image1.setVisibility(View.VISIBLE);
                break;
            case 1:
                image2.setVisibility(View.VISIBLE);
                break;
            case 2:
                image3.setVisibility(View.VISIBLE);
                break;
        }

        // Update the current image index to cycle through images
        currentImageIndex = (currentImageIndex + 1) % 3; // Cycle between 0, 1, and 2
    }
}
