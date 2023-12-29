import java.util.Scanner;

class Employee{
	String first_name;
	String last_name ;
	double m_salary;
	
	Employee(){
		
	}

	public Employee(String first_name, String last_name, double m_salary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.m_salary = m_salary;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getM_salary() {
		return m_salary;
	}

	public void setM_salary(double m_salary) {
		this.m_salary = m_salary;
	}
	
	void check_salary(){
		if (this.m_salary <= 0.0) {
			this.m_salary = 0.0;
		}  
	}
	
	double  yearly_salary() {
		double yearly_salary = 0.0;
		
		yearly_salary =  12 * getM_salary();
		
		return yearly_salary; 
	}
	
	
	double percent_raise(double sal) {
		sal = (0.1 * sal ) + sal;
		return sal;
	}

	public String toString() {
		return "Employee [first_name=" + first_name + ", last_name=" + last_name + ", m_salary=" + m_salary + "]";
	}
	
	
	
}

public class Day3_2 {

	public static void main(String[] args) {
		
		Employee e2 = new Employee("john" , "mathews" , 55000);
		System.out.println(e2.toString());
		
		System.out.println("YEARLY SALARY : "+e2.yearly_salary());
		double sal = e2.yearly_salary();
		System.out.println("AFTER RAISE "+e2.percent_raise(sal));
		
		
		Scanner scan = new Scanner(System.in);
		Employee e1 = new Employee();
		
		
		System.out.println("Enter the first name : ");
		String x1 = scan.next();
		e1.setFirst_name(x1);
		
		System.out.println("Enter the last name : ");
		String x2 = scan.next();
		e1.setLast_name(x2);
		
		System.out.println("Enter the monthly salary : ");
		double x3 = scan.nextDouble();
		e1.setM_salary(x3);
		e1.check_salary();
		
		System.out.println(e1.toString());
		double sal1 = e1.yearly_salary();
		System.out.println("Yearly Salary is : "+sal1);
		
		System.out.println("yearly salary after raise : "+e1.percent_raise(sal1));
		
		
		
	}

}
