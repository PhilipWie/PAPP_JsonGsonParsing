package com.philip.papp_jsongsonparsing.models;

import com.google.gson.annotations.SerializedName;

public class Adresse {
    @SerializedName(value = "Strasse")
    String strasse;
    int plz;
    int hausnummer;
    String stadt;

    public String toString(){
        return "Strasse: " + strasse + " | PLZ: " + plz + " | Stadt: " + stadt + "| Hausnummer: " + hausnummer + " ";
    }
    public String getStrasse() {
        return strasse;
    }
    public Integer getPlz() {
        return plz;
    }
    public String getStadt() {
        return stadt;
    }
    public Integer getHausnummer() {
        return hausnummer;
    }
}
