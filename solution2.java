import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int result = romanToInteger(romanNumeral);

        if (result != -1) {
            System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
        } else {
            System.out.println("Invalid Roman numeral.");
        }

        scanner.close();
    }

    // Function to convert a Roman numeral to an integer
    private static int romanToInteger(String s) {
        if (s == null || s.length() == 0) {
            return -1; // Invalid input
        }

        // Define the values for each Roman numeral
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int result = 0;
        int index = 0;

        for (int i = 0; i < numerals.length; i++) {
            while (s.startsWith(numerals[i], index)) {
                result += values[i];
                index += numerals[i].length();
            }
        }

        // Check if the entire string is processed
        if (index == s.length()) {
            return result;
        } else {
            return -1; // Invalid input
        }
    }
}


/*

Enter a Roman numeral: X
The integer equivalent of X is: 10

Enter a Roman numeral: III
The integer equivalent of III is: 3

Enter a Roman numeral: M
The integer equivalent of M is: 1000

Enter a Roman numeral: XX
The integer equivalent of XX is: 20

Enter a Roman numeral: XVIII
The integer equivalent of XVIII is: 18

*/