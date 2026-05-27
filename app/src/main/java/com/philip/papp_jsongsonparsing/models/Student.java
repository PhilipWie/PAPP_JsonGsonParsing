package com.philip.papp_jsongsonparsing.models;

public class Student {
    String Matrikelnummer;
    private Person person;
    private Adresse adresse;
    private Kurs kurs;

    public String toString() {
        return "Matrikelnummer: " + Matrikelnummer + " " + person.toString() + adresse.toString() + kurs.toString();
    }
    public String getMatrikelnummer() { return Matrikelnummer;}
    public Person getPerson() { return person;}
    public Adresse getAdresse() { return adresse;}
    public Kurs getKurs() { return kurs;}
}
