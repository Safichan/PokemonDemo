package pokemon.model;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.json.*;

public class JsonReader {

    public JsonReader() {

    }

    private String[] listFilesForFolder(File folder) {
        ArrayList files = new ArrayList();
        for (final File fileEntry : folder.listFiles()) {
            files.add(fileEntry.getName());
        }

        return (String[]) files.toArray();
    }

    private static String readFileAsString(String file)
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    private List<Pokemon> readAllPokemon(){


        List<Pokemon> pokemonList = new ArrayList<>();
        String pokemonFolder = "";
        String[] pokemonFiles = listFilesForFolder(new File(pokemonFolder));


        for (String file : pokemonFiles) {
            String pokemonJson = readFileAsString(file);
            JSONObject pokemon = new JSONObject(pokemonJson);
        }






        JSONObject =


        setPokemonEvolutions(pokemonList);

        return pokemonList;
    }

    private void setPokemonEvolutions(List<Pokemon> pokemonList){

        for (int i = 0; i < pokemonList.size(); i++) {
            Pokemon currentPokemon = pokemonList.get(i);

            //returns empty array if there is no Pre-Evolution/Post-Evolution
            List<Pokemon> preEvolution = pokemonList.stream().
                    filter(pokemon -> currentPokemon.getPreEvolutionNames().contains(pokemon.getName())).collect(Collectors.toList());
            currentPokemon.setPreEvolution(preEvolution);

            List<Pokemon> postEvolution = pokemonList.stream().
                    filter(pokemon -> currentPokemon.getPostEvolutionNames().contains(pokemon.getName())).collect(Collectors.toList());
            currentPokemon.setPostEvolution(postEvolution);

        }
    }


}
