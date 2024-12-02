package E92to94;

public class BasicAccount extends BankAccount{
    public BasicAccount(String name, long ID, double amount) {
        super(name, ID, amount);
    }

    @Override
    public void withdraw(double amount) {
        amount += 30;
        if(getAmount() < amount){
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("Withdraw request successful.");
            super.withdraw(amount);
        }
    }
}
