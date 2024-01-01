/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here	
        boolean girl, boy;
        int count2C = 0;
        int count3C = 0;
        int count4C = 0;
        int sum = 0;
        double n = Double.parseDouble(args[0]);
        int max;
        double average;

        for (int i = 0; i < n; i++) {
            girl = false;
            boy = false;
            int count = 0;

            while ((!girl) || (!boy)) {
                double random = Math.random();
                if (random >= 0.5) {
                    girl = true;
                } else {
                    boy = true;
                }
                count++;
            }

            sum += count;

            if (count >= 4) {
                count4C++;
            } else if (count == 3) {
                count3C++;
            } else if (count == 2) {
                count2C++;
            }
        }

        int tempmax = Math.max(count2C, count3C);
        max = Math.max(tempmax, count4C);
        average = sum / n;

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + count2C);
        System.out.println("Number of families with 3 children: " + count3C);
        System.out.println("Number of families with 4 children: " + count4C);

        if (max == count4C) {
            System.out.println("The most common number of children is 4 or more.");
        } else if (max == count2C) {
            System.out.println("The most common number of children is 2.");
        } else {
            System.out.println("The most common number of children is 3.");
        }
	}
}
