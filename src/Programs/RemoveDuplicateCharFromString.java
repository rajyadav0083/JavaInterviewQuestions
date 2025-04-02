package Programs;

import java.util.Scanner;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder uniqueStr = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII range

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                uniqueStr.append(ch);
                seen[ch] = true;
            }
        }

        return uniqueStr.toString();
    }
}

