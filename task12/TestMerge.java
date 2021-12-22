import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMerge {
    public ArrayList<Merge> sortArray(ArrayList<Merge> arrayA){

        if (arrayA == null) {
            return null;
        }
        
        if (arrayA.size() < 2) {
            return arrayA;
        }
        ArrayList<Merge> arrayB = new ArrayList<Merge>(arrayA.size() / 2);
        // Merge [] arrayB = new Merge[arrayA.size() / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.size() / 2);

        ArrayList<Merge> arrayС = new ArrayList<Merge>(arrayA.size() - arrayA.size() / 2);
        
        // Merge [] arrayC = new Merge[arrayA.size() - arrayA.size() / 2];
        System.arraycopy(arrayA, arrayA.size() / 2, arrayС, 0, arrayA.size() - arrayA.size() / 2);

        arrayB = sortArray(arrayB);
        arrayС = sortArray(arrayС);

        return mergeArray(arrayB, arrayС);
    }

    public ArrayList<Merge> mergeArray(ArrayList<Merge> arrayА, ArrayList<Merge> arrayB) {

        ArrayList<Merge> arrayC = new ArrayList<Merge>(10);
        int positionA = 0, positionB = 0;
        
        for (int i = 0; i < arrayC.size(); i++) {
            if (positionA == arrayА.size()){
                arrayC[0] = arrayB[0];
                arrayC[i] = arrayB[i - positionB];
                positionB++;
            } else if (positionB == arrayB.size()) {
                arrayC[i] = arrayА[i - positionA];
                positionA++;
            } else if (arrayА[i - positionA].idNumber < arrayB[i - positionB].idNumber) {
                arrayC[i] = arrayА[i - positionA];
                positionB++;
            } else {
            arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }
    
    public static void main(String[] args) {
        int a;
        String b;
        Scanner scanner = new Scanner(System.in);

        List<Student> listOne = new ArrayList<Student>(5);
        for (int i = 0; i < 5; i++) {
            a = scanner.nextInt();
            b = scanner.next();
            Student students = new Student(a, b);
            listOne.add(students);
            // System.out.print(students[i]);
        }
        List<Student> listTwo = new ArrayList<Student>(5);

        for (int i = 0; i < 5; i++) {
            Student students = new Student(scanner.nextInt(), scanner.next());
            listTwo.add(students);
            // System.out.print(students[i]);
        }
        List<Student> newList = new ArrayList<Student>(10);

        newList.addAll(listOne);
        newList.addAll(listTwo);
        sortArray(newList);
        for(Student stud : newList) {
            System.out.print(stud);
        }
    }
}
