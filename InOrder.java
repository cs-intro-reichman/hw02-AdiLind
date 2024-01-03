/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int r = (int) (Math.random()*10.0);
		System.out.print(r + " ");
		int t = (int) (Math.random() * 10.0);
		while((t >= r) && (t < 10.0)) 
		{
			System.out.print(t + " ");
			r=t;
			t = (int) (Math.random() * 10.0);
		}
	}
}
