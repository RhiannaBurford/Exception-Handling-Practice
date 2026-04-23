public class RegistrationManager {

    public void checkPassword(String password) throws InvalidPasswordException{
        if (password.length() < 8){
            throw new InvalidPasswordException("Password is not long enough");
        }
        System.out.println("Password accepted");
    }

    public void registerUser(){
        String input = "12345";
        try{
            checkPassword(input);
        }
        catch (InvalidPasswordException e){
            System.out.println("ERROR: " + e.getMessage() + ". Please try a longer password");
        }
        finally {
            System.out.println("Session closed");
        }
    }
}
