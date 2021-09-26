package task6;

public class Fruit implements Printable{
    private String name;
    private String price;

    Fruit(String name, String price) {
        this.name = name;
        this.price = price;
    }
    public void getPrice() {
        System.out.printf("Фрукт '%s' стоит %s$", name, price);
    }
}
