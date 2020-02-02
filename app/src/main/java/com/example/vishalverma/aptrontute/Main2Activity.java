package com.example.vishalverma.aptrontute;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button4);
        b4=findViewById(R.id.button5);
        b5=findViewById(R.id.button12);
        b6=findViewById(R.id.button7);
        b7=findViewById(R.id.button11);
        b8=findViewById(R.id.button13);
        b9=findViewById(R.id.button14);
        tv1=findViewById(R.id.text1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(R.string.history);
                b1.setVisibility(View.GONE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b7.setVisibility(View.GONE);
                b6.setVisibility(View.VISIBLE);
                tv1.setVisibility(View.VISIBLE);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab=new AlertDialog.Builder(Main2Activity.this);
                ab.setTitle("Permission");
                ab.setMessage("Are you sure to go back?");
                ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv1.setVisibility(View.GONE);
                        b5.setVisibility(View.GONE);
                        b6.setVisibility(View.GONE);
                        b7.setVisibility(View.VISIBLE);
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        b4.setVisibility(View.VISIBLE);
                        b8.setVisibility(View.GONE);
                        b9.setVisibility(View.GONE);

                    }
                });
                ab.setNegativeButton("No",null);
                ab.setNeutralButton("Cancel",null);
                ab.setCancelable(false);
                ab.show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(R.string.lesson1);
                b1.setVisibility(View.GONE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b6.setVisibility(View.VISIBLE);
                b7.setVisibility(View.GONE);
                tv1.setVisibility(View.VISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(R.string.lesson2);
                b1.setVisibility(View.GONE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b6.setVisibility(View.VISIBLE);
                b7.setVisibility(View.GONE);
                tv1.setVisibility(View.VISIBLE);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab=new AlertDialog.Builder(Main2Activity.this);
                ab.setTitle("SORRY");
                ab.setMessage("This lesson is currently unavailable.");
                ab.setPositiveButton("OK",null);
                ab.setNeutralButton("CANCEL",null);
                ab.setCancelable(false);
                ab.show();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setVisibility(View.GONE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b7.setVisibility(View.GONE);
                b6.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);
                b9.setVisibility(View.VISIBLE);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,easyfood.class);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,dialog.class);
                startActivity(i);
            }
        });

    }
}
