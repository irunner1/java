package task1;

public class Summ {
    public static void main(String[] args) {
        int[] array = new int[12];
        int num = 0, num1 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10));
            System.out.print(array[i]+" ");
            num += array[i];
        }
        int i= 0;
        while (i < array.length) {
            num1 += array[i];
            i++;
        }
        System.out.println("\nsum for = "+ num +"\nsum while = "+ num1);
    }
}
