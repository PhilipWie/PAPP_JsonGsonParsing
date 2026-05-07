import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class JsonReader {
    public static String readFileAsString(String fileName) throws Exception {
        return new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
    }
}
JsonReader reader = new JsonReader();
Gson gson = new Gson();
Buch buch = gson.fromJson(reader.readFileAsString("/../resources/buecher.json"), Buch.class);
console.log(buch.toString());