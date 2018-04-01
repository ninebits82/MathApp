package com.example.zaidal_mashhadani.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button)findViewById(R.id.result);
        Button reset = (Button) findViewById(R.id.reset);
        final EditText num1 = (EditText) findViewById(R.id.in1);
        final EditText num2 = (EditText) findViewById(R.id.in2);
        final EditText result = (EditText) findViewById(R.id.userAns);

        /**
        * generate random numbers
        * */

        final Random r = new Random();
        final Random r1 = new Random();
        final int rn1 = r.nextInt(10 - 1) + 1;
        final int rn2 = r1.nextInt(10 - 1) + 1;

        /**
         * display these random numbers in the text fields
         */


        num1.setText(Integer.toString(rn1));
        num2.setText(Integer.toString(rn2));



        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = num1.getText().toString();
                int n1 = Integer.parseInt(str1);

                String str2 = num2.getText().toString();
                int n2 = Integer.parseInt(str2);


                String str3 = result.getText().toString();
                int n0 = Integer.parseInt(str3);

               if(n0 == n1 * n2){
                   Toast.makeText(getApplicationContext(),"Good Job!", Toast.LENGTH_SHORT)
                           .show();

               }else{
                   Toast.makeText(getApplicationContext(),"Wrong Answer! the correct answer is " +
                           n1 * n2 , Toast.LENGTH_LONG)
                           .show();
               }
            }
        });
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final Random r = new Random();
                final Random r1 = new Random();
                final int rn1 = r.nextInt(10 - 1) + 1;
                final int rn2 = r1.nextInt(10 - 1) + 1;

                num1.setText(Integer.toString(rn1));
                num2.setText(Integer.toString(rn2));
            }

        });
    }


}
