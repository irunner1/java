package lab3;

public class Dog {
    public int length;
    public int age;
    public String color;

    public Dog(int length, int age, String color) {
        this.length = length;
        this.age = age;
        this.color = color;
    }
    @Override
    public String toString() {
        return length + age + color;
    }
}