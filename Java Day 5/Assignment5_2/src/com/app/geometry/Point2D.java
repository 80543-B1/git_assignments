package com.app.geometry;
//import java.util.Objects;

//import tester.*;
import java.util.Scanner;


public class Point2D{
	
	int x;
	int y;
	
	public Point2D(){
		
	}
	
	public Point2D(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public String toString() {
		return "point2D [x=" + x + ", y=" + y + "]";
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the x ordinate : ");
		this.x =sc.nextInt();

		
		System.out.print("Enter the y ordinate : ");
		this.y = sc.nextInt();
	
		

		
	
	}
	
	

	public String getDetails() {
		return "("+ this.x + "," + this.y +")";
	}
	
	public static boolean  isEqual(int x1 , int y1 , int x2 , int y2) {
		
		if ((x1 == x2) && (y1 == y2)) {
			return true;
		}
		else 
			return false;
		
	}
	
	public static double distance(int x1 , int y1 , int x2 , int y2){
		
		double distance = 0.0 ;
		
		distance = Math.sqrt( ( ( x2 - x1) * (x2 - x1) ) + ((y2-y1) * (y2-y1) )) ;
		
		return distance; 
	}
	
	
	
	
	
}

////public class Point2D {
////
////	public static void main(String[] args) {
////		
////
////	}
//
//}
