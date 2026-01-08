class Program133{
    public static void main(String args[]){
         
        for(int i=5; i>=1; i--){
            char ch = 65;
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(ch++ + " ");
                
            }
            System.out.println("");
        }
    }
}