package Programs;

public class ReverseStringManual {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}

// Using String builder
/*import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        scanner.close();

        // Using StringBuilder to reverse
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed String: " + reversed);
    }
}*/

