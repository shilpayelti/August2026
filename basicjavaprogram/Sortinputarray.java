package basicjavaprogram;

import java.util.Arrays;

public class Sortinputarray {

	
	// Sort a numeric array and a string array


	public static void main(String[] args) {
		
		int a[]= {4,56,67,32,12,4};
		
    String s[]= {"abc","wer","acx","zee","aqw"};
   
   Arrays.sort(a);
   Arrays.sort(s);
  
   
   System.out.println("Sorted Numeric Array: " + Arrays.toString(a));
   System.out.println("Sorted String Array: " + Arrays.toString(s));

	}
	

}
