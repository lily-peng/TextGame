/**
 * This is a subclass of the abstract class Room. It represents an EmptyRoom, in which nothing happens.
 * @author Lily Peng
 * @version 1.0
 * Nov. 8, 2011
 * I did not collaborate with any other students for this assignment.
 */
public class EmptyRoom extends Room
{
	/**
	 * This is a toString method, which overrides its superclass' method. First it prints the generic text from the toString method in its
	 * superclass, then it returns its own text.
	 */
	public String toString()
	{
		System.out.print(super.toString());
		return "This room is empty, so you move on to the next one.";
	}
}
