package example.demo.arrays;

public class MinMax {

	public static void main(String[] args) {
		
		int[] a = {20, 5, 40, 7, 300, 10};
		
//		min-max Element:
		int min, max;
		min = max = a[0];
		for(int i : a) {
			if(i<min) min=i;
			if(i>max) max=i;
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);

	}

}
