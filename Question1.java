import java.util.Scanner;
import java.util.InputMismatchException;

public class Question1 {

    public static void main(String[] args){
        /* Write a Java program that throws an exception and catch it 
        using a try-catch block. */
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int num = sinput.nextInt();
            System.out.println("You entered: " + num);
        }
        catch (InputMismatchException e){
            System.out.println("ERROR: you must enter an integer ");
        }
        sinput.close();
    }
}
