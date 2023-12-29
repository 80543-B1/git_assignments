import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al1 = new ArrayList<String>();
		
		System.out.println("Enter the elements one by one : ");
		al1.add(sc.nextLine());
		al1.add(sc.nextLine());
		al1.add(sc.nextLine());
		al1.add(sc.nextLine());
		al1.add(sc.nextLine());
		
		System.out.println(al1);
		
		System.out.println("Enter the element you want to insert in 1st index : ");
		String x = sc.next();
		al1.set(1, x);
		
		System.out.println(al1);
		
//		for (int i = 0; i< al1.size() ; i++) {
//			
//		}
		
		
		
		
	}

}
