public class Demo3 {
    public static void main(String[] args) {
        int i, j, k, n = 7;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
