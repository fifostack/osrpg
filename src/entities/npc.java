package entities;

/*
Non-Playable Characters (NPCs) will be defined here
In addition to a name and examination String, NPCs have 
conversations, shops, and other abilities
*/
public class npc extends entity
{
    private boolean canFight, hostile;
    
    public npc(String n, String ex, boolean fight, boolean host)
    {
        name = n;         //from entity.java
        examine = ex;     //
        canFight = fight; //is the npc able to be attacked?
        hostile = host;   //will the npc attack on sight?
    }
//add "Talk" structure
//add "Type" enum    
}
