package task6;

class Planet implements Nameable{
    String name;

    Planet(String name){
        this.name = name;
    }

    public void getName() {
        System.out.printf("Планета - '%s'\n", name);
    }
}
