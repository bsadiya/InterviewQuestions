package example.demo.arrays;

import java.util.Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,10,60,90,30};
		System.out.println(Arrays.toString(a));
		
		// Finding Duplicates
		for(int i=0; i<a.length; i++) {
			int count = 0;
			for(int aa : a) {
//				System.out.println("a[i]: "+ a[i] + "  And aa: "+aa);
				if(a[i] == aa)count++;
			}
			System.out.println("a["+i+"] occurs: "+ count + " Times");
		}

	}

}
