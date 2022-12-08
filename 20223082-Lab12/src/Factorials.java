// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************

import java.util.Scanner;

public class Factorials
{
    public static void main(String[] args) throws IllegalArgumentException
    {
	char keepGoing = 'y';
	Scanner in = new Scanner(System.in);
	IllegalArgumentException a = new IllegalArgumentException("val equals 17 or val is bigger than 17");
	IllegalArgumentException b = new IllegalArgumentException("val is lower than 0");
	while (keepGoing == 'y' || keepGoing == 'Y')
	    {
		System.out.print("Enter an integer: ");
		int val = in.nextInt();
		try {
		if (val < 0) {
			throw b;
		} else if (val >= 17) {
			throw a;
		}
		}
		catch (IllegalArgumentException ex){
			System.out.println(ex);
			//ex.printStackTrace();
			continue;
		}
		System.out.println("Factorial(" + val + ") = " 
				   + MathUtils.factorial(val));
		System.out.print("Another factorial? (y/n) ");
		keepGoing = in.next().charAt(0);
	    }
    }
}
