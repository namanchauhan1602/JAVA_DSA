package Recursion;

public class printRevStr {
    static void reverse(String str, int idx) {
        if (idx == -1)
            return;
        System.out.print(str.charAt(idx));
        reverse(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        reverse(str, str.length() - 1);
    }
}
