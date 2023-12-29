import java.util.Scanner;

class Accept {
	static int accept_qty() {
		Scanner sc = new Scanner(System.in);
		
		int qty;
		System.out.println("Enter the qty : ");
		qty = sc.nextInt();
		return qty;
		
	}
}


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int cost_Dosa = 50;
		int cost_Samosa = 20;
		int cost_Idli = 25;
		int cost_EggRoll = 40;
		int cost_Chickenroll = 50;
		int cost_Upma = 25;
		int cost_MeduVada = 30;
		int cost_SavaiUpma = 30;
		int cost_Pizza = 70;
		int cost_Burger = 50;
		
		int choice = 1;
		int total_bill = 0;
		
		while (choice >= 1 && choice <= 11) {
			System.out.println("Welcome to Johnny Food truck");
			System.out.println("1. Dosa");
			System.out.println("2. Somosa");
			System.out.println("3. Idli");
			System.out.println("4. EggRoll");
			System.out.println("5. ChickenRoll");
			System.out.println("6. Upma");
			System.out.println("7. MeduVada");
			System.out.println("8. SavaiUpma");
			System.out.println("9. Pizza");
			System.out.println("10. Burger");
			System.out.println("11 . total bill and Exit : ");
			
			System.out.print("ENter your choice sir : ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			if (choice == 1)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_Dosa;
				total_bill = total_bill + cost ;
			}
			if (choice == 2)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_Samosa;
				total_bill = total_bill + cost ;
			}
			if (choice == 3)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_Idli;
				total_bill = total_bill + cost ;
			}
			if (choice == 4)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_EggRoll;
				total_bill = total_bill + cost ;
			}
			if (choice == 5)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_Chickenroll;
				total_bill = total_bill + cost ;
			}
			
			if (choice == 6)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_Upma;
				total_bill = total_bill + cost ;
			}
			if (choice == 7)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_MeduVada;
				total_bill = total_bill + cost ;
			}
			if (choice == 8)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_SavaiUpma;
				total_bill = total_bill + cost ;
			}
			if (choice == 9)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_Pizza;
				total_bill = total_bill + cost ;
			}
			if (choice == 10)
			{
				int qty_items = Accept.accept_qty();
				int cost = qty_items * cost_Burger;
				total_bill = total_bill + cost ;
			}
			
			if (choice == 11)
			{
			System.out.println("Your Total bill is : "+total_bill);
			break;
			}
				
			
			}
			
			
		}

	}


