package Recursion;

public class factorial {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int factNM1 = fact(n - 1);
        int factN = n * factNM1;
        return factN;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
