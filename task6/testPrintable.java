package task6;

public class TestPrintable {
    public static void main(String[] args) {
        Printable printable = new Phone("sosung", "150");
        printable.getPrice();
        printable = new Fruit("авокадо", "3");
        printable.getPrice();
    }
}
