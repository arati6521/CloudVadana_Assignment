import java.util.Scanner;

public class solution3 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    // Function to check if the input is a pangram
    private static boolean isPangram(String s) {
        // Assuming ASCII values for a-z (97-122)
        boolean[] alphabetPresent = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}


/*

Enter a sentence: qwertyuioplkjhgfdsazxcvbnm
The input is a pangram.

Enter a sentence: zxcvbnm
The input is not a pangram.

Enter a sentence: The quick brown fox jumps over the lazy dog
The input is a pangram.

Enter a sentence: this is a pangram program
The input is not a pangram.

*/