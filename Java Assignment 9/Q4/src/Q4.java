
import java.util.*;
//import java.util.LinkedList;

//class Insertnumbers{
//	int num;
//
//	public int getNum() {
//		return num;
//	}
//
//	public void setNum(int num) {
//		this.num = num;
//	}
//
//	@Override
//	public String toString() {
//		return "Insertnumbers [num=" + num + "]";
//	}
//
//	public Insertnumbers(int num) {
////		super();
//		this.num = num;
//	}
//	
//	
//	
//}


//class array_list extends ArrayList{
//	Q4.addnumber(ArrayList<Integer> ArrayList);
//}






public class Q4 {
	
	public static <T extends Comparable<T>> T findMax(List<T> numbers)
	{
	T max = numbers.get(0);
	
	for (T number : numbers) {
		if (number.compareTo(max) > 0) {
			max = number;
		}
	}
	
	return max;
	
	
	
	}
	
	static void addnumber(List<Integer> list ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 5 elements one by one :  " );
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		
		
	}

	
	public static void main(String[] args) {
		
		System.out.println("********************Array List***********************************");
		
		ArrayList<Integer> al_int = new ArrayList<Integer>();
		addnumber(al_int);
		
		for (Integer element : al_int)
		{
			System.out.print(element+"\t");
		}
		
//		int max = Collections.max(al_int);
//		System.out.println("Max : "+max);
		
		System.out.println("Max integer : "+findMax(al_int));
		
		}
	
//		System.out.println("********************LinkedList***********************************");
		
	
	LinkedList<Integer> ll_int = new LinkedList<Integer>();
	
	
	
	for (Integer element : al_int)
	{
		System.out.print(element+"\t");
	}

	
	System.out.println("Max integer : "+findMax(al_int));
	
	}

}
