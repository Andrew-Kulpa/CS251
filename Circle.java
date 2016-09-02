/*
   CS250 Fall 2014
   Covert
   Hwk 5 Circle.java
   Changed implementation so that position is represented by a Vector2D
*/

public class Circle
{
   //Initialize private member variables
   private Vector2D pos;
   private final double r;
   
   public Circle(double x0, double y0, double r0 ) //Setup Circle constructor wanting x0,y0 for position and r0 for radius.
   {
      pos = new Vector2D( x0, y0 );
      r = r0;
   }
   
   public double area()//return the area of the Circle
   {
      return Math.PI*r*r;
   }
   
   public double perimeter()//return the perimeter of the Circle
   {
      return 2*Math.PI*r;
   }
   
   public boolean intersects( Circle b ) //determine if the circle intersects with another Circle object
   {
      // if one is inside the other, they can't intersect
      if( contains(b) || b.contains(this) )
         return false;
      
      // if they are not "too far away", then they intersect
      return (r + b.r) >= centerDist(b);
   }
   
   public boolean contains( Circle b ) //determine if the circle contains the Circle object argument.
   {
      if( b.r >= r )
         return false; // b can't be inside a smaller or the same circle
      
      // b is smaller, is it inside this circle?
      // distance between centers + b's radius less than our radius?
      return (centerDist(b) + b.r) < r;
   }
   
   private double centerDist( Circle b )
   {
      double delX = this.pos.getX() - b.pos.getX();
      double delY = this.pos.getY() - b.pos.getY();
      return Math.sqrt(delX*delX + delY*delY);
   }
   
   public void show( Circle b )
   {
      StdDraw.circle( b.pos.getX(), b.pos.getY(), b.r );
   }
   
   public void moveTo( double x0, double y0)
   {
      pos = new Vector2D( x0, y0 );
   }  

   void moveTo( Vector2D position2 )
   {
      pos = position2;
   }
   
   Vector2D getPosition( )
   {
      return pos;
   }
       
}
