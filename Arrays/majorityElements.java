package Arrays;

public class majorityElements {
    static int finrMajority(int[] arr) {
        int majElm = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (count == 0) {
                majElm = arr[i];
            }
            if (arr[i] == majElm) count++;
            else count--;
        }
        return majElm;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        System.out.println(finrMajority(arr));
    }
}
