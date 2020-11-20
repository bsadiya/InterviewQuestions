package example.demo.arrays;

import java.util.Arrays;

public class FibonacciSeries {


	public static void main(String[] args) {
		
		int lengthOfSeries = 10;
		int first=0;
		int second =1;
		
		int key = 56;
		
//		usingLoop(lengthOfSeries, first, second);
		
//		usingLoopEffectively(lengthOfSeries, first, second); // storing result in array
		
//		usingRecursion(lengthOfSeries, first, second);
		
//		usingRecursionEffectively(lengthOfSeries, first, second);
		
		findNthFib(lengthOfSeries, key);

	}

	private static void findNthFib(int lengthOfSeries, int key) {
		boolean found= false;
		int f1 =0;
		int f2 = 1;
		for(int i =0 ; i < lengthOfSeries; i++) {
			int f3= f1+f2;
			f1=f2;
			f2=f3;
			if(key == f3) { 
				found = true;
			}
			
		}
		
		if(found) {
			System.out.println("Key: "+key + " is a Fibonnaci Number");
		}
		else {
			System.out.println("Key: "+key + " is Not a Fibonnaci Number");
		}
		
	}

	private static void usingLoopEffectively(int lengthOfSeries, int first, int second) {
		int a[] = new int[lengthOfSeries];
		a[0] = 0;
		a[1] = 1;
		for(int i=2; i<lengthOfSeries; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		System.out.println(Arrays.toString(a));
		
	}

	private static void usingRecursionEffectively(int lengthOfSeries, int first, int second) {

		for(int i=0; i<lengthOfSeries; i++) {
			System.out.println(fib(i));
		}

		
	}
	
	static int fib(int n) {
		if(n <=1 ) {
			return n;
		}
		System.out.println("n: "+n);
		return fib(n-1)+fib(n-2);
	}

	private static void usingRecursion(int lengthOfSeries, int first, int second) {
		int i=1;
		if(lengthOfSeries > 2) {
		int feb=first+second;
		System.out.println(feb);
		first = second;
		second = feb;
		System.out.println("Iteration: "+ i++);
		usingRecursion(--lengthOfSeries, first,  second);
		}
		
	}

	private static void usingLoop(int lengthOfSeries, int first, int second) {
		System.out.println(first);
		System.out.println(second);
		for(int i = 3; i<=lengthOfSeries; i++) {
			int sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;
		}
	}

}
