package com.philip.json_gsonparsing01;
import com.google.gson.reflect.TypeToken;
import com.philip.json_gsonparsing01.model.Buch;
import com.philip.json_gsonparsing01.model.JsonReader;
import com.google.gson.Gson;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.List;

public class BuchParserTest {
    @Test
    public void testBuchParser() throws Exception {
        JsonReader reader = new JsonReader();
        Gson gson = new Gson();
        Type btyp = new TypeToken<List<Buch>>(){}.getType();
        List<Buch> buchList = gson.fromJson(reader.readFileAsString("/Users/philip/Developer/FHDW/PAPP/JsonGsonParsing01/app/src/main/java/com/philip/json_gsonparsing01/resources/buecher.json"), btyp);
        System.out.println(buchList.toString());
    }


}
