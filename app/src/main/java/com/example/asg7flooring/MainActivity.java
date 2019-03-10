package com.example.asg7flooring;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText editWidth;
    EditText editLength;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editWidth = findViewById(R.id.editWidth);
        editLength = findViewById(R.id.editLength);
        submitButton = findViewById(R.id.btnResult);


        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Integer width = Integer.parseInt(editWidth.getText().toString());
                Integer length = Integer.parseInt(editLength.getText().toString());

                Intent floor = new Intent(v.getContext(), FlooringResult.class);
                floor.putExtra("Width", width);
                floor.putExtra("Length", length);
                startActivity(floor);
            }


        });
    }

}