package q1;

import java.util.*;

class ExceptionLineTooLong extends Exception {
	ExceptionLineTooLong() {
		
	}
}

public class q1 {

	public static void main(String[] args) {
		
		System.out.println("ENter the string : ");
		Scanner sc = new Scanner(System.in);
		
		try {
		String sentence = sc.nextLine();
		
		if (sentence.length() > 80 ) {
			throw new ExceptionLineTooLong();
		
		
		}
		System.out.println(sentence);
		
		
		}
		catch(ExceptionLineTooLong e){
			System.out.print("ExceptionLineTooLong Raised");
		}
	
	
	
	
	}

}
