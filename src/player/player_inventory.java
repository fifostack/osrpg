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
            int iNum = slots[i].getCurrentStack();
            int xNum = x.getCurrentStack();
            //if the item matches one in the inventory that has not reached max stack
            if(slots[i] == x && iNum <= slots[i].getMaxStack() + xNum)
            {
                slots[i].setCurrentStack(iNum + xNum);
            }
            else if(slots[i] == null)
            {
                slots[i] = x; 
                return true;
            }
        }
        return false; //return false if there are no empty slots
    }
    
    public boolean removeItem(item x)
    {
        for(int i = 0; i < BAG_SIZE; i++)
        {
            int iNum = slots[i].getCurrentStack();
            int xNum = x.getCurrentStack();
            //if the item matches one in the inventory with a stack high enough to take out
            if(slots[i] == x && iNum >= slots[i].getMaxStack() - xNum)
            {
                slots[i].setCurrentStack(iNum - xNum);
            }
            else if(slots[i] == null)
            {
                slots[i] = x; 
                return true;
            }
        }
        return false; //return false if there are no empty slots
    }
    
}
