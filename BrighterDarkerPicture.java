/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 6
	
	Program Purpose: alternates between darkening and lightening pixels of an image
*/
import java.util.Scanner;
import java.awt.Color;

public class BrighterDarkerPicture
{
	public static void main( String[] args)
	{
      Picture patrick = new Picture("patrick.png");
      
      int x = patrick.width();
      int y = patrick.height();
      
      int darkerLighter = 1;
      //for( double i = 0 ; i < 100; i++ )
      while(true) //used for testing in a loop
      {
         for( int xPixel = 0; xPixel < x; xPixel++ )
         {
            for( int yPixel = 0; yPixel < y; yPixel++ )
            {
               if(darkerLighter == 1)
                  patrick.set(xPixel,yPixel,(patrick.get(xPixel,yPixel)).darker());
               else
                  patrick.set(xPixel,yPixel,(patrick.get(xPixel,yPixel)).brighter());
                  
                     
            }
         }
         if(darkerLighter ==1)
            darkerLighter++;
         else
            darkerLighter--;
         patrick.show();
      }
      
	}
}