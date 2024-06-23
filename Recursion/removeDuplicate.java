package Recursion;

public class removeDuplicate {
    static boolean[] map = new boolean[26];

    static void remove(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        if (map[str.charAt(idx) - 'a']) {
            remove(str, idx + 1, newStr);
        } else {
            newStr += str.charAt(idx);
            map[str.charAt(idx) - 'a'] = true;
            remove(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        remove(str, 0, "");
    }
}
