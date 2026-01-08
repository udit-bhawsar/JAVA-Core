class Program145 {
    public static void main(String args[]) {
        

        for (int i = 1; i <= 5; i++) {
            for(int p =1; p<=5-i; p++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
