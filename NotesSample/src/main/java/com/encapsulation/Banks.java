package com.encapsulation;

public class Banks {
	
private int balance;      	

private int accountNumber;

private String name;

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

 public static void main(String[] args) {
	 Banks obj = new Banks();
	 obj.setName("Customer name:"+"AbuSayed");
	 obj.setAccountNumber(25345);
	 obj.setBalance(15000);
	 
	 System.out.println(obj.getName());
	 System.out.println(obj.getAccountNumber());
	 System.out.println(obj.getBalance());
	
}

}