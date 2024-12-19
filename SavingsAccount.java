public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String showAccountType() {
        return "Savings Account";
    }

    public double getInterestRate() {
        return 0.01;
    }

    public String showBenefits() {
        return "Standard Savings Account";
    }

    public double computeBalanceWithInterest() {
        return balance + balance * getInterestRate();
    }

    public String showInfo() {
        return String.join("\n", 
            "Account number: " + getAccountNumber(),
            "Account name: " + getAccountName(),
            "Balance: " + String.format("%.2f", getBalance())
        );
    }
}
