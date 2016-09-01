/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 8
	
	Program Purpose: Rock-Paper-Scissors game making
*/
import java.util.Scanner;
import java.awt.Color;

public class RockPaperScissors
{
	public static int game()
	{  
      Scanner scan = new Scanner(System.in);
      String outcome;
      boolean invalidMove = true;
      String compChoice = " ";
      String charChoice = " ";
      
      System.out.println("Rock Paper Scissors game\n");
      
      while(invalidMove)
      {
         System.out.print("Enter your move(Rock, Paper, or Scissors): ");
         charChoice = scan.nextLine();
         
         if((charChoice.equals("Rock")||charChoice.equals("rock")||
             charChoice.equals("Paper")||charChoice.equals("paper")||
             charChoice.equals("Scissors")||charChoice.equals("scissors")))
         {
            invalidMove = false;
         }
         else
            System.out.println("Invalid move! Try again, making sure to enter either Rock or Paper or Scissors.");
      }
      System.out.println("You chose " + charChoice + ".");
      compChoice = compRandomMove();
      System.out.println("Computer chose " + compChoice + ".");
      
      if((charChoice.equals("Rock")||charChoice.equals("rock")&&compChoice.equals("Scissors")||
          charChoice.equals("Paper")||charChoice.equals("paper")&&compChoice.equals("Rock")||
          charChoice.equals("Scissors")||charChoice.equals("scissors")&&compChoice.equals("Paper")))
      {
          System.out.println("You win!");
          return 1;
      }
      else if((charChoice.equals(compChoice)||
              charChoice.equals("rock")&&compChoice.equals("Rock")||
              charChoice.equals("scissors")&&compChoice.equals("Scissors")||
              charChoice.equals("paper")&&compChoice.equals("Paper")))  
      {
         System.out.println("It's a tie!");
         return 2;
      }
      else
      {
         System.out.println("Computer wins!");
         return 3;
      }
     	}
   
   public static String compRandomMove()
   {
      int move = (int)(Math.random()*(3-1+1)+1);
      if(move == 1)
         return "Rock";
      else if(move == 2)
         return "Paper";
      else
         return "Scissors";
   }
   
   public static boolean playAgain()
   {
      System.out.print("\n\nPlay again? (Y or N): ");
      String answer = StdIn.readLine();
      if((answer.contains("y")||answer.contains("Y")||answer.contains("yes")||answer.contains("Yes")))
         return true;
      else
         return false;
   }
   public static void main(String[]args)
   {
      int timesPlayed = 1;
      int playerWon = 0;
      int tied = 0;
      int computerWon = 0;
      boolean play = true;
      
      while(play)
      {
         int outcome = game();
         play = playAgain();
         if(play)
            timesPlayed++;
         if(outcome==1)
            playerWon++;
         else if(outcome==2)
            tied++;
         else
            computerWon++;
      }
      System.out.println("OK,bye!\n\n");
      System.out.println("Game summary");
      System.out.println("Games played: " + timesPlayed);
      System.out.println("Games player won: " + playerWon);
      System.out.println("Games tied: " + tied);
      System.out.println("Games computer won: " + computerWon);
   }
}