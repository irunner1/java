package task10;

public class Prime {
    public static boolean recursion(int num, int i) {
        if (num == 2) return true;
        if (num % i == 0) return false;

        if (i <= Math.sqrt(num)) return recursion(num, i + 1);
        else return true;
        
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(recursion(n, 2));
    }
}
