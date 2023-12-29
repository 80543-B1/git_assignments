import java.util.Scanner;

class Credit_System {
	int account_number;
	int balance;
	int charges;
	int credits ;
	int credit_limit ;
	
	
	Credit_System() {}
	
	public Credit_System(int account_number, int balance, int charges, int credits, int credit_limit) {
		
		this.account_number = account_number;
		this.balance = balance;
		this.charges = charges;
		this.credits = credits;
		this.credit_limit = credit_limit;
	}


	public int getAccount_number() {
		return account_number;
	}


	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getCharges() {
		return charges;
	}


	public void setCharges(int charges) {
		this.charges = charges;
	}


	public int getCredits() {
		return credits;
	}


	public void setCredits(int credits) {
		this.credits = credits;
	}


	public int getCredit_limit() {
		return credit_limit;
	}


	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}
	
	
	public int new_balance(){
		int new_balance = 0;
		
		new_balance = this.balance + this.charges - this.credits;
		
		return new_balance;
	}
	
	public void check_status(int x) {
		if (x > this.credit_limit)
			{ 
			System.out.print("Credit limit exceeded"); 
			}
		else {
		System.out.println("Credit limit not exceeded");
	}
	}	
}

public class Day_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number : ");
		int acc_num = sc.nextInt();
		
		System.out.println("Enter balance : ");
		int bal = sc.nextInt();
		
		System.out.println("Enter charges : ");
		int charges = sc.nextInt();
		
		
		System.out.println("Enter the credit : ");
		int credit = sc.nextInt();
		
		
		System.out.println("Enter the credit limit : ");
		int credit_limit = sc.nextInt();
		
		
		Credit_System cs1 = new Credit_System(acc_num , bal , charges , credit , credit_limit);
		int nb = cs1.new_balance();
		
		
		cs1.check_status(nb);
		
		
		
		
		
	}

}
