package E92to94;

public class BankAccount {
    private String name;
    private long ID;
    private double amount;

    public BankAccount(String name, long ID, double amount) {
        this.name = name;
        this.ID = ID;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public long getID() {
        return ID;
    }

    public double getAmount() {
        return amount;
    }

    public void withdraw(double amount){
        this.amount -= amount;
    }

    public void deposit(double amount){
        this.amount += amount;
    }

    public void displayInformation(){
        System.out.println("Name: " +  name);
        System.out.println("ID: " + ID);
        System.out.println("Balance: " + amount);
    }
}
