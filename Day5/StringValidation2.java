package day5;

class InvalidUsernameException extends Exception {
    InvalidUsernameException(String message) {
        super(message);
    }
}

public class StringValidation2 {

    public static void main(String[] args) {

        String username = "Sultana";

        try {
            validateUsername(username);
            System.out.println("Registration successful");
        } catch (InvalidUsernameException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void validateUsername(String username)
            throws InvalidUsernameException {

        if (username.contains(" ")) {
            throw new InvalidUsernameException("Username should not contain spaces");
        }

        if (username.length() < 5) {
            throw new InvalidUsernameException("Username must be at least 5 characters");
        }
    }
}

