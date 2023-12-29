
import java.util.Scanner;

class Invoice {
	String number;
	String description ;
	int qty;
	double price;
	double total_price;
	
	public Invoice(){
		
	}
	
	public Invoice(String number, String description, int qty, double price) {
	
		this.number = number;
		this.description = description;
		this.qty = qty;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	double total_price() {
		this.total_price = this.qty * this.price;
		
		
		return this.total_price;
	}
	
	void display(){
		System.out.println("Num : "+this.number);
		System.out.println("Description : "+this.description);
		System.out.println("Qty : "+this.qty);
		System.out.println("Price : "+this.price);
		System.out.println("Total_Price : "+total_price());
		
	}

	public String toString() {
		return "Invoice [number=" + number + ", description=" + description + ", qty=" + qty + ", price=" + price
				+ ", total_price=" + total_price + "]";
	}
	
	
	
}

public class Day3_1 {
	
//	System.out.println("addsad");
//	Invoice  = new Invoice();
//	
	public static void main (String args[]) {

		Scanner sc = new Scanner(System.in);
		Invoice i1  = new Invoice();
		
		System.out.println("Enter the details");
		
		System.out.println("Enter part number : ");
		String num = sc.next();
		i1.setNumber(num);
		
		System.out.println("Enter description : ");
		String description = sc.next();
		i1.setDescription(description);
		
		System.out.println("Enter quantity : ");
		int qty = sc.nextInt();
		if (qty <= 0)
		{
			i1.setQty(qty);
		}
		else {
			i1.setQty(0);
		}
		
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		i1.setPrice(price);
		
		if (price <= 0.0)
		{
			i1.setPrice(price);
		}
		else {
			i1.setPrice(0);
		}
		
		
		
		i1.display();
		sc.close();
	}
	

	



}
