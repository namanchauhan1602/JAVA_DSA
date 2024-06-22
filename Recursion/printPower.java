package Recursion;

public class printPower {
    static int printSPower(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return printSPower(x, n/2) * printSPower(x, n/2);
        }else{
            return printSPower(x, n/2) * printSPower(x, n/2) * x;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(printSPower(2, 5 ));
    }
}
