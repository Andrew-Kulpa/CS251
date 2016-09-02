/*
	Andrew Kulpa
	CS250, Section 1
	Fall 2014
	Homework 1,Question 5
	
	Program Purpose: Asks user for colors of preset shapes
*/
import java.util.Scanner;
import java.awt.Color;

public class AskForColors
{
	public static void main( String[] args)
	{
      Scanner scan = new Scanner(System.in);
		
      System.out.println("Enter the amount of Red, Green, and Blue below: "); //Setup RGB Values
      System.out.println("(This must be an integer between 0 and 255) "); //Tell user the constraints/range
      
		System.out.print("Red: ");
		int red = scan.nextInt(); //init red value
		
		System.out.print("Green: ");
		int green = scan.nextInt(); //init green value
		
		System.out.print("Blue: ");
		int blue = scan.nextInt(); //init blue value
      
      Color randColor = new Color (red,green,blue); //init color from rgb values
      
      StdDraw.setCanvasSize(300,300);
      StdDraw.setXscale(0, 300);
      StdDraw.setYscale(0, 300);
      
      StdDraw.setPenColor(randColor);
      StdDraw.filledCircle(100,100,20);
      StdDraw.filledSquare(200,100,50);
      
      double[] xArray = {80.0,100.0,120.0};
      double[] yArray = {250.0,280.0,250.0};
      StdDraw.filledPolygon(xArray,yArray);
      StdDraw.show();
      
	}
}
