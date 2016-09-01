/*
   CS250 Fall 2014
   Covert
   Hwk 5 OptionPaneStudentList.java
*/

import edu.wiu.cs250.StudentList;
import javax.swing.JOptionPane;

public class OptionPaneStudentList
{
   public static void main( String[] args )
   {
      StudentList ourClass = new StudentList();
      
      boolean done = false;
      
      while( !done )
      {
         String fName = JOptionPane.showInputDialog( "Enter student's first name, enter quit to stop:", null);
         // check if user wanted to quit
         if( fName.equalsIgnoreCase("quit") )
         {
            done = true;
            break;   // quit the loop
         }
         // get the rest of the data
         String lName = JOptionPane.showInputDialog( "Enter student's last name:", null);         
         String major = JOptionPane.showInputDialog( "Enter student's major:", "CS"); // the power of suggestion!
         int age = Integer.parseInt(JOptionPane.showInputDialog( "Enter student's age:", null));
         double gpa = Double.parseDouble(JOptionPane.showInputDialog( "Enter student's gpa:", null));
         // add student to list
         ourClass.add( new Student( fName, lName, major, age, gpa ) );                         
      }
      
      // done with student entry
      System.out.println( ourClass );
   }
}