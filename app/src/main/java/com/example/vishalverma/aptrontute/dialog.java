package com.example.vishalverma.aptrontute;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class dialog extends AppCompatActivity {

    TextView tv1;
    int mont=1;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View vv=layoutInflater.inflate(R.layout.my_layout,null,false);
                AlertDialog.Builder al=new AlertDialog.Builder(dialog.this);
                al.setTitle("ALERT DIALOG BOX");
                al.setIcon(R.drawable.ic_launcher_background);
                al.setMessage("This is alert dialog box.");
                al.setPositiveButton("OK",null);
                al.setNeutralButton("CANCEL",null);
                al.setCancelable(false);
                al.setView(vv);
                tv1=vv.findViewById(R.id.tv2);
                tv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(dialog.this, "Text view is clicked", Toast.LENGTH_LONG).show();
                    }
                });
                al.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog pd=new ProgressDialog(dialog.this);
                pd.setIcon(R.drawable.ic_launcher_background);
                pd.setTitle("PROGRESS");
                pd.setMessage("Please wait");
                pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pd.setProgress(0);
                pd.setMax(100);
                pd.show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                int dd=calendar.get(Calendar.DAY_OF_MONTH);
                int mm=calendar.get(Calendar.MONTH);
                int yy=calendar.get(Calendar.YEAR);
                mont=mont+mm;
                String day=dd+"/"+mont+"/"+yy;
                Toast.makeText(dialog.this, "The day is="+day, Toast.LENGTH_SHORT).show();
                mont=mont-mm;
                DatePickerDialog dp=new DatePickerDialog(dialog.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month=month+1;
                        String dayee=dayOfMonth+"/"+month+"/"+year;
                        Toast.makeText(dialog.this, "The selected day is="+dayee, Toast.LENGTH_SHORT).show();
                        month=month-1;
                    }
                }, yy, mm, dd);
                dp.show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                int hh=calendar.get(Calendar.HOUR_OF_DAY);
                int mi=calendar.get(Calendar.MINUTE);
                String time=hh+":"+mi;
                Toast.makeText(dialog.this, "time is="+time, Toast.LENGTH_SHORT).show();
                TimePickerDialog tp=new TimePickerDialog(dialog.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String timee=hourOfDay+":"+minute;
                        Toast.makeText(dialog.this, "Time selected="+timee, Toast.LENGTH_SHORT).show();
                    }
                }, hh, mi, false);
                tp.show();
            }
        });
    }
}
