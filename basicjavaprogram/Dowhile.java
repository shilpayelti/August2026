package basicjavaprogram;

public class Dowhile {

	public static void main(String[] args) {
		int i,sum ;
		i= 3;
		sum = 0;
		do {
			sum = sum +i;
			i++;
			
		}
		while (i <=5);
	
		System.out.println("the sum of number :" +sum);
		

	}

}
