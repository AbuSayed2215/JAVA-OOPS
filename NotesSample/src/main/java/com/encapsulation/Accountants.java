package com.encapsulation;

public class Accountants {
	public static void main(String[] args) {
		
		Banks obj = new Banks();
		obj.setName("David");
		obj.setBalance(25000);
		obj.setAccountNumber(25483);
		
		System.out.println(obj.getName());
		System.out.println(obj.getBalance());
		System.out.println(obj.getAccountNumber());
		
	}

}
