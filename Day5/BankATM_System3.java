package day5;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientBalanceException, InvalidAmountException {

        if (amount < 0) {
            throw new InvalidAmountException("Invalid Amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class BankATM_System3 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(2000);
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}

