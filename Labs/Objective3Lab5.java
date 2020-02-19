import java.util.Scanner;

public class Objective3Lab5 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number. ");
        num1 = input.nextDouble();

        System.out.print("Please enter another number: ");
        num2 = input.nextDouble();

        System.out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2));
        input.close();
    
    }

}
