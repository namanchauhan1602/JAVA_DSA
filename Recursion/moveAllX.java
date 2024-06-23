package Recursion;

public class moveAllX {
    static String newStr = "";
    static int count = 0;

    static void move(String str, int idx) {
        if (idx == str.length()) {
            for(int i = 0; i < count; i++){
                newStr += 'x';
            }
            return;
        }
        if (str.charAt(idx)!= 'x') {
            newStr += str.charAt(idx);
        }else{
            count++;
        }
        move(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        move(str, 0);
        System.out.println(newStr);
    }
}
