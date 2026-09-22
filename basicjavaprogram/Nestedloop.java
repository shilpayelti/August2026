package basicjavaprogram;


/* to print the pattern for 
12345
12345
12345
12345
12345  */


public class Nestedloop {

	public static void main(String[] args) {
	/* for (int i=1; i<=5; i++){
		 System.out.println("");
		  {
	  for (int j=1; j<=5; j++){
	  System.out.print(j);

	}
//System.out.println(" ");
		  } 
}	


// to print 1
/*
 * 1111
 * 111
 * 11
 * 1
 
 for (int i=4;i>0;i--) {
	for (int j=1;j<=i;j++) {
		  System.out.print("1");
	}
	  System.out.println("");
}
*/
	 
	  
	  // to print the * pattern 
		
		/*  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  ****
		 *  ***
		 *  **
		 *  *
		 */
for (int i=1; i<=5; i++){

 for (int j=1; j<=i; j++){
 System.out.print("*");

}
System.out.println("");
	  } 
	


for (int i=4;i>0;i--) {
for (int j=1;j<=i;j++) {
	  System.out.print("*");
}
 System.out.println("");
}
}

}


