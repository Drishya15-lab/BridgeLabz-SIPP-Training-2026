class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited " + amount);
    }

    // Withdraw with overdraft check
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew " + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }

    // Statement
    public void getStatement() {
        System.out.println("Account: " + accountNumber +
                           ", Holder: " + holder +
                           ", Balance: " + balance);
    }

    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // Create 3 accounts
        BankAccount a1 = new BankAccount(101, "Drishya", 5000);
        BankAccount a2 = new BankAccount(102, "skand", 3000);
        BankAccount a3 = new BankAccount(103, "aditi", 7000);

        // Simulate 5 transactions each
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.withdraw(7000); // overdraft check
        a1.deposit(500);
        a1.getStatement();

        a2.withdraw(500);
        a2.deposit(1500);
        a2.withdraw(4000); // overdraft check
        a2.deposit(200);
        a2.getStatement();

        a3.deposit(1000);
        a3.withdraw(2000);
        a3.deposit(500);
        a3.withdraw(3000);
        a3.getStatement();

        System.out.println("Total Accounts Created = " + BankAccount.getTotalAccounts());
    }
}

