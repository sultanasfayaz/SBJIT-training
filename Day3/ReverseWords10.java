package Day3;

import java.util.Scanner;

public class ReverseWords10 {
    public static void main(String[] args) {
    	
    	Scanner scanner=new Scanner(System.in);
    	
    	System.out.println("Enter the Sentence:");
    	String sentence=scanner.nextLine();
    	
    	String[] words=sentence.split(" ");
    	
    	StringBuilder reversedSentence=new StringBuilder();
    	
        for(int i=words.length-1; i>=0; i--) {
        	reversedSentence.append(words[i]).append(" ");
        }
        System.out.println("Reversed sentence:");
        System.out.println(reversedSentence.toString().trim());

        scanner.close();
    }
}
