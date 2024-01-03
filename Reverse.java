/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String str = args[0];
		int length = str.length()-1;
		int i = str.length();
		int middleindex = length/2;
		char middle=0;
		if(((middleindex % 2) == 0))
		{
			middle = str.charAt(middleindex);
		}
		else
		{
			 middle = str.charAt(middleindex);			
		} 
		for(int j=0;j<length;j++)
		{
			System.out.print(str.charAt(i-j-1));
		}
		System.out.println(str.charAt(0));
		System.out.println("The middle character is " + middle);

	}
}
