package task12;

public class Student {
    int idNumber;
    String name;

    Student(int _idNumber, String _name) {
        idNumber = _idNumber;
        name = _name;
    }

    @Override
    public String toString() {
        return "Student" +
        "id = " + idNumber + " " +
        ", name =" + name + "\n";
    }
}