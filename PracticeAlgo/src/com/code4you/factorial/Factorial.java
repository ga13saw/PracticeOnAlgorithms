package com.code4you.factorial;

public class Factorial {
	
	public static void main(String[] args) {
		long facttorialValue = factorial(19);
		System.out.println(facttorialValue);
		
		//fibbonaci(2);
		//fibbonacci2(10);
		//System.out.println(fibonacci3(5));
		System.out.println(digitsInFactorial(19));
	}

	private static void fibbonaci(int count) {
		
		
		if (count ==0) {
			System.out.println("0");
		}else if(count==1 ){
			System.out.println("0 1");
		}
		else{
			int[] fibbo = new int[count];
			fibbo[0]=0;
			fibbo[1]=1;
		for (int i = 2; i < fibbo.length; i++) {
			fibbo[i] = fibbo[i-1]+fibbo[i-2];
			
		}
		for (int i : fibbo) {
			System.out.print(i+" ");
		}
		System.out.println();
		}
		
	}
	
	private static void fibbonacci2(int count) {
		int temp;
		int previous=0;
		int current = 1;
		
		for (int i = 0; i < count; i++) {
			System.out.print(previous+" ");
			temp = previous;
			previous = current;
			current = previous + temp;
		}
		System.out.println();
	}
	
	private static int fibonacci3(int count) {
		if (count < 2) {
			return count;
		}
		
		return fibonacci3(count-1) + fibonacci3(count-2);
	}

	private static long factorial(int number) {

		if (number == 0 || number ==1) {
			return 1;
		}
		//120
		return number * factorial(number-1);
	}
	public static int digitsInFactorial(int N){
        // code here
        int digitCount=0;
        //for grater value use long
        long factValue = factorial(N);
        while(factValue>0){
            factValue=factValue/10;
            digitCount++;
        }
        return digitCount;
    }
	
}
