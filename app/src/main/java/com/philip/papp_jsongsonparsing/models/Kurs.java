package com.philip.papp_jsongsonparsing.models;

public class Kurs {
    String kursName;
    String kursNummer;
    int kursDauer;

    public String toString() {
        return "Kurs: " + kursName + " | Nummer: " + kursNummer + " | Dauer: " + kursDauer + " ";
    }
    public String getKursName() {
        return kursName;
    }
    public String getKursNummer() {
        return kursNummer;
    }
    public int getKursDauer() {
        return kursDauer;
    }
}
