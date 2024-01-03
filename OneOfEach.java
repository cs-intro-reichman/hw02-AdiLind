
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		Boolean girl = false , boy = false;
		int count = 0;
		while((!girl) || (!boy))
		{
			double random = Math.random();
			if (random >= 0.5)
			{
				girl = true;
				System.out.print("g ");
			}
			else
			{
				boy = true;
				System.out.print("b ");
			}
			count++;

		}
		System.out.println("You made it... and you now have " + count + " children");
	}
}
