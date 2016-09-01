public class MovingRectangle extends Rectangle
{
	private Vector2D v;	
	
	public MovingRectangle(double x0, double y0, double w, double h, double vx1, double vy1)
   {
      super(x0,y0,w,h);
		v = new Vector2D(vx1,vy1);
   }
		
		
	public void move()
	{
		pos = pos.plus(v);
	}
	
	public void collide( MovingRectangle r)
	{
		if(r.intersects(this))
		{
			v.times(-1);
			r.v.times(-1);
		}
	}
}
		
	