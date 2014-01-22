import java.util.*;

/**
 * This is a subclass of the abstract class Room. It represents a MonsterRoom, where players can fight Monsters (employees in this game).
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class MonsterRoom extends Room
{
	private Random r = new Random();
	Monster m = new RedMonster();
	private int i;
	
	/**
	 * This is a constructor for MonsterRoom. It chooses the type of Monster to appear in the room based on a 
	 * random number generator.
	 */
	public MonsterRoom()
	{
		i = r.nextInt(3) + 1;
		if (i == 2)
		{
			m = new GreenMonster();
		}
		else if (i == 3)
		{
			m = new BlueMonster();
		}
	}
	
	/**
	 * This is a toString method for MonsterRoom. It prints out the toString method from its superclass then returns the 
	 * Monsters' toString method. 
	 */
	public String toString()
	{
		System.out.print(super.toString());
		return m.toString();
	}
	
	/**
	 * This method returns the randomly generated Monster.
	 * @return the randomly generated Monster (RedMonster, GreenMonster, or BlueMonster)
	 */
	public Monster getMonster()
	{
		return m;
	}
	
}
