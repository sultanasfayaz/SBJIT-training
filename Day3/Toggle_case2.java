package Day3;
public class Toggle_case2 {
    public static void main(String[] args) {
        String message = "Hello World";
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            char value = message.charAt(i);

            if (Character.isUpperCase(value)) {
                result += Character.toLowerCase(value);
            } else if (Character.isLowerCase(value)) {
                result += Character.toUpperCase(value);
            } else {
                result += value; 
            }
        }

        System.out.println("Toggled string: " + result);
    }
}



