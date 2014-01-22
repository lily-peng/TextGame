/**
 * This is HW08, a Dungeon Crawler game.
 * This class contains the main method to run this game.
 * @author Lily Peng
 * @version 1.0
 * Nov 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class DungeonMain 
{	
	/**
	 * The main method, which will execute the game.
	 * @param args
	 */
	public static void main(String[] args)
	{
		DungeonCrawler game = new DungeonCrawler();

		while (game.hasNextRoom())
		{
			game.nextRoom();
		}
		
		game.showResults();		
	}
}
