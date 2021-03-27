package com.example.secondchancelove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class About_Me_Activity extends AppCompatActivity {
    Chip chipMovies, chipCooking, chipTechnology, chipShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__me_);


        Button button = findViewById(R.id.next_button_aboutme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About_Me_Activity.this,Upload_Image_Activity.class));
            }
        });


//        chipMovies = findViewById(R.id.chipMovies);
//        chipCooking = findViewById(R.id.chipCooking);
//        chipShopping = findViewById(R.id.chipShopping);
//
//        chipMovies.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // check whether the chips is filtered by user
//                // or not and give the suitable Toast message
//                if (chipMovies.isChecked()) {
//                    Toast.makeText(About_Me_Activity.this, "C++ selected", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(About_Me_Activity.this, "C++ deselected", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        chipCooking.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // check whether the chips is filtered by user or
//                // not and give the suitable Toast message
//                if (chipCooking.isChecked()) {
//                    Toast.makeText(About_Me_Activity.this, "JAVA selected", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(About_Me_Activity.this, "JAVA deselected", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        chipShopping.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // check whether the chips is filtered by user or
//                // not and give the suitable Toast message
//                if (chipShopping.isChecked()) {
//                    Toast.makeText(About_Me_Activity.this, "Python selected", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(About_Me_Activity.this, "Python deselected", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }
}

