package E92to94;

public class Runner {
    public static void main(String[] args) {
        BasicAccount user = new BasicAccount("Raihan Ahmed", 101, 500);
        user.displayInformation();
        user.deposit(34223);
        user.displayInformation();
        user.withdraw(23492);
        user.displayInformation();

        CheckingAccount user1 = new CheckingAccount("Bulbul Islam", 118, 10);
        user1.withdraw(33);

    }
}