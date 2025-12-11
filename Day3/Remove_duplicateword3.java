package Day3;

public class Remove_duplicateword3 {
    public static void main(String[] args) {
        String sentence = "java program to remove duplicate words java program";

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }

           
            if (!isDuplicate) {
                result += words[i] + " ";
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Without duplicates: " + result.trim());
    }
}
