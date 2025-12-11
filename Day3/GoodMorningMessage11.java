package Day3;

public class GoodMorningMessage11 {
    public static void main(String[] args) {
        String input = "Good Morning";

        String[] words = input.split(" ");
        
        if (words.length == 2) {

            char firstLetter = words[0].charAt(0);

            char secondLetter = words[0].charAt(1);

            char thirdLetter = words[1].charAt(words[1].length() - 2);

            char fourthLetter = words[1].charAt(words[1].length() - 1);

            String result = "" + firstLetter + secondLetter + thirdLetter + fourthLetter;
            
            System.out.println("Converted string: " + result);
        } else {
            System.out.println("Input string format not recognized.");
        }
    }
}
