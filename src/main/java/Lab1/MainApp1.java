package Lab1;

import java.util.function.BiFunction;

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
        // System.out.println(n + "! = " + MyLibrary.factorial(n));
        QuadFunction<BiFunction<String, String, String>, String, String, String, String> fx
                = (f, h, i, j) -> f.apply(f.apply(h, i), j);
        System.out.println(fx.apply((k, l) -> k + l, String.valueOf(n), "! = ", String.valueOf(MyLibrary.factorial(n))));
        System.out.println("Program Ended ...");
    }
}

@FunctionalInterface
interface QuadFunction<A, B, C, D, R> {
    R apply(A a, B b, C c, D d);
}
