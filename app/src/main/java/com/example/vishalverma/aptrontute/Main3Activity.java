package com.example.vishalverma.aptrontute;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button b1;
    String ar[] = {"FRANCE", "BELGIUM", "CROATIA", "ENGLAND"};
    String ar2[] = {"Antonie Griezmann", "Hugo Lloris", "Karim Benzema", "Olivier Giroud", "Blaise Matuidi", "Antoine Griezmann","Paul Pogba","Moussa Sissoko","Laurent Koscielny","Yohan Cabaye","Raphaël Varane","Dimitri Payet","Adil Rami","Samuel Umtiti","Kylian Mbappé§","Lucas Digne"};
    String ar3[]= {"Jan Vertonghen","Thibaut Courtois","Toby Alderweireld","Axel Witsel","Marouane Fellaini","Eden Hazard (captain)","Dries Mertens","Mousa Dembélé","Kevin De Bruyne","Thomas Vermaelen"};
    String ar4[]= {"Danijel Subasic","Lovre Kalinic","Vedran Corluka","Domagoj Vida ","Ivan Strinic ","Luka Modric","Ivan Rikatic","Luka Modrić (C)","Mateo Kovačić","Marcelo Brozovic","Milan Badelj","Mario Mandžukić","Nikola Kalinić","Marko Pjaca ","Ante Rebic"};
    String ar5[]= {"Wayne Rooney ","David Beckham","Harry Kane (captain)","Danny Rose","Jordan Henderson","Jamie Vardy","Gary Cahill","Ashley Young","Fabian Delph","Jack Butland","Dele Alli","Nick Pope","Dele Alli","Marcus Rashford","Ruben Loftus-Cheek"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this,R.layout.my_layout,R.id.tv2, ar);
        final ArrayAdapter<String> arrayAdapter1=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, ar2);
        final ArrayAdapter<String> arrayAdapter2=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, ar3);
        final ArrayAdapter<String> arrayAdapter3=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, ar4);
        final ArrayAdapter<String> arrayAdapter4=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, ar5);
        final Spinner spinner=findViewById(R.id.spin1);
        final ListView listView= findViewById(R.id.list1);
        b1=findViewById(R.id.button13);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    spinner.setAdapter(arrayAdapter1);
                    b1.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    spinner.setVisibility(View.VISIBLE);
                }
                if(position==1)
                {
                    spinner.setAdapter(arrayAdapter2);
                    b1.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    spinner.setVisibility(View.VISIBLE);
                }
                if(position==2)
                {
                    spinner.setAdapter(arrayAdapter3);
                    b1.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    spinner.setVisibility(View.VISIBLE);
                }
                if(position==3)
                {
                    spinner.setAdapter(arrayAdapter4);
                    b1.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    spinner.setVisibility(View.VISIBLE);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setVisibility(View.GONE);
                listView.setVisibility(View.VISIBLE);
                spinner.setVisibility(View.GONE);
            }
        });
    }
}
