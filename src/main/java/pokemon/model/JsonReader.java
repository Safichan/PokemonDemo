package pokemon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JsonReader {

    public JsonReader() {

    }


    private List<Pokemon> readAllPokemon(){

        List<Pokemon> pokemonList = new ArrayList<>();



        setPokemonEvolutions(pokemonList);

        return pokemonList;
    }

    private void setPokemonEvolutions(List<Pokemon> pokemonList){

        for (int i = 0; i < pokemonList.size(); i++) {
            Pokemon currentPokemon = pokemonList.get(i);

            //returns null if there is no Pre-Evolution and sets null as well
            List<Pokemon> preEvolution = pokemonList.stream().
                    filter(pokemon -> currentPokemon.getPreEvolutionNames().contains(pokemon.getName())).collect(Collectors.toList());
            currentPokemon.setPreEvolution(preEvolution);

            List<Pokemon> postEvolution = pokemonList.stream().
                    filter(pokemon -> currentPokemon.getPostEvolutionNames().contains(pokemon.getName())).collect(Collectors.toList());
            currentPokemon.setPostEvolution(postEvolution);

        }
    }


}
