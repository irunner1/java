package task6;

public class Animals implements Nameable {
    private String name;

    Animals(String name){
        this.name = name;
    }

    public void getName() {
        System.out.printf("Животное - '%s'\n", name);
    }
}
