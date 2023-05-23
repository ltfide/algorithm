package hackerrank.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s2.getCGPA() > s1.getCGPA())
            return (1);
        else if (s2.getCGPA() < s1.getCGPA())
            return (-1);
        else {
            int secondCompare = s1.getName().compareTo(s2.getName());
            if (secondCompare != 0)
                return (secondCompare);
            int thirdCompare = s1.getID() - s2.getID();
            return (thirdCompare);
        }
    }
}

class Student {

    private Integer id;
    private String name;
    private Double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new StudentComparator());

        for (String ev : events) {
            String[] s = ev.split("\\s+");

            if (s[0].equals("ENTER")) {
                Integer id = Integer.valueOf(s[3]);
                String name = s[1];
                Double CGPA = Double.valueOf(s[2]);

                Student student = new Student(id, name, CGPA);
                queue.add(student);
            } else {
                queue.poll();
            }
        }

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }
        students.sort(new StudentComparator());
        return students;
    }
}

public class JavaPriorityQueue {

    @Test
    void testQueue() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_priority_queue.txt"));

        List<String> events = new ArrayList<>();
        while (sc.hasNextLine()) {
            String event = sc.nextLine();
            events.add(event);
        }

        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);

        Scanner response = new Scanner(Path.of("sample/priority_queue_response.txt"));
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
                assertEquals(response.nextLine(), student.getName());
            }
        }
        sc.close();
    }
}
