import java.util.Scanner;

public class tetris {
    public static void main(String[] args) {
        printL(); 
        System.out.println();
        printJ();
        System.out.println();
        printBox();
        System.out.println();
        printT(); 
        System.out.println();
        printI();
        System.out.println();
        printZ();
    }

    static void printL() {
        System.out.println("O");
        System.out.println("O");
        System.out.println("O O");
    }
   
    static void printI() {
        System.out.println("O");
        System.out.println("O");
        System.out.println("O");
        System.out.println("O");
    } 
    
    static void printJ() {
        System.out.println("  O");
        System.out.println("  O");
        System.out.println("O O");
    }

    static void printBox() {
        System.out.println("O O");
        System.out.println("O O");
    }

    static void printT() {
        System.out.println("  O  ");
        System.out.println("O O O");
    }

    static void printZ() {
        System.out.println("O O");
        System.out.println("  O O");
    }
}
