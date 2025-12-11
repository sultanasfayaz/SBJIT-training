package Day3;

public class Count_vowels1 {
    public static void main(String[] args) {
    	String message="Hello World";
        int count = 0;

        for (int i = 0; i <message.length(); i++) {
            char character = message.charAt(i);

            if (character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||
            		character=='A'||character=='E'||character=='I'||character=='O'||character=='U') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}
