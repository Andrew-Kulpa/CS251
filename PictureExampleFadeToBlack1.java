import java.awt.Color;
public class PictureExampleFadeToBlack1
{
   public static void main( String[] args )
   { 
      Picture p1 = new Picture( "patrick.png" );
      
      int h = p1.height();
      int w = p1.width();
      
      Color black = new Color( 0, 0, 0 );

    
      
      for( double x = 0 ; x < 100; x++ )
      {
         for( int i = 0; i < w; i++ )
         {
            for( int j = 0; j < h; j++ )
            {
               p1.set( i, j, blend(black, p1.get(i,j), x/100.0 ));

            }       
         }
         p1.show();
      }            
   }
   
    public static Color blend(Color c1, Color c2, double alpha) {
        double r =  alpha * c1.getRed()   + (1.0 - alpha) * c2.getRed();
        double g =  alpha * c1.getGreen() + (1.0 - alpha) * c2.getGreen();
        double b =  alpha * c1.getBlue()  + (1.0 - alpha) * c2.getBlue();

        return new Color((int)r, (int)g, (int)b);
    }   
}