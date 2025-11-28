package module08._06polymorphism;

public class CheckingAccount extends Account{
    private double overdraftFee;

    public CheckingAccount(String name, double balance, double overdraftFee) {
        super(name, balance);
        this.overdraftFee = overdraftFee;
    }
}