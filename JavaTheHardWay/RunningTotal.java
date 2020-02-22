import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int current, total = 0;
        boolean isZero = false;

        System.out.print("Type in a bunch of values and I'll add them up ");
        System.out.println("I'll stop when you type a 0");
        
         do {
            System.out.print("Enter a value: ");
            current = keyboard.nextInt();
            total += current;
            if (current == 0) {
                System.out.println("The final Total is: " + total);
                isZero = true;    
            } else {
                System.out.println("Current Total:  " + total);
            }    
        } while (!isZero);
    }
}
