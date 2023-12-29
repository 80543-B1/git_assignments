package com.app.fruits;

public class Fruit {

	String color;
	double weight;
	String name;
	boolean isFresh;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}


	Fruit(){
		
	}
	
	
	Fruit(String name , double weight , String color  , boolean isFresh){
			
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.isFresh = isFresh;
	}
	
	public String toString() {
		return "Name : "+this.name + "\t Weight : "+this.weight + "\t color : "+this.color + "\t Freshness : "+this.isFresh ;
	}
	
	public String taste() {
		return "No Specific Taste";
	}
	
	
}
