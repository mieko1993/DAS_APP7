package com.team16.antenna.trend.das;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CarSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_selection);
    }

    public void onClickVolvo(View view){
        Intent i= new Intent(CarSelection.this,Connect.class);
        startActivity(i);
    }

    public void onClickAddCar(View view){
        Intent i= new Intent(CarSelection.this,AddCar.class);
        startActivity(i);
    }
}
