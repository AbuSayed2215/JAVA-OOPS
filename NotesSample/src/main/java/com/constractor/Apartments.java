package com.constractor;

public class Apartments extends Building{
	
	Apartments (){
		System.out.println("I live in NY");
	}
	void Counter () {
		System.out.println("Wood counter");
	}
	
	public static void main(String[] args) {
		
		Apartments obj = new Apartments();
		obj.counter();
		obj.Counter();
		
		
	}

}
