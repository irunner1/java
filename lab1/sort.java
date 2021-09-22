package lab1;

public class sort {
    
    private static void BubbleSort(int[] ar) {
        int tmp;
        for (int i = 0; i < ar.length; i++) {
            for (int j = ar.length - 2; j >= i; j--) {
                if (ar[j] > ar[j + 1]) {
                    tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) { //рандом + сумма чисел массива
            array[i] = (int) Math.round((Math.random() * 10));
            System.out.print(array[i]+" ");
        }
        BubbleSort(array);
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) { //рандом + сумма чисел массива
            System.out.print(array[i]+" ");
        }
    }
    
}
