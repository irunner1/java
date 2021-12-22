package task13;

import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> CarManufactures = new ArrayList<String>();

        CarManufactures.add("Porsche");
        CarManufactures.add("BMW");
        CarManufactures.add("Honda");
        CarManufactures.add("Toyota");
        CarManufactures.add(1, "Fiat");

        for(String CarBrand : CarManufactures) {
            System.out.println(CarBrand);
        }
        System.out.printf("В списке %d элементов \n", CarManufactures.size());
        
        CarManufactures.remove("Toyota");
        CarManufactures.add(2, "Mazda");
        
        for(String CarBrand : CarManufactures) {
            System.out.println(CarBrand);
        }
    }
}
