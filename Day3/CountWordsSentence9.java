package Day3;

import java.util.Scanner;

public class CountWordsSentence9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        int count = (sentence.trim().isEmpty()) ? 0 : words.length;

        System.out.println("Number of words: " + count);

        sc.close();
    }
}
