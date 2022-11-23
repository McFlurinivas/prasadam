package com.example.prasadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PickReligionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_religion);

        Button hinduButton = findViewById(R.id.hinduButton);
        Button MuslimButton = findViewById(R.id.MuslimButton);
        Button ChristianButton = findViewById(R.id.ChristianButton);

        hinduButton.setOnClickListener(view -> {
            Intent i = new Intent(this, TemplesActivity.class);
            i.putExtra("Religion", "Hindu");
            startActivity(i);
        });

        MuslimButton.setOnClickListener(view -> {
            Intent i = new Intent(this, TemplesActivity.class);
            i.putExtra("Religion", "Muslim");
            startActivity(i);
        });

        ChristianButton.setOnClickListener(view -> {
            Intent i = new Intent(this, TemplesActivity.class);
            i.putExtra("Religion", "Christian");
            startActivity(i);
        });
    }
}