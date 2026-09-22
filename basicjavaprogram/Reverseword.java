package basicjavaprogram;

public class Reverseword {

	public static void main(String[] args) {
		String input = "my name is shilpa";
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }

        System.out.println("Output: " + result.trim());
    }


	}


