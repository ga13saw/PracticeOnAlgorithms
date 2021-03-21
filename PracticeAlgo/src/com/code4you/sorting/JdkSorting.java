package com.code4you.sorting;

import java.util.Arrays;

public class JdkSorting {

	public static void main(String[] args) {

		int[] numbers = { 2, 5, 1, 8, 9, 43, 32, 13, 33 };
		/*
		 * char[] chars = {'v','s','w','a','r'}; String[] names =
		 * {"ramu","Roy","Raj","Amay","canifer","Suraj","yush"};
		 * Arrays.sort(names); Arrays.sort(numbers); Arrays.sort(chars);
		 * System.out.println(Arrays.toString(numbers));
		 * System.out.println(Arrays.toString(chars));
		 * System.out.println(Arrays.toString(names));
		 */
		//System.out.println("-----selection sort---");
		//(numbers);
		System.out.println("----insertion sort");
		selectionSort(numbers);
		
	}

	// {2,5,1,8,9,43,32,13,33}
	public static void selectionSort(int[] numArray) {
		int temp;
		int index = 0;
		for (int i = 0; i < numArray.length; i++) {
			temp = numArray[i];
			index = i;
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[index] > numArray[j]) {

					index = j;
				}
			}

			numArray[i] = numArray[index];
			numArray[index] = temp;

		}

		for (int i : numArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	// {2,5,1,8,9,43,32,13,33}
	public static void insertionSort(int[] arr) {
		int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
	}
        for (int i : arr) {
			System.out.println(i+" ");
		}
	}
	
	

	
}

























