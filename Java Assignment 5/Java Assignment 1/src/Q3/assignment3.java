package Q3;

import java.util.*;


//public class assignment3 {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string : ");
//		String sentence = sc.next();
//		
//		StringTokenizer stk1 = new StringTokenizer(sentence);
//		
//		int count = 0;
//		
//	 
//		while(stk1.hasMoreTokens()) {
//			
//			
//			count = count + 1;
//				
//			}
//		System.out.print("Count : "+count);
//		}
//			
//
//
//
//	}




public class assignment3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String sentence = sc.nextLine();
		
		String str[] = sentence.split(" ");
		
		for (String s : str)
		{
			System.out.println(s);
		}
		
		System.out.println("count of woords : "+str.length);
	}
	
}