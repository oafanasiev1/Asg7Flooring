package com.example.asg7flooring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FlooringResult extends AppCompatActivity {


    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring_result);
        txtResult = findViewById(R.id.txtResult);
        Bundle extra = getIntent().getExtras();
        int width = extra.getInt("Width");
        int length = extra.getInt("Length");
        int total = width * length;
        txtResult.setText("The floor with a width of " + width + " and the length of " + length
        + " has area of " + total
        );



    }
}
