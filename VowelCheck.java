import java.util.Scanner;

public class VowelCheck {

    public static void main(String[] args){
        /* Write a Java program to create a method that takes a string as
        input and throws an exception if the string does not contain vowels.*/
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter a string: ");
        try {
            String input = sinput.nextLine();
            checkContainsVowels(input);
            System.out.println("Your input was accepted, thank you");
        }
        catch (RuntimeException e){
            System.out.println("ERROR: no vowels");
        }
        sinput.close();
    }

    public static void checkContainsVowels(String input){
        boolean containsVowels = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < input.length(); i++){
            for (int j = 0; j < vowels.length; j++){
                if (input.toLowerCase().charAt(i) == vowels[j]){
                    containsVowels = true;
                    break;
                }
            }
        }
        if (!containsVowels){
            throw new NoVowelsException("String does not contain any vowels");
        }
    }

    static class NoVowelsException extends RuntimeException{
        public NoVowelsException(String message){
            super(message);
        }
    }
}
