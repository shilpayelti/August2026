package basicjavaprogram;
 
import java.util.Scanner;
 
public class Nameagegenderandadress {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
System.out.print("enter the name , age, gender ,address:  ");
String  a = scanner.next(); 
int b = scanner.nextInt(); 
String gender = scanner.next(); 
String address = scanner.nextLine();


	

	System.out.println("name :"  +a);
	System.out.println("age :"  +b);
	System.out.println("gender :"  +gender);
	System.out.println("address :"  +address);

scanner.close();
}
}