import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        double x, y;
        

        System.out.print("Are you ready? (yes/no)\n" );
        System.out.print("> ");
        String isReady = keyboard.next();
        
        while(!isReady.equalsIgnoreCase("yes")) {
            System.out.println("We can't move on until you are ready.");
            System.out.println("are you ready now?");
            System.out.print("> ");
            isReady = keyboard.next();
        }

        System.out.print("Give me a number, and I'll find it's square root. ");
        System.out.print("(No negatives please.) ");
        x = keyboard.nextDouble();
        
        while(x < 0) {
            System.out.println("I wont't take the sqaure root of a negative.");
            System.out.print("\nNew number: ");
            x = keyboard.nextDouble();
        }

        y = Math.sqrt(x);

        System.out.println("The square root of " + x + " is " + String.format("%.2f", y));
    }
}
