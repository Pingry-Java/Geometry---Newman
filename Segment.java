public class Segment
{
	private Point start;
	private Point end;
	
	// Keep track of how many segment instances exist
	// Generally good to initialize these right away
	private static int numSegments = 0;
	
	// Default Constructor because it has no args
	// Need to override the default constructor 
	public Segment()
	{
		this.start = new Point();
		this.end = new Point();
		numSegments++;
	}
	
	public Segment(Point start, Point end)
	{
		this.start = start;
		this.end = end;
		
		// Remember to increment the counter of all line segments
		numSegments++;
	}
	
	public String toString()
	{
		return start.name + end.name;
	}
	
	public double slope()
	{
		double deltaX = start.getX() - end.getX();
		double deltaY = start.getY() - end.getY();
		
		return deltaY/deltaX;
	}
	
	public double length()
	{
		return start.distanceTo(end);
	}
	
	public static int getNumSegments()
	{
		// If the field is static, its accessor should be too.
		return numSegments;
	}
}