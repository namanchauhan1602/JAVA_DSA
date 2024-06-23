package Recursion;

public class totalPathsInMaze {
    static int countPaths(int i, int j, int n, int m){
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int ans = countPaths(0, 0, 3, 3);
        System.out.println(ans);
    }
}
