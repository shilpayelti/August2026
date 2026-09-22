package basicjavaprogram;

import java.util.Arrays;

public class Minandmax {
	
	// min and max values of array 

	public static void main(String[] args) {
	int a[] = { 23,3,56,78,100, 24};
	int min = a[0];
	int max=  a[0];
	 int  i;
	 
for  (i=1; i< a.length; i++);
{
	if (a[i] < min) 
	{
        min = a[i];
    }
    if (a[i] > max) 
    {
        max = a[i];
    }


System.out.println("Array: " + Arrays.toString(a));
System.out.println("Minimum Value: " + min);
System.out.println("Maximum Value: " + max);
}

}}

