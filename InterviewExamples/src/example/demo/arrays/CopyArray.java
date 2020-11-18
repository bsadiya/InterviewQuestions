package example.demo.arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,60,90};
		System.out.println(Arrays.toString(a));
		
		// Using Built-in method
		int[] b = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));
		
		
		// without- Using Built-in method
		int[] c = new int[a.length];
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
