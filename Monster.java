/**
 * This is an abstract class Monster. It's the superclass for RedMonster, GreenMonster, and BlueMonster.
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public abstract class Monster 
{

	private String name;
	
	/**
	 * This is the constructor for Monster. It initializes the String name.
	 * @param name the name of the Monster
	 */
	public Monster(String name)
	{
		this.name = name;
	}
	
	/**
	 * This method returns a String with a description of finding the Monster in the Room.
	 */
	public String toString()
	{
		return "You find a " + name + " in here.";
	}
	
	/**
	 * This method is called when the player chooses the first action. It returns the response if the action was incorrect.
	 * @return boolean false because the action was incorrect
	 */
	public boolean action1() //make these abstract?
	{
		System.out.println("The " + name + " laughs in your face, and you continue further into the building in shame.");
		return false;
	}
	
	/**
	 * This method is called when the player chooses the second action. It returns the response if the action was incorrect.
	 * @return boolean false because the action was incorrect
	 */
	public boolean action2()
	{
		System.out.println("The " + name + " laughs in your face, and you continue further into the building in shame.");
		return false;
	}
	
	/**
	 * This method is called when the player chooses the third action. It returns the response if the action was incorrect.
	 * @return boolean false because the action was incorrect
	 */
	public boolean action3()
	{
		System.out.println("The " + name + " laughs in your face, and you continue further into the building in shame.");
		return false;
	}
}
