package task3;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5, "red", 2, 5);
        System.out.println(c);
        c.setRadius(7);
        c.setXY(8, 2);
        double square = c.getArea();
        double perimetr = c.getPerimeter();
        System.out.println(c);
        System.out.println("Площадь: " + square + " Периметр: " + perimetr);
    }    
}