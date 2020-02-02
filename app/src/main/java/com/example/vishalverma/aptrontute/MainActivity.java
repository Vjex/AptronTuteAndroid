package com.example.vishalverma.aptrontute;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    EditText et1,et2,et3,et4,et5;
    RadioGroup rg1;
    RadioButton rb1,rb2;
    String s1,s2,s3,s4,s5,dayee;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,et6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater layoutInflater = getLayoutInflater();
        final View vv =layoutInflater.inflate(R.layout.form,null,false);
        Calendar calendar= Calendar.getInstance();
        final int dd=calendar.get(Calendar.DAY_OF_MONTH);
        final int mm=calendar.get(Calendar.MONTH);
        final int yy=calendar.get(Calendar.YEAR);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button9);
        b3=findViewById(R.id.button6);
        et1=vv.findViewById(R.id.edit1);
        et2=vv.findViewById(R.id.edit2);
        et3=vv.findViewById(R.id.edit3);
        et4=vv.findViewById(R.id.edit4);
        et5=vv.findViewById(R.id.edit5);
        et6=vv.findViewById(R.id.edit6);
        rg1=vv.findViewById(R.id.radiog1);
        rb1=vv.findViewById(R.id.radio1);
        rb2=vv.findViewById(R.id.radio2);
        tv1=findViewById(R.id.textView6);
        tv2=findViewById(R.id.textView7);
        tv3=findViewById(R.id.textView11);
        tv4=findViewById(R.id.textView13);
        tv5=findViewById(R.id.textView15);
        tv6=findViewById(R.id.textView16);
        tv7=findViewById(R.id.textView17);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        et6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog dp=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month=month+1;
                        dayee=dayOfMonth+"/"+month+"/"+year;
                        et6.setText(dayee);
                        month=month-1;
                    }
                }, yy, mm, dd);
                dp.show();

            }
        });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        tv1.setVisibility(View.GONE);
                        tv2.setVisibility(View.GONE);
                        tv3.setVisibility(View.GONE);
                        tv4.setVisibility(View.GONE);
                        tv5.setVisibility(View.GONE);
                        tv6.setVisibility(View.GONE);
                        tv7.setVisibility(View.GONE);
                        b3.setVisibility(View.GONE);
                        b1.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        Intent i=new Intent(MainActivity.this,test.class);
                        startActivity(i);
                    }
                });

        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setView(vv);
        alert.setTitle("Please fill this form first.");
        alert.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                b1.setVisibility(View.GONE);
                b2.setVisibility(View.GONE);
                tv1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.VISIBLE);
                tv7.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);

                s1=et1.getText().toString();
                s2=et2.getText().toString();
                s3=et3.getText().toString();
                s4=et4.getText().toString();
                s5=et5.getText().toString();


                tv1.setText("First name ="+s1);
                tv2.setText("Last name ="+s2);
                tv3.setText("Father's name ="+s3);
                tv4.setText("Mother's name ="+s4);
                tv5.setText("Email ="+s5);
                tv6.setText("D.O.B ="+dayee);
                if(rb1.isChecked())
                {
                    tv7.setText("Gender is = MALE");
                }
                if(rb2.isChecked())
                {
                    tv7.setText("Gender is = FEMALE");
                }

            }
        });
        alert.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Please submit the form to give test.", Toast.LENGTH_LONG).show();

            }
        });
        alert.setCancelable(false);
        final AlertDialog abb=alert.create();
        abb.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                abb.show();
            }
        });
    }
    public void onBackPressed() {
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("PERMISSION");
        alert.setMessage("Do you really want to exit?");
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
