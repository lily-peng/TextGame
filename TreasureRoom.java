import java.util.*;

/**
 * This is a subclass of the abstract class Room. It represents a TreasureRoom, where players can pick up treasure (toilet paper sheets).
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class TreasureRoom extends Room
{
	private int treasure;
	private Random r = new Random();
	
	/**
	 * This is a constructor of TreasureRoom. It randomly generates an amount for treasure, between 1-10. 
	 */
	public TreasureRoom()
	{
		treasure = r.nextInt(10) + 1;
	}
	
	/**
	 * This method returns the amount of treasure.
	 * @return treasure, which is toilet paper in the game
	 */
	public int getTreasure()
	{
		return treasure;
	}
	
	/**
	 * This is a toString method, which overrides its superclass' method. First it prints the generic text from the toString method in its
	 * superclass, then it returns its own text.
	 */
	public String toString()
	{
		System.out.print(super.toString());
		return "Nice! You found " + treasure + " sheets of toilet paper in this room and stash them in your pockets. They'll be useful later. ";
	}
}
