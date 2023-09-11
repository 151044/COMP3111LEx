package Lab1;

/**
 * Code provided by COMP 3111H teaching team.
 */
public class MainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println("Welcome to Scientific Calculator!");
        System.out.println("Program started ...");
        System.out.println(b + " to power " + n + " = " + MyLibrary.power(b, n));
        System.out.println(n + "! = " + MyLibrary.factorial(n));
        System.out.println("Program Ended ...");
    }
}
