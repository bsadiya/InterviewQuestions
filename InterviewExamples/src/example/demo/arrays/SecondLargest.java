package example.demo.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] a = {20, 5, 40, 7, 300, 10};
		
		int max = max(a);
		
		for (int i=0; i<a.length; i++) {
			if (a[i] == max)
			a[i]=0;
		}
		int secondMax = max(a);
		
		System.out.println(secondMax);
		
//		 using Build-in Methods
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println(a[a.length-2]);
		
	}

	private static int max(int[] a) {
		int max = 0;
		for(int i : a) {
			if(i > max) max = i;
		}
		return max;
		
	}

}
