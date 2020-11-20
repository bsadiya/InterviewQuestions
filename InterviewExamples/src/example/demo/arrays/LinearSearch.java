package example.demo.arrays;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {12,23,34,45,56,78,89};
		int key = 89;
		
		searchKey(a, key);
		
		searchPosition(a, key);
		

	}

	private static void searchPosition(int[] a, int key) {
		System.out.println("Input Array:  "+Arrays.toString(a));
		
		// print the position of search key if present
		for(int i = 0; i < a.length; i++) {
			if(key == a[i]) {
				System.out.println("Seach Key: "+key +" Found at Position : "+(i+1));
				break;
			}
			System.out.println(i);
		}
	}

	private static void searchKey(int[] a, int key) {
		System.out.println("Input Array:  "+Arrays.toString(a));
		
		// Chk the key is present or not
		boolean found = false;
		for(int i : a) {
			if(key == i) {
				found  = true;
				break;
			}
		}
		if(found) {
			System.out.println("Seach Key Found");
		}
		else {
			System.out.println("Seach Key Not Found");
		}
	}

}
