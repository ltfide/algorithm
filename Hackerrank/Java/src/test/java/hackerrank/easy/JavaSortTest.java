package hackerrank.easy;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class JavaSortTest {

    public static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int CGPACompare = o2.CGPA.compareTo(o1.CGPA);
            int nameComapare = o1.firstName.compareTo(o2.firstName);
            return (CGPACompare == 0) ? nameComapare : CGPACompare;
        }

    }

    public static class Student {
        public Integer id;
        public String firstName;
        public Double CGPA;
    }

    @Test
    void test() throws IOException {
        Path path = Paths.get("students.txt");
        Scanner sc = new Scanner(path);

        List<Student> students = new ArrayList<>();
        while (sc.hasNextLine()) {
            Student student = new Student();
            student.id = sc.nextInt();
            student.firstName = sc.next();
            student.CGPA = Double.valueOf(sc.next());
            students.add(student);
        }

        // Collections.sort(students, new StudentComparator());

        // lebih ringkas dengan lambda
        Collections.sort(students, (o1, o2) -> {
            int CGPACompare = o2.CGPA.compareTo(o1.CGPA);
            int nameComapare = o1.firstName.compareTo(o2.firstName);
            return (CGPACompare == 0) ? nameComapare : CGPACompare;
        });
        for (Student students2 : students) {
            System.out.format("%s %s %s \n", students2.id, students2.firstName, students2.CGPA);
        }
        sc.close();
    }
}
