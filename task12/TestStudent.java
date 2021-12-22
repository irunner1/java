package task12;

import java.util.Scanner;

public class TestStudent {
    
    static void InsertionSort(Student[] stud) {
        for(int i = 1; i < 5; i++){
            for(int j = i; j > 0 && stud[j-1].idNumber > stud[j].idNumber; j--) {
                Student tmp = stud[j - 1];
                stud[j - 1] = stud[j];
                stud[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner scanner = new Scanner(System.in);
        int a;
        String b;
        for (int i = 0; i < 5; i++) {
            a = scanner.nextInt();
            b = scanner.next();
            students[i] = new Student(a, b);
            // System.out.print(students[i]);
        }
        InsertionSort(students);
        for (int i = 0; i < 5; i++) {
            System.out.print(students[i]);
        }
    }
}