class Program109{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
        char ch = 65;
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i;k++){
              if(k == 1 || k == i || i==5){
                System.out.print(ch++);
              }
              else{
                System.out.print("_");
                ch++;

              }
            }
             System.out.println(" ");
        }
    }
}