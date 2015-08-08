package com.team16.antenna.trend.das;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Connect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
    }

    public void onClickOBDConnection(View view){
        Intent i= new Intent(Connect.this, DAS.class);
        startActivity(i);
    }

}
