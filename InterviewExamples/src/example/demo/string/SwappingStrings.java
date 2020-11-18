package example.demo.string;

public class SwappingStrings {

	public static void main(String[] args) {
		
//		String Swapping
		String s1 = "Sadiya";
		String s2 = "Raju";
		
		String temp = null;
		temp = s1;
		s1=s2;
		s2= temp;
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		// Swap without Temp:
		// Declare two strings 
        String a = "Hello"; 
        String b = "World"; 
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
        // append 2nd string to 1st 
        a = a + b; 
          System.out.println(a);
        // store intial string a in string b 
        b = a.substring(0,a.length()-b.length()); 
        System.out.println(b);
        // store initial string b in string a 
        a = a.substring(b.length()); 
        System.out.println(a);
        // print String after swapping 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b); 

	}

}
