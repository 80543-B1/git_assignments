package tester;

import com.app.geometry.*;

import java.util.Arrays;
import java.util.Scanner;


public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENter the number of coordinates you want to enter : ");
		int n = sc.nextInt();		
		
		Point2D points[] = new Point2D[n];
//		System.out.println(Arrays.toString(points));

		for (int i=0 ; i < n ; i++) {
			points[i] = new Point2D();
			points[i].accept();
			
		}
		
		
		
		int choice = 1;
		
		while(choice>=1 || choice <=4) {
			System.out.println("Press 1. to Display details of a specific point ");
			System.out.println("Press 2. to Display x, y co-ordinates of all points");
			System.out.println("Press 3. to User i/p : 2 indices for the points , validate the indices");
			System.out.println("Press 4. Exit ");
			System.out.println("ENter the choice");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println();
				System.out.println("Okay Which coordinate you want to chooose ?  ");
				int index = sc.nextInt();
				
				
				if (index > n)
				{
					System.out.println("Enter the valid index : ");
				}
				else 
				{	
				System.out.println("Required Coordinate is : "+points[index].getDetails());
				
				}
			}
			
			else if(choice == 2) {
				for (Point2D coords : points ) {
					
					System.out.println(coords.getDetails());
					
				}
				
//				for(int i = 0; i < n; i++) {
////					System.out.println("goal");
//					System.out.println(points[i].getDetails());
				}
			
			else if(choice == 3) {
				
				System.out.println("index 1 : ");
				int index1 = sc.nextInt();
				
				System.out.println("index 2 : ");
				int index2 = sc.nextInt();
				
				
				if ( (index1 > n) || (index2 > n) ) 
				{
					System.out.println("Enter the valid index (should be less than) given "+n);
				}
				else 
				{	
					System.out.println("Status if p1 , p2 Coordinates are equal : "+Point2D.isEqual(points[index1].getX() , points[index1].getY() , points[index2].getX() , points[index2].getY()));
					
					System.out.println("Distance between "+points[index1].getDetails()+ " " + points[index1].getDetails() + " is : " + Point2D.distance(points[index1].getX() , points[index1].getY() , points[index2].getX() , points[index2].getY()) );
					
					
//				System.out.println("Required Coordinate is : "+points[index].getDetails());
				
				}
				
				}
			else {
					System.out.println("Bye Bye you exited the program ");
					break;
				}
				
				
				
			 
		
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
	}


