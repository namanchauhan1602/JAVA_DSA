package Arrays;

import java.util.ArrayList;

public class dupicatesInArray {
    static ArrayList duplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int idx = arr[i] % n;   
            arr[idx] += n;
        }

        for(int i = 0; i < n; i++){
            if((arr[i] / n) >= 2) list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        ArrayList<Integer> list = duplicates(arr);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}