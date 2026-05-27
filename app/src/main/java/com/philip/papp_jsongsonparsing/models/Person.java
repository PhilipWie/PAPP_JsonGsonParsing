package com.philip.papp_jsongsonparsing.models;

public class Person {
    String vorname;
    String nachname;
    int alter;

    public String toString() {
        return "Vorname: " + vorname + " Nachname: " + nachname + " Alter: " + alter;
    }

    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public int getAlter() {
        return alter;
    }
}
