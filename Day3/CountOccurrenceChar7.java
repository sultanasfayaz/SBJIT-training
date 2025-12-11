package Day3;

import java.util.Scanner;
public class CountOccurrenceChar7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String words = sc.nextLine();

        System.out.print("Enter the character to count: ");
        char character = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == character) {
                count++;
            }
        }

        System.out.println("The character '" + character + "' occurs " + count + " times.");

        sc.close();
    }
}

