package com.example.student.basicactivity;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailSeite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_seite);

        Intent detailIntent = getIntent();
        String s = detailIntent.getStringExtra("id");
        int id = Integer.valueOf(s);

        Toast t = Toast.makeText(getApplicationContext(), s , Toast.LENGTH_SHORT);
        t.show();

        ReisetippDatenquelle datenquelle = new ReisetippDatenquelle();
        ArrayList<ModellTipp> modell = datenquelle.getDaten();

        Log.i("Datenliste", "Benutzer" + modell.get(id).getBenutzer());



    }
}
