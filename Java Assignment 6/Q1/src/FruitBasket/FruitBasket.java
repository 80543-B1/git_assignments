package FruitBasket;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Johnny Fruit SuperStore");
		System.out.print("Enter the the Basket Size : ");
		int basketSize = 0;
		
		Scanner sc = new Scanner(System.in);
		basketSize = sc.nextInt();
		
		Fruit basket[] = new Fruit[basketSize];
		
		int counter = 0;
		
		System.out.println();	
		

		
		int choice = 0;
		
		while(choice != 10)
		{
			System.out.println();
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruit in basket");
			System.out.println("5. Display name , color , weight , taste of all fresh fruits ");
			System.out.println("6. tastes of all stale(not fresh) fruits in the basket");
			System.out.println("7. Mark a fruit as Stale");
			System.out.println("8. Mark all sour fruits as stale");
			System.out.println("10. Exit");
			System.out.print("Enter the choice : ");
			
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println();
				if  (counter < basketSize) {
					System.out.print("Enter the Color : ");
					String color = sc.next();
					System.out.print("Enter the weight : ");
					int weight = sc.nextInt();
					basket[counter] = new Mango(color , weight);
					counter = counter + 1;
				} 
				else {
					System.out.println("Max basket size reached !");
				}
				
			}
			
			else if (choice == 2) {
				System.out.println();
				if  (counter < basketSize) {
					System.out.print("Enter the Color : ");
					String color = sc.next();
					System.out.print("Enter the weight : ");
					int weight = sc.nextInt();
					basket[counter] = new Orange(color , weight);
					counter = counter + 1;
				}
				else {
					System.out.println("Max basket size reached !");
				}
				
			}
			
			
			else if (choice == 3) {
				System.out.println();
				if  (counter < basketSize) {
					System.out.print("Enter the Color : ");
					String color = sc.next();
					System.out.print("Enter the weight : ");
					int weight = sc.nextInt();
					basket[counter] = new Apple(color , weight);
					counter = counter + 1;
				}
				
				else {
					System.out.println("Max basket size reached !");
				}
				
			}
			
			
			else if (choice == 4) {
				System.out.println();
				
				for (int i = 0; i < basket.length ; i++)
				{	
					if (basket[i] != null){
					System.out.print(basket[i].getName());
					System.out.println();
				}
					}
				
			}
			
			
			else if (choice == 5) {
				System.out.println();
				for (int i = 0 ; i < basket.length ; i++)
				{
					if (basket[i] != null) {
					System.out.println(basket[i].toString());
					}
				}
			}
			
			
			else if (choice == 6) {
				System.out.println();
				for (int i = 0 ; i < basket.length ; i++)
				{
					if (basket[i] != null) {
					if (basket[i].isFresh() == false) {
					System.out.println(basket[i].toString());
					}
					
					
				}
			}
			}
			
			else if (choice == 7) {
				System.out.println();
				System.out.println("Enter which indexed Fruit you want to make stale ? ");
					int index = sc.nextInt();
					
					if (index < counter) {
						basket[index].setFresh(false);
						System.out.println("Freshness of Fruit " + index + " =  False");
					}
			}
			
			
			else if (choice == 8) {
				System.out.println();
				for(int i = 0; i < basket.length ; i++)
				{
					if (basket[i] != null) {
					if ("sour".equals(basket[i].taste()))
						basket[i].setFresh(false);
						System.out.println("Freshness of Fruit " + i + " =  False");
					}
				}
			}
			
			
			}
			System.out.println();
			System.out.println("Bye Bye Do visit us again !!!!");
		
		
		
	}

}
