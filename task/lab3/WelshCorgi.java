package lab3;

public class WelshCorgi extends Dog{
    private String name;
    
    WelshCorgi(int length, String color, int age, String name) {
        super(length, age, color);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Корги\n" +
                "Имя: " + name +
                ", Длина: " + length +
                ", Цвет: " + color +
                ", Возраст: " + age;
    }
}