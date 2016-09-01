/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 3
	
	Program Purpose: Sorts input arrays of information about students by last name
*/
import java.util.Scanner;

public class StudentParallelArraySortName
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner(System.in);
   	
      //initializes arrays
      String[] firstNames = new String[6];
      String[] lastNames = new String[6];
      int[] ages = new int[6];
      String[] majors = new String[6];
      Double[] gpas = new Double[6];
   	
      //allows user to input information for i students
      for(int i=0; i<=5; i++)
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
      
      sortForLastNameArray(gpas,firstNames,lastNames,majors,ages);
   	
      //prints out information for i students in a table'd format
      System.out.printf("%s%n%-30s%-30s%-30s%-30s","Student Data","Name","Major","GPA","Age");
      for(int i=0; i<=5; i++)
      {
         String name = firstNames[i] + " " + lastNames[i];
         System.out.printf("%n%-30s%-30s%-30.2f%-30d",name,majors[i],gpas[i],ages[i]);
      }
   }
   
   
   public static void sortForLastNameArray(Double[] gpa, String[] fName,String[] lName, String[] major, int[] age)
   {
      boolean swapped = false;
      for(int i = lName.length-1;i>0;i--)
      {
         for(int j = 0;j<i ; j++)
         {
            if(lName[j].compareTo(lName[j+1])>0)
            {
               for(int swapType = 0;swapType<=4;swapType++)
               {
                  if(swapType == 0)
                  {
                     Double swapGpa = gpa[j];
                     gpa[j] = gpa[j+1];
                     gpa[j+1] = swapGpa;
                  }
                  else if(swapType == 1)
                  {
                     String swapFName = fName[j];
                     fName[j] = fName[j+1];
                     fName[j+1] = swapFName;
                  }
                  else if(swapType == 2)
                  {
                     String swapLName = lName[j];
                     lName[j] = lName[j+1];
                     lName[j+1] = swapLName;
                  }
                  else if(swapType == 3)
                  {
                     String swapMajor = major[j];
                     major[j] = major[j+1];
                     major[j+1] = swapMajor;
                  }
                  else if(swapType == 4)
                  {
                     int swapAge = age[j];
                     age[j] = age[j+1];
                     age[j+1] = swapAge;
                  }
               }
               //swapped = true;
            }
         }
      //if(!swapped)
      //break;
      }
   }

}