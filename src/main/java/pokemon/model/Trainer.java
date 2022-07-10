package pokemon.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trainer {
    private String name;
    private int age;
    private Date birthday;
    private String region;
    private String gender;
    private List<Pokemon> pokemonTeam;
    private String description;

    public Trainer(String name, int age, Date birthday, String region, String gender, String description) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.region = region;
        this.gender = gender;
        this.pokemonTeam = new ArrayList<>();
        this.description = description;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonTeam.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        this.pokemonTeam.remove(pokemon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Pokemon> getPokemonTeam() {
        return pokemonTeam;
    }

    public void setPokemonTeam(List<Pokemon> pokemonTeam) {
        this.pokemonTeam = pokemonTeam;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

