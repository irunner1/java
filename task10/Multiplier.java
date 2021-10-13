public class Multiplier {

    public static void mult(int num, int i) {
        if (i < num) {
            if (num % i == 0) {
                if (recursion(i, 2)) {
                    System.out.println(i);
                }
            }
            mult(num, i + 1);
        }
    }
    public static boolean recursion(int num, int i) {
        if (num == 2) return true;
        if (num % i == 0) return false;

        if (i <= Math.sqrt(num)) return recursion(num, i + 1);
        else return true;
        
    }
    public static void main(String[] args) {
        int n = 140;
        mult(n, 2);
    }
}
