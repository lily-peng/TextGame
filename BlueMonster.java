/**
 * This is a subclass of the abstract class Monster. It represents a BlueMonster, named a Janitor in the game.
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class BlueMonster extends Monster
{

	/**
	 * This is a constructor of BlueMonster. It passes a hardcoded name (Janitor...) to the super constructor.
	 */
	public BlueMonster()
	{
		super("Janitor with Blue overalls");
	}
	
	/**
	 * This method overrides action3 from its superclass so it returns true.
	 */
	public boolean action3()
	{
		System.out.println("Success! You thank the Janitor and continue further in to the building in the direction he pointed. "); //example, change
		return true;
	}
}
