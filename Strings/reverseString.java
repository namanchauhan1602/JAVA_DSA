package Strings;

public class reverseString {
    static void reverseStr(String str){
        int i = 0;
        int j = str.length() - 1;
        char[] arr = str.toCharArray();
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(arr));
    }
    public static void main(String[] args) {
        String str = "algoprep";
        reverseStr(str);
    }
}
