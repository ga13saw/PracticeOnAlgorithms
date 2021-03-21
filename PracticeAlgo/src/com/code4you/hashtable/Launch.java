package com.code4you.hashtable;

public class Launch {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable(15);
		hashTable.entry("Hello");
		hashTable.entry("Raj");
		hashTable.entry("Dillawar");
		
		hashTable.printHashTable();

	}

}
