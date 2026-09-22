package basicjavaprogram;

public class Array {

	public static void main(String[] args) {
		int a[] = new int[5];{
		System.out.println("elements of the array");
		for (int j=0; j<=5; j++)
		System.out.println("a[" + j +  "]= " + a[j]);

	}		
	// storing the values in array 
for(int i=0; i<=5; i++) {
	a[i] = i;

}
System.out.println("elements of the array");
for (int j=0; j<=5; j++)
System.out.println("a[" + j +  "]= " + a[j]);

}
}
