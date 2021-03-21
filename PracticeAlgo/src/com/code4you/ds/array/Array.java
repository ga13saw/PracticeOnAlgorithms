package com.code4you.ds.array;

public class Array {

	public static void main(String[] args) {
		
		int[] player1 = {10,15,50};
		int[] player2 = {10,15,50};
		int[] player3 = player1;
		
		System.out.println(player1 == player2);
		
		System.out.println(player1 == player3);
		
		boolean equals = player1.equals(player2);
		System.out.println(equals);
		
		int[] clone = player3.clone();
		for (int i : clone) {
			System.out.println(i);
		}
	}

}
