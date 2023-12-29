import java.util.HashSet;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elemenets one by one please : ");
		hs1.add(sc.next());
		hs1.add(sc.next());
		hs1.add(sc.next());
		hs1.add(sc.next());
		hs1.add(sc.next());
		
		for (String element : hs1) {
			System.out.print(element+ "\t");
		}
		
		
	}

}
