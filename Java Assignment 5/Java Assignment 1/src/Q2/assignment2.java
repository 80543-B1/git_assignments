package Q2;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		boolean flag = true;
		int j = s.length()-1;
		for (int i = 0 ; i < s.length() ; i++)
		{
			if (s.charAt(i) != s.charAt(j)) {
				flag  = false;
				break;
			}
//			System.out.println(s.charAt(i));
//			System.out.println(s.charAt(j));
//			System.out.println();
			j--;
			
		}
		
		if (flag == true) {
			System.out.println("GIven string is pallindrome");
		}
		
		else {
			System.out.println("GIven string is not pallindrome");
		}
		
	}

}
