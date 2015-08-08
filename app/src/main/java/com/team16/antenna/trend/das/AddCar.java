package com.team16.antenna.trend.das;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AddCar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
    }

    public void onClickDoneAddCar(View view){
        Intent i= new Intent(AddCar.this,Connect.class);
        startActivity(i);
    }
}
