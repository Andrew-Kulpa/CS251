/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 7
	
	Program Purpose: Practices basic operations with Strings.
*/
import java.util.Scanner;
import java.awt.Color;

public class BasicStringOps
{
	public static void main( String[] args)
	{
      Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a text string: ");
		String text = scan.nextLine();
		
      System.out.println("\n");
      
		System.out.println("Length of your string: " + text.length());
		
		System.out.println("Character at index 5: " + text.charAt(5));
      
      System.out.println("First 5 characters: " + text.substring(0,5));
      
      boolean containsBob = text.contains("bob");
      System.out.println("Contains bob? " + containsBob);
      
      boolean startsWithBob = text.startsWith("bob");
      System.out.println("Starts with bob? " + startsWithBob);
      
      boolean endsWithBob = text.endsWith("bob");
      System.out.println("Ends with bob? " + endsWithBob);
      
	}
}