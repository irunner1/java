package task6;

public class TestPrint {
    public static void main(String[] args) {
        Nameable nameable = new Planet("Сатурн");
        nameable.getName();
        nameable = new Animals("Слон");
        nameable.getName();
    }
}
