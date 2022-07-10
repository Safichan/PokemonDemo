package pokemon.model;

public class Nature {

    private String name;
    private float atkMultiplier;
    private float defMultiplier;
    private float spAtkMultiplier;
    private float spDefMultiplier;
    private float iniMultiplier;

    public Nature(String name, float atkMultiplier, float defMultiplier, float spAtkMultiplier, float spDefMultiplier, float iniMultiplier) {
        this.name = name;
        this.atkMultiplier = atkMultiplier;
        this.defMultiplier = defMultiplier;
        this.spAtkMultiplier = spAtkMultiplier;
        this.spDefMultiplier = spDefMultiplier;
        this.iniMultiplier = iniMultiplier;
    }

    public String getName() {
        return name;
    }


    public float getAtkMultiplier() {
        return atkMultiplier;
    }

    public float getDefMultiplier() {
        return defMultiplier;
    }

    public float getSpAtkMultiplier() {
        return spAtkMultiplier;
    }

    public float getSpDefMultiplier() {
        return spDefMultiplier;
    }

    public float getIniMultiplier() {
        return iniMultiplier;
    }
}
