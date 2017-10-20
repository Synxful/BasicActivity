package com.example.student.basicactivity;

import java.util.ArrayList;

/**
 * Created by student on 20.10.2017.
 */

public class ReisetippDatenquelle {

    ArrayList<ModellTipp> daten = new ArrayList();

    public ReisetippDatenquelle() {
        daten.add(new ModellTipp("Erleben die U Bahn", "London", "Frank", "YOLO"));
    }


    public ArrayList<ModellTipp> getDaten() {
        return daten;
    }

}
