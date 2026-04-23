import java.lang.Exception;

public class ExceedsLimitException extends Exception{

    public ExceedsLimitException(String message){
        super(message);
    }
}
