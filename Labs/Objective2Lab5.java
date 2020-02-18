public class Objective2Lab5 {
    public static void main(String [] args) {
        double side1, side2, hypotenuse;

        double num = Math.sqrt(3*3); //num=>3
        double result = Math.sqrt(4) + Math.sqrt(9); //result => 2 + 3 => 5

        side1 = 3.45;
        side2 = 10;
        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
        
        System.out.println("The hypotenuse of a triangle with side 3.45 and 10.0 is: " + String.format("%.2f", hypotenuse));
    }

}
