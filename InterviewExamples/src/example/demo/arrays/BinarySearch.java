package example.demo.arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(a));
		int key = 3;
		
//		myLogic(a);
		
		binarySearchUsingLoop(a, key);
		
		System.out.println("-----------Binary Search Using Recursion--------");
		int first = 0, last = a.length-1;
		int position = binarySearchUsingRecursion(a, key, first, last);
		System.out.println("*******Key Found at :"+(position+1));
		
		
	}

	private static int binarySearchUsingRecursion(int[] a, int key, int first, int last) {

		if(first < last) {
			int mid= (first+last)/2;
			System.out.println("Medium Value: "+mid);
			if(key == a[mid]) return mid;
			
			if(key > a[mid]) {
				first = mid+1;
				return binarySearchUsingRecursion(a, key, first, last);
			}
			if(key < a[mid]) {
				last = mid-1;
				return binarySearchUsingRecursion(a, key, first, last);
			}
			
		}
		return -1;
		
		
	}

	private static void binarySearchUsingLoop(int[] a, int key) {
		
		System.out.println("-----------Binary Search Using Loop-------------");
		int low = 0;
		int high = a.length-1;
		
		while(low < high) {
			int med = (low+high)/2;
			System.out.println("Medium Value: "+med);
			if(key == a[med]) {
				System.out.println("######Key Found..at "+a[med] ); return;
			}
			if(key > a[med]) {
				low = med+1;
			}
			if(key < a[med]) {
				high = med-1;
			}
		}
	}

	private static void myLogic(int[] a) {
		int key = 8;
		int n = a.length;
		int l=0, m=n/2, h = n;
		
		if(key == a[l]) {
			System.out.println("****Key Found at position: "+(l+1));
		}
		else if(key == a[m]) {
			System.out.println("#####Key Found at position: "+(m+1));
		}
		else if(key == a[h-1]) {
			System.out.println("@@@@@@@Key Found at position: "+(h));
		}
		else {
			if(key > a[m]) {
				l = m+1;
			}
			else {
				h = m-1;
			}
			for(int i=l ; i < h; i++) {
				System.out.println(i);
				if(key == a[i]) {
					System.out.println("$$$$$$Key Found at position : "+ (i+1));
					break;
				}
			}
		}
	}
	
}
