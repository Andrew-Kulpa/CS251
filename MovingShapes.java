/*
   CS250 Fall 2014
   Covert
   Hwk 5 MovingShapes.java
*/

public class MovingShapes
{
   public static void main( String[] args )
   {
      // drawing objects
      Circle c1 = new Circle( 0.05, 0.1, 0.1 );
      Circle c2 = new Circle( 0.1, 0.9, 0.08 );      
      Rectangle r1 = new Rectangle( 0.95, 0.1, 0.1, 0.12 );
      Rectangle r2 = new Rectangle( 0.9, 0.8, 0.1, 0.05 ); 
      
      // acceleration vector            
      Vector2D a = new Vector2D( 0, -0.0001 );
      
      // velocity vectors
      Vector2D v1 = new Vector2D( 0.005, 0.008 );
      Vector2D v2 = new Vector2D( 0, 0.003 );
      Vector2D v3 = new Vector2D( -0.003, 0.01 );
      Vector2D v4 = new Vector2D( -0.005, 0.008 );
      
      // animation loop            
      while( true )
      {
         StdDraw.clear();
         v1 = v1.plus(a);
         v2 = v2.plus(a);
         v3 = v3.plus(a);
         v4 = v4.plus(a);                           
         c1.moveTo( c1.getPosition().plus(v1) );
         c2.moveTo( c2.getPosition().plus(v2) );
         r1.moveTo( r1.getPosition().plus(v3) );
         r2.moveTo( r2.getPosition().plus(v4) );                           
         c1.show(c1);
         c2.show(c2);
         r1.show(r1);
         r2.show(r2);                           
         StdDraw.show(10);
      }
   }
}