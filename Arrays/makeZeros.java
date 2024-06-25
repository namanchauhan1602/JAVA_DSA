package Arrays;

public class makeZeros {
    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void makezero(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] temp = new int[arr.length][];
        for (int i = 0; i < n; i++) {
            temp[i] = new int[m];
            System.arraycopy(arr[i], 0, temp[i], 0, m);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (temp[i][j] == 0) {
                    if (i + 1 < n) {
                        arr[i][j] += arr[i + 1][j];
                        arr[i + 1][j] = 0;

                    }
                    if (i - 1 >= 0) {
                        arr[i][j] += arr[i - 1][j];
                        arr[i - 1][j] = 0;

                    }
                    if (j + 1 < m) {
                        arr[i][j] += arr[i][j + 1];
                        arr[i][j + 1] = 0;

                    }
                    if (j - 1 >= 0) {
                        arr[i][j] += arr[i][j - 1];
                        arr[i][j - 1] = 0;
                    }
                }
            }
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 0, 7 }, { 8, 9, 4, 6 }, { 8, 4, 5, 2 } };
        makezero(arr);
    }
}
