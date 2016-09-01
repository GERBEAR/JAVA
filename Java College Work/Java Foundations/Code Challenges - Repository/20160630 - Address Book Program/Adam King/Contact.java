package com.ocja.addressbook;

public class Contact implements Comparable<Contact> {
	
	String fName;
	String lName;
	
	String phNumber;
	
		public Contact(){
			
		}
		public Contact(String newFName, String newLName, String newPHNumber){
			fName = newFName;
			lName = newLName;
			phNumber = newPHNumber;
		}
		public void setFName(String newFName){
			fName = newFName;
		}
		public void setlName(String newLName){
			lName = newLName;
		}
		public void setphNumber(String newPHNumber){
			phNumber = newPHNumber;
		}
		
		public String getFName(String newFName){
			return fName ;
		}
		public String getlName(){
			return lName ;
		}
		public String getphNumber(String newPHNumber){
			return phNumber;
		}
	  public String toString(){
			return "\nLast Name: "+ lName+"\nFirst Name: "+ fName + "\nPhone number: "+phNumber;
	  }
	@Override
	public int compareTo( Contact args) {
		// TODO Auto-generated method stub
		int num = lName.compareTo(args.getlName());
		return num;
	}

}
