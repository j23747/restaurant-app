package com.moringaschool.restaurant_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
// Initializing & set new member variable
    public final String TAG = MainActivity.class.getSimpleName();

    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        //Adding click listeners

        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String location = mLocationEditText.getText().toString();
                 Log.d(TAG, location);

                 Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                 startActivity(intent);
//                 Toast.makeText(MainActivity.this, "Find restaurants!", Toast.LENGTH_LONG).show();

             }
         });


    }
}