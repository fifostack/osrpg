package player;

import item.item;


public class player_inventory {
    static final int BAG_SIZE = 32;
    item[] slots = new item[BAG_SIZE];
    
    public void init()
    {
        for(item x : slots)
        {
            x = null;
        }
    }
    
    public boolean addItem(item x)
    {
        for(int i = 0; i < BAG_SIZE; i++)
        {
            if(slots[i] == null)
            {
                slots[i] = x;
                return true;
            }
        }
        return false; //return true if there was an error
    }
}
