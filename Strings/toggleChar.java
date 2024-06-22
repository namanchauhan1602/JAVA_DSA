package Strings;

public class toggleChar {
    static void printArr(char[] arr) {
        for (char i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void toggleCharacter(String str) {
        char[] arr = str.toCharArray();
        printArr(arr);
        for(int i = 0; i < arr.length; i++){
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }else{
                arr[i] = (char)(arr[i] - 32);
            }
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        String str = "aLGOprEp";
        toggleCharacter(str);
    }
}
