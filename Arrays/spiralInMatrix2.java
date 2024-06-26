package Arrays;

public class spiralInMatrix2 {
    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int row = n;
        int column = n;
        if (row == 1 && column == 1) {
            matrix[0][0] = 1;
            return matrix;
        }
        int i = 1;
        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;
        int temp = 0;
        while (i <= row * column) {
            while (temp <= right && i <= row * column) {
                matrix[top][temp] = i;
                temp++;
                i++;
            }
            printArr(matrix);
            top++;
            temp = top;
            while (temp <= bottom && i <= row * column) {
                matrix[temp][right] = i;
                temp++;
                i++;
            }
            right--;
            temp = right;
            while (temp >= left && i <= row * column) {
                matrix[bottom][temp] = i;
                temp--;
                i++;
            }
            bottom--;
            temp = bottom;
            while (temp >= top && i <= row * column) {
                matrix[temp][left] = i;
                temp--;
                i++;
            }
            left++;
            temp = left;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        printArr(matrix);
    }
}