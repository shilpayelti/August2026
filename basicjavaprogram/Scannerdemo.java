
package basicjavaprogram;

import java.util.Scanner;
public class Scannerdemo {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("enter the first number :  ");
		int a = reader.nextInt();
		
		System.out.println("enter the second number :  ");
		int b = reader.nextInt();
		
		System.out.println("enter the third number :  ");
		int c = reader.nextInt();
		
int sum = a+b+c;
int avg = (a+b+c)/3;


System.out.println("the sum of 3  numbers :  " + sum );
System.out.println("the ave of 3  number :  " + avg );
	 reader.close();
	}
	

	}

