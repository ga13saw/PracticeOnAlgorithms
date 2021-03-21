package com.code4you.ds.array;

public class LaunchArray {

	public static void main(String[] args) {

		int[] order;
		order = new int[] { 2, 3, 4, 6, 7 };

		for (int i : order) {
			System.out.println(i);
		}
		System.out.println("\n" + order.length);

		int[] clone = order.clone();
		for (int i : clone) {
			System.out.println(i);
		}
		String[] name = { "ram", "seeta" };
		System.out.println(name.getClass());

		double[] fees = new double[10];

		for (int i = 0; i < fees.length; i += 2) {
			fees[i] = 10.89;
		}
		for (double d : fees) {
			System.out.println(d);
		}
		
		System.out.println(name.toString());
		
		order[0] = 8;
		order[order.length] = 8;
		for (int i : order) {
			System.out.println(i);
		}
		
		
		
	}

}
