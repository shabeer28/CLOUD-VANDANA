
1.
 -> Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
 -> Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
 -> Check if the input is pangram or not. (A pangram is a sentence that contains all the 
    alphabets from A to Z

code:
 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> myList = Arrays.asList(myArray);
        Collections.shuffle(myList);
        System.out.println("Shuffled Array: " + myList);

      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Task 2: Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int integerValue = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + integerValue);

       
        System.out.print("Task 3: Enter a sentence: ");
        String userSentence = scanner.nextLine();
        if (isPangram(userSentence)) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }
    }

   
    private static int romanToInteger(String s) {
        

        return 0; // Placeholder return value
    }

   
    private static boolean isPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            if (sentence.toLowerCase().indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}


