import java.util.Scanner;

public class RudeQuestions { 
    public static void main(String[] args) {
        String name;
        int age;
        double weight, income;
        int bathroomMinutes;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();

        System.out.print("Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So, you're " + age + ", eh? That's not very old.");
        System.out.print("How much do you weight, " + name + "? ");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!");
        System.out.println("Finally, what's your income, " + name + "? ");
        income = keyboard.nextDouble();
        
        System.out.print("What is the average amount of minutes you spend in the bathroom per visit? ");
        bathroomMinutes = keyboard.nextInt();
        System.out.println("Only " + bathroomMinutes + " minutes?! I have socks that's have spent more time in the bathroom than that!");
        System.out.println();

        System.out.print("Hopefully that is " + income + " per hour");
        System.out.println(" and not per year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name + ".");
    
        //I don't think entering an integer instead of a double will crash because, an integer is just less specific than a double.
        //No it doesn't, it just receives the numeric value as a string.
        //The only thing I know that makes it blow up all the time is adding a space in between answers. And that is because the buffer
        //sees whitespace as the end of input and when there is still characters in the buffer it crashes.
    }

}
