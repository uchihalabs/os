class BankAccount {

    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000);

        account.displayBalance();
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}
