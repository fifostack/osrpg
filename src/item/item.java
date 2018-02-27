package item;


/*
This class will define items
*/

import java.util.LinkedList;
public class item {
    
    private String itemName;
    private int curStack;
    private int maxStack; //maximum that can occupy one slot
    private LinkedList<item> useWith; //what other items this can be used with
    
    public item(String n, int stackMax)
    {
        itemName = n;
        curStack = 1;
        maxStack = stackMax;
	useWith = new LinkedList<item>();
    }
    public item(String n, int stack, int stackMax)
    {
        itemName = n;
        if(stack <= stackMax)
            curStack = stack;
        else
        {
            System.out.println("Invalid " + stack + "stack of item: " + n);
            stack = 1;
        }
        maxStack = stackMax;
	useWith = new LinkedList<item>();
    }

    public void setName(String n) {
	itemName = n;
    }
    public void setInteractions(LinkedList<item> x) {
	useWith = x;
    }
    public void setCurrentStack(int x) {
        curStack = x;
    }
    public String getItemName() {
	return itemName;
    }
    public int getCurrentStack() {
        return curStack;
    }
    public int getMaxStack() {
	return maxStack;
    }
    public LinkedList<item> getInteractions() {
	return useWith;
    }
}
