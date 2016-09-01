public class Rectangle
{
	private final double x;
	private final double y;
	
	private final double width;
	private final double height;
	
	public Rectangle(double x0, double y0, double w, double h)
	{
		x = x0;
		y = y0;
		width = w;
		height = h;
	}
	
	public double area()
	{
		return width*height;
	}
	
	public double perimeter()
	{
		return 2*width + 2*height;
	}
	
	public boolean intersects(Rectangle b)
	{
	 	return true;
		//
	}
	
	public boolean contains(Rectangle b)
	{
		return true;
		//
	}
	
	public void show(Rectangle b)
	{
		double xRectangle[]= new double[4];
		double yRectangle[]= new double[4];
		
		xRectangle[0] = x-width/2;
		xRectangle[1] = x-width/2;
		xRectangle[2] = x+width/2;
		xRectangle[3] = x+width/2;
		
		yRectangle[0] = y-width/2;
		yRectangle[1] = y+width/2;
		yRectangle[2] = y+width/2;
		yRectangle[3] = y-width/2;
		
		StdDraw.polygon(xRectangle,yRectangle);
	}
}