package coding_task;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
        	System.out.println("Invalid balance");
        }
        this.balance = initialBalance;
        
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
    
        BankAccount ba = new BankAccount(1000);
        ba.deposit(500);
        System.out.println("Balance after deposit: " + ba.getBalance());

        ba.withdraw(200);
        System.out.println("Balance after withdrawal: " + ba.getBalance());
    }
}