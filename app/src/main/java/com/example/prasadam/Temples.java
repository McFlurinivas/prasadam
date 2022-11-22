package com.example.prasadam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Temples extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<templesList> templesArrayList;
    MyAdapter myAdapter;
    String[] templeName;
    String[] templeLocation;
    String[] templeDistance;
    String[] templeTime;
    int[] templeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        templesArrayList = new ArrayList<>();

        myAdapter = new MyAdapter(this,templesArrayList);
        recyclerView.setAdapter(myAdapter);

        templeName = new String[]{
                "Shree Abhistha Maharaja Ganapathi Temple",
                "Chamundeshwari Temple"
        };

        templeLocation = new String[]{
                "12-522, 17th A Cross Rd, Muneswara Nagar, Sector 6, HSR Layout, Bengaluru, Karnataka 560068",
                "WJ9H+H5W, Santhosapuram, Venkatapura, HSR Layout, Bengaluru, Karnataka 560034"
        };

        templeDistance = new String[]{
                "3km",
                "5km"
        };

        templeTime = new String[]{
                "5am - 10pm",
                "5am - 7pm"
        };

        templeImage = new int[] {
                R.drawable.shreeabhisthamaharajaganapathitemple,
                R.drawable.chamundeshwaritemple
        };

        getData();
    }

    public void getData() {
        for (int i = 0; i < templeName.length; i++) {
            templesList temples = new templesList(templeName[i], templeTime[i], templeLocation[i], templeDistance[i], templeImage[i]);
            templesArrayList.add(temples);
        }
    }
}