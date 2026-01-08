class Program116{
    public static void main(String args[]){
        for(int i=1; i<=5;i++){
         char ch = 65;
            int j;
            for( j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(char k=1; k<=6-i; k++){
                System.out.print(ch++);
            }
            System.out.println(" ");
        }
      }
}