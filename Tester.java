/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 1
	
	Program Purpose: Print out information about me
*/
import java.util.Scanner;

public class Tester
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner(System.in);
   	
      String[] firstNames = {"Andrew","Hannah","Larry","Carl","John"};
      String[] lastNames = {"Kulpa","Larks","Kulpa","Hans","Hand"};
      int[] ages = {16,24,36,43,66};
      String[] majors = {"CS","CSD","LEJA","Accounting","Social Sciences"};
      Double[] gpas = {3.94,3.99,2.5,2.0,3.5};
   	
   	//sortForGpaArray(gpas,firstNames,lastNames,majors,ages);
      //sortForFirstNameArray(gpas,firstNames,lastNames,majors,ages);
      sortForLastNameArray(gpas,firstNames,lastNames,majors,ages);
      
      System.out.printf("%s%n%-30s%-30s%-30s%-30s","Student Data","Name","Major","GPA","Age");
      for(int i=0; i<=4; i++)
      {
         String name = firstNames[i] + " " + lastNames[i];
         System.out.printf("%n%-30s%-30s%-30.2f%-30d",name,majors[i],gpas[i],ages[i]);
      }
   }
   
   public static void sortForGpaArray(Double[] gpa, String[] fName,String[] lName, String[] major, int[] age)
   {
      boolean swapped = false;
      for(int i = gpa.length-1;i>0;i--)
      {
         for(int j = 0;j<i ; j++)
         {
            if(gpa[j]<gpa[j+1])
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
   public static void sortForFirstNameArray(Double[] gpa, String[] fName,String[] lName, String[] major, int[] age)
   {
      boolean swapped = false;
      for(int i = fName.length-1;i>0;i--)
      {
         for(int j = 0;j<i ; j++)
         {
            if(fName[j].compareTo(fName[j+1])>0)
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