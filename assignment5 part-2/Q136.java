class Program136{
    public static void main(String args[]){

        for(int i=5; i>=1; i--){
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
            if(k==1 || k==((i*2)-1) || i==5){

                System.out.print(k);
            }
            else{
                System.out.print("+");
            }
            }
            System.out.println("");
        }
    }
}