package Arrays;

public class sort123 {
    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        printArr(arr);
    }

    static void sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid < high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 1, 2, 0 };
        sort(arr);
        printArr(arr);
    }
}
