package com.philip.papp_jsongsonparsing.parser;

import com.google.gson.Gson;
import com.philip.papp_jsongsonparsing.models.Adresse;
import com.philip.papp_jsongsonparsing.models.Kurs;
import com.philip.papp_jsongsonparsing.models.Person;
import com.philip.papp_jsongsonparsing.models.Student;

public class GsonParser {
    private static final Gson gson = new Gson();

    public static Adresse parseAdresse(String json){
        return gson.fromJson(json, Adresse.class);
    }
    public static Person parsePerson(String json) {
        return gson.fromJson(json, Person.class);
    }

    public static Kurs parseKurs(String json) {
        return gson.fromJson(json, Kurs.class);
    }

    public static Student parseStudent(String json) {
        return gson.fromJson(json, Student.class);
    }
}
