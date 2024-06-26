package Arrays;

import Recursion.fibonacci;

public class rotateMatrix {
    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (n == 1 && m == 1)
            return;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = m - 1;
            while (j <= k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }

    static boolean findRotation(int[][] matrix, int[][] target) {
        boolean flag = false;
        for (int k = 0; k < 4; k++) {
            rotate(matrix);
            printArr(matrix);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != target[i][j]) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] target = { { 1, 0 }, { 0, 1 } };
        int[][] matrix = { { 0, 1 }, { 1, 1 } };
        System.out.println(findRotation(matrix, target));
    }
}