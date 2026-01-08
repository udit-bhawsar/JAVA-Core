class Program124{
    public static void main(String args[]){
        
        
        for(int i = 1; i<=5; i++){
            char ch=65;
          for(int j=1; j<=5-i; j++){
            System.out.print(" ");
          }
          for(int k=1; k<=(i*2)-1; k++){
            System.out.print(ch++);        
          }
          System.out.println("");
        }
    }
}