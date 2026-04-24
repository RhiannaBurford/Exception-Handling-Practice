public class BankAccount {

    private double balance;

    public void withdraw(double amount) throws InsufficientFundsException2{
        if (amount > balance){
            throw new InsufficientFundsException2("You do not have enough money in your account.");
        }
        balance = balance - amount;
    }

    public void checkFunds(double amount){
        try {
            withdraw(amount);
        }
        catch(InsufficientFundsException2 e){
            System.out.println("ERROR " + e.getMessage());
        }
    }
}
