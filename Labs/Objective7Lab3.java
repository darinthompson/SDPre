import java.util.Scanner;

public class Objective7Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        while(true) {
            printMenu();
            selection = scanner.nextInt();
            if(selection == 1) {
                System.out.println("Hello Human!\n");
            } else if(selection == 2) {
                System.out.println("My Favorite Foods Are: Tacos, Curry, and Hotdogs.\n");
            } else if(selection == 3){
                System.out.println("Good-Bye!");
                break;
            } 

        }

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("____Menu____");
        System.out.println("1: Say Hello");
        System.out.println("2: List My Favorite Foods");
        System.out.println("3: Exit");
        System.out.println();
        System.out.print("Choice: ");
    }
}
