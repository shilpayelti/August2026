package basicjavaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from user
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        bubblesort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void bubblesort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if adjacent element is smaller
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in inner loop, array is already sorted
            if (!swapped) {
                break;
            }
        }
   
	}

}
