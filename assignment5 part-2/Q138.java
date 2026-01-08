class Program138{
    public static void main(String args[]){

        for(int i=1; i<=7; i++){
            int n = i<=4 ? i : 8-i;
            for(int j=1; j<=n; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}