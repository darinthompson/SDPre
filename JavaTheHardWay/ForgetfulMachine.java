import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France?");
        keyboard.next();

        System.out.println("What is 6 multiplied by 7?");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 1.0");
        keyboard.nextDouble();

        System.out.println("Is there anything else you would like to say?");
        keyboard.next();

        // On the first question it blew up because I put a space between my answer.
        // On the second question it blew up because I typed the word forty-two instead of the number 42
        // On the third question it blew up when I typed another word "shotput" instead of a number
    }
    

}
