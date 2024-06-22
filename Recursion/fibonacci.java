package Recursion;

import java.util.Scanner;

public class fibonacci {
    static void printSeries(int n, int first, int second, int i) {
        if (i == n) {
            System.out.println(first + second + " ");
            return;
        }
        int next = first + second;
        first = second;
        second = next;
        System.out.print(next + " ");
        printSeries(n, first, second, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:-");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        printSeries(n - 3, first, second, 0);
        sc.close();
    }
}