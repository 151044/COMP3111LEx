package Lab2c;

import Lab2b.Book;

import java.util.Arrays;

/**
 * Code provided by COMP 3111H teaching team.
 */
public class MainApp2c {
    public static void main(String[] args) {
        final String[] array = new String[] {"Basic Java", "Advanced Java", "Guru Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " + k + " is " + b.getChapter(k - 1));
        String[] anotherArray = b.getChapters();

        System.out.println("There are " + anotherArray.length + " chapters.");
        System.out.println(Arrays.toString(anotherArray));

        Computer a = new MobileComputer();
        for (int i = 0; i < 10; i++) {
            a.work();
        }

        Charger c = new Charger();
        Phone p = new Phone();
        MobileComputer m = new MobileComputer();
        c.charge(p);
        c.charge(m);
    }
}
