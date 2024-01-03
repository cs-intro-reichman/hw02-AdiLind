/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i % 2 != 0 && j == 0) { // Print space only for even rows, before first asterisk
	                    System.out.print(" ");
	                }
	                System.out.print("* "); // Print asterisk and space
	            }
	            System.out.println(); 
	        }
	}
}
