public class TransferService {

    public void processTransfer(double amount) throws InvalidAmountException, ExceedsLimitException{
        if (amount <= 0){
            throw new InvalidAmountException("Transfer amount is too low");
        }
        else if (amount > 1000){
            throw new ExceedsLimitException("Transfer amount is too high");
        }
        System.out.println("Transfer of " + amount + " successful");
    }

    public void runTest(){
        try {
            processTransfer(1500);
        }
        catch (InvalidAmountException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (ExceedsLimitException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        finally{
            System.out.println("Transaction log updated");
        }
    }
}
