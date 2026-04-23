public class Account {

    private double balance = 500.00;


    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance){
            throw new InsufficientFundsException("There are not enough funds in your account");
        }
        balance -= amount;
    }

    public void transaction(){
        try {
            withdraw(600.00);
        }
        catch (InsufficientFundsException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
