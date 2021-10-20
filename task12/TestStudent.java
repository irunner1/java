
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            students[i].idNumber = Integer.parseInt(str);
            str = scanner.nextLine();
            students[i].name = str;
            System.out.print(students[i]);
        }
    }
}