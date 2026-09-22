package basicjavaprogram;

public class Twoboolean {

	public static void main(String[] args) {
		boolean a = false;
		boolean b= false;
		boolean c= true;
		
		boolean result = atLeastTwoTrue(a, b, c);

        System.out.println("Are at least two booleans true? " + result);
    }

    public static boolean atLeastTwoTrue(boolean a, boolean b, boolean c) {
      
        return (a && b) || (b && c) || (a && c);
    }
}
