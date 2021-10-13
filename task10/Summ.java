public class Summ {
    public static int recursion(int n) {
        if (n / 10 > 0) {
            int sum = n % 10;
            int num = n / 10;
            return sum + recursion(num); 
        }
        else {            
            return n;
        }
    }

    public static void main(String[] args) {
        int n = 5345;
        System.out.println(recursion(n));
    }
}
