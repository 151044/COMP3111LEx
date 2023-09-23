package Lab2b;

import java.util.Arrays;

/**
 * Code provided by COMP 3111H teaching team.
 */
public class MainApp2b {
    public static void main(String[] args) {
        final String[] array = new String[] {"Basic Java", "Advanced Java", "Guru Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " + k + " is " + b.getChapter(k - 1));
        String[] anotherArray = b.getChapters();

        System.out.println("There are " + anotherArray.length + " chapters.");
        System.out.println(Arrays.toString(anotherArray));
    }
}
