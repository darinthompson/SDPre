import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userNum;

        System.out.print("Enter a number: ");
        userNum = scan.nextDouble();

        if(userNum % 2 == 0){
            System.out.println("The Number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
