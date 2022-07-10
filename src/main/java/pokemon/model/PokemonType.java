package pokemon.model;

import java.util.ArrayList;
import java.util.List;

public class PokemonType {

    private int id;
    private String name;
    private List<PokemonType> strongAgainstTypes;
    private List<PokemonType> weakAgainstTypes;

    public PokemonType(int id, String name) {
        this.id = id;
        this.name = name;
        this.strongAgainstTypes = new ArrayList<>();
        this.weakAgainstTypes = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<PokemonType> getStrongAgainstTypes() {
        return strongAgainstTypes;
    }

    public void setStrongAgainstTypes(List<PokemonType> strongAgainstTypes) {
        this.strongAgainstTypes = strongAgainstTypes;
    }

    public List<PokemonType> getWeakAgainstTypes() {
        return weakAgainstTypes;
    }

    public void setWeakAgainstTypes(List<PokemonType> weakAgainstTypes) {
        this.weakAgainstTypes = weakAgainstTypes;
    }
}

