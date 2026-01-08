class Program114{
    public static void main(String agrs[]){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=6-i; k++){
               if( k==1 || k==6-i || i==1){
                System.out.print((6-i));
               }
               else{
                System.out.print("_");
               }
            }
            System.out.println(" ");
        }
    }
}