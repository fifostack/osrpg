package item;


/*
This class will define items
*/

public class item {
    
    private String itemName;
    private int maxStack; //maximum that can occupy one slot
    
    public item(String n, int stack)
    {
        itemName = n;
        maxStack = stack;
    }
    
}
