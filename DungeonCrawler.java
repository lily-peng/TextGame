import java.util.*;
/**
 * This class organizes the Rooms into an ArrayList and provide methods to move through and 
 * interact with the Rooms and its Monsters (people).
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class DungeonCrawler 
{
	private ArrayList<Room> array;
	private int count;
	private Random r;
	private int totalTreasure;
	private Scanner s;
	private int totalMonsters;
	private int monsterWin;
	private int monsterLose;
	
	/**
	 * This is a constructor for DungeonCrawler. It instantiates the instance variables and puts 10 random Rooms
	 * into an ArrayList. It also prints the starting game text.
	 */
	public DungeonCrawler()
	{
		array = new ArrayList<Room>();
		count = 0;
		r = new Random();
		totalTreasure = 0;
		s = new Scanner(System.in);
		totalMonsters = 0;
		monsterWin = 0;
		monsterLose = 0;
		
		for (int n = 0; n < 10; n++)
		{
			addRandomRoom();
		}
		
		System.out.println("In a state of panic, you managed to enter a large corporate building you've never been in before. But all you know... is that you really, really need to go to the bathroom. You can't hold it much longer, but you have no idea where the bathroom could possibly be! ");
	}
	
	/**
	 * This class randomly instantiates one of the three types of rooms and adds it to the ArrayList. 
	 * It also keeps a count of how many Rooms have been created.
	 */
	public void addRandomRoom()
	{
		count = count + 1;
		
		int i = r.nextInt(3) + 1;
		if (i == 1)
		{
			array.add(new EmptyRoom());
		}
		else if (i == 2)
		{
			array.add(new TreasureRoom());
		}
		else
		{
			array.add(new MonsterRoom());
		}
	}
	
	/**
	 * This method picks up the treasure if the room is a TreasureRoom and adds it to a total.
	 * @param tr the TreasureRoom the player is in
	 */
	public void pickUpTreasure(TreasureRoom tr)
	{
		totalTreasure = totalTreasure + tr.getTreasure();
	}
	
	/**
	 * This method allows the player to choose one of three actions to interact with a
	 * Monster in a MonsterRoom.
	 * @param mr The MonsterRoom the player is in
	 */
	public void chooseAction(MonsterRoom mr)
	{
		totalMonsters = totalMonsters + 1;
		System.out.println("How will you ask for directions?");
		System.out.println("1: Grovel at his feet.");
		System.out.println("2: Bribe him. ");
		System.out.println("3: Promise to clean up after yourself.");
		
		int action = s.nextInt();
		
		if (action == 1)
		{
			if (mr.getMonster().action1() == false)
			{
				monsterLose = monsterLose + 1;
				addRandomRoom();
			}
			else
			{
				monsterWin = monsterWin + 1;
			}
		}
		else if (action == 2)
		{
			
			if (mr.getMonster().action2() == false)
			{
				monsterLose = monsterLose + 1;
				addRandomRoom();
			}
			else
			{
				monsterWin = monsterWin + 1;
			}
		}
		else if (action == 3)
		{
			
			if (mr.getMonster().action3() == false)
			{
				monsterLose = monsterLose + 1;
				addRandomRoom();
			}
			else
			{
				monsterWin = monsterWin + 1;
			}
		}
	}
	
	/**
	 * This class eliminates the first Room in the ArrayList and then checks to see what type of Room it
	 * was. If it was a TreasureRoom, it will call the appropriate method (pickUpTreasure). If it was a
	 * MonsterRoom, it will call chooseAction.
	 */
	public void nextRoom()
	{
		Room roo = array.get(0);
		array.remove(0);
		System.out.println(roo.toString());

		if (roo instanceof TreasureRoom)
		{
			pickUpTreasure((TreasureRoom) roo);
		}
		else if (roo instanceof MonsterRoom)
		{
			chooseAction((MonsterRoom) roo);
		}
	}
	
	/**
	 * This method returns whether or not the ArrayList still has rooms in it.
	 * @return whether or not the ArrayList still has rooms in it
	 */
	public boolean hasNextRoom()
	{
		if (array.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	/**
	 * This method prints the results of the game once the player has gone through every Room in the ArrayList.
	 * It displays how many rooms were visited, how many monsters were encountered, how many of them were beaten, 
	 * how many of them were not beaten, and how much treasure was gained.
	 */
	public void showResults()
	{
		System.out.println("Finally! You find your way to the bathroom and dash inside. Unfortunately, none of the stalls have any toilet paper left... Good thing you found your own along the way! Right?");
		System.out.println("Rooms Cleared: " + count);
		System.out.println("People Encountered: " + totalMonsters);
		System.out.println("Number of Times Helped: " + monsterWin);
		System.out.println("Number of Times Ridiculed: " + monsterLose);
		System.out.println("Toilet Paper Sheets Collected: " + totalTreasure);	
	}
}
