
    public class Demo2 {
        public static void main(String args[]) {
            int i, j, k, n = 7; 
            for (i = 1; i <= n; i++) {
                for (k = n; k > i; k--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
    


