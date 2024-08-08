package java.eh.throws_throw_d4_d5;
 class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
 class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Available balance: " + balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
	public class Main {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(100.00);

	        try {
	            System.out.println("Attempting to withdraw $50...");
	            account.withdraw(50.00);
	            System.out.println("Withdrawal successful! Current balance: $" + account.getBalance());

	            System.out.println("Attempting to withdraw $60...");
	            account.withdraw(60.00);
	            System.out.println("Withdrawal successful! Current balance: $" + account.getBalance());
	        } catch (InsufficientFundsException e) {
	            System.err.println("Error: " + e.getMessage());
	        }

	        try {
	            System.out.println("Attempting to withdraw $70...");
	            account.withdraw(70.00);
	            System.out.println("Withdrawal successful! Current balance: $" + account.getBalance());
	        } catch (InsufficientFundsException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }
	
}
