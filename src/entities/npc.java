package entities;

import stats.npc_stats;

/*
Non-Playable Characters (NPCs) will be defined here
In addition to a name and examination String, NPCs have 
conversations, shops, and other abilities

Notes:
An NPC's hostility can be toggled
Talk is just a String as of now
AN NPC is not able to perform combat if they are not given an npc_stats
*/
public class npc extends entity
{
    private boolean canFight, hostile;
    private String talk;
    private npc_stats nstats;
    
    public npc(String n, String ex, npc_stats stats, boolean host)
    {
        name = n;         //from entity.java
        examine = ex;     //
        if(stats != null)
        {
            nstats = stats;   //npc combat stats
            canFight = true;  //is the npc able to be attacked?
        }
        else
            canFight = false;
        hostile = host;   //will the npc attack on sight?
    }
    
    public String getTalk() //add "Talk" structure and data type later
    {
        return talk;
    }
    
    public void setHostile(boolean x)
    {
        hostile = x;
    }
    
    
//add "Type" enum    
}
