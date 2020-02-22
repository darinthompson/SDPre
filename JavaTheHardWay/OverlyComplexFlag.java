import static java.lang.System.*;

public class OverlyComplexFlag {
    public static void main(String[] args) {
        printTopHalf();
        
        print48Colons();
        print48Ohs();
        print48Colons();
        print48Ohs();
        print48Colons();
        print48Ohs();

        System.out.println();
        printPledge();    
    }

    // Had to delte 5 colons/O's/and -'s to make everything line up. Maybe it's just my font
    public static void print48Colons() {
        out.println("|:::::::::::::::::::::::::::::::::::::::::::|");
    }

    public static void print48Ohs() {
        out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
    }

    public static void print29Colons() {
        out.println("|:::::::::::::::::::::::::::::|");
    }

    public static void printPledge() {
        out.println("I pledge allegiance to the flag.");
    }

    public static void print29Ohs() {
        out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
    }

    public static void print6Stars() {
        out.print("| * * * * * * ");
    }

    public static void print5Stars() {
        out.print("|  * * * * *  ");
    }

    public static void printSixStarLine() {
        print6Stars();
        print29Ohs();
    }

    public static void printFiveStarLine() {
        print5Stars();
        print29Colons();
    }

    public static void printTopHalf() {
        out.println(" ___________________________________________");
        printSixStarLine();
        printFiveStarLine();
        printSixStarLine();
        printFiveStarLine();
        printSixStarLine();
        printFiveStarLine();
        printSixStarLine();
    }
}
