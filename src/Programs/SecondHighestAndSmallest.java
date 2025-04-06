package Programs;

import java.util.Arrays;

public class SecondHighestAndSmallest {
    private int;
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 19, 3, 5, 7};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        Arrays.sort(arr);

        int secondSmallest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Highest: " + secondHighest);
    }
}
