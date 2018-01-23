package stats;

/*
NPC stats are much simpler than PC stats, and have no 
ability to change naturally
*/
public class npc_stats 
{
    private int health;
    private int defense;
    private int accuracy;
    private int agility;
    private int strength;
    private int ranged;
    private int magic;
    private int spirit;

    public int getHealth() {
        return health;
    }
    public int getDefense() {
        return defense;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public int getAgility() {
        return agility;
    }
    public int getStrength() {
        return strength;
    }
    public int getRanged() {
        return ranged;
    }
    public int getMagic() {
        return magic;
    }
    public int getSpirit() {
        return spirit;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setRanged(int ranged) {
        this.ranged = ranged;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }
    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }
}
