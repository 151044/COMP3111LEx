package Lab1;

/**
 * Code provided by COMP 3111H teaching team.
 * Java library with two mathematical functions.
 */
public class MyLibrary {
    public static int power(int base, int exponent) {
        if (exponent == 1) {
            return base * exponent;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
