/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 1
	
	Program Purpose: Print out information about me
*/
import java.util.Scanner;

public class StudentParallelArray
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner(System.in);
   	
      String[] firstNames = new String[6];
      String[] lastNames = new String[6];
      int[] ages = new int[6];
      String[] majors = new String[6];
      Double[] gpas = new Double[6];
   	
      for(int i=1; i<=1; i++)
      {
         System.out.print("Student's first name: ");
         firstNames[i] = scan.nextLine();
      
         System.out.print("Student's last name: ");
         lastNames[i] = scan.nextLine();
      
         System.out.print("Student's age: ");      
         scan.nextLine(); //Fixes incorrect skipped input from scan.nextLine below.
      
         System.out.print("Student's major: ");
         majors[i] = scan.nextLine();
      
         System.out.print("Student's current gpa: ");
         gpas[i] = scan.nextDouble();
      	
         scan.nextLine();
         System.out.println();
      }
   	
      System.out.printf("%s%n%-30s%-30s%-30s%-30s","Student Data","Name","Major","GPA","Age");
      for(int i=1; i<=1; i++)
      {
         System.out.printf("%n%-1s %-1s%-27s%-30s%-30.2f%-30d",firstNames[i],lastNames[i],"",majors[i],gpas[i],ages[i]);
         /*firstNames[i] + " " + lastNames[i] + "\t" + ages[i] + "\t\t" + majors[i] + "\t\t" + gpas[i]);*/
      }
   }
}