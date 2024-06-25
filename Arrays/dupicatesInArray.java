package Arrays;

import java.util.ArrayList;

public class dupicatesInArray {
    public static ArrayList<Integer> duplicates(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int idx = arr[i] % n;
            arr[idx] += n;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] / 2 >= n) {
                int elm = arr[i] % n;
                list.add(elm);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3 };
        ArrayList<Integer> list = duplicates(arr);
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
}
