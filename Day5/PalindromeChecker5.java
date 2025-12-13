package day5;


class EmptyStringException extends Exception {
 public EmptyStringException(String message) {
     super(message);
 }
}

public class PalindromeChecker5 {

 public static void main(String[] args) {
     try {
         checkPalindrome("racecar");
         checkPalindrome("hello");
         checkPalindrome("");         
            
     } catch (EmptyStringException exception) {
         System.out.println(exception.getMessage());
     }
 }
 public static void checkPalindrome(String string) throws EmptyStringException {
     if (string == null || string.isEmpty()) {
         throw new EmptyStringException("Input string is empty!");
     }

     String reversed = new StringBuilder(string).reverse().toString();

     if (string.equals(reversed)) {
         System.out.println("Palindrome");
     } else {
         System.out.println("Not Palindrome");
     }
 }
}
