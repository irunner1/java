package task3;

public class testBook {
    public static void main(String args[]) {
        Book book1 = new Book();
        book1.SetYear(1968);
        book1.SetAuthor("Филип Дик");
        book1.SetTitle("Мечтают ли андроиды об электроовцах?");
        Book book2 = new Book("Глуховский", "Будущее", 2013);
        System.out.println(book1);
        System.out.println(book2);
    }
}
