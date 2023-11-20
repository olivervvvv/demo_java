package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "atm")
public class Atm {
	@Id
    @Column(name="account")
	private String account;
	
    @Column(name="password")
	private String pwd;
	
    @Column(name="balance")
	private int balance;
	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Atm(String account, String pwd) {
		super();
		this.account = account;
		this.pwd = pwd;
	}

	public Atm(String account, String pwd, int balance) {
		super();
		this.account = account;
		this.pwd = pwd;
		this.balance = balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
	
}
