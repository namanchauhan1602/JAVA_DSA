package Recursion;

public class subSequence {
    static void subSeq(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        subSeq(str, idx + 1, newStr + str.charAt(idx));
        subSeq(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String  str = "abc";
        subSeq(str, 0, "");
    }
}