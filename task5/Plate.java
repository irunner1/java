package task5;

public class Plate extends Dish{
    protected String size;

    Plate(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }
    
    @Override
    public String toString() {
        return "Тарелка\n"+
                "Материал: " + material +
                " Цвет: " + color +
                " Размер: " + size;
    }
}
