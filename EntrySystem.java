public class EntrySystem {

    public void verifyEntry(int age, String id) throws UnderageException, InvalidIDException{
        if (age < 18){
            throw new UnderageException("You are too young.");
        }
        else if (id == null || id.equals(" ")){
            throw new InvalidIDException("No ID was provided.");
        }
        System.out.println("Entry granted");
    }

    public void start(){
        try {
            verifyEntry(20, null);
        }
        catch (UnderageException e){
            System.out.println("ERROR" + e.getMessage());
        }
        catch (InvalidIDException e){
            System.out.println("ERROR" + e.getMessage());
        }
        finally{
            System.out.println("Verification attempt finished");
        }
    }
}
