package example.demo.arrays;

public class FebinacciSeries {


	public static void main(String[] args) {
		
		int lengthOfSeries = 10;
		int first=0;
		int second =1;
		
		usingLoop(lengthOfSeries, first, second);
		
		usingRecursion(lengthOfSeries, first, second);
		

	}

	private static void usingRecursion(int lengthOfSeries, int first, int second) {
		if(lengthOfSeries > 2) {
		int feb=first+second;
		System.out.println(feb);
		first = second;
		second = feb;
		usingRecursion(--lengthOfSeries, first,  second);
		
		}
		
	}

	private static void usingLoop(int lengthOfSeries, int first, int second) {
		System.out.println(first);
		System.out.println(second);
		for(int i = 3; i<=lengthOfSeries; i++) {
			int feb = first + second;
			System.out.println(feb);
			first = second;
			second = feb;
		}
	}

}
