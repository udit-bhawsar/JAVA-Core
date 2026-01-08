    class Program148 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= 2*n; i++) {
            int stars = i <= n ? n - i + 1 : i - n;
            int spaces = i <= n ? 2 * (i - 1) : 2 * (2 * n - i);
            
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
