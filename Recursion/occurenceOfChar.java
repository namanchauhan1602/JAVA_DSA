package Recursion;

public class occurenceOfChar {
    static int first = -1;
    static int last = -1;
    static void checkOccurence(String str, int idx, char chr) {
        if (idx == str.length()) 
            return;
        if(str.charAt(idx) == chr){
            if (first == -1) {
                first = idx;
            }else{
                last = idx;
            }
        }
        checkOccurence(str, idx + 1, chr);
    }

    public static void main(String[] args) {
        String str = "abaacdaefa";
        checkOccurence(str, 0, 'a');
        System.out.println(first + " " +  last);
    }
}
