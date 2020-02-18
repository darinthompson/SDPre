public class CreatingVariables {

    public static void main(String[] args) {
        int x, y, age;
        double seconds, e, checking;
        String firstName, lastName, title;
        
        String profession = "software engineer";
        String company = "self-employed";

        double salary = 5994453.12;
        int jobSatisfaction = 10; // out of 10

        x = 10;
        y = 40;
        age = 31;


        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;

        firstName = "Darin";
        lastName = "Thompson";
        title = "Mr.";
        
        
        

        System.out.println("The variable x contains " + x);
        System.out.println("The value " + y + " is stored in the variable y.");
        System.out.println("The experiment took " + seconds + " seconds.");
        System.out.println("A favorite irrational # is Euler's number: " + e);
        System.out.println("Hopefully you have more than $" + checking + "!");
        System.out.println("My name's " + title + " "+ firstName + lastName);
        
        System.out.println("\nEmployee Info");
        System.out.println("**************************************");
        System.out.println("Name: " + firstName  + " " + lastName );
        System.out.println("Position: " + profession);
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
        System.out.println("Job Satisfaction: " + jobSatisfaction + " out of 10");
    }
}
