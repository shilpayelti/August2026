package basicjavaprogram;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){;

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String reversedStr = "";

        // Iterate through the string from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {
           reversedStr += str.charAt(i);
        
        }
    }
    }
}