
public class Day1_7 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		
		System.out.println("Original value : "+i);
		
		int temp = i;
		int rev = 0;
		while (temp != 0)
		{
			int rem = temp % 10;
			rev = rev * 10 + rem;
//			System.out.println(rev);
			temp = temp / 10;
//			System.out.println(temp);
			
			
		}
		
		System.out.println("Reverse value : "+rev);
		
		
		
		
	}

}
