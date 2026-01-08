class Program139{
    public static void main(String args[]){

        for(int i=1; i<=7; i++){
            int n = i<=4 ? i : 8-i;
            for(int j=1; j<=7-n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++){
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}