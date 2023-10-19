package com.example.array;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ArrayTest {

    @Getter
    @Setter
    @AllArgsConstructor
    private static class Student {
        private String name;
        private int age;
    }

    @Test
    void createArray() {
        String names[] = new String[] { "Lutfi", "Dendiansyah" };
        int[] numbers = { 1, 2, 3, 4 };
        Student[] students = new Student[] { new Student("Lutfi", 30) };

        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));
    }
}
