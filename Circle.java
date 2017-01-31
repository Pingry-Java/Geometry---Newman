public class Circle
{
	private Point center;
	private double radius;
	
	public Circle()
	{
		this.center = new Point();
		this.radius = 1.0;
	}
	
	public Circle(Point center)
	{
		this.center = center;
		this.radius = 1.0;
	}
	
	public Circle(Point center, double radius)
	{
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(double radius)
	{
		this.center = new Point();
		this.radius = radius;
	}
	
	public Circle(Point center, Point pointOnCircle)
	{
		this.center = center;
		this.radius = center.distanceTo(pointOnCircle);
	}
	
	public double diameter()
	{
		return radius * 2;
	}
	
	public double circumfrence()
	{
		return radius * 2 * Math.PI;
	}
	
	public double area()
	{
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public String toString()
	{
		return center.name;
	}
}