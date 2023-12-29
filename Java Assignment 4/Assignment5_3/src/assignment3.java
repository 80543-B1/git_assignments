public class assignment3 {

	public static void main(String[] args) {
		
		String arr1[] = {"john" , "mat" , "joffy" , "man"};
		String arr2[] = {"abhishek" , "boy" , "mat"};
		
//		System.out.println("dadasd");
		
		for (int i = 0 ; i < arr1.length ; i++) {
//			System.out
			
			for (int j = 0; j < arr2.length ; j++)
			{
				if (arr1[i].equals(arr2[j])) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
















//import java.util.Scanner;
//
//class array_creation{
//	
//	int len ;
//	String arr[];
//	
//	array_creation(){
//		
//	}
//	
//	array_creation(int len){
//		this.len = len;
//	}
//	
//	
//	
//	public int getLen() {
//		return len;
//	}
//
//	public void setLen(int len) {
//		this.len = len;
//	}
//
//	void accept(){
//		Scanner sc = new Scanner(System.in);
//		
//		this.arr = new String[this.len];
//		
//		for (int i = 0 ; i < this.len ; i++)
//		{
//			this.arr[i] = sc.next();
//		}
//		
//	}
//	
//	void display() {
//		System.out.print("Array : ");
//		for (String element : this.arr) {
//			System.out.print(element+"\t");
//			
//		}
//		
//		
//	}
//	
//	static void matching(String arr1 ,String arr2 ) {
//			
//		for (int i=0 ; i < arr1.getLen() ; i++)
//		{
//			for (int j = 0 ; j < arr2.getLen() ; j++)
//			{
//				if (arr1[i].equals(arr2[j])){
//					
//				} 
//			}
//		}
//		
//		
//	} 
//	
//	
//	
//	
//}
//
//public class assignment3 {
//
//	public static void main(String[] args) {
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter number of elements for array 1 : ");
//		int num1 = scan.nextInt();
//		
//		array_creation arr1 = new array_creation(num1);
//		System.out.print("Enter elements one by one : ");
//		arr1.accept();
//		
//		System.out.print("Enter number of elements for array 2 : ");
//		int num2 = scan.nextInt();
//		
//		array_creation arr2 = new array_creation(num2);
//		System.out.print("Enter elements one by one  : ");
//		arr2.accept();
//		
//		arr1.display();
//		System.out.println();
//		arr2.display();
//		
//	}
//
//}
