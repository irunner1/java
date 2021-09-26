package task1;

public class fact {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
           result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(getFactorial(6) - getFactorial(4));
    }
}
