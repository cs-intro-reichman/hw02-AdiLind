/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);

       for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - 1; j++) { 
                System.out.print("* ");
            }

            System.out.print("*"); 
            System.out.println(); 
        }
	}
}
