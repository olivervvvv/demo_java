package com.example.demo.entity;

public class TaipeiBank {
	String vranch;
	String user;
	int balance=1000;
	
	public String getvranch() {
		return vranch;
	}
	public int getBalance() {
		return balance;
	}
	public int saving(int amount) {
		if(amount>0)balance += amount;
		
		return balance;
	}
	
	public int withdraw(int amount) {
		if(amount<0) {
			if((balance-amount)>=0) {
				balance -= amount;
			}
		}
		return balance;
	}

}
