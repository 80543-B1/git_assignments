package com.Book;

//import java.util.Date;
import java.util.Objects;

class Date{
	int dd;
	int mm;
	int yy;
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
	
	
}

enum Category{

	romance , fiction , drama;
}

public class Book implements Comparable<Book>{

	String isbn;
	Category category;
	double price;
	Date publishDate;
	String authorName;
	int quantity;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Book() {
		
	}
	
	public Book(String isbn, Category category, double price, Date publishDate, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [isbn= " + isbn + ", category= " + category + ", price= " + price + ", publishDate= " + publishDate
				+ ", authorName = " + authorName + ", quantity= " + quantity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorName, category, isbn, price, publishDate, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && category == other.category
				&& Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publishDate, other.publishDate) && quantity == other.quantity;
	}
	
	public int compareTo(Book b)
	{
		if (this.publishDate.yy > b.publishDate.yy ) 
		{ 
			return 1;	
		
		}
		
		else if (this.publishDate.yy < b.publishDate.yy ) 
		{ 
			return -1;	
		
		}
		
		else
		{ 
			if (this.publishDate.mm > b.publishDate.mm)	
			{
				return 1;
			}
			
			else if (this.publishDate.mm < b.publishDate.mm)	
			{
				return -1;
			}
			
			else {
				if (this.publishDate.dd > b.publishDate.dd)
				{
					return 1;
				}
				
				else if (this.publishDate.dd < b.publishDate.dd)
				{
					return -1;
				}
				
				else {
					return 0;
				}
			}
			
			
			
			
			
			}
		}
				
		
		
		
	
}
