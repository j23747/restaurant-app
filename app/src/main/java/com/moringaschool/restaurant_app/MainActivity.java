package com.moringaschool.restaurant_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button mFindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        //Adding click listeners

        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                 startActivity(intent);
//                 Toast.makeText(MainActivity.this, "Find restaurants!", Toast.LENGTH_LONG).show();

             }
         });


    }
}