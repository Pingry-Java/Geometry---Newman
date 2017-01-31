public class Point
{
	// Declare some instance fields
	private double x;
	private double y;
	public String name;
	
	// Declare a constructor to make a new instance of the class
	// Constructors always have the same name as the class
	public Point()
	{
		x = 0;
		y = 0;
		name = "O";
	}
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
		this.name = "A";
	}
	
	public Point(double x, double y, String name)
	{
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	// Write some accessor methods. 
	// These can be called from other classes because they are public, and they can get 
	// the private x and y values because they are in the same class as x and y
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	// Write modifier methods
	
	public void setX(double newX)
	{
		x = newX;
	}
	
	public void setY(double newY)
	{
		y = newY;
	}
	
	// Declare some useful method(s)
	
	/**
	* This method calculates and returns this point's distance from the origin (0,0)
	* @return The distance from (0,0) as a real number
	*/
	
	public double distanceFromOrigin()
	{
		// These do the same thing
		//return Math.sqrt((double) x * x + (double) y * y);
		return Math.hypot(x, y);
	}
	
	public String toString()
	{
		return name + ": (" + x + ", " + y + ")";
	}
	
	
	// Static version
	
	public static double distanceBetween(Point a, Point b)
	{
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
	
	
	// Non-static version
	
	public double distanceTo(Point other)
	{
		return Math.sqrt((other.x - x) * (other.x - x) + (other.y - y) * (other.y - y));
	}
}