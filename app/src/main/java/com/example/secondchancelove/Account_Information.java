package com.example.secondchancelove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Account_Information extends AppCompatActivity {

    String[] Gender = {"Male", "Female"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account__information);

        Button button = findViewById(R.id.next_button_accountInfo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Account_Information.this,Account_Information_Activity2.class));
            }
        });


        Spinner mySpinner = (Spinner) findViewById(R.id.genderSpinner);
      //  mySpinner.setAdapter(new MyCustomAdapter(Account_Information.this, R.layout.row, Gender));



    }

//    public class MyCustomAdapter extends ArrayAdapter<String> {
//
//        private Context context;
//
//        public MyCustomAdapter(Context context, int textViewResourceId,
//                               String[] objects) {
//            super(context, textViewResourceId, objects);
//            this.context = context;
//
//
//
//
//            // TODO Auto-generated constructor stub
//        }
//
//        @Override
//        public View getDropDownView(int position, View convertView,
//                                    ViewGroup parent) {
//            // TODO Auto-generated method stub
//            return getCustomView(position, convertView, parent);
//
//
//
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            // TODO Auto-generated method stub
//            TextView label = (TextView) convertView;
//
//            if (convertView == null) {
//                convertView = new TextView(context);
//                label = (TextView) convertView;
//            }
//
//            label.setText(Gender[position]);
//
//
//
//            return (convertView);
//
//
//
//        }
//
//        public View getCustomView(int position, View convertView, ViewGroup parent) {
//            // TODO Auto-generated method stub
//            //return super.getView(position, convertView, parent);
//
//            LayoutInflater inflater = getLayoutInflater();
//            View row = inflater.inflate(R.layout.row, parent, false);
//            GridView label = (GridView) row.findViewById(R.id.gridView1);
//
//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Account_Information.this, android.R.layout.simple_list_item_1, Gender);
//            label.setAdapter(adapter);
//
//
//            return row;
//        }
//
//
//
//    }
}