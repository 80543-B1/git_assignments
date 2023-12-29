package Q4;

import java.util.*;
import java.util.Arrays;

enum trafficLight {
	
	RED(60),YELLOW(10),GREEN(50);
	private int seconds;
	
	trafficLight(int seconds){
		this.seconds = seconds;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	
	
}

//public class assignment4 {
//	
//	public static void main(String args[]) {
//	
//	trafficLight c1 = trafficLight.RED ; 
//	System.out.println("Traffic Color : "+c1.name());
//	System.out.println("Traffic Duration : "+c1.getSeconds());
//	System.out.println();
//	
//	c1 = trafficLight.YELLOW;
//	System.out.println("Traffic Color : "+c1.name());
//	System.out.println("Traffic Duration : "+c1.getSeconds());
//	System.out.println();
//	
//	c1 = trafficLight.GREEN;
//	System.out.println("Traffic Color : "+c1.name());
//	System.out.println("Traffic Duration : "+c1.getSeconds());
//	System.out.println();
//	
//	}	
//}



public class assignment4 {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);	
	trafficLight Lights[] = new trafficLight[3];
	System.out.print(Arrays.toString(Lights));
	
	
	int x;
	
	for (int i = 0 ; i < Lights.length ; i++ )
	{
		trafficLight Lights[i] = new trafficLight(); 
		x = sc.nextInt();
		
	}
	
	
	}

}