package Recursion;

public class keyPadCombnations {
    static String[] keyPad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    static void printConbinations(String str, int idx, String conbination) {
        if (idx == str.length()) {
            System.out.println(conbination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keyPad[currChar - '0'];
        for(int i = 0; i < mapping.length(); i++){
            printConbinations(str, idx + 1, conbination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printConbinations(str, 0, "");
    }
}
