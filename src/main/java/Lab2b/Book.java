package Lab2b;

import java.util.Arrays;

/**
 * Code provided by the COMP 3111H teaching team.
 */
public class Book {
    private String[] chapters;
    private static final int DEFAULT_CHAPTERS = 10;
    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < DEFAULT_CHAPTERS; i++) {
            chapters[i] = "n/a";
        }
    }
    public Book(String[] args) {
        chapters = Arrays.copyOf(args, args.length);
    }

    public String getChapter(int i) {
        return chapters[i];
    }

    public String[] getChapters() {
        return chapters;
    }
}
