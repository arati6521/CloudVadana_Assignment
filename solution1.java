import java.util.Random;

public class solution1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        // Print the shuffled array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // Function to shuffle the array using Fisher-Yates algorithm
    private static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}


/*

Output:
2 5 4 7 1 3 6 

*/
