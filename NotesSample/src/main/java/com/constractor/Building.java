package com.constractor;

public class Building {
	Building(){
		
		System.out.println("adding new tiles in the kitchen");
		
	}
	
	void counter() {
		System.out.println("Adding marvel counter");
	}
	
	Building (int Floor){
		System.out.println("The buildin has "+Floor+"floors total");
		
		
		
	}
	
	void counter(String leavingroom) {
		System.out.println("Adding marvel counter"+leavingroom);
	}
 public static void main(String[] args) {
	 Building obj = new Building();
	 obj.counter();
	 ConPrac obj1 = new ConPrac();
	 obj1.accesories();
	 
}
}
