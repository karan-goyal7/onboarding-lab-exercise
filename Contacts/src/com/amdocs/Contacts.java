package com.amdocs;

import java.util.HashMap;

public class Contacts {
	private HashMap<String,String> contacts;
	
	public Contacts() {
		this.contacts = new HashMap<String,String>();
	}
	public void addContact(String name, String mobileNo) {
		contacts.put(mobileNo , name);
	}
	public String findContactNameByMobileNo(String mobileNo) {
		String name = contacts.get(mobileNo);
		if(name == null)
			return mobileNo;
		return name;
	}
	
	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		contacts.addContact("abcd", "123456");
		contacts.addContact("efgh", "987654" );
		
		String res1 = contacts.findContactNameByMobileNo("123456");
		String res2 = contacts.findContactNameByMobileNo("234556");
		
		System.out.println(res1);
		System.out.println(res2);
	}

}
