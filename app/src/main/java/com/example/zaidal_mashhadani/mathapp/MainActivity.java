package com.example.zaidal_mashhadani.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button)findViewById(R.id.result);
        final EditText num1 = (EditText) findViewById(R.id.in1);
        final EditText num2 = (EditText) findViewById(R.id.in2);
        final EditText result = (EditText) findViewById(R.id.out);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();
                int n1 = Integer.parseInt(str1);
                int n2 = Integer.parseInt(str2);

                result.setText(Integer.toString(n1 * n2));

            }
        });
    }


}