import java.util.Scanner;
import java.util.InputMismatchException;

public class Q2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first double ");
			double num1 = sc.nextDouble();
			
			System.out.println("ENter the 2nd double : ");
			double num2 = sc.nextDouble();
		
			double average = (num1 + num2) / 2;
			System.out.println("Average is : "+average);
		
		}catch (InputMismatchException e) {
			System.out.println("Error");
		}
		finally {
			sc.close();
		}
					
		}

	}


