package player;

import stats.player_stats;

/*
This is the main class for the player character,
tracking their stats, skills, statuses, and inventory
*/
public class player {
    
    String name;          //player's character name
    player_inventory inv; //player's inventory
    player_stats pstats;  //player's stat sheet
    
    public player(String n) //create completely new character
    {
        name = n;
        inv = new player_inventory();
        pstats = new player_stats();
        
        inv.init(); //initialize player inventory (save/load at a later date)
    }
    
    public player(String n, player_inventory in, player_stats st)
    {
        name = n;
        inv = in;
        pstats = st;
    }
    
}
