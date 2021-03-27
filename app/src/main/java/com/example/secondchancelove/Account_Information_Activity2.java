package com.example.secondchancelove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class Account_Information_Activity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] religions = {"Hindu","Muslim","Christian","Sikh","Parsi","Jain","Buddisht","Jewish","Spirtual","Others"};
   // int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle, R.drawable.america, R.drawable.new_zealand};

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account__information_2);
       // linearLayout = findViewById(R.id.linearlayout);

        Button button = findViewById(R.id.next_button_accountInfo2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Account_Information_Activity2.this,About_Me_Activity.class));
            }
        });


        Spinner spin = (Spinner) findViewById(R.id.religion_Spinner);
        spin.setOnItemSelectedListener(this);

        ReligionsAdapter customAdapter=new ReligionsAdapter(getApplicationContext(),religions);
        spin.setAdapter((SpinnerAdapter) customAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), religions[position], Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}