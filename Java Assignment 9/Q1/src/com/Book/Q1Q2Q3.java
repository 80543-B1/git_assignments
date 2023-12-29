//package com.Book;
//
//import java.util.HashMap;
//
//public class Q1 {
//
//	public static void main(String[] args) {
//		
//		Book b1 = new Book("101",Category.drama,400,"14/Dec/2023","JOhn Mathews",7 );
//		Book b2 = new Book("201",Category.fiction,800,"15/Dec/2023","Abhishek Khan",15 );
//		Book b3 = new Book("301",Category.romance,1000,"16/Dec/2023","Rahul",20 );
//		Book b4 = new Book("301",Category.romance,1000,"16/Dec/2023","Rahul",20 );
//		
//		Book b5 = new Book("501",Category.drama,1000,"20/Dec/2023","Rahul",200 );
//		Book b6 = new Book("601",Category.fiction,1000,"25/Dec/2023","Rahul",200 );
//		
//		HashMap<String,Book> hs1 = new HashMap<String,Book>();
//		
//		
//		hs1.put(b1.getIsbn(),b1);
//		hs1.put(b2.getIsbn(),b2);
//		hs1.put(b3.getIsbn(),b3);
//		hs1.put(b4.getIsbn(),b4);
//		hs1.put(b5.getIsbn(),b5);
//		
////		hs1.put(b2);
////		hs1.add(b3);
//////		hs1.add(b1);
////		hs1.add(b4);
//		
//			System.out.println(hs1);
//	
//		
//	}
//
//}



package com.Book;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Q1Q2Q3 {

	public static void main(String[] args) {
		
		Book b1 = new Book("101",Category.drama,400,(new Date(15,12,2023)),"JOhn Mathews",7 );
		Book b2 = new Book("201",Category.fiction,800,(new Date(17,11,2021)),"Abhishek Khan",15 );
		Book b3 = new Book("301",Category.romance,1000,(new Date(17,9,2023)),"Rahul",20 );
		Book b4 = new Book("301",Category.romance,1000,(new Date(17,12,2022)),"Rahul",20 );
		
		Book b5 = new Book("501",Category.drama,1000,(new Date(31,11,2009)),"Rahul",200 );
		Book b6 = new Book("601",Category.fiction,1000,(new Date(25,10,2020)),"Rahul",200 );
		
		HashSet<Book> hs1 = new HashSet<Book>();
		
		
		hs1.add(b1);
		hs1.add(b2);
		hs1.add(b3);
		hs1.add(b4);
		hs1.add(b5);
		hs1.add(b6);
		
//		hs1.put(b2);
//		hs1.add(b3);
////		hs1.add(b1);
//		hs1.add(b4);
		
			System.out.println(hs1);
			
			for (Book book : hs1) {
				System.out.println(book);
			}
		
		LinkedList<Book> LL1 = new LinkedList<Book>(); 
			
			
		for(Book element : hs1) {
				LL1.add(element);
				
			}
			System.out.println();
			System.out.println("Linked List is : "+LL1);
			
			for(Book element : LL1) {
				System.out.println(element+"\t");
				
			}
			
			
	System.out.println("***********************After sorting*****************************");
	
	Collections.sort(LL1);
	
//	System.out.println(LL1);
	for(Book element : LL1) {
		System.out.println(element+"\t");
		
	}
		
		
		
	}

}
