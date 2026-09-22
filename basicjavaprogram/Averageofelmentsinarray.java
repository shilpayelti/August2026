package basicjavaprogram;
 
import java.util.Arrays;
 
public class Averageofelmentsinarray {
	
	//find the average of all the elements of an array

	public static void main(String[] args) {
	
double  a[] = {12,34,56,32,56};
double sum = 0;
 
for (double num: a) {
	

sum += num;

}
double average = (double) sum / a.length;

System.out.println("sum: " + sum );
	System.out.println(" average :" + average);
 

	}
}

