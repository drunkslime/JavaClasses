public class BankAccount {
    private double balance = 0;
    
    public void depositMoney(double value) {
        this.balance += value;
    }

    public void withdrawMoney(double value) {
        double oldBalance = this.balance;
        try {
            this.balance -= value;
            if (this.balance < 0) {
                throw new Exception("Inuficient funds.");
            }
        } catch (Exception e){
            this.balance = oldBalance;
            System.out.println("Transfer not possible: " + e.getMessage() + " \nBalance: " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}