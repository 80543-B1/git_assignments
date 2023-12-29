package q2;
import java.util.Scanner;


class NegativeDiameterException extends Exception{
	
	NegativeDiameterException(){
		
	}
}

class Circle{
	double myX;
	double myY;
	double myDiameter;  

	Circle(){
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;

	}
	
	Circle(double myX , double myY , double myDiameter){
		this.myX = myX;
		this.myY = myY;
		this.myDiameter = myDiameter;
		
	}

	@Override
	public String toString() {
		return "Circle [myX=" + myX + ", myY=" + myY + ", myDiameter=" + myDiameter + "]";
	}
	
	

}

public class q2 {

	public static void main(String[] args) {
		
		try
		{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x axis : ");
		double x_axis = sc.nextDouble();
		
		System.out.println("Enter y axis : ");
		double y_axis = sc.nextDouble();
		
		System.out.println("Enter the diameter : ");
		double myDiameter = sc.nextDouble();
		
		if (myDiameter < 0) {
			throw new NegativeDiameterException();
		}
		
		Circle obj = new Circle(x_axis , y_axis , myDiameter);
		
		System.out.println(obj);
		
		
		}
		
		
		catch(NegativeDiameterException e) {
			System.out.print("NEgative diameter inserted");
		}
	}

}
