import java.util.Random;

public class RandomDieExample
{
	public static void main( String[] args)
	{
		// create new random number generator names rand
		Random rand = new Random();
		
		// roll die 10 times
		for( int i = 0; i < 10; i++)
		{
			// .nextInt(6) generates number from 0-5
			// adding 1 gives us 1-6
			int dieRoll = rand.nextInt(6)+1;
			System.out.println( "Die roll: " + dieRoll );
		}
	}
}