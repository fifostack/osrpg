package item;


/*
This class will define items
*/

import java.util.LinkedList;
public class item {
    
    private String itemName;
    private int maxStack; //maximum that can occupy one slot
    private LinkedList<item> useWith; //what other items this can be used with
    
    public item(String n, int stack)
    {
        itemName = n;
        maxStack = stack;
	useWith = new LinkedList<item>();
    }

    public void setName(String n) {
	itemName = n;
    }
    public void setInteractions(LinkedList<item> x) {
	useWith = x;
    }
    public String getItemName() {
	return itemName;
    }
    public int getMaxStack() {
	return maxStack;
    }
    public LinkedList<item> getInteractions() {
	return useWith;
    }
}
