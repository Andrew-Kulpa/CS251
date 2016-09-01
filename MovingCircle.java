public class MovingCircle
{
	private Circle c;
	private Vector2D v;
	
	public void move()
	{
		c.moveTo(c.getPosition().plus(v));
	}
	
	public void collide( MovingCircle r)
	{
		
	}
}