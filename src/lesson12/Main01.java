package lesson12;

public class Main01 {

    /*
    // pseudocode
    countFiles(folder) {
        files[] = getFolderContent()
        for (file in files) {
            if (file.isFolder) {
                countFiles(file)
            }
            else {
                fileCount++
            }
        }
    }

     */

    public static int factorial(int n) {
        return n == 0 ? 1 : factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        // n! = (n-1)! * n
        // 5! = (5-1)! * 5 = 4! * 5
        // 0! = 1
        int n = 5;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
        System.out.println(factorial(n));
    }
}
