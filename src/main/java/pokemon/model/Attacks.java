package pokemon.model;

public class Attacks {
    private int id;
    private String name;
    private int ap;
    private int maxAp;
    private int power;
    private PokemonType type;
    private int accuracy;
    private String effectDescription;
    private StatusCondition.PrimaryStatusConditions primaryStatusAffliction;
    private StatusCondition.SecondaryStatusConditions secondaryStatusAffliction;
    private int statusProbability;
    private boolean useable;

    public Attacks(int id, String name, int ap, int maxAp, int power, PokemonType type, int accuracy, String effectDescription, StatusCondition.PrimaryStatusConditions primaryStatusAffliction,
                   StatusCondition.SecondaryStatusConditions secondaryStatusAffliction, int statusProbability, boolean useable) {
        this.id = id;
        this.name = name;
        this.ap = ap;
        this.maxAp = maxAp;
        this.power = power;
        this.type = type;
        this.accuracy = accuracy;
        this.effectDescription = effectDescription;
        this.primaryStatusAffliction = primaryStatusAffliction;
        this.secondaryStatusAffliction = secondaryStatusAffliction;
        this.statusProbability = statusProbability;
        this.useable = useable;
    }

    public int getMaxAp() {
        return maxAp;
    }

    public void setMaxAp(int maxAp) {
        this.maxAp = maxAp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getEffectDescription() {
        return effectDescription;
    }

    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }

    public StatusCondition.PrimaryStatusConditions getPrimaryStatusAffliction() {
        return primaryStatusAffliction;
    }

    public void setPrimaryStatusAffliction(StatusCondition.PrimaryStatusConditions primaryStatusAffliction) {
        this.primaryStatusAffliction = primaryStatusAffliction;
    }

    public StatusCondition.SecondaryStatusConditions getSecondaryStatusAffliction() {
        return secondaryStatusAffliction;
    }

    public void setSecondaryStatusAffliction(StatusCondition.SecondaryStatusConditions secondaryStatusAffliction) {
        this.secondaryStatusAffliction = secondaryStatusAffliction;
    }

    public int getStatusProbability() {
        return statusProbability;
    }

    public void setStatusProbability(int statusProbability) {
        this.statusProbability = statusProbability;
    }

    public boolean isUseable() {
        return useable;
    }

    public void setUseable(boolean useable) {
        this.useable = useable;
    }

}


