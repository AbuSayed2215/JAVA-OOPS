package com.polymorphism;

public class ClassA {
	
	public void franklin(String name, int age) {
		System.out.println(name+"-"+age);
}

	public void franklin (double salary, String job) {
		System.out.println(salary+"-"+job);
	}
	public void franklin (String instrument) {
	
		System.out.println(instrument);
	}
	public void franklin (String sibling1, String sibling2) {
		
		System.out.println(sibling1+"-"+sibling2);
	}
	public void franklin (int salary, String sibling1) {
		System.out.println(salary+"-"+sibling1);
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.franklin("String", 27);
		obj.franklin(75000.50, "CMD");
		obj.franklin("Drum");
		obj.franklin("John", "James");
	}
}
