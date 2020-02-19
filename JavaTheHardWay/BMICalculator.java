import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi;
        double in, lb;
        int feet, inches, totalInches;

        // d(m) = d(") * 0.0254
        //kgs = lbs/2.2
        System.out.print("Your Height (feet): ");
        feet = keyboard.nextInt();
        System.out.print("Your Height(inches): ");
        inches = keyboard.nextInt();

        totalInches = (inches + (feet * 12));
        //in = keyboard.nextDouble();
        
        m = totalInches * 0.0254; 
        //System.out.print("Your height in m: ");
        //m = keyboard.nextDouble();

        System.out.print("What is your weight in pounds? ");
        lb = keyboard.nextDouble();
        kg = lb / 2.2;

        //System.out.print("Your weight in kg: ");
        //kg = keyboard.nextDouble();

        bmi = kg/(m*m);

        System.out.println("Your BMI is " + String.format("%.2f", bmi));
    }
}
