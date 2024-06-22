package Arrays;

public class rotateKTimes {
    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void rotateArrKTimes(int[] arr, int k) {
        k = k % (arr.length - 1);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = k - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = k;
        j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, -2, 1, 4, 6, 9, 8 };
        printArr(arr);
        rotateArrKTimes(arr, 3);
        printArr(arr);
    }
}
