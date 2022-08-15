package pokemon.model;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        try {
            return new String(Files.readAllBytes(Path.of(file)));
        } catch (IOException e) {
            return null;
        }

    }

    private List<Pokemon> readAllPokemon(){


        List<Pokemon> pokemonList = new ArrayList<>();
        String pokemonFolder = "";
        String[] pokemonFiles = listFilesForFolder(new File(pokemonFolder));


        for (String file : pokemonFiles) {
            String pokemonJson = readFileAsString(file);
            Pokemon pokemon = new Pokemon(getJSONObjectFromString(pokemonJson));
        }
        setPokemonEvolutions(pokemonList);

        return pokemonList;
    }

    private JSONObject getJSONObjectFromString(String jsonString){

        return new JSONObject(jsonString);
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
