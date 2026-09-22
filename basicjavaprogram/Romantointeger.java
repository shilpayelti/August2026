package basicjavaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Romantointeger {

	public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase();

        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);

        scanner.close();
    
	
	}
	public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = map.get(s.charAt(i));
            if (i < s.length() - 1 && currentVal < map.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        return total;
}
}
