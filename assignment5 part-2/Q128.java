class Program128{
    public static void main(String args[]){
        
        
            char ch =65;
        for(int i = 1; i<=5; i++){
          for(int j=1; j<=5-i; j++){
            System.out.print(" ");
          }
          for(int k=1; k<=(i*2)-1; k++){
            if(k==1 || k==((i*2)-1) || i==5){
            System.out.print(ch);        

            }
            else{
            System.out.print("_");        
            }
          }
          System.out.println("");
          ch++;
        }
    }
}