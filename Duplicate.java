import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class Duplicate {
    /* Write a Java program that reads a list of integers from 
    the user and throws an exception if any numbers are duplicates*/ 
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter an integer (-1 to quit): ");
        int num = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        while (num != -1){
            try {
                num = sinput.nextInt();
                for (int i = 0; i < list.size(); i++){
                    if (list.get(i) == num){
                        // Next time, create a custom made exception
                        throw new IllegalArgumentException("You have already entered " + num);
                    }
                }
                list.add(num);            
            }
            catch (InputMismatchException e){
                System.out.println("ERROR: You must enter an integer. ");
            }
        }
        sinput.close();
    }
}
