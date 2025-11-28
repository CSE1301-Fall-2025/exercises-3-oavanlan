package module08._06polymorphism;

public class Account 
{
    private String name;
    private double balance;

    public Account(String name, double balance)
    {
       this.name = name;
       this.balance = balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public double withDraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            return amount;
        } else {
            this.balance = 0;
            return this.balance;
        }
    } 
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args)
    {
        
    }
}
