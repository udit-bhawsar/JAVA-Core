class Program121{
    public static void main(String args[]){
        
        for(int i = 1; i<=5; i++){
            char ch = 65;
             
          for(int j=1; j<=5-i; j++){
            System.out.print(" ");
          }
          for(int k=1; k<=i; k++){
            if(k==1 || i==5 || k==i){
            System.out.print("X ");

            }
            else{
            System.out.print("_ ");

            }
          }
          System.out.println("");
        }
    }
}