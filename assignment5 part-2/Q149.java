    class Program149 {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 1; i <= 2 * n + 1; i++) {
            if(i <= n) {
                for(int j = 1; j <= n; j++) {
                    System.out.print(" ");
                }
                System.out.println(i);
            } else if(i == n + 1) {
                for(int j = 1; j <= n + 1; j++) {
                    System.out.print(j);
                }
                for(int j = n; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            } else {
                for(int j = 1; j <= n; j++) {
                    System.out.print(" ");
                }
                System.out.println(2 * n + 2 - i);
            }
        }
    }
}
