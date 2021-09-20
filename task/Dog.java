package task;

public class Dog {
    private int age;
    private String name;

    public Dog() {
        age = 0;
        name = "";
    }
    public Dog(int _age) {
        age = _age;
        name = "";
    }
    public Dog(int _age, String _name) {
        age = _age;
        name = _name;
    }

    public void SetAge(int _age) {
        age = _age;
    }
    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + age;
    }

    public void HumanAge() {
        System.out.print(name + " " + age*7);
    }
}

