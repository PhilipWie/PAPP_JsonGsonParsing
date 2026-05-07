package com.philip.json_gsonparsing01.model;

public class Autor {
    String name;
    int geburtsjahr;

    public Autor(String name, int geburtsjahr) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }
    public String getName() {
        return name;
    }
    public String setName(String name) {
        return this.name = name;
    }
    public int getGeburtsjahr() {
        return geburtsjahr;
    }
    public int setGeburtsjahr(int geburtsjahr) {
        return this.geburtsjahr = geburtsjahr;
    }
}
