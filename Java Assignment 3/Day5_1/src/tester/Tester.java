package tester;
import com.app.geometry.*;


public class Tester {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D();
		p1.accept();
		
		System.out.print("Coordinate : "+p1.getDetails());
		
		System.out.println();
		Point2D p2 = new Point2D();
		p2.accept();
		
		System.out.print("Coordinate : "+p2.getDetails());
		
		System.out.println();
		System.out.println("Status if p1 , p2 Coordinates are equal : "+Point2D.isEqual(p1.getX() , p1.getY() , p2.getX() , p2.getY()));
		
		
		System.out.println("Distance between "+p1.getDetails()+ " " + p2.getDetails() + " is : " + Point2D.distance(p1.getX() , p1.getY() , p2.getX() , p2.getY()) );
		
		
	}

}
