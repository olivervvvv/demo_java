package com.example.demo.entity;

public class a extends c{
	
//	private String city;
//	private String state;
//	private String country;
	private String adress;
	private String street;
	
	public a(String string, String string2, String string3) {
		super(string, string2, string3);
		
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
