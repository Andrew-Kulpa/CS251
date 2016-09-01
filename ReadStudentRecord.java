/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 1
	
	Program Purpose: Print out information about me
*/
import java.util.Scanner;

public class ReadStudentRecord
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Student's first name: ");
		String firstName = scan.nextLine();
		
		System.out.print("Student's last name: ");
		String lastName = scan.nextLine();
		
		System.out.print("Student's age: ");
		int age = scan.nextInt();
		
		scan.nextLine(); //Fixes incorrect skipped input from scan.nextLine below.
		
		System.out.print("Student's major: ");
		String major = scan.nextLine();
		
		System.out.print("Student's current gpa: ");
		double gpa = scan.nextDouble();
		
		System.out.println("Your name is " + firstName + " " + lastName + ". You are " + age
								 + " years old. You are a " + major + " major with a " + gpa + " gpa.");
	}
}