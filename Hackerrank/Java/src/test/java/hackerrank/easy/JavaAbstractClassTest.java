package hackerrank.easy;

import org.junit.jupiter.api.Test;

public class JavaAbstractClassTest {

    public static abstract class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    public static class MyBook extends Book {

        @Override
        void setTitle(String s) {
            this.title = s;
        }
    }

    @Test
    void test() {
        MyBook mb = new MyBook();
        mb.setTitle("A tale of two cities");
        System.out.println("The title is: " + mb.getTitle());
    }
}
