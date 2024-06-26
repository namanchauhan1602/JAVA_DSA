package Arrays;

public class booleanMatrix {
    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void boolMatrix(int matrix[][]) {
        /*
         * int row = matrix.length;
         * int col = matrix[0].length;
         * if (row == 1 && col == 1)
         * return;
         * 
         * int left = 0;
         * int right = col - 1;
         * int top = 0;
         * int bottom = row - 1;
         * int[][] tempMatrix = new int[matrix.length][];
         * for (int i = 0; i < row; i++) {
         * tempMatrix[i] = new int[col];
         * System.arraycopy(matrix[i], 0, tempMatrix[i], 0, col);
         * }
         * for (int i = 0; i < row; i++) {
         * for (int j = 0; j < col; j++) {
         * if (tempMatrix[i][j] == 1) {
         * int temp = i;
         * while (temp >= top) {
         * matrix[temp][j] = 1;
         * temp--;
         * }
         * temp = i;
         * while (temp <= bottom) {
         * matrix[temp][j] = 1;
         * temp++;
         * }
         * temp = j;
         * while (temp >= left) {
         * matrix[i][temp] = 1;
         * temp--;
         * }
         * temp = j;
         * while (temp <= right) {
         * matrix[i][temp] = 1;
         * temp++;
         * }
         * }
         * }
         * }
         */

        // better way
        int r = matrix.length;
        int c = matrix[0].length;
        int[] row = new int[r];
        int[] col = new int[c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
        printArr(matrix);
        boolMatrix(matrix);
        printArr(matrix);
    }
}
