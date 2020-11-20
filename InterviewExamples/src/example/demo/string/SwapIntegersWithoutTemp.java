package example.demo.string;

public class SwapIntegersWithoutTemp {

	public static void main(String[] args) {

		
		
		// Using Temp
		int i =1;
		int j= 2;
		
		int t;
		t=i;
		i=j;
		j=t;
		
//		System.out.println("i: "+i + " j: "+ j);
				
		
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b; // (a + b) - b = a
		a = a - b; // (a+b) - a = b
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
