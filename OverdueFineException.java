import java.lang.Exception;

public class OverdueFineException extends Exception{

    public OverdueFineException(String message){ // are there any other variants of this?
        super(message);
    }
}
