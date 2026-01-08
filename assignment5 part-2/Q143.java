class Program143{
    public static void main(String args[]){
        
        
        for(int i = 1; i<=7; i++){
            int n = i<=4 ? i : 8-i;
          for(int j=1; j<=7-n; j++){
            System.out.print(" ");
          }
          for(int k=1; k<=(n*2)-1; k++){
            if(k==1 || k==(2*n-1)){
            System.out.print("*");        

            }
            else{
            System.out.print("_");        
            }
          }
          System.out.println("");
        }
    }
}