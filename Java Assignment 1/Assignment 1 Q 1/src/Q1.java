import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the integer number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("Given Number : "+num);
		System.out.println("BInary Equivalent : "+Integer.toBinaryString(num));
		System.out.println("Octal Equivalent: "+Integer.toOctalString(num));
		System.out.println("Hexadecimal EQuivalent : "+Integer.toHexString(num));
		
		sc.close();
	}

}
