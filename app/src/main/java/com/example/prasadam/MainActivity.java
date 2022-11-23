package com.example.prasadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.util.Log;

import com.example.prasadam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.openGoogleMapsButton.setOnClickListener(
            (view) -> {
                final Uri uri = Uri.parse("https://www.google.com/maps/dir/?api=1")
                    .buildUpon()
                    .appendQueryParameter("destination", "Sri Krishna Temple")
                    .appendQueryParameter("destination_place_id", "ChIJl043D1AUrjsRJdgKx6Cw7TQ")
                    .build();

                Log.i("CustomLog", "Maps uri = " + uri.toString());

                final Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        );
    }


    private ActivityMainBinding binding = null;
}