package com.example.prasadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.prasadam.databinding.ActivityTempleDetailsBinding;
import com.example.prasadam.models.Temple;

import android.net.Uri;
import android.util.Log;

public class TempleDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTempleDetailsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        temple = (Temple) getIntent().getSerializableExtra("temple");

        binding.nameLabel.setText(temple.templeName);
        binding.addressLabel.setText(temple.address.toString());
        binding.distanceValueLabel.setText(temple.templeDistance);


        binding.showDirectionsButton.setOnClickListener(
            (view) -> {
                final Uri uri = Uri.parse("https://www.google.com/maps/dir/")
                    .buildUpon()
                    .appendQueryParameter("api", "1")
                    .appendQueryParameter("destination", "Sri Krishna Temple")
                    .appendQueryParameter("destination_place_id", temple.mapId)
                    .build();

                Log.i("CustomLog", "Uri = " + uri.toString());


                final Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        );
    }


    private ActivityTempleDetailsBinding binding = null;
    private Temple temple = null;
}