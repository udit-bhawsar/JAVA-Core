class Program111{
    public static void main(String args[]){
        System.out.print("");

        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=6-i; k++){
                System.out.print(k);
            }
            System.out.println(" ");
        }

        
   }
}