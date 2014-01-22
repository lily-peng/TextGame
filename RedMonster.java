/**
 * This is a subclass of the abstract class Monster. It represents a RedMonster, named a CEO in the game.
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class RedMonster extends Monster
{

	/**
	 * This is a constructor of RedMonster. It passes a hardcoded monster name (CEO...) to the super constructor.
	 */
	public RedMonster()
	{
		super("CEO with a Red tie");
	}
	
	/**
	 * This method overrides action1 from its superclass so it returns true. 
	 */
	public boolean action1()
	{
		System.out.println("Success! You thank the CEO and continue further in to the building in the direction he pointed. ");
		return true;
	}
}
