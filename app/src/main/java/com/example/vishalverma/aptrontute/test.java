package com.example.vishalverma.aptrontute;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class test extends AppCompatActivity {

    int score=0;
    Button b1;
    TextView tv1,tv2,tv3,tv4;
    RadioGroup rg1;
    RadioButton rb1,rb2,rb3,rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        b1=findViewById(R.id.button10);
        tv1=findViewById(R.id.text1);
        tv2=findViewById(R.id.text2);
        tv3=findViewById(R.id.text3);
        tv4=findViewById(R.id.text4);
        rg1=findViewById(R.id.radiog1);
        rb1=findViewById(R.id.radio1);
        rb2=findViewById(R.id.radio2);
        rb3=findViewById(R.id.radio3);
        rb4=findViewById(R.id.radio4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                tv1.setVisibility(View.VISIBLE);
                rg1.setVisibility(View.VISIBLE);
                b1.setText("NEXT");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked())
                {
                    score = score+1;
                }
                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                tv1.setText("Q2.In which year android established:");
                rb1.setText("2007");
                rb2.setText("2005");
                rb3.setText("2003");
                rb4.setText("2008");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(rb3.isChecked())
                        {
                            score = score+1;
                        }
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        tv1.setText("Q3.Android is developed by:");
                        rb1.setText("Andy Rubin");
                        rb2.setText("Rich Miner");
                        rb3.setText("Nick Sears and Chris White");
                        rb4.setText("All of the above");
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(rb4.isChecked())
                                {
                                    score = score+1;
                                }
                                rb1.setChecked(false);
                                rb2.setChecked(false);
                                rb3.setChecked(false);
                                rb4.setChecked(false);
                                tv1.setText("Q4.Google bought the android in:");
                                rb1.setText("2003");
                                rb2.setText("2005");
                                rb3.setText("2007");
                                rb4.setText("2010");
                                b1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(rb2.isChecked())
                                        {
                                            score = score+1;
                                        }
                                        rb1.setChecked(false);
                                        rb2.setChecked(false);
                                        rb3.setChecked(false);
                                        rb4.setChecked(false);
                                        tv1.setText("Q5.First Android version is:");
                                        rb1.setText("Android Eclair");
                                        rb2.setText("Android Donut");
                                        rb3.setText("Android Froyo");
                                        rb4.setText("Android Petit Four");
                                        b1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if(rb4.isChecked())
                                                {
                                                    score = score+1;
                                                }
                                                rb1.setChecked(false);
                                                rb2.setChecked(false);
                                                rb3.setChecked(false);
                                                rb4.setChecked(false);
                                                tv1.setText("Q6.Android Inc. was founded in which city:");
                                                rb1.setText("Dijon, France");
                                                rb2.setText("Kingston,Jamaica");
                                                rb3.setText(" Palo Alto, California");
                                                rb4.setText("Bangor,UK");
                                                b1.setText("SUBMIT");
                                                b1.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(rb3.isChecked())
                                                        {
                                                            score=score+1;

                                                        }
                                                        rb1.setChecked(false);
                                                        rb2.setChecked(false);
                                                        rb3.setChecked(false);
                                                        rb4.setChecked(false);
                                                        tv4.setText("Your score is="+score);
                                                        b1.setText("EXIT");
                                                        tv1.setVisibility(View.GONE);
                                                        rg1.setVisibility(View.GONE);
                                                        tv4.setVisibility(View.VISIBLE);
                                                        b1.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                System.exit(1);
                                                            }
                                                        });
                                                    }
                                                });

                                            }
                                        });

                                            }
                                        });

                                    }
                                });

                            }
                        });
                    }
                });
            }
        });

    }
    public void onBackPressed() {
        AlertDialog.Builder alert=new AlertDialog.Builder(test.this);
        alert.setTitle("PERMISSION");
        alert.setMessage("Do you really want to go back?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(1);
            }
        });
        alert.setNegativeButton("No",null);
        alert.setNeutralButton("Cancel",null);
        alert.setCancelable(false);
        alert.show();
        //super.onBackPressed();
    }
}
