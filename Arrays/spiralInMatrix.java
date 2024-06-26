package Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralInMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;
        if (row == 1 && column == 1) {
            list.add(matrix[0][0]);
            return list;
        }
        int i = 0;
        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;
        int temp = 0;
        while (i < row*column) {
            while (temp <= right && i < row*column) {
                list.add(matrix[top][temp]);
                temp++;
                i++;
            }
            top++;
            temp = top;
            while (temp <= bottom && i < row*column) {
                list.add(matrix[temp][right]);
                temp++;
                i++;
            }
            right--;
            temp = right;
            while (temp >= left && i < row*column) {
                list.add(matrix[bottom][temp]);
                temp--;
                i++;
            }
            bottom--;
            temp = bottom;
            while (temp >= top && i < row*column) {
                list.add(matrix[temp][left]);
                temp--;
                i++;
            }
            left++;
            temp = left;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }
}
