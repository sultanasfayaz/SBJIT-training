package Day3;

public class Reverse_string4 {                                 
    public static void main(String[] args) {
        String words = "Hello World";

        String reversed = new StringBuilder(words).reverse().toString();

        System.out.println("Original: " + words);
        System.out.print("Reversed: " + reversed);
    }
}
