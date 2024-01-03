/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
	       for (int i = 0; i < n; i++) // שורה
	        {
	            if (i % 2 == 0) // if the row is even, you should print 1 space inside
	            {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < n; j++) // עמודות
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}
}
