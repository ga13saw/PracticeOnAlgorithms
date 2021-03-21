package com.code4you.hashtable;

import java.util.EmptyStackException;

public class HashTable {
	
	String[] hash ; 
	public HashTable(int capacity) {
		hash = new String[capacity];
	}
	
	public void entry(String value) {
		if (isEmpty(value)) {
			throw new EmptyStackException();
		}
		hash[doHasing(value)] = value;
	}
	

	
	public void printHashTable(){
		for (String string : hash) {
			if (string != null) {
				System.out.println(doHasing(string)+" : "+ string);
			}
			
		}
	}
	
private int doHasing(String value) {
	if (isEmpty(value)) {
		throw new EmptyStackException();
	}
	int temhash = value.length() % 10;
	return temhash;
}

public boolean isEmpty(String value) {
	if (value == null || value == " ") {
		return true;
	}
	return false;
}
}
