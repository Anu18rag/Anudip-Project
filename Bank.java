public class Bank {
    private double amount;

    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount) ? "Withdrawal successful" : "Insufficient funds";
        System.out.println(message);
        amount = (amount >= withdrawalAmount) ? amount - withdrawalAmount : amount;
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public double getBalance() {
        return amount;
    }

    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        bank.withdraw(500);
        bank.deposit(5000);
        System.out.println("Total balance: " + bank.getBalance());
    }
}
