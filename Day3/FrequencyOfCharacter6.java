package Day3;


import java.util.Scanner;

public class FrequencyOfCharacter6 {
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.print("Enter a String:");
    	String stringdemo=sc.nextLine();
    	
    	int[] frequency=new int[256]; // ASCII size
    	char[] characters=stringdemo.toCharArray();
    	for(char chardemo:characters) {
    		frequency[chardemo]++;
    	}

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("'" + (char) i + "' = " + frequency[i]);
            }
        }

        sc.close();
    }
}
