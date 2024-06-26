package Arrays;

public class transposeOfMatrix {
    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (n == 1 && m == 1) {
            return matrix;
        } else if (n == m) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        } else {
            int[][] newMatrix = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    newMatrix[j][i] = matrix[i][j];
                }
            }
            return newMatrix;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printArr(matrix);
        transpose(matrix);
        printArr(matrix);
    }
}
