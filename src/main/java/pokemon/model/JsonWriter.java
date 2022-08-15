package pokemon.model;
import org.json.*;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    public JsonWriter(){

    }

    public void writeJson(Pokemon Pokemon){
        JSONObject pokemonJson = new JSONObject();

        //pokemonJson.put();


    }

    private void writeToFile(JSONObject JSON) throws IOException {
        FileWriter writer = new FileWriter(""); //correctFilename
        writer.write(JSON.toString());

    }
}
