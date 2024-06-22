package Sorting;

public class InsertionSort {
    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        printArr(arr);
        sort(arr);
        printArr(arr);
    }
}
