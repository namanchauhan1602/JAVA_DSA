package Recursion;

public class printNums {
    static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(printSum(5));
    }
}
