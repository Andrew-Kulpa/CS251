/*
   CS250 Fall 2014
   Covert
   Hwk 4 Vector2D.java
   unchanged from Hwk 3
*/
public class Vector2D
{
   private double x, y;
   
   public Vector2D()
   {
      x = 0.0;
      y = 0.0;
   }
   
   public Vector2D(double x0, double y0)
   {
      x = x0;
      y = y0;
   }
   
   public Vector2D plus( Vector2D v )
   {
      return new Vector2D( x + v.x , y + v.y );
   }
   
   public Vector2D minus( Vector2D v )
   {
      return new Vector2D( x - v.x , y - v.y );   
   }
   
   public double dot( Vector2D v )
   {
      return x*v.x + y*v.y;
   }
   
   public Vector2D times( double t )
   {
      return new Vector2D( t*x, t*y );    
   }
   
   public double magnitude()
   {
      return Math.sqrt(dot(this));
   }
   
   public double getX()
   {
      return x;
   }
   
   public double getY()
   {
      return y;
   }
      
   public void show()
   {
      StdDraw.line( 0, 0, x, y ); 
   }

   public void show(Vector2D v)
   {
      StdDraw.line( v.x, v.y, x+v.x, y+v.y ); 
   }   
      
}