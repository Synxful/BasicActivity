package com.example.student.basicactivity;

import java.util.ArrayList;

/**
 * Created by student on 20.10.2017.
 */

public class ModellTipp {

    String name;
    String ziel;
    String benutzer;
    String text;

    public ModellTipp(String name, String ziel, String benutzer, String text) {
        this.name = name;
        this.ziel = ziel;
        this.benutzer = benutzer;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZiel() {
        return ziel;
    }

    public void setZiel(String ziel) {
        this.ziel = ziel;
    }

    public String getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ModellTipp{" +
                "name='" + name + '\'' +
                ", ziel='" + ziel + '\'' +
                ", benutzer='" + benutzer + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
