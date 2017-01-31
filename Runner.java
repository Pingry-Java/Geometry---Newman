public class Runner
{
	public static void main(String[] args)
	{
		Point p = new Point(3, 4, "P");
		Point q = new Point(5, 1, "Q");
		
		System.out.println(p.getX());
		System.out.println(Point.distanceBetween(p, q));
		System.out.println(p.distanceTo(q));
		
		Point a = new Point(3, 4);
		Point b = new Point(5, 1);
		Segment myLine = new Segment(a, b);
		
		System.out.println("The length of " + myLine.toString() + " is " + myLine.length());
		System.out.println("How many segments are there: " + Segment.getNumSegments());
	}
}