package pokemon.model;

public class PokemonStats {

    private Pokemon pokemon;

    private int hp;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int ini;

    private int baseHp;
    private int baseAtk;
    private int baseDef;
    private int baseSpAtk;
    private int baseSpDef;
    private int baseIni;

    private int evHp;
    private int evAtk;
    private int evDef;
    private int evSpAtk;
    private int evSpDef;
    private int evIni;

    private int ivHp;
    private int ivAtk;
    private int ivDef;
    private int ivSpAtk;
    private int ivSpDef;
    private int ivIni;

    public PokemonStats(int baseHp, int baseAtk, int baseDef, int baseSpAtk, int baseSpDef, int baseIni) {
        this.baseHp = baseHp;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.baseSpAtk = baseSpAtk;
        this.baseSpDef = baseSpDef;
        this.baseIni = baseIni;
    }

    //TODO
    public void calculateStats(){

        if(!pokemon.getName().equals("Ninjatom")){
            this.hp =(int) Math.floor(0.01 * (2 * baseHp + ivHp + Math.floor(0.25 + evHp)) * pokemon.getLevel() + pokemon.getLevel() + 10);
        }
        else this.hp = 1;
        this.atk = (int) (Math.floor(0.01 * (2 * baseAtk + ivAtk + Math.floor(0.25 * evAtk)) * pokemon.getLevel() + 5) * pokemon.getNature().getAtkMultiplier());
        this.def = (int) (Math.floor(0.01 * (2 * baseDef + ivDef + Math.floor(0.25 * evDef)) * pokemon.getLevel() + 5) * pokemon.getNature().getDefMultiplier());
        this.spAtk = (int) (Math.floor(0.01 * (2 * baseSpAtk + ivSpAtk + Math.floor(0.25 * evSpAtk)) * pokemon.getLevel() + 5) * pokemon.getNature().getSpAtkMultiplier());
        this.spDef = (int) (Math.floor(0.01 * (2 * baseSpDef + ivSpDef + Math.floor(0.25 * evSpDef)) * pokemon.getLevel() + 5) * pokemon.getNature().getSpDefMultiplier());
        this.ini = (int) (Math.floor(0.01 * (2 * baseIni + ivIni + Math.floor(0.25 * evIni)) * pokemon.getLevel() + 5) * pokemon.getNature().getIniMultiplier());

    }

    public int getHp() {
        return hp;
    }


    public int getAtk() {
        return atk;
    }


    public int getDef() {
        return def;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public int getIni() {
        return ini;
    }

    public int getEvHp() {
        return evHp;
    }

    public void setEvHp(int evHp) {
        this.evHp = evHp;
    }

    public int getEvAtk() {
        return evAtk;
    }

    public void setEvAtk(int evAtk) {
        this.evAtk = evAtk;
    }

    public int getEvDef() {
        return evDef;
    }

    public void setEvDef(int evDef) {
        this.evDef = evDef;
    }

    public int getEvSpAtk() {
        return evSpAtk;
    }

    public void setEvSpAtk(int evSpAtk) {
        this.evSpAtk = evSpAtk;
    }

    public int getEvSpDef() {
        return evSpDef;
    }

    public void setEvSpDef(int evSpDef) {
        this.evSpDef = evSpDef;
    }

    public int getEvIni() {
        return evIni;
    }

    public void setEvIni(int evIni) {
        this.evIni = evIni;
    }


}

