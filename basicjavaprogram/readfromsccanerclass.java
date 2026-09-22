package basicjavaprogram;

import java.util.Scanner;


public class readfromsccanerclass {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);	
	System.out.println(" enter the integer ");
	int a = reader.nextInt();
	
	System.out.println( "int value:" +a  );
	
   System.out.println(" enter the double");
double b= reader.nextDouble();
  System.out.println( "double value:" +b );
	
  System.out.println( "enter the float value");
  float f = reader.nextFloat();
  System.out.println(" float value :" +f);
  
  System.out.println( "enter the booelan" );
  boolean c = reader.hasNext();
  
  System.out.println( "boolean value:" +c  );
	
	
	float d= (float) (b%f * -2);
	System.out.println( d  );
	
	}

}
