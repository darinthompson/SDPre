import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin, entry;
        
        String password, userPassGuess;
        password = "password";
        pin = 12345;
        

        System.out.println("WELCOME TO THE BANK OF JAVA.");
        System.out.println("ENTER YOUR PASSWORD.");
        userPassGuess = keyboard.next();

        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();

        while((entry != pin) || (! userPassGuess.equals(password)))  {
            System.out.println("\nINCORRECT PIN AND/OR PASSWORD. TRY AGAIN!");
            System.out.println("ENTER YOUR PASSWORD: ");
            userPassGuess = keyboard.next();
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        
        System.out.println("PIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
        
    }
}
