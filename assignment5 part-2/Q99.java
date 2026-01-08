class Program99{
    public static void main(String args[]){

        for(int i=5; i>=1;i--){
            for(int j=1; j<=i; j++){
                if(i==5 || j==i || j==1){
                System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}