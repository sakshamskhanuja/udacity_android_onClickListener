package com.basic.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the Button.
        Button updateButton = findViewById(R.id.button_update);

        // Attaching an OnClickListener to updateButton.
        updateButton.setOnClickListener((v) -> {
            // Get the TextView.
            TextView textView = findViewById(R.id.text_view);
            textView.setText(R.string.text_two);
        });
    }
}