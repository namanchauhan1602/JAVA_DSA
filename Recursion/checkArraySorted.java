package Recursion;

public class checkArraySorted {
    static boolean flag = true;
    static void checkSorted(int[] arr, int idx){
        if (!flag || idx == arr.length) {
            return;
        }
        if (arr[idx] < arr[idx - 1]) {
            flag = false;
            return;
        }
        checkSorted(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        checkSorted(arr, 1);
        if (flag) {
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }    
}