package lab3;

public class Cupboard extends FurnitureShop{
    public String color;

    Cupboard(String material, int height, int weight, int width, String color) {
        super(material, height, weight, width);
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Шкаф\n" +
                "Материал: " + material +
                " Высота: " + height +
                " Вес: " + weight +
                " Ширина: " + width +
                " Цвет: " + color;
    }
}