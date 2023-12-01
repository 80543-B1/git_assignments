import java.util.Scanner;

public class Day1_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt(); 
	
	
	switch (choice) {
	case  1: 
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		int x3 = Math.max(x1, x2);
		int x4 = Math.min(x1, x2);
		
		System.out.println("Max Value : "+x3);
		System.out.println("Min Value : "+x4);

		int x5 = x3 - x4 ;
		System.out.println(x5);
		
	case  2: 
	{
	
	float y1 = sc.nextFloat();
	float y2 = sc.nextFloat();
	
	float y3 = Math.max(y1, y2);
	float y4 = Math.min(y1, y2);
	
	System.out.println("Max Value : "+y3);
	System.out.println("Min Value : "+y4);

	float y5 = y3 - y4 ;
	System.out.println(y5);

	}
	
	case 3 : {
		double z1 = sc.nextDouble();
		double z2 = sc.nextDouble();
		
		double z3 = Math.max(z1, z2);
		double z4 = Math.min(z1, z2);
		
		System.out.println("Max Value : "+z3);
		System.out.println("Min Value : "+z4);

		double z5 = z3 - z4 ;
		System.out.println(z5);
	
		
		
	}
	sc.close();
	}
		
	} 
	
}
		
		
