package entities;

/*
Usable entities are objects that the player can interact with,
provided they have the skill required
*/
public class entity_usable extends entity {
    
    private boolean canUse;
    
    public entity_usable(String n, String ex) //if entity is usable by default
    {
        name = n;
        examine = ex;
        canUse = true;
    }
    
}
