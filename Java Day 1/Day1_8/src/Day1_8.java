import java.util.Scanner;

public class Day1_8 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Float f1 = new Float((8.0/0.0)/(4.0/0.0));
		
		if (Float.isNaN(f1))
			System.out.println(true);
		else
			System.out.println(false);
		sc.close();

		
		
	}
}