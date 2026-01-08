class Program108{
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            int j;
            for ( j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k=1; k<= i; k++) {
                if(k==1 || k==i || i==5){
                System.out.print(k);

                }
                else{
                System.out.print("*");

                }
            }

            System.out.println();
        }
    }
}