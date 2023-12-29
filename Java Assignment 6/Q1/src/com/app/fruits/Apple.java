package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple(String color , double weight){
		super("Apple" ,weight , color , true);
	}
	
	public String taste() {
		return "sweet n sour";
	}
	
	
	
	
}
