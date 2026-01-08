class Program115{
    public static void main(String args[]){

        for(int i=1; i<=5; i++){
        char ch = 65;
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=6-i; k++){
                if(k==1 || k==6-i || i==1){
                    System.out.print(ch++);
                }
                else{
                    System.out.print("_");
                    ch++;
                    
                }
            }
            System.out.println("");
        }
    }
}