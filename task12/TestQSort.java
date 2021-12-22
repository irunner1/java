package task12;

import java.util.Arrays;
import java.util.Scanner;

public class TestQSort {
    public static void main(String[] args) {
        SortingStudentsByGPA[] students = new SortingStudentsByGPA[5];
        Scanner scanner = new Scanner(System.in);
        int a;
        String b;
        for (int i = 0; i < 5; i++) {
            a = scanner.nextInt();
            b = scanner.next();
            students[i] = new SortingStudentsByGPA(a, b);
        }

        System.out.println("Было");
        System.out.println(Arrays.toString(students));
 
        int low = 0;
        int high = students.length - 1;
 
        // students.QuickSort(students, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(students));
    }
}