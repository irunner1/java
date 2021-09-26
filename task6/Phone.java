package task6;
public class Phone implements Printable{
    private String price;
    private String name;

    Phone(String name, String price) {
        this.price = price;
        this.name = name;
    }
    public void getPrice() {
        System.out.printf("Цена телефона '%s' = %s$\n", name, price);
    }
}
