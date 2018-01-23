package entities;

/*
This class defines the most basic fields shared by ALL entities
Subclasses will further distinguish between NPC, PC, etc.
*/

public class entity
{
	protected String name,examine;

	public entity()
	{
		name = "null";
		examine = "--undefined object--";
	}

	public entity(String n, String ex)
	{
		name = n;
		examine = ex;
	}

	public String getName(){
		return name;
	}
	public String getExamine(){
		return examine;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setExamine(String newExamine){
		examine = newExamine;
	}
}
