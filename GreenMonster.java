/**
 * This is a subclass of the abstract class Monster. It represents a GreenMonster, named a Tax Collector in the game.
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class GreenMonster extends Monster
{
	/**
	 * This is a constructor of GreenMonster. It passes a hardcoded name (Tax Collector...) to the super constructor.
	 */
	public GreenMonster()
	{
		super("Tax Collector with Green moneybags");
	}
	
	 /**
	  * This method overrides action2 from its superclass so it returns true.
	  */
	public boolean action2()
	{
		System.out.println("Success! You thank the Tax Collector and continue further in to the building in the direction he pointed. ");
		return true;
	}
}
