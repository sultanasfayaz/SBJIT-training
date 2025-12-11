package Day3;

import java.util.Scanner;

public class RemoveSpecificChar8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String words = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char character = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) != character) {
                result += words.charAt(i);
            }
        }

        System.out.println("String after removing '" + character + "': " + result);

        sc.close();
    }
}
