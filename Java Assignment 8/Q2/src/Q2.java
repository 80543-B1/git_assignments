import java.util.ArrayList;
import java.util.*;
//import java.util.Collections;

public class Q2 {
	
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
		
		Collections.sort(al1);
		
		System.out.println(al1);
	}

}
