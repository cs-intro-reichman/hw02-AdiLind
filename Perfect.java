/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		 if (args.length != 1) {
            System.out.println("Usage: java Perfect <number>");
        }
		else{

        int num = Integer.parseInt(args[0]);
        int x = 1;
        String ssum = num + " is a perfect number since " + num + " = ";
        int sum = 0;

        while ((x <= num) && (sum < num))
		 {
            if (num % x == 0) {
                ssum = ssum + x;
                sum = sum + x;
				if (sum != num)
				{
					ssum = ssum + " + ";
				}
            }
            x++;
        }
		if ( sum == num)
		{
			System.out.println(ssum);
		}
		else
		{
			System.out.println (num + " is not a perfect number");
		}
		
	}

	}
}
