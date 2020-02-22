import java.util.Scanner;

public class Objective6Lab5 {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        while(true) {
            System.out.println("____Menu____");
            System.out.println("1: Say Hello");
            System.out.println("2: List My Favorte Foods");
            System.out.println("3: Exit");
            System.out.println();
            
            System.out.print("Choice: ");
            selection = scanner.nextInt();

            if(selection == 1) {
                System.out.println("Hello");
            } else if(selection == 2) {
                System.out.println("Tacos, Curry, Hotdogs");
            } else if (selection == 3) {
                System.out.println("Good-Bye");
                break;
            }
        }
    }
}
