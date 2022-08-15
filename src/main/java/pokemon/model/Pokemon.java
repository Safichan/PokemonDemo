package pokemon.model;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private int id;
    private int level;
    private String name;
    private Nature nature;
    private List<PokemonType> types;
    private List<Attacks> combatAttacks;
    private List<Attacks> learnableAttacks;
    private StatusCondition.PrimaryStatusConditions primaryStatusCondition;
    private StatusCondition.SecondaryStatusConditions secondaryStatusConditions;
    private int currentHP;
    private PokemonStats stats;
    private List<Pokemon> preEvolution;
    private List<Pokemon> postEvolution;

    public Pokemon(JSONObject pokemonJSON) {

    }

    public Pokemon(String Name) {

    }

    public Pokemon(int id, int level, Nature nature, String name, List<PokemonType> types, List<Attacks> combatAttacks, List<Attacks> learnableAttacks,
                   StatusCondition.PrimaryStatusConditions primaryStatusCondition, StatusCondition.SecondaryStatusConditions secondaryStatusConditions,
                   int currentHP, PokemonStats stats, String[] PreEvolutionName, String[] PostEvolutionname) {
        this.id = id;
        this.level = level;
        this.nature = nature;
        this.name = name;
        this.types = types;
        this.combatAttacks = combatAttacks;
        this.learnableAttacks = learnableAttacks;
        this.primaryStatusCondition = primaryStatusCondition;
        this.secondaryStatusConditions = secondaryStatusConditions;
        this.currentHP = currentHP;
        this.stats = stats;
        //
        List<Pokemon> preList = new ArrayList<>();
        for (String preName : PreEvolutionName) {
            preList.add(new Pokemon(preName));
        }
        List<Pokemon> postList = new ArrayList<>();
        for (String postName : PreEvolutionName) {
            postList.add(new Pokemon(postName));
        }

        this.preEvolution = preList;
        this.postEvolution = postList;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    public List<Attacks> getCombatAttacks() {
        return combatAttacks;
    }

    public void setCombatAttacks(List<Attacks> combatAttacks) {
        this.combatAttacks = combatAttacks;
    }

    public List<Attacks> getLearnableAttacks() {
        return learnableAttacks;
    }

    public void setLearnableAttacks(List<Attacks> learnableAttacks) {
        this.learnableAttacks = learnableAttacks;
    }

    public StatusCondition.PrimaryStatusConditions getPrimaryStatusCondition() {
        return primaryStatusCondition;
    }

    public void setPrimaryStatusCondition(StatusCondition.PrimaryStatusConditions primaryStatusCondition) {
        this.primaryStatusCondition = primaryStatusCondition;
    }

    public StatusCondition.SecondaryStatusConditions getSecondaryStatusConditions() {
        return secondaryStatusConditions;
    }

    public void setSecondaryStatusConditions(StatusCondition.SecondaryStatusConditions secondaryStatusConditions) {
        this.secondaryStatusConditions = secondaryStatusConditions;
    }


    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public PokemonStats getStats() {
        return stats;
    }

    public void setStats(PokemonStats stats) {
        this.stats = stats;
    }

    public List<Pokemon> getPreEvolution() {
        return preEvolution;
    }

    public void setPreEvolution(List<Pokemon> preEvolution) {
        this.preEvolution = preEvolution;
    }
    public List<String> getPreEvolutionNames(){
        List <String> preEvolutionNames = new ArrayList<>();
        for (Pokemon pokemon: preEvolution) {
            preEvolutionNames.add(pokemon.name);
        }
        return preEvolutionNames;
    }
    public List<Pokemon> getPostEvolution() {
        return postEvolution;
    }

    public void setPostEvolution(List<Pokemon> postEvolution) {
        this.postEvolution = postEvolution;
    }
    public List<String> getPostEvolutionNames(){
        List <String> postEvolutionNames = new ArrayList<>();
        for (Pokemon pokemon: postEvolution) {
            postEvolutionNames.add(pokemon.name);
        }
        return postEvolutionNames;
    }


    // Stage X model.Pokemon and Evolution


}
