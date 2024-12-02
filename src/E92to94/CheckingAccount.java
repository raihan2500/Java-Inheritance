package E92to94;

public class CheckingAccount extends BasicAccount{
    private int withdrawCount;
    public CheckingAccount(String name, long ID, double amount) {
        super(name, ID, amount);
    }
    @Override
    public void withdraw(double amount) {
        double penalty = 30;
        if(withdrawCount == 0){
            withdrawCount++;
            penalty = 20;
        }

        if(getAmount() < amount){
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("Withdraw request successful.");
            super.withdraw(amount);
        }
    }
}
