package com.dean.objects;

public class Contact {
	
	private String name;
	private String number;
	
	public Contact(String name){
		this.name = name;
	}
	
	public Contact(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(String number){
		this.number = number;
	}
	public String getAge(){
		return this.number;
	}
}
