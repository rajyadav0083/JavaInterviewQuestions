package Programs;

import java.util.Scanner;

public class ArrayIndexFinder {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to find its index: ");
        int element = scanner.nextInt();
        scanner.close();

        int index = -1; // Default value if element is not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + element + " found at index: " + index);
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }
    }
}
