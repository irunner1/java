package task5;

public class FurnitureShop {
    public String material;
    public int height;
    public int weight;
    public int width;

    FurnitureShop(String material, int height, int weight, int width) {
        this.material = material;
        this.height = height;
        this.weight = weight;
        this.width = width;
    }
    @Override
    public String toString() {
        return "Мебель\n Материал " + material +
                "Высота " + height +
                "Вес " + weight +
                "Ширина " + width;
    }
}