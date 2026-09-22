package basicjavaprogram;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		long factorial = fact(num);
		System.out.println("factorial of " + num + " = " +factorial);
	}

   public static long fact(int num)
{
	if (num == 1) {
		// System.out.println("factorial (" +num + ") = 1\n");
	return 1;
	
	}
	else
		//System.out.println("factorial (" +num + ") = "+num+ "  *factirial" +)
return num * fact(num - 1);
}

}
