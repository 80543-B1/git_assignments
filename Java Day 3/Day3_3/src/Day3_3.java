import java.util.Scanner;


class Date{
	int day;
	int month;
	int year;
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	void display() {
		
		System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
		
		
	}
	
	
	
}

public class Day3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Number of dates you want to enter : ");
		n = sc.nextInt();
		
		Date dates[] = new Date[n];

		for (int i=0 ; i<n; i++) {
			
			dates[i] = new Date();
			
			System.out.println("ENter the day (1-31)");
			int x1 = sc.nextInt();
			dates[i].setDay(x1);
			
			System.out.println("ENter the month (1-12)");
			int x2 = sc.nextInt();
			dates[i].setMonth(x2);
	
			
			System.out.println("ENter the year ");
			int x3 = sc.nextInt();
			dates[i].setYear(x3);
		}
		
		for (int j = 0; j<n ; j++) {
			dates[j].display();
			
		}
		
		
		
		
		
		
		
		
	}

}
