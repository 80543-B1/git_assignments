import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s; 		
		System.out.print("Enter the string : ");
		s = sc.next();
		
		StringBuffer sb1 = new StringBuffer(s);
		
		sb1.reverse();
		
		
		System.out.println("Reversed String is : "+sb1);
		
	}

}
