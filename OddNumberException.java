import java.util.Scanner;

public class OddNumberException {
    public static void main(String[] args){
        /* Write a Java program to create a method that takes an integer 
        as a parameter and throws an exception if the number is odd */
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sinput.nextInt();
        validateEvenNumber(num1);

        sinput.close();
    }

    public static void validateEvenNumber(int num){
        if (num % 2 != 0){
            throw new IllegalArgumentException(num + " is odd");
        }
        else {
            System.out.println("Accepted - number is even");
        }
    }
}
