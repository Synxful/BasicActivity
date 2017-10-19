package com.example.student.basicactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

                Intent i = new Intent(getApplicationContext(),DetailSeite.class);
                startActivity(i);
            }
        });




        ReisetippDatenquelle tipp = new ReisetippDatenquelle();
        final ArrayList<ModellTipp> daten = tipp.getDaten();


        /*final List valueList = new ArrayList<String>();*/

        /*valueList.add("1. Element");
        valueList.add("2. Element");
        valueList.add("3. Element");
        valueList.add("4. Element");
        valueList.add("5. Element");
        valueList.add("6. Element");
        valueList.add("7. Element");
        valueList.add("8. Element");
        valueList.add("9. Element");
        valueList.add("0. Element");
        valueList.add("1. Element");
        valueList.add("2. Element");
        valueList.add("1. Element");
        valueList.add("56. Element");
        valueList.add("7l. Element");
        valueList.add("21. Element");*/



        ListAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, daten);
        final ListView liste = (ListView) findViewById(R.id.liste);
        liste.setAdapter(adapter);

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String geklickt = daten.get(position).toString();
                System.out.println("String geklickt : " + geklickt);


                Toast aussage = Toast.makeText(getApplicationContext(),"Geklickt wurde: " + geklickt, Toast.LENGTH_SHORT);
                aussage.show();

                Intent dasExtra = new Intent(getApplicationContext(),DetailSeite.class);
                dasExtra.putExtra("id", String.valueOf(position));
                System.out.println("String.valueOf(position) : " + String.valueOf(position));
                startActivity(dasExtra);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
