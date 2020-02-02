package com.example.vishalverma.aptrontute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class easyfood extends AppCompatActivity {

    int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easyfood);
        final CheckBox cb1=findViewById(R.id.checkBox);
        final CheckBox cb2=findViewById(R.id.checkBox2);
        final CheckBox cb3=findViewById(R.id.checkBox3);
        final CheckBox cb4=findViewById(R.id.checkBox4);
        final TextView tv1=findViewById(R.id.textView12);
        final TextView tv2=findViewById(R.id.textView);
        final TextView tv3=findViewById(R.id.textView2);
        final TextView tv4=findViewById(R.id.textView3);
        final TextView tv5=findViewById(R.id.textView4);
        final TextView tv6=findViewById(R.id.textView14);
        final TextView tv7=findViewById(R.id.textView8);
        final TextView tv8=findViewById(R.id.textView9);
        final TextView tv9=findViewById(R.id.textView10);
        final Button b2=findViewById(R.id.button2);
        final Button b1=findViewById(R.id.button);
        final Button b3=findViewById(R.id.butt3);
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()){
                    cb1.setChecked(true);
                    cb2.setChecked(true);
                    cb3.setChecked(true);
                }
                else{
                    cb1.setChecked(false);
                    cb2.setChecked(false);
                    cb3.setChecked(false);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb1.isChecked()||cb2.isChecked()||cb3.isChecked()) {
                    cb1.setVisibility(View.GONE);
                    cb2.setVisibility(View.GONE);
                    cb3.setVisibility(View.GONE);
                    cb4.setVisibility(View.GONE);
                    tv1.setVisibility(View.GONE);
                    tv2.setVisibility(View.GONE);
                    tv3.setVisibility(View.GONE);
                    tv4.setVisibility(View.GONE);
                    tv5.setVisibility(View.GONE);
                    tv7.setVisibility(View.GONE);
                    tv8.setVisibility(View.GONE);
                    tv9.setVisibility(View.GONE);
                    b3.setVisibility(View.GONE);
                }
                if (cb1.isChecked())
                    total = total + 140;
                if (cb2.isChecked())
                    total = total + 40;
                if (cb3.isChecked())
                    total = total + 30;
                if (total == 140) {
                    tv6.setText("You ordered only pizza and your bill is :- ₹" + total);
                    tv6.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.GONE);
                }
                if (total == 40) {

                    tv6.setText("You ordered only burger and your bill is :-₹" + total);
                    tv6.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.GONE);

                }
                if (total == 30) {

                    tv6.setText("You ordered only roll and your bill is :-₹ " + total);
                    tv6.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.GONE);

                }
                if (total == 180) {

                    tv6.setText("You ordered both pizza and burger. your bill is :- ₹" + total);
                    tv6.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.GONE);

                }
                if (total == 170) {

                    tv6.setText("You ordered both pizza and roll. your bill is :- ₹" + total);
                    tv6.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.GONE);

                }
                if (total == 70) {

                    tv6.setText("You ordered both  burger and roll. your bill is :- ₹" + total);
                    tv6.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.GONE);

                }
                if (total == 210) {

                    tv6.setText("HURRAY you ordered each item in menu. your bill is :- ₹" + total);
                    tv6.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.GONE);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(easyfood.this,easyfood2.class);
                startActivity(i);
                b3.setVisibility(View.VISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });

    }
}
